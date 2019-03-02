package typings
package reactDashNativeDashPercentageDashCircleLib.reactDashNativeDashPercentageDashCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentageCircleProps extends js.Object {
  var bgcolor: js.UndefOr[java.lang.String] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var innerColor: js.UndefOr[java.lang.String] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var textStyle: js.UndefOr[js.Array[reactDashNativeLib.reactDashNativeMod.TextStyle]] = js.undefined
}

object PercentageCircleProps {
  @scala.inline
  def apply(
    bgcolor: java.lang.String = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    innerColor: java.lang.String = null,
    percent: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    textStyle: js.Array[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
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

