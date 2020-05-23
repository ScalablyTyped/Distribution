package typings.reactNativeElements.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
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
    buttonStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    titleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined
  ): ButtonInformation = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonStyle)) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(titleStyle)) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonInformation]
  }
}

