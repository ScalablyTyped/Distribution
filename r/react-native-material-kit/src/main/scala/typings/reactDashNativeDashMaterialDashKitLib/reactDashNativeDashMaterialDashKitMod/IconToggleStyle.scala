package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconToggleStyle extends js.Object {
  var offColor: js.UndefOr[java.lang.String] = js.undefined
  var onColor: js.UndefOr[java.lang.String] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
}

object IconToggleStyle {
  @scala.inline
  def apply(
    offColor: java.lang.String = null,
    onColor: java.lang.String = null,
    rippleColor: java.lang.String = null
  ): IconToggleStyle = {
    val __obj = js.Dynamic.literal()
    if (offColor != null) __obj.updateDynamic("offColor")(offColor)
    if (onColor != null) __obj.updateDynamic("onColor")(onColor)
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    __obj.asInstanceOf[IconToggleStyle]
  }
}

