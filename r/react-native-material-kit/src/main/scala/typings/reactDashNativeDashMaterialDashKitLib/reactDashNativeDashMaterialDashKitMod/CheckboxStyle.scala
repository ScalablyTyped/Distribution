package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxStyle extends js.Object {
  var borderOffColor: js.UndefOr[java.lang.String] = js.undefined
  var borderOnColor: js.UndefOr[java.lang.String] = js.undefined
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[scala.Double] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
}

object CheckboxStyle {
  @scala.inline
  def apply(
    borderOffColor: java.lang.String = null,
    borderOnColor: java.lang.String = null,
    fillColor: java.lang.String = null,
    inset: scala.Int | scala.Double = null,
    rippleColor: java.lang.String = null
  ): CheckboxStyle = {
    val __obj = js.Dynamic.literal()
    if (borderOffColor != null) __obj.updateDynamic("borderOffColor")(borderOffColor)
    if (borderOnColor != null) __obj.updateDynamic("borderOnColor")(borderOnColor)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    __obj.asInstanceOf[CheckboxStyle]
  }
}

