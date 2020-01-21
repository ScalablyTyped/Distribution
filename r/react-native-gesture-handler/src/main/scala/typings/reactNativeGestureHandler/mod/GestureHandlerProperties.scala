package typings.reactNativeGestureHandler.mod

import typings.react.mod.Ref
import typings.reactNativeGestureHandler.AnonBottom
import typings.reactNativeGestureHandler.AnonBottomHeight
import typings.reactNativeGestureHandler.AnonHeight
import typings.reactNativeGestureHandler.AnonLeft
import typings.reactNativeGestureHandler.AnonRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureHandlerProperties extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.undefined
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.undefined
}

object GestureHandlerProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    id: String = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    waitFor: Ref[_] | js.Array[Ref[_]] = null
  ): GestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerProperties]
  }
}

