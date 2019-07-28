package typings.reactDashNativeDashKeyboardDashSpacer.reactDashNativeDashKeyboardDashSpacerMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardSpacerProps extends js.Object {
  var onToggle: js.UndefOr[js.Function2[/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double, Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var topSpacing: js.UndefOr[Double] = js.undefined
}

object KeyboardSpacerProps {
  @scala.inline
  def apply(
    onToggle: (/* keyboardIsOpen */ Boolean, /* keyboardSpace */ Double) => Unit = null,
    style: StyleProp[ViewStyle] = null,
    topSpacing: Int | Double = null
  ): KeyboardSpacerProps = {
    val __obj = js.Dynamic.literal()
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (topSpacing != null) __obj.updateDynamic("topSpacing")(topSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardSpacerProps]
  }
}

