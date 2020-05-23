package typings.reactGaugeChart.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeChartProps extends js.Object {
  var animDelay: js.UndefOr[Double] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var arcPadding: js.UndefOr[Double] = js.undefined
  var arcWidth: js.UndefOr[Double] = js.undefined
  var arcsLength: js.UndefOr[js.Array[Double]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var formatTextValue: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var hideText: js.UndefOr[Boolean] = js.undefined
  var id: String
  var marginInPercent: js.UndefOr[Double] = js.undefined
  var needleBaseColor: js.UndefOr[String] = js.undefined
  var needleColor: js.UndefOr[String] = js.undefined
  var nrOfLevels: js.UndefOr[Double] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
}

object GaugeChartProps {
  @scala.inline
  def apply(
    id: String,
    animDelay: js.UndefOr[Double] = js.undefined,
    animate: js.UndefOr[Boolean] = js.undefined,
    arcPadding: js.UndefOr[Double] = js.undefined,
    arcWidth: js.UndefOr[Double] = js.undefined,
    arcsLength: js.Array[Double] = null,
    className: String = null,
    colors: js.Array[String] = null,
    cornerRadius: js.UndefOr[Double] = js.undefined,
    fontSize: String = null,
    formatTextValue: /* value */ String => String = null,
    hideText: js.UndefOr[Boolean] = js.undefined,
    marginInPercent: js.UndefOr[Double] = js.undefined,
    needleBaseColor: String = null,
    needleColor: String = null,
    nrOfLevels: js.UndefOr[Double] = js.undefined,
    percent: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    textColor: String = null
  ): GaugeChartProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(animDelay)) __obj.updateDynamic("animDelay")(animDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arcPadding)) __obj.updateDynamic("arcPadding")(arcPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arcWidth)) __obj.updateDynamic("arcWidth")(arcWidth.get.asInstanceOf[js.Any])
    if (arcsLength != null) __obj.updateDynamic("arcsLength")(arcsLength.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (formatTextValue != null) __obj.updateDynamic("formatTextValue")(js.Any.fromFunction1(formatTextValue))
    if (!js.isUndefined(hideText)) __obj.updateDynamic("hideText")(hideText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginInPercent)) __obj.updateDynamic("marginInPercent")(marginInPercent.get.asInstanceOf[js.Any])
    if (needleBaseColor != null) __obj.updateDynamic("needleBaseColor")(needleBaseColor.asInstanceOf[js.Any])
    if (needleColor != null) __obj.updateDynamic("needleColor")(needleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(nrOfLevels)) __obj.updateDynamic("nrOfLevels")(nrOfLevels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeChartProps]
  }
}

