package typings
package reactDashNativeDashKeyboardDashSpacerLib.reactDashNativeDashKeyboardDashSpacerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardSpacerProps extends js.Object {
  var onToggle: js.UndefOr[
    js.Function2[/* keyboardIsOpen */ scala.Boolean, /* keyboardSpace */ scala.Double, scala.Unit]
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var topSpacing: js.UndefOr[scala.Double] = js.undefined
}

object KeyboardSpacerProps {
  @scala.inline
  def apply(
    onToggle: (/* keyboardIsOpen */ scala.Boolean, /* keyboardSpace */ scala.Double) => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    topSpacing: scala.Int | scala.Double = null
  ): KeyboardSpacerProps = {
    val __obj = js.Dynamic.literal()
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topSpacing != null) __obj.updateDynamic("topSpacing")(topSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardSpacerProps]
  }
}

