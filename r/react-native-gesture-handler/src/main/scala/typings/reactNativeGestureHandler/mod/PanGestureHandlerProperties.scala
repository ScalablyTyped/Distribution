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

trait PanGestureHandlerProperties extends GestureHandlerProperties {
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var avgTouches: js.UndefOr[Boolean] = js.undefined
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /** @deprecated  use failOffsetX*/
  var maxDeltaX: js.UndefOr[Double] = js.undefined
  /** @deprecated  use failOffsetY*/
  var maxDeltaY: js.UndefOr[Double] = js.undefined
  var maxPointers: js.UndefOr[Double] = js.undefined
  /** @deprecated  use activeOffsetX*/
  var minDeltaX: js.UndefOr[Double] = js.undefined
  /** @deprecated  use activeOffsetY*/
  var minDeltaY: js.UndefOr[Double] = js.undefined
  var minDist: js.UndefOr[Double] = js.undefined
  /** @deprecated  use activeOffsetX*/
  var minOffsetX: js.UndefOr[Double] = js.undefined
  /** @deprecated  use failOffsetY*/
  var minOffsetY: js.UndefOr[Double] = js.undefined
  var minPointers: js.UndefOr[Double] = js.undefined
  var minVelocity: js.UndefOr[Double] = js.undefined
  var minVelocityX: js.UndefOr[Double] = js.undefined
  var minVelocityY: js.UndefOr[Double] = js.undefined
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ PanGestureHandlerGestureEvent, Unit]] = js.undefined
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ PanGestureHandlerStateChangeEvent, Unit]] = js.undefined
}

object PanGestureHandlerProperties {
  @scala.inline
  def apply(
    activeOffsetX: Double | js.Array[Double] = null,
    activeOffsetY: Double | js.Array[Double] = null,
    avgTouches: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    failOffsetX: Double | js.Array[Double] = null,
    failOffsetY: Double | js.Array[Double] = null,
    hitSlop: Double | Bottom | Left | Right | Height | BottomHeight = null,
    id: String = null,
    maxDeltaX: js.UndefOr[Double] = js.undefined,
    maxDeltaY: js.UndefOr[Double] = js.undefined,
    maxPointers: js.UndefOr[Double] = js.undefined,
    minDeltaX: js.UndefOr[Double] = js.undefined,
    minDeltaY: js.UndefOr[Double] = js.undefined,
    minDist: js.UndefOr[Double] = js.undefined,
    minOffsetX: js.UndefOr[Double] = js.undefined,
    minOffsetY: js.UndefOr[Double] = js.undefined,
    minPointers: js.UndefOr[Double] = js.undefined,
    minVelocity: js.UndefOr[Double] = js.undefined,
    minVelocityX: js.UndefOr[Double] = js.undefined,
    minVelocityY: js.UndefOr[Double] = js.undefined,
    onGestureEvent: /* event */ PanGestureHandlerGestureEvent => Unit = null,
    onHandlerStateChange: /* event */ PanGestureHandlerStateChangeEvent => Unit = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined,
    waitFor: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined
  ): PanGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (activeOffsetX != null) __obj.updateDynamic("activeOffsetX")(activeOffsetX.asInstanceOf[js.Any])
    if (activeOffsetY != null) __obj.updateDynamic("activeOffsetY")(activeOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(avgTouches)) __obj.updateDynamic("avgTouches")(avgTouches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (failOffsetX != null) __obj.updateDynamic("failOffsetX")(failOffsetX.asInstanceOf[js.Any])
    if (failOffsetY != null) __obj.updateDynamic("failOffsetY")(failOffsetY.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeltaX)) __obj.updateDynamic("maxDeltaX")(maxDeltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeltaY)) __obj.updateDynamic("maxDeltaY")(maxDeltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPointers)) __obj.updateDynamic("maxPointers")(maxPointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDeltaX)) __obj.updateDynamic("minDeltaX")(minDeltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDeltaY)) __obj.updateDynamic("minDeltaY")(minDeltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDist)) __obj.updateDynamic("minDist")(minDist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOffsetX)) __obj.updateDynamic("minOffsetX")(minOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOffsetY)) __obj.updateDynamic("minOffsetY")(minOffsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPointers)) __obj.updateDynamic("minPointers")(minPointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVelocity)) __obj.updateDynamic("minVelocity")(minVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVelocityX)) __obj.updateDynamic("minVelocityX")(minVelocityX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minVelocityY)) __obj.updateDynamic("minVelocityY")(minVelocityY.get.asInstanceOf[js.Any])
    if (onGestureEvent != null) __obj.updateDynamic("onGestureEvent")(js.Any.fromFunction1(onGestureEvent))
    if (onHandlerStateChange != null) __obj.updateDynamic("onHandlerStateChange")(js.Any.fromFunction1(onHandlerStateChange))
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simultaneousHandlers)) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(waitFor)) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerProperties]
  }
}

