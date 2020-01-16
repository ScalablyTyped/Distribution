package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonDatasetConfig extends js.Object {
  var axisDependency: js.UndefOr[AxisDependency] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  var drawValues: js.UndefOr[Boolean] = js.undefined
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  var valueFormatter: js.UndefOr[ValueFormatter] = js.undefined
  var valueTextColor: js.UndefOr[Color] = js.undefined
  var valueTextSize: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CommonDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    color: Int | Double = null,
    colors: js.Array[Color] = null,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    valueFormatter: ValueFormatter = null,
    valueTextColor: Int | Double = null,
    valueTextSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CommonDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueTextColor != null) __obj.updateDynamic("valueTextColor")(valueTextColor.asInstanceOf[js.Any])
    if (valueTextSize != null) __obj.updateDynamic("valueTextSize")(valueTextSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonDatasetConfig]
  }
}

