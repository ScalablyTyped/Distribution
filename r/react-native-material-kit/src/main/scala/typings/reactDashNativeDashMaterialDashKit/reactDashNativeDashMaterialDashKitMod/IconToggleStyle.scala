package typings.reactDashNativeDashMaterialDashKit.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconToggleStyle extends js.Object {
  var offColor: js.UndefOr[String] = js.undefined
  var onColor: js.UndefOr[String] = js.undefined
  var rippleColor: js.UndefOr[String] = js.undefined
}

object IconToggleStyle {
  @scala.inline
  def apply(offColor: String = null, onColor: String = null, rippleColor: String = null): IconToggleStyle = {
    val __obj = js.Dynamic.literal()
    if (offColor != null) __obj.updateDynamic("offColor")(offColor.asInstanceOf[js.Any])
    if (onColor != null) __obj.updateDynamic("onColor")(onColor.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconToggleStyle]
  }
}

