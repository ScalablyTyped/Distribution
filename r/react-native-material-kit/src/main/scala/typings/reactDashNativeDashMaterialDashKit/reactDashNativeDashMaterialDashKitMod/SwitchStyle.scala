package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchStyle extends js.Object {
  var offColor: js.UndefOr[String] = js.undefined
  var onColor: js.UndefOr[String] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
  var thumbOffColor: js.UndefOr[String] = js.undefined
  var thumbOnColor: js.UndefOr[String] = js.undefined
}

object SwitchStyle {
  @scala.inline
  def apply(
    offColor: String = null,
    onColor: String = null,
    rippleColor: String = null,
    thumbOffColor: String = null,
    thumbOnColor: String = null
  ): SwitchStyle = {
    val __obj = js.Dynamic.literal()
    if (offColor != null) __obj.updateDynamic("offColor")(offColor)
    if (onColor != null) __obj.updateDynamic("onColor")(onColor)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (thumbOffColor != null) __obj.updateDynamic("thumbOffColor")(thumbOffColor)
    if (thumbOnColor != null) __obj.updateDynamic("thumbOnColor")(thumbOnColor)
    __obj.asInstanceOf[SwitchStyle]
  }
}

