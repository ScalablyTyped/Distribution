package typings.reactNativeMaterialMenu.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.clip
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.head
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.middle
import typings.reactNativeMaterialMenu.reactNativeMaterialMenuStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
  var underlayColor: js.UndefOr[String] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledTextColor: String = null,
    ellipsizeMode: head | middle | tail | clip = null,
    onPress: () => Unit = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    testID: String = null,
    textStyle: TextStyle = null,
    underlayColor: String = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (disabledTextColor != null) __obj.updateDynamic("disabledTextColor")(disabledTextColor.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

