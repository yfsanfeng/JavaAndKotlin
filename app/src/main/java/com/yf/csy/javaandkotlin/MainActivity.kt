package com.yf.csy.javaandkotlin

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview(this)
    }

    private fun initview(context: Context) {

    }


}
