package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlingGestureHandlerGestureEvent extends GestureHandlerGestureEvent

object FlingGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent): FlingGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlingGestureHandlerGestureEvent]
  }
}

