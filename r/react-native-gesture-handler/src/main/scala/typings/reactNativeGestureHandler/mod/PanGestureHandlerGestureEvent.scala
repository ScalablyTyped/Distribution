package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_PanGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with PanGestureHandlerEventExtra = js.native
}

object PanGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with PanGestureHandlerEventExtra): PanGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerGestureEvent]
  }
  @scala.inline
  implicit class PanGestureHandlerGestureEventOps[Self <: PanGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with PanGestureHandlerEventExtra): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

