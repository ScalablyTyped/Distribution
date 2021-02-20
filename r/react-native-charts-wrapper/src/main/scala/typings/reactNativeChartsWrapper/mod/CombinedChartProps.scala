package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BAR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BUBBLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CANDLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SCATTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CombinedChartProps extends BarLineChartBase {
  
  var data: js.UndefOr[CombinedData] = js.native
  
  var drawBarShadow: js.UndefOr[Boolean] = js.native
  
  var drawOrder: js.UndefOr[js.Array[BAR | BUBBLE | LINE | CANDLE | SCATTER]] = js.native
  
  var drawValueAboveBar: js.UndefOr[Boolean] = js.native
  
  var highlightFullBarEnabled: js.UndefOr[Boolean] = js.native
}
object CombinedChartProps {
  
  @scala.inline
  def apply(): CombinedChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedChartProps]
  }
  
  @scala.inline
  implicit class CombinedChartPropsMutableBuilder[Self <: CombinedChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CombinedData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDrawBarShadow(value: Boolean): Self = StObject.set(x, "drawBarShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBarShadowUndefined: Self = StObject.set(x, "drawBarShadow", js.undefined)
    
    @scala.inline
    def setDrawOrder(value: js.Array[BAR | BUBBLE | LINE | CANDLE | SCATTER]): Self = StObject.set(x, "drawOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawOrderUndefined: Self = StObject.set(x, "drawOrder", js.undefined)
    
    @scala.inline
    def setDrawOrderVarargs(value: (BAR | BUBBLE | LINE | CANDLE | SCATTER)*): Self = StObject.set(x, "drawOrder", js.Array(value :_*))
    
    @scala.inline
    def setDrawValueAboveBar(value: Boolean): Self = StObject.set(x, "drawValueAboveBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawValueAboveBarUndefined: Self = StObject.set(x, "drawValueAboveBar", js.undefined)
    
    @scala.inline
    def setHighlightFullBarEnabled(value: Boolean): Self = StObject.set(x, "highlightFullBarEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightFullBarEnabledUndefined: Self = StObject.set(x, "highlightFullBarEnabled", js.undefined)
  }
}
