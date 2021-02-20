package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TOP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLimitLine extends StObject {
  
  var label: js.UndefOr[String] = js.native
  
  var labelPosition: js.UndefOr[LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM] = js.native
  
  var limit: Double = js.native
  
  var lineColor: js.UndefOr[Color] = js.native
  
  var lineDashLengths: js.UndefOr[js.Array[Double]] = js.native
  
  var lineDashPhase: js.UndefOr[Double] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var valueFont: js.UndefOr[String] = js.native
  
  var valueTextColor: js.UndefOr[Color] = js.native
}
object AxisLimitLine {
  
  @scala.inline
  def apply(limit: Double): AxisLimitLine = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLimitLine]
  }
  
  @scala.inline
  implicit class AxisLimitLineMutableBuilder[Self <: AxisLimitLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPosition(value: LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: Color): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineDashLengths(value: js.Array[Double]): Self = StObject.set(x, "lineDashLengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashLengthsUndefined: Self = StObject.set(x, "lineDashLengths", js.undefined)
    
    @scala.inline
    def setLineDashLengthsVarargs(value: Double*): Self = StObject.set(x, "lineDashLengths", js.Array(value :_*))
    
    @scala.inline
    def setLineDashPhase(value: Double): Self = StObject.set(x, "lineDashPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashPhaseUndefined: Self = StObject.set(x, "lineDashPhase", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setValueFont(value: String): Self = StObject.set(x, "valueFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFontUndefined: Self = StObject.set(x, "valueFont", js.undefined)
    
    @scala.inline
    def setValueTextColor(value: Color): Self = StObject.set(x, "valueTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTextColorUndefined: Self = StObject.set(x, "valueTextColor", js.undefined)
  }
}
