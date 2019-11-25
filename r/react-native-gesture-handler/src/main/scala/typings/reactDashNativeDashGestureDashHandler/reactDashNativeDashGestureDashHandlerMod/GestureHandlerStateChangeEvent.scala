package typings.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureHandlerStateChangeEvent extends js.Object {
  var nativeEvent: GestureHandlerStateChangeNativeEvent
}

object GestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent): GestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GestureHandlerStateChangeEvent]
  }
}

