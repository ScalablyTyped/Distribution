package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Phase
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CUBIC_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINEAR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.STEPPED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineDatasetConfig
  extends StObject
     with CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig
     with LineRadarConfig {
  
  var circleColor: js.UndefOr[Color] = js.undefined
  
  var circleColors: js.UndefOr[js.Array[Color]] = js.undefined
  
  var circleHoleColor: js.UndefOr[Color] = js.undefined
  
  var circleRadius: js.UndefOr[Double] = js.undefined
  
  var dashedLine: js.UndefOr[Phase] = js.undefined
  
  var drawCircleHole: js.UndefOr[Boolean] = js.undefined
  
  var drawCircles: js.UndefOr[Boolean] = js.undefined
  
  var drawCubicIntensity: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER] = js.undefined
}
object LineDatasetConfig {
  
  inline def apply(): LineDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDatasetConfig]
  }
  
  extension [Self <: LineDatasetConfig](x: Self) {
    
    inline def setCircleColor(value: Color): Self = StObject.set(x, "circleColor", value.asInstanceOf[js.Any])
    
    inline def setCircleColorUndefined: Self = StObject.set(x, "circleColor", js.undefined)
    
    inline def setCircleColors(value: js.Array[Color]): Self = StObject.set(x, "circleColors", value.asInstanceOf[js.Any])
    
    inline def setCircleColorsUndefined: Self = StObject.set(x, "circleColors", js.undefined)
    
    inline def setCircleColorsVarargs(value: Color*): Self = StObject.set(x, "circleColors", js.Array(value*))
    
    inline def setCircleHoleColor(value: Color): Self = StObject.set(x, "circleHoleColor", value.asInstanceOf[js.Any])
    
    inline def setCircleHoleColorUndefined: Self = StObject.set(x, "circleHoleColor", js.undefined)
    
    inline def setCircleRadius(value: Double): Self = StObject.set(x, "circleRadius", value.asInstanceOf[js.Any])
    
    inline def setCircleRadiusUndefined: Self = StObject.set(x, "circleRadius", js.undefined)
    
    inline def setDashedLine(value: Phase): Self = StObject.set(x, "dashedLine", value.asInstanceOf[js.Any])
    
    inline def setDashedLineUndefined: Self = StObject.set(x, "dashedLine", js.undefined)
    
    inline def setDrawCircleHole(value: Boolean): Self = StObject.set(x, "drawCircleHole", value.asInstanceOf[js.Any])
    
    inline def setDrawCircleHoleUndefined: Self = StObject.set(x, "drawCircleHole", js.undefined)
    
    inline def setDrawCircles(value: Boolean): Self = StObject.set(x, "drawCircles", value.asInstanceOf[js.Any])
    
    inline def setDrawCirclesUndefined: Self = StObject.set(x, "drawCircles", js.undefined)
    
    inline def setDrawCubicIntensity(value: Double): Self = StObject.set(x, "drawCubicIntensity", value.asInstanceOf[js.Any])
    
    inline def setDrawCubicIntensityUndefined: Self = StObject.set(x, "drawCubicIntensity", js.undefined)
    
    inline def setMode(value: LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
