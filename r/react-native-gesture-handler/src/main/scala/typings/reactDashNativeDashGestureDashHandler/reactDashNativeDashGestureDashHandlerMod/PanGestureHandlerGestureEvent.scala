package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_PanGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with PanGestureHandlerEventExtra
}

object PanGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with PanGestureHandlerEventExtra): PanGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent)
  
    __obj.asInstanceOf[PanGestureHandlerGestureEvent]
  }
}

