package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig {
  var barShadowColor: js.UndefOr[Color] = js.undefined
  var highlightAlpha: js.UndefOr[Double] = js.undefined
  var stackLabels: js.UndefOr[js.Array[String]] = js.undefined
}

object BarDatasetConfig {
  @scala.inline
  def apply(
    axisDependency: AxisDependency = null,
    barShadowColor: Int | Double = null,
    color: Int | Double = null,
    colors: js.Array[Color] = null,
    drawValues: js.UndefOr[Boolean] = js.undefined,
    highlightAlpha: Int | Double = null,
    highlightColor: Int | Double = null,
    highlightEnabled: js.UndefOr[Boolean] = js.undefined,
    stackLabels: js.Array[String] = null,
    valueFormatter: ValueFormatter = null,
    valueTextColor: Int | Double = null,
    valueTextSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BarDatasetConfig = {
    val __obj = js.Dynamic.literal()
    if (axisDependency != null) __obj.updateDynamic("axisDependency")(axisDependency.asInstanceOf[js.Any])
    if (barShadowColor != null) __obj.updateDynamic("barShadowColor")(barShadowColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(drawValues)) __obj.updateDynamic("drawValues")(drawValues.asInstanceOf[js.Any])
    if (highlightAlpha != null) __obj.updateDynamic("highlightAlpha")(highlightAlpha.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightEnabled)) __obj.updateDynamic("highlightEnabled")(highlightEnabled.asInstanceOf[js.Any])
    if (stackLabels != null) __obj.updateDynamic("stackLabels")(stackLabels.asInstanceOf[js.Any])
    if (valueFormatter != null) __obj.updateDynamic("valueFormatter")(valueFormatter.asInstanceOf[js.Any])
    if (valueTextColor != null) __obj.updateDynamic("valueTextColor")(valueTextColor.asInstanceOf[js.Any])
    if (valueTextSize != null) __obj.updateDynamic("valueTextSize")(valueTextSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarDatasetConfig]
  }
}

