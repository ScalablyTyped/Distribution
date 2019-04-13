package typings
package reactDashNativeDashNavigationLib.libDistAdaptersTouchablePreviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var onPeekIn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPeekOut: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressIn: js.UndefOr[
    js.Function1[/* payload */ reactDashNativeDashNavigationLib.Anon_ReactTag, scala.Unit]
  ] = js.undefined
  var touchableComponent: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.TouchableHighlight | reactDashNativeLib.reactDashNativeMod.TouchableOpacity | reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedback | reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedback | reactLib.reactMod.ReactNode
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    onPeekIn: () => scala.Unit = null,
    onPeekOut: () => scala.Unit = null,
    onPress: () => scala.Unit = null,
    onPressIn: /* payload */ reactDashNativeDashNavigationLib.Anon_ReactTag => scala.Unit = null,
    touchableComponent: reactDashNativeLib.reactDashNativeMod.TouchableHighlight | reactDashNativeLib.reactDashNativeMod.TouchableOpacity | reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedback | reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedback | reactLib.reactMod.ReactNode = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (onPeekIn != null) __obj.updateDynamic("onPeekIn")(js.Any.fromFunction0(onPeekIn))
    if (onPeekOut != null) __obj.updateDynamic("onPeekOut")(js.Any.fromFunction0(onPeekOut))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

