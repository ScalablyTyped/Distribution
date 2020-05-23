package typings.reactNativeKeyboardSpacer.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
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
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    topSpacing: js.UndefOr[Double] = js.undefined
  ): KeyboardSpacerProps = {
    val __obj = js.Dynamic.literal()
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(topSpacing)) __obj.updateDynamic("topSpacing")(topSpacing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardSpacerProps]
  }
}

