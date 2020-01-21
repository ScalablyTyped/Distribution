package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinchGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_PinchGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with PinchGestureHandlerEventExtra
}

object PinchGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with PinchGestureHandlerEventExtra): PinchGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PinchGestureHandlerGestureEvent]
  }
}

