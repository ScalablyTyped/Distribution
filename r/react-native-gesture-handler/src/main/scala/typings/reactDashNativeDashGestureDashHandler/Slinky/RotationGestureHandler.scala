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
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandlerGestureEvent
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandlerProperties
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: id */
object RotationGestureHandler
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandler
    ] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandler].asInstanceOf[String | js.Object]
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    onGestureEvent: /* event */ RotationGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ RotationGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null
  ): BuildingComponent[
    tag.type, 
    typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.RotationGestureHandler
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside)
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RotationGestureHandlerProperties
}

