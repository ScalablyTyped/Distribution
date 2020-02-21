package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongPressGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_LongPressGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra
}

object LongPressGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra): LongPressGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LongPressGestureHandlerGestureEvent]
  }
}

