package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CROSS
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TRIANGLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.X
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
    color: js.UndefOr[Color] = js.undefined,
    colors: js.Array[Color] = null,
    drawHighlightIndicators: js.UndefOr[Boolean] = js.undefined,
    drawHorizontalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    drawVerticalHighlightIndicator: js.UndefOr[Boolean] = js.undefined,
    highlightColor: js.UndefOr[Color] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    highlightLineWidth: js.UndefOr[Double] = js.undefined,
    scatterShape: SQUARE | CIRCLE | TRIANGLE | CROSS | X = null,
    scatterShapeHoleColor: js.UndefOr[Color] = js.undefined,
    scatterShapeHoleRadius: js.UndefOr[Double] = js.undefined,
    scatterShapeSize: js.UndefOr[Double] = js.undefined,
    valueFormatter: ValueFormatter = null,
    valueTextColor: js.UndefOr[Color] = js.undefined,
    valueTextSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ScatterDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHighlightIndicators)) __obj.updateDynamic("drawHighlightIndicators")(drawHighlightIndicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawHorizontalHighlightIndicator)) __obj.updateDynamic("drawHorizontalHighlightIndicator")(drawHorizontalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawVerticalHighlightIndicator)) __obj.updateDynamic("drawVerticalHighlightIndicator")(drawVerticalHighlightIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightColor)) __obj.updateDynamic("highlightColor")(highlightColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightLineWidth)) __obj.updateDynamic("highlightLineWidth")(highlightLineWidth.get.asInstanceOf[js.Any])
    if (scatterShape != null) __obj.updateDynamic("scatterShape")(scatterShape.asInstanceOf[js.Any])
    if (!js.isUndefined(scatterShapeHoleColor)) __obj.updateDynamic("scatterShapeHoleColor")(scatterShapeHoleColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scatterShapeHoleRadius)) __obj.updateDynamic("scatterShapeHoleRadius")(scatterShapeHoleRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scatterShapeSize)) __obj.updateDynamic("scatterShapeSize")(scatterShapeSize.get.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextColor)) __obj.updateDynamic("valueTextColor")(valueTextColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextSize)) __obj.updateDynamic("valueTextSize")(valueTextSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterDatasetConfig]
  }
}

