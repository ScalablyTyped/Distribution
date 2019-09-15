package typings.reactDashNativeDashGestureDashHandler.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.Ref
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashGestureDashHandler.Anon_Bottom
import typings.reactDashNativeDashGestureDashHandler.Anon_BottomHeight
import typings.reactDashNativeDashGestureDashHandler.Anon_Height
import typings.reactDashNativeDashGestureDashHandler.Anon_Left
import typings.reactDashNativeDashGestureDashHandler.Anon_Right
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.BorderlessButtonProperties
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerGestureEvent
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: id */
object BorderlessButton
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.BorderlessButton
    ] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.BorderlessButton].asInstanceOf[String | js.Object]
  def apply(
    activeOpacity: Int | Double = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    disallowInterruption: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    onActiveStateChange: /* active */ Boolean => Unit = null,
    onGestureEvent: /* event */ NativeViewGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit = null,
    onPress: /* pointerInside */ Boolean => Unit = null,
    rippleColor: String = null,
    shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    style: StyleProp[ViewStyle] = null,
    testID: String = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null
  ): BuildingComponent[
    tag.type, 
    typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.BorderlessButton
  ] = {
    val __obj = js.Dynamic.literal()
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (!js.isUndefined(disallowInterruption)) __obj.updateDynamic("disallowInterruption")(disallowInterruption)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (onActiveStateChange != null) __obj.updateDynamic("onActiveStateChange")(js.Any.fromFunction1(onActiveStateChange))
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (!js.isUndefined(shouldActivateOnStart)) __obj.updateDynamic("shouldActivateOnStart")(shouldActivateOnStart)
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside)
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BorderlessButtonProperties
}

