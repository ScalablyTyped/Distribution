package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeViewGestureHandlerGestureEvent extends GestureHandlerGestureEvent {
  @JSName("nativeEvent")
  var nativeEvent_NativeViewGestureHandlerGestureEvent: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra = js.native
}

object NativeViewGestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra): NativeViewGestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerGestureEvent]
  }
  @scala.inline
  implicit class NativeViewGestureHandlerGestureEventOps[Self <: NativeViewGestureHandlerGestureEvent] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent with NativeViewGestureHandlerEventExtra): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

