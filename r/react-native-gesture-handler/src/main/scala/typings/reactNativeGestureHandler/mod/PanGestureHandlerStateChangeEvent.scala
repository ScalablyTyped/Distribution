package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanGestureHandlerStateChangeEvent extends GestureHandlerStateChangeEvent {
  @JSName("nativeEvent")
  var nativeEvent_PanGestureHandlerStateChangeEvent: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra = js.native
}

object PanGestureHandlerStateChangeEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra): PanGestureHandlerStateChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerStateChangeEvent]
  }
  @scala.inline
  implicit class PanGestureHandlerStateChangeEventOps[Self <: PanGestureHandlerStateChangeEvent] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: GestureHandlerStateChangeNativeEvent with PanGestureHandlerEventExtra): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

