package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeViewGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_NativeViewGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra
}

object NativeViewGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra): NativeViewGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NativeViewGestureHandlerGestureEvent]
  }
}

