package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldStyle extends js.Object {
  var highlightColor: js.UndefOr[java.lang.String] = js.undefined
  var textInputStyle: js.UndefOr[reactDashNativeDashMaterialDashKitLib.Anon_Color] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
}

object TextFieldStyle {
  @scala.inline
  def apply(
    highlightColor: java.lang.String = null,
    textInputStyle: reactDashNativeDashMaterialDashKitLib.Anon_Color = null,
    tintColor: java.lang.String = null
  ): TextFieldStyle = {
    val __obj = js.Dynamic.literal()
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (textInputStyle != null) __obj.updateDynamic("textInputStyle")(textInputStyle)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[TextFieldStyle]
  }
}

