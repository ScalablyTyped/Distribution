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

trait TapGestureHandlerProperties extends GestureHandlerProperties {
  var maxDelayMs: js.UndefOr[Double] = js.undefined
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  var maxDist: js.UndefOr[Double] = js.undefined
  var maxDurationMs: js.UndefOr[Double] = js.undefined
  var minPointers: js.UndefOr[Double] = js.undefined
  var numberOfTaps: js.UndefOr[Double] = js.undefined
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ TapGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ TapGestureHandlerStateChangeEvent, Unit]] = js.undefined
}

object TapGestureHandlerProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Bottom | Left | Right | Height | BottomHeight = null,
    id: String = null,
    maxDelayMs: js.UndefOr[Double] = js.undefined,
    maxDeltaX: js.UndefOr[Double] = js.undefined,
    maxDeltaY: js.UndefOr[Double] = js.undefined,
    maxDist: js.UndefOr[Double] = js.undefined,
    maxDurationMs: js.UndefOr[Double] = js.undefined,
    minPointers: js.UndefOr[Double] = js.undefined,
    numberOfTaps: js.UndefOr[Double] = js.undefined,
    onGestureEvent: /* event */ TapGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ TapGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined,
    waitFor: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined
  ): TapGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDelayMs)) __obj.updateDynamic("maxDelayMs")(maxDelayMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeltaX)) __obj.updateDynamic("maxDeltaX")(maxDeltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeltaY)) __obj.updateDynamic("maxDeltaY")(maxDeltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDist)) __obj.updateDynamic("maxDist")(maxDist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDurationMs)) __obj.updateDynamic("maxDurationMs")(maxDurationMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPointers)) __obj.updateDynamic("minPointers")(minPointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfTaps)) __obj.updateDynamic("numberOfTaps")(numberOfTaps.get.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simultaneousHandlers)) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(waitFor)) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapGestureHandlerProperties]
  }
}

