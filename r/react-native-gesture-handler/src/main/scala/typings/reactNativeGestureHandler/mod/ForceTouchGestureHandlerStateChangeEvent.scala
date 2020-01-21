package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceTouchGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_ForceTouchGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra
}

object ForceTouchGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra): ForceTouchGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ForceTouchGestureHandlerStateChangeEvent]
  }
}

