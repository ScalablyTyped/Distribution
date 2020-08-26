package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongPressGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_LongPressGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra = js.native
}

object LongPressGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra): LongPressGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongPressGestureHandlerGestureEvent]
  }
  @scala.inline
  implicit class LongPressGestureHandlerGestureEventOps[Self <: LongPressGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with LongPressGestureHandlerEventExtra): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

