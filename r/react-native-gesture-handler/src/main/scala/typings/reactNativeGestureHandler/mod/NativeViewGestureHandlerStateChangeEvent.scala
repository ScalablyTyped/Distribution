package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeViewGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_NativeViewGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with NativeViewGestureHandlerEventExtra
}

object NativeViewGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with NativeViewGestureHandlerEventExtra): NativeViewGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NativeViewGestureHandlerStateChangeEvent]
  }
}

