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
    color: Int | Double = null,
    colors: js.Array[Color] = null,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionShift: Int | Double = null,
    sliceSpace: Int | Double = null,
    valueFormatter: ValueFormatter = null,
    valueLineColor: Int | Double = null,
    valueLinePart1Length: Int | Double = null,
    valueLinePart1OffsetPercentage: Int | Double = null,
    valueLinePart2Length: Int | Double = null,
    valueLineVariableLength: js.UndefOr[Boolean] = js.undefined,
    valueLineWidth: Int | Double = null,
    valueTextColor: Int | Double = null,
    valueTextSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    xValuePosition: PieValuePosition = null,
    yValuePosition: PieValuePosition = null
  ): PieDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.asInstanceOf[js.Any])
    if (selectionShift != null) __obj.updateDynamic("selectionShift")(selectionShift.asInstanceOf[js.Any])
    if (sliceSpace != null) __obj.updateDynamic("sliceSpace")(sliceSpace.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueLineColor != null) __obj.updateDynamic("valueLineColor")(valueLineColor.asInstanceOf[js.Any])
    if (valueLinePart1Length != null) __obj.updateDynamic("valueLinePart1Length")(valueLinePart1Length.asInstanceOf[js.Any])
    if (valueLinePart1OffsetPercentage != null) __obj.updateDynamic("valueLinePart1OffsetPercentage")(valueLinePart1OffsetPercentage.asInstanceOf[js.Any])
    if (valueLinePart2Length != null) __obj.updateDynamic("valueLinePart2Length")(valueLinePart2Length.asInstanceOf[js.Any])
    if (!js.isUndefined(valueLineVariableLength)) __obj.updateDynamic("valueLineVariableLength")(valueLineVariableLength.asInstanceOf[js.Any])
    if (valueLineWidth != null) __obj.updateDynamic("valueLineWidth")(valueLineWidth.asInstanceOf[js.Any])
    if (valueTextColor != null) __obj.updateDynamic("valueTextColor")(valueTextColor.asInstanceOf[js.Any])
    if (valueTextSize != null) __obj.updateDynamic("valueTextSize")(valueTextSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (xValuePosition != null) __obj.updateDynamic("xValuePosition")(xValuePosition.asInstanceOf[js.Any])
    if (yValuePosition != null) __obj.updateDynamic("yValuePosition")(yValuePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieDatasetConfig]
  }
}

