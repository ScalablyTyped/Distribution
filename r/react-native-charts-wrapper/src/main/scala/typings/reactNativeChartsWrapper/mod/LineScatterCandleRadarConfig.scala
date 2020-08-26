package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineScatterCandleRadarConfig extends js.Object {
  var drawHighlightIndicators: js.UndefOr[Boolean] = js.native
  var drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.native
  var drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.native
  var highlightLineWidth: js.UndefOr[Double] = js.native
}

object LineScatterCandleRadarConfig {
  @scala.inline
  def apply(): LineScatterCandleRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineScatterCandleRadarConfig]
  }
  @scala.inline
  implicit class LineScatterCandleRadarConfigOps[Self <: LineScatterCandleRadarConfig] (val x: Self) extends AnyVal {
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
    def setDrawHighlightIndicators(value: Boolean): Self = this.set("drawHighlightIndicators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawHighlightIndicators: Self = this.set("drawHighlightIndicators", js.undefined)
    @scala.inline
    def setDrawHorizontalHighlightIndicator(value: Boolean): Self = this.set("drawHorizontalHighlightIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawHorizontalHighlightIndicator: Self = this.set("drawHorizontalHighlightIndicator", js.undefined)
    @scala.inline
    def setDrawVerticalHighlightIndicator(value: Boolean): Self = this.set("drawVerticalHighlightIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawVerticalHighlightIndicator: Self = this.set("drawVerticalHighlightIndicator", js.undefined)
    @scala.inline
    def setHighlightLineWidth(value: Double): Self = this.set("highlightLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightLineWidth: Self = this.set("highlightLineWidth", js.undefined)
  }
  
}

