package typings.reactDashNativeDashGestureDashHandler.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.Ref
import typings.reactDashNativeDashGestureDashHandler.Anon_Bottom
import typings.reactDashNativeDashGestureDashHandler.Anon_BottomHeight
import typings.reactDashNativeDashGestureDashHandler.Anon_Height
import typings.reactDashNativeDashGestureDashHandler.Anon_Left
import typings.reactDashNativeDashGestureDashHandler.Anon_Right
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerGestureEvent
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerStateChangeEvent
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RawButtonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: id */
object RawButton
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RawButton
    ] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RawButton].asInstanceOf[String | js.Object]
  def apply(
    disallowInterruption: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    onGestureEvent: /* event */ NativeViewGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ NativeViewGestureHandlerStateChangeEvent => Unit = null,
    shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    testID: String = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null
  ): BuildingComponent[
    tag.type, 
    typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RawButton
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disallowInterruption)) __obj.updateDynamic("disallowInterruption")(disallowInterruption)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldActivateOnStart)) __obj.updateDynamic("shouldActivateOnStart")(shouldActivateOnStart)
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside)
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RawButtonProperties
}

