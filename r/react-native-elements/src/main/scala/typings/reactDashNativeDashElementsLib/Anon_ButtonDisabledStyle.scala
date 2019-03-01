package typings
package reactDashNativeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonDisabledStyle extends js.Object {
  var buttonDisabledStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var buttonDisabledTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var buttonStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var buttonTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ButtonDisabledStyle {
  @scala.inline
  def apply(
    buttonDisabledStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    buttonDisabledTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    buttonStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    buttonTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    color: java.lang.String = null
  ): Anon_ButtonDisabledStyle = {
    val __obj = js.Dynamic.literal()
    if (buttonDisabledStyle != null) __obj.updateDynamic("buttonDisabledStyle")(buttonDisabledStyle.asInstanceOf[js.Any])
    if (buttonDisabledTextStyle != null) __obj.updateDynamic("buttonDisabledTextStyle")(buttonDisabledTextStyle.asInstanceOf[js.Any])
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Anon_ButtonDisabledStyle]
  }
}

