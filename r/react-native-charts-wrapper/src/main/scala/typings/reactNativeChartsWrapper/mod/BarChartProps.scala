package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarChartProps extends BarLineChartBase {
  
  var data: BarData = js.native
  
  var drawBarShadow: js.UndefOr[Boolean] = js.native
  
  var drawValueAboveBar: js.UndefOr[Boolean] = js.native
  
  var highlightFullBarEnabled: js.UndefOr[Boolean] = js.native
}
object BarChartProps {
  
  @scala.inline
  def apply(data: BarData): BarChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps]
  }
  
  @scala.inline
  implicit class BarChartPropsMutableBuilder[Self <: BarChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: BarData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBarShadow(value: Boolean): Self = StObject.set(x, "drawBarShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawBarShadowUndefined: Self = StObject.set(x, "drawBarShadow", js.undefined)
    
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
