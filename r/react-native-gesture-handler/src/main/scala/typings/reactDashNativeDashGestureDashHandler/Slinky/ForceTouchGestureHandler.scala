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
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerGestureEvent
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerProperties
import typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandlerStateChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: id */
object ForceTouchGestureHandler
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler
    ] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler].asInstanceOf[String | js.Object]
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    feedbackOnActivation: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Anon_Bottom | Anon_Left | Anon_Right | Anon_Height | Anon_BottomHeight = null,
    maxForce: Int | Double = null,
    minForce: Int | Double = null,
    onGestureEvent: /* event */ ForceTouchGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ ForceTouchGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null
  ): BuildingComponent[
    tag.type, 
    typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ForceTouchGestureHandler
  ] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(feedbackOnActivation)) __obj.updateDynamic("feedbackOnActivation")(feedbackOnActivation)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (minForce != null) __obj.updateDynamic("minForce")(minForce.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside)
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ForceTouchGestureHandlerProperties
}

