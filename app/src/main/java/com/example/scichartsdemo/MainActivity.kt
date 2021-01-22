package com.example.scichartsdemo

import android.R
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.scichart.charting.visuals.SciChartSurface


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            SciChartSurface.setRuntimeLicenseKey(getString(R.string.sci_charts_key))
            Log.i("Sci Chart Success", " Success")
            Toast.makeText(this, "Configuration Successful", Toast.LENGTH_LONG).show()
        } catch (e: Exception) {
            Log.e("SciChart", "Error when setting the license", e)
        }


        val surface = SciChartSurface(this)

        val chartLayout = findViewById<View>(R.id.chart_layout) as LinearLayout
        // Add the SciChartSurface to the layout
        // Add the SciChartSurface to the layout
        chartLayout.addView(surface)

    }
}