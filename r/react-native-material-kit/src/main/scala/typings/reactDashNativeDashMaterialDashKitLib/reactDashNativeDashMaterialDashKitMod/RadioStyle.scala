package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioStyle extends js.Object {
  var borderOffColor: js.UndefOr[java.lang.String] = js.undefined
  var borderOnColor: js.UndefOr[java.lang.String] = js.undefined
  var extraRippleRadius: js.UndefOr[scala.Double] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
}

object RadioStyle {
  @scala.inline
  def apply(
    borderOffColor: java.lang.String = null,
    borderOnColor: java.lang.String = null,
    extraRippleRadius: scala.Int | scala.Double = null,
    fillColor: java.lang.String = null,
    rippleColor: java.lang.String = null
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

