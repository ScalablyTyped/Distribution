package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class BarChartPropsOps[Self <: BarChartProps] (val x: Self) extends AnyVal {
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
    def setData(value: BarData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawBarShadow(value: Boolean): Self = this.set("drawBarShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawBarShadow: Self = this.set("drawBarShadow", js.undefined)
    @scala.inline
    def setDrawValueAboveBar(value: Boolean): Self = this.set("drawValueAboveBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawValueAboveBar: Self = this.set("drawValueAboveBar", js.undefined)
    @scala.inline
    def setHighlightFullBarEnabled(value: Boolean): Self = this.set("highlightFullBarEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightFullBarEnabled: Self = this.set("highlightFullBarEnabled", js.undefined)
  }
  
}

