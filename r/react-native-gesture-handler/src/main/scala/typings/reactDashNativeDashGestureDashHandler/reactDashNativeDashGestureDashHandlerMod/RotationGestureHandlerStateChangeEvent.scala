package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_RotationGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with RotationGestureHandlerEventExtra
}

object RotationGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with RotationGestureHandlerEventExtra): RotationGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent)
  
    __obj.asInstanceOf[RotationGestureHandlerStateChangeEvent]
  }
}

