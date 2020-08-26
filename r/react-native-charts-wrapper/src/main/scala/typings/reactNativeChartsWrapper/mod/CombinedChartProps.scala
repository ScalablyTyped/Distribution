package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BAR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BUBBLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CANDLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SCATTER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CombinedChartPropsOps[Self <: CombinedChartProps] (val x: Self) extends AnyVal {
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
    def setData(value: CombinedData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDrawBarShadow(value: Boolean): Self = this.set("drawBarShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawBarShadow: Self = this.set("drawBarShadow", js.undefined)
    @scala.inline
    def setDrawOrderVarargs(value: (BAR | BUBBLE | LINE | CANDLE | SCATTER)*): Self = this.set("drawOrder", js.Array(value :_*))
    @scala.inline
    def setDrawOrder(value: js.Array[BAR | BUBBLE | LINE | CANDLE | SCATTER]): Self = this.set("drawOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawOrder: Self = this.set("drawOrder", js.undefined)
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

