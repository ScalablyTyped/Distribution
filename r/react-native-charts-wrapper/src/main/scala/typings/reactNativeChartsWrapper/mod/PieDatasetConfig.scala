package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieDatasetConfig extends CommonDatasetConfig {
  var selectionShift: js.UndefOr[Double] = js.undefined
  var sliceSpace: js.UndefOr[Double] = js.undefined
  var valueLineColor: js.UndefOr[Color] = js.undefined
  var valueLinePart1Length: js.UndefOr[Double] = js.undefined
  var valueLinePart1OffsetPercentage: js.UndefOr[Double] = js.undefined
  var valueLinePart2Length: js.UndefOr[Double] = js.undefined
  var valueLineVariableLength: js.UndefOr[Boolean] = js.undefined
  var valueLineWidth: js.UndefOr[Double] = js.undefined
  var xValuePosition: js.UndefOr[PieValuePosition] = js.undefined
  var yValuePosition: js.UndefOr[PieValuePosition] = js.undefined
}

object PieDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    color: js.UndefOr[Color] = js.undefined,
    colors: js.Array[Color] = null,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionShift: js.UndefOr[Double] = js.undefined,
    sliceSpace: js.UndefOr[Double] = js.undefined,
    valueFormatter: ValueFormatter = null,
    valueLineColor: js.UndefOr[Color] = js.undefined,
    valueLinePart1Length: js.UndefOr[Double] = js.undefined,
    valueLinePart1OffsetPercentage: js.UndefOr[Double] = js.undefined,
    valueLinePart2Length: js.UndefOr[Double] = js.undefined,
    valueLineVariableLength: js.UndefOr[Boolean] = js.undefined,
    valueLineWidth: js.UndefOr[Double] = js.undefined,
    valueTextColor: js.UndefOr[Color] = js.undefined,
    valueTextSize: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    xValuePosition: PieValuePosition = null,
    yValuePosition: PieValuePosition = null
  ): PieDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionShift)) __obj.updateDynamic("selectionShift")(selectionShift.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sliceSpace)) __obj.updateDynamic("sliceSpace")(sliceSpace.get.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLineColor)) __obj.updateDynamic("valueLineColor")(valueLineColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLinePart1Length)) __obj.updateDynamic("valueLinePart1Length")(valueLinePart1Length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLinePart1OffsetPercentage)) __obj.updateDynamic("valueLinePart1OffsetPercentage")(valueLinePart1OffsetPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLinePart2Length)) __obj.updateDynamic("valueLinePart2Length")(valueLinePart2Length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLineVariableLength)) __obj.updateDynamic("valueLineVariableLength")(valueLineVariableLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLineWidth)) __obj.updateDynamic("valueLineWidth")(valueLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextColor)) __obj.updateDynamic("valueTextColor")(valueTextColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valueTextSize)) __obj.updateDynamic("valueTextSize")(valueTextSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (xValuePosition != null) __obj.updateDynamic("xValuePosition")(xValuePosition.asInstanceOf[js.Any])
    if (yValuePosition != null) __obj.updateDynamic("yValuePosition")(yValuePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieDatasetConfig]
  }
}

