package typings
package reactDashNativeDashPopupDashDialogLib.reactDashNativeDashPopupDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButtonProps extends js.Object {
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
  var align: js.UndefOr[AlignTypes] = js.undefined
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onPress: js.UndefOr[
    js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var text: java.lang.String
  var textStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

object DialogButtonProps {
  @scala.inline
  def apply(
    text: java.lang.String,
    activeOpacity: scala.Int | scala.Double = null,
    align: AlignTypes = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onPress: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    textStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): DialogButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogButtonProps]
  }
}

