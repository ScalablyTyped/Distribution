package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchStyle extends js.Object {
  var offColor: js.UndefOr[java.lang.String] = js.undefined
  var onColor: js.UndefOr[java.lang.String] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  var thumbOffColor: js.UndefOr[java.lang.String] = js.undefined
  var thumbOnColor: js.UndefOr[java.lang.String] = js.undefined
}

object SwitchStyle {
  @scala.inline
  def apply(
    offColor: java.lang.String = null,
    onColor: java.lang.String = null,
    rippleColor: java.lang.String = null,
    thumbOffColor: java.lang.String = null,
    thumbOnColor: java.lang.String = null
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

