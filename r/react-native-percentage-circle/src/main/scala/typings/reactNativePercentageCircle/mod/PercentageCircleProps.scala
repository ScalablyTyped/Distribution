package typings.reactNativePercentageCircle.mod

import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentageCircleProps extends js.Object {
  var bgcolor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var innerColor: js.UndefOr[String] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[js.Array[TextStyle]] = js.undefined
}

object PercentageCircleProps {
  @scala.inline
  def apply(
    bgcolor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    percent: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    textStyle: js.Array[TextStyle] = null
  ): PercentageCircleProps = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (innerColor != null) __obj.updateDynamic("innerColor")(innerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentageCircleProps]
  }
}

