package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongPressGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_LongPressGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with LongPressGestureHandlerEventExtra
}

object LongPressGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with LongPressGestureHandlerEventExtra): LongPressGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent)
  
    __obj.asInstanceOf[LongPressGestureHandlerStateChangeEvent]
  }
}

