package typings.reactDashNativeDashTabDashView

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Borderless extends js.Object {
  var borderless: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var delayPressIn: js.UndefOr[Double] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pressColor: String
  var pressOpacity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  def onPress(): Unit
}

object Anon_Borderless {
  @scala.inline
  def apply(
    onPress: () => Unit,
    pressColor: String,
    borderless: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    delayPressIn: Int | Double = null,
    onLongPress: () => Unit = null,
    pressOpacity: Int | Double = null,
    style: StyleProp[ViewStyle] = null
  ): Anon_Borderless = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress), pressColor = pressColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (pressOpacity != null) __obj.updateDynamic("pressOpacity")(pressOpacity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Borderless]
  }
}

