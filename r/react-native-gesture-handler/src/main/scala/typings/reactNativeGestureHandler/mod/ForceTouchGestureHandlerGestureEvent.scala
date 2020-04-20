package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceTouchGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_ForceTouchGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with ForceTouchGestureHandlerEventExtra
}

object ForceTouchGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with ForceTouchGestureHandlerEventExtra): ForceTouchGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerGestureEvent]
  }
}

