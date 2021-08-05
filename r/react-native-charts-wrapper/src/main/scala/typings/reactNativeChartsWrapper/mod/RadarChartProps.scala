package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadarChartProps
  extends StObject
     with PieRadarChartBase {
  
  var data: js.UndefOr[RadarData] = js.undefined
  
  var drawWeb: js.UndefOr[Boolean] = js.undefined
  
  var skipWebLineCount: js.UndefOr[Double] = js.undefined
  
  var webAlpha: js.UndefOr[Double] = js.undefined
  
  var webColor: js.UndefOr[Color] = js.undefined
  
  var webColorInner: js.UndefOr[Color] = js.undefined
  
  var webLineWidth: js.UndefOr[Double] = js.undefined
  
  var webLineWidthInner: js.UndefOr[Double] = js.undefined
  
  var yAxis: js.UndefOr[typings.reactNativeChartsWrapper.mod.yAxis] = js.undefined
}
object RadarChartProps {
  
  inline def apply(): RadarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadarChartProps]
  }
  
  extension [Self <: RadarChartProps](x: Self) {
    
    inline def setData(value: RadarData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDrawWeb(value: Boolean): Self = StObject.set(x, "drawWeb", value.asInstanceOf[js.Any])
    
    inline def setDrawWebUndefined: Self = StObject.set(x, "drawWeb", js.undefined)
    
    inline def setSkipWebLineCount(value: Double): Self = StObject.set(x, "skipWebLineCount", value.asInstanceOf[js.Any])
    
    inline def setSkipWebLineCountUndefined: Self = StObject.set(x, "skipWebLineCount", js.undefined)
    
    inline def setWebAlpha(value: Double): Self = StObject.set(x, "webAlpha", value.asInstanceOf[js.Any])
    
    inline def setWebAlphaUndefined: Self = StObject.set(x, "webAlpha", js.undefined)
    
    inline def setWebColor(value: Color): Self = StObject.set(x, "webColor", value.asInstanceOf[js.Any])
    
    inline def setWebColorInner(value: Color): Self = StObject.set(x, "webColorInner", value.asInstanceOf[js.Any])
    
    inline def setWebColorInnerUndefined: Self = StObject.set(x, "webColorInner", js.undefined)
    
    inline def setWebColorUndefined: Self = StObject.set(x, "webColor", js.undefined)
    
    inline def setWebLineWidth(value: Double): Self = StObject.set(x, "webLineWidth", value.asInstanceOf[js.Any])
    
    inline def setWebLineWidthInner(value: Double): Self = StObject.set(x, "webLineWidthInner", value.asInstanceOf[js.Any])
    
    inline def setWebLineWidthInnerUndefined: Self = StObject.set(x, "webLineWidthInner", js.undefined)
    
    inline def setWebLineWidthUndefined: Self = StObject.set(x, "webLineWidth", js.undefined)
    
    inline def setYAxis(value: yAxis): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
