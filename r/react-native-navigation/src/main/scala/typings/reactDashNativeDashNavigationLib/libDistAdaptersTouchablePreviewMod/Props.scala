package typings
package reactDashNativeDashNavigationLib.libDistAdaptersTouchablePreviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var onPeekIn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPeekOut: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressIn: js.UndefOr[
    js.Function1[/* payload */ reactDashNativeDashNavigationLib.Anon_ReactTag, scala.Unit]
  ] = js.undefined
  var touchableComponent: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.TouchableHighlight | reactDashNativeLib.reactDashNativeMod.TouchableOpacity | reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedback | reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedback | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    onPeekIn: js.Function0[scala.Unit] = null,
    onPeekOut: js.Function0[scala.Unit] = null,
    onPress: js.Function0[scala.Unit] = null,
    onPressIn: js.Function1[/* payload */ reactDashNativeDashNavigationLib.Anon_ReactTag, scala.Unit] = null,
    touchableComponent: reactDashNativeLib.reactDashNativeMod.TouchableHighlight | reactDashNativeLib.reactDashNativeMod.TouchableOpacity | reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedback | reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedback | reactLib.reactMod.ReactNs.ReactNode = null
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (onPeekIn != null) __obj.updateDynamic("onPeekIn")(onPeekIn)
    if (onPeekOut != null) __obj.updateDynamic("onPeekOut")(onPeekOut)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(onPressIn)
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

