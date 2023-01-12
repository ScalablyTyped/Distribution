package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BAR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BUBBLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CANDLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SCATTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombinedChartProps
  extends StObject
     with BarLineChartBase {
  
  var data: js.UndefOr[CombinedData] = js.undefined
  
  var drawBarShadow: js.UndefOr[Boolean] = js.undefined
  
  var drawOrder: js.UndefOr[js.Array[BAR | BUBBLE | LINE | CANDLE | SCATTER]] = js.undefined
  
  var drawValueAboveBar: js.UndefOr[Boolean] = js.undefined
  
  var highlightFullBarEnabled: js.UndefOr[Boolean] = js.undefined
}
object CombinedChartProps {
  
  inline def apply(): CombinedChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedChartProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CombinedChartProps] (val x: Self) extends AnyVal {
    
    inline def setData(value: CombinedData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDrawBarShadow(value: Boolean): Self = StObject.set(x, "drawBarShadow", value.asInstanceOf[js.Any])
    
    inline def setDrawBarShadowUndefined: Self = StObject.set(x, "drawBarShadow", js.undefined)
    
    inline def setDrawOrder(value: js.Array[BAR | BUBBLE | LINE | CANDLE | SCATTER]): Self = StObject.set(x, "drawOrder", value.asInstanceOf[js.Any])
    
    inline def setDrawOrderUndefined: Self = StObject.set(x, "drawOrder", js.undefined)
    
    inline def setDrawOrderVarargs(value: (BAR | BUBBLE | LINE | CANDLE | SCATTER)*): Self = StObject.set(x, "drawOrder", js.Array(value*))
    
    inline def setDrawValueAboveBar(value: Boolean): Self = StObject.set(x, "drawValueAboveBar", value.asInstanceOf[js.Any])
    
    inline def setDrawValueAboveBarUndefined: Self = StObject.set(x, "drawValueAboveBar", js.undefined)
    
    inline def setHighlightFullBarEnabled(value: Boolean): Self = StObject.set(x, "highlightFullBarEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightFullBarEnabledUndefined: Self = StObject.set(x, "highlightFullBarEnabled", js.undefined)
  }
}
