package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonInformation extends js.Object {
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var icon: String
  var title: String
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object ButtonInformation {
  @scala.inline
  def apply(
    icon: String,
    title: String,
    buttonStyle: StyleProp[ViewStyle] = null,
    titleStyle: StyleProp[TextStyle] = null
  ): ButtonInformation = {
    val __obj = js.Dynamic.literal(icon = icon, title = title)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonInformation]
  }
}

