package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonInformation extends js.Object {
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var icon: String
  var title: String
}

object ButtonInformation {
  @scala.inline
  def apply(icon: String, title: String, buttonStyle: StyleProp[ViewStyle] = null): ButtonInformation = {
    val __obj = js.Dynamic.literal(icon = icon, title = title)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonInformation]
  }
}

