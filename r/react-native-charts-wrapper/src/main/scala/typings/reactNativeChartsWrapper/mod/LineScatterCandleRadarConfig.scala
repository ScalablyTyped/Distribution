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
    highlightLineWidth: Int | Double = null
  ): LineScatterCandleRadarConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.asInstanceOf[js.Any])
    if (highlightLineWidth != null) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineScatterCandleRadarConfig]
  }
}

