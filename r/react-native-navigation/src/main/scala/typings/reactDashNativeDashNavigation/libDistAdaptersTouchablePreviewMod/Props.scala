package typings.reactDashNativeDashNavigation.libDistAdaptersTouchablePreviewMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TouchableHighlight
import typings.reactDashNative.reactDashNativeMod.TouchableNativeFeedback
import typings.reactDashNative.reactDashNativeMod.TouchableOpacity
import typings.reactDashNative.reactDashNativeMod.TouchableWithoutFeedback
import typings.reactDashNativeDashNavigation.Anon_ReactTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* payload */ Anon_ReactTag, Unit]] = js.undefined
  var touchableComponent: js.UndefOr[
    TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactNode
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    onPeekIn: () => Unit = null,
    onPeekOut: () => Unit = null,
    onPress: () => Unit = null,
    onPressIn: /* payload */ Anon_ReactTag => Unit = null,
    touchableComponent: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactNode = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onPeekIn != null) __obj.updateDynamic("onPeekIn")(js.Any.fromFunction0(onPeekIn))
    if (onPeekOut != null) __obj.updateDynamic("onPeekOut")(js.Any.fromFunction0(onPeekOut))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

