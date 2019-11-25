package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxStyle extends js.Object {
  var borderOffColor: js.UndefOr[String] = js.undefined
  var borderOnColor: js.UndefOr[String] = js.undefined
  var fillColor: js.UndefOr[String] = js.undefined
  var inset: js.UndefOr[Double] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
}

object CheckboxStyle {
  @scala.inline
  def apply(
    borderOffColor: String = null,
    borderOnColor: String = null,
    fillColor: String = null,
    inset: Int | Double = null,
    rippleColor: String = null
  ): CheckboxStyle = {
    val __obj = js.Dynamic.literal()
    if (borderOffColor != null) __obj.updateDynamic("borderOffColor")(borderOffColor.asInstanceOf[js.Any])
    if (borderOnColor != null) __obj.updateDynamic("borderOnColor")(borderOnColor.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxStyle]
  }
}

