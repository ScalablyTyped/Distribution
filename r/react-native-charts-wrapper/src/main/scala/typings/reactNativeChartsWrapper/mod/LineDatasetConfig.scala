package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Phase
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CUBIC_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL_BEZIER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINEAR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.STEPPED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig
     with LineRadarConfig {
  
  var circleColor: js.UndefOr[Color] = js.native
  
  var circleColors: js.UndefOr[js.Array[Color]] = js.native
  
  var circleHoleColor: js.UndefOr[Color] = js.native
  
  var circleRadius: js.UndefOr[Double] = js.native
  
  var dashedLine: js.UndefOr[Phase] = js.native
  
  var drawCircleHole: js.UndefOr[Boolean] = js.native
  
  var drawCircles: js.UndefOr[Boolean] = js.native
  
  var drawCubicIntensity: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER] = js.native
}
object LineDatasetConfig {
  
  @scala.inline
  def apply(): LineDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDatasetConfig]
  }
  
  @scala.inline
  implicit class LineDatasetConfigMutableBuilder[Self <: LineDatasetConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircleColor(value: Color): Self = StObject.set(x, "circleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleColorUndefined: Self = StObject.set(x, "circleColor", js.undefined)
    
    @scala.inline
    def setCircleColors(value: js.Array[Color]): Self = StObject.set(x, "circleColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleColorsUndefined: Self = StObject.set(x, "circleColors", js.undefined)
    
    @scala.inline
    def setCircleColorsVarargs(value: Color*): Self = StObject.set(x, "circleColors", js.Array(value :_*))
    
    @scala.inline
    def setCircleHoleColor(value: Color): Self = StObject.set(x, "circleHoleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleHoleColorUndefined: Self = StObject.set(x, "circleHoleColor", js.undefined)
    
    @scala.inline
    def setCircleRadius(value: Double): Self = StObject.set(x, "circleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleRadiusUndefined: Self = StObject.set(x, "circleRadius", js.undefined)
    
    @scala.inline
    def setDashedLine(value: Phase): Self = StObject.set(x, "dashedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashedLineUndefined: Self = StObject.set(x, "dashedLine", js.undefined)
    
    @scala.inline
    def setDrawCircleHole(value: Boolean): Self = StObject.set(x, "drawCircleHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawCircleHoleUndefined: Self = StObject.set(x, "drawCircleHole", js.undefined)
    
    @scala.inline
    def setDrawCircles(value: Boolean): Self = StObject.set(x, "drawCircles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawCirclesUndefined: Self = StObject.set(x, "drawCircles", js.undefined)
    
    @scala.inline
    def setDrawCubicIntensity(value: Double): Self = StObject.set(x, "drawCubicIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawCubicIntensityUndefined: Self = StObject.set(x, "drawCubicIntensity", js.undefined)
    
    @scala.inline
    def setMode(value: LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
