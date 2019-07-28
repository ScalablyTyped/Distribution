package typings.reactDashNativeDashPercentageDashCircle.reactDashNativeDashPercentageDashCircleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
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
    borderWidth: Int | Double = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    innerColor: String = null,
    percent: Int | Double = null,
    radius: Int | Double = null,
    textStyle: js.Array[TextStyle] = null
  ): PercentageCircleProps = {
    val __obj = js.Dynamic.literal()
    if (bgcolor != null) __obj.updateDynamic("bgcolor")(bgcolor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (innerColor != null) __obj.updateDynamic("innerColor")(innerColor)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[PercentageCircleProps]
  }
}

