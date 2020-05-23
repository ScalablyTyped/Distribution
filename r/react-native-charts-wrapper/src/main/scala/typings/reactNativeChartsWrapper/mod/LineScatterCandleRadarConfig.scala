package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineScatterCandleRadarConfig extends js.Object {
  var drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined
  var drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined
  var drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined
  var highlightLineWidth: js.UndefOr[Double] = js.undefined
}

object LineScatterCandleRadarConfig {
  @scala.inline
  def apply(
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: js.UndefOr[Double] = js.undefined
  ): LineScatterCandleRadarConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightLineWidth)) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineScatterCandleRadarConfig]
  }
}

