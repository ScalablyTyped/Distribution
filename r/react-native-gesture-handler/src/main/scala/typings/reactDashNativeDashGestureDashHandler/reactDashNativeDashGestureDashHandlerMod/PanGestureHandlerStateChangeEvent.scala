package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_PanGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra
}

object PanGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra): PanGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent)
  
    __obj.asInstanceOf[PanGestureHandlerStateChangeEvent]
  }
}

