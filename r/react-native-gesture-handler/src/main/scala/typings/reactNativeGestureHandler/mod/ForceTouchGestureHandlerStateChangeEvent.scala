package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceTouchGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_ForceTouchGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra = js.native
}

object ForceTouchGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra): ForceTouchGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceTouchGestureHandlerStateChangeEvent]
  }
  @scala.inline
  implicit class ForceTouchGestureHandlerStateChangeEventOps[Self <: ForceTouchGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent with ForceTouchGestureHandlerEventExtra): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

