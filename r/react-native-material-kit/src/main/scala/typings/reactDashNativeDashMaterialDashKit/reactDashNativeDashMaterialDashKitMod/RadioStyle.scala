package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

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
    extraRippleRadius: Int | Double = null,
    fillColor: String = null,
    rippleColor: String = null
  ): RadioStyle = {
    val __obj = js.Dynamic.literal()
    if (borderOffColor != null) __obj.updateDynamic("borderOffColor")(borderOffColor)
    if (borderOnColor != null) __obj.updateDynamic("borderOnColor")(borderOnColor)
    if (extraRippleRadius != null) __obj.updateDynamic("extraRippleRadius")(extraRippleRadius.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    __obj.asInstanceOf[RadioStyle]
  }
}

