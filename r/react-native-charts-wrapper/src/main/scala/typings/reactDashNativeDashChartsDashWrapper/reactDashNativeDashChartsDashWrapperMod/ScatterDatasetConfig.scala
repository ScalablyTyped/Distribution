package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.CIRCLE
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.CROSS
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.SQUARE
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.TRIANGLE
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  var scatterShape: js.UndefOr[SQUARE | CIRCLE | TRIANGLE | CROSS | X] = js.undefined
  var scatterShapeHoleColor: js.UndefOr[Color] = js.undefined
  var scatterShapeHoleRadius: js.UndefOr[Double] = js.undefined
  var scatterShapeSize: js.UndefOr[Double] = js.undefined
}

object ScatterDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    color: Int | Double = null,
    colors: js.Array[Color] = null,
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    highlightColor: Int | Double = null,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: Int | Double = null,
    scatterShape: SQUARE | CIRCLE | TRIANGLE | CROSS | X = null,
    scatterShapeHoleColor: Int | Double = null,
    scatterShapeHoleRadius: Int | Double = null,
    scatterShapeSize: Int | Double = null,
    valueFormatter: ValueFormatter = null,
    valueTextColor: Int | Double = null,
    valueTextSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ScatterDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.asInstanceOf[js.Any])
    if (highlightLineWidth != null) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.asInstanceOf[js.Any])
    if (scatterShape != null) __obj.updateDynamic("scatterShape")(scatterShape.asInstanceOf[js.Any])
    if (scatterShapeHoleColor != null) __obj.updateDynamic("scatterShapeHoleColor")(scatterShapeHoleColor.asInstanceOf[js.Any])
    if (scatterShapeHoleRadius != null) __obj.updateDynamic("scatterShapeHoleRadius")(scatterShapeHoleRadius.asInstanceOf[js.Any])
    if (scatterShapeSize != null) __obj.updateDynamic("scatterShapeSize")(scatterShapeSize.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueTextColor != null) __obj.updateDynamic("valueTextColor")(valueTextColor.asInstanceOf[js.Any])
    if (valueTextSize != null) __obj.updateDynamic("valueTextSize")(valueTextSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterDatasetConfig]
  }
}

