package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Angle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarDatasetConfig
  extends CommonDatasetConfig
     with LineScatterCandleRadarConfig
     with LineRadarConfig

object RadarDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    color: js.UndefOr[Color] = js.undefined,
    colors: js.Array[Color] = null,
    drawFilled: js.UndefOr[Boolean] = js.undefined,
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    fillAlpha: js.UndefOr[Double] = js.undefined,
    fillColor: js.UndefOr[Color] = js.undefined,
    fillGradient: Angle = null,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: js.UndefOr[Double] = js.undefined,
    lineWidth: js.UndefOr[Double] = js.undefined,
    valueFormatter: ValueFormatter = null,
    valueTextColor: js.UndefOr[Color] = js.undefined,
    valueTextSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): RadarDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawFilled)) __obj.updateDynamic("drawFilled")(drawFilled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillAlpha)) __obj.updateDynamic("fillAlpha")(fillAlpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillColor)) __obj.updateDynamic("fillColor")(fillColor.get.asInstanceOf[js.Any])
    if (fillGradient != null) __obj.updateDynamic("fillGradient")(fillGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightLineWidth)) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextColor)) __obj.updateDynamic("valueTextColor")(valueTextColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextSize)) __obj.updateDynamic("valueTextSize")(valueTextSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarDatasetConfig]
  }
}

