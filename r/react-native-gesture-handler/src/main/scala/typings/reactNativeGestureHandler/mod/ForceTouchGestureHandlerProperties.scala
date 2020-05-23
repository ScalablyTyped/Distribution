package typings.reactNativeGestureHandler.mod

import typings.react.mod.Ref
import typings.reactNativeGestureHandler.anon.Bottom
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Height
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceTouchGestureHandlerProperties extends GestureHandlerProperties {
  var feedbackOnActivation: js.UndefOr[Boolean] = js.undefined
  var maxForce: js.UndefOr[Double] = js.undefined
  var minForce: js.UndefOr[Double] = js.undefined
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerStateChangeEvent, Unit]] = js.undefined
}

object ForceTouchGestureHandlerProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    feedbackOnActivation: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Bottom | Left | Right | Height | BottomHeight = null,
    id: String = null,
    maxForce: js.UndefOr[Double] = js.undefined,
    minForce: js.UndefOr[Double] = js.undefined,
    onGestureEvent: /* event */ ForceTouchGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ ForceTouchGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined,
    waitFor: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined
  ): ForceTouchGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(feedbackOnActivation)) __obj.updateDynamic("feedbackOnActivation")(feedbackOnActivation.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maxForce)) __obj.updateDynamic("maxForce")(maxForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minForce)) __obj.updateDynamic("minForce")(minForce.get.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simultaneousHandlers)) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(waitFor)) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerProperties]
  }
}

