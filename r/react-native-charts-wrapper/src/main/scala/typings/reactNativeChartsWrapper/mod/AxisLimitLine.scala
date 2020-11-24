package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TOP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLimitLine extends js.Object {
  
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
  implicit class AxisLimitLineOps[Self <: AxisLimitLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: LEFT_TOP | LEFT_BOTTOM | RIGHT_TOP | RIGHT_BOTTOM): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setLineColor(value: Color): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineDashLengthsVarargs(value: Double*): Self = this.set("lineDashLengths", js.Array(value :_*))
    
    @scala.inline
    def setLineDashLengths(value: js.Array[Double]): Self = this.set("lineDashLengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashLengths: Self = this.set("lineDashLengths", js.undefined)
    
    @scala.inline
    def setLineDashPhase(value: Double): Self = this.set("lineDashPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineDashPhase: Self = this.set("lineDashPhase", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setValueFont(value: String): Self = this.set("valueFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFont: Self = this.set("valueFont", js.undefined)
    
    @scala.inline
    def setValueTextColor(value: Color): Self = this.set("valueTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueTextColor: Self = this.set("valueTextColor", js.undefined)
  }
}
