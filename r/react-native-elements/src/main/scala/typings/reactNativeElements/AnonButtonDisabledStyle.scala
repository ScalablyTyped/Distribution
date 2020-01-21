package typings.reactNativeElements

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonDisabledStyle extends js.Object {
  var buttonDisabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonDisabledTextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var buttonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
}

object AnonButtonDisabledStyle {
  @scala.inline
  def apply(
    buttonDisabledStyle: StyleProp[ViewStyle] = null,
    buttonDisabledTextStyle: StyleProp[ViewStyle] = null,
    buttonStyle: StyleProp[ViewStyle] = null,
    buttonTextStyle: StyleProp[TextStyle] = null,
    color: String = null
  ): AnonButtonDisabledStyle = {
    val __obj = js.Dynamic.literal()
    if (buttonDisabledStyle != null) __obj.updateDynamic("buttonDisabledStyle")(buttonDisabledStyle.asInstanceOf[js.Any])
    if (buttonDisabledTextStyle != null) __obj.updateDynamic("buttonDisabledTextStyle")(buttonDisabledTextStyle.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonButtonDisabledStyle]
  }
}

