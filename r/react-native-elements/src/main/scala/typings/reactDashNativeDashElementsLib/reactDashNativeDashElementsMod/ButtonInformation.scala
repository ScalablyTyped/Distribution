package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonInformation extends js.Object {
  var buttonStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var icon: java.lang.String
  var title: java.lang.String
}

object ButtonInformation {
  @scala.inline
  def apply(
    icon: java.lang.String,
    title: java.lang.String,
    buttonStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): ButtonInformation = {
    val __obj = js.Dynamic.literal(icon = icon, title = title)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonInformation]
  }
}

