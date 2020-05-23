package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioStyle extends js.Object {
  var borderOffColor: js.UndefOr[String] = js.undefined
  var borderOnColor: js.UndefOr[String] = js.undefined
  var extraRippleRadius: js.UndefOr[Double] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
}

object RadioStyle {
  @scala.inline
  def apply(
    borderOffColor: String = null,
    borderOnColor: String = null,
    extraRippleRadius: js.UndefOr[Double] = js.undefined,
    fillColor: String = null,
    rippleColor: String = null
  ): RadioStyle = {
    val __obj = js.Dynamic.literal()
    if (borderOffColor != null) __obj.updateDynamic("borderOffColor")(borderOffColor.asInstanceOf[js.Any])
    if (borderOnColor != null) __obj.updateDynamic("borderOnColor")(borderOnColor.asInstanceOf[js.Any])
    if (!js.isUndefined(extraRippleRadius)) __obj.updateDynamic("extraRippleRadius")(extraRippleRadius.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioStyle]
  }
}

