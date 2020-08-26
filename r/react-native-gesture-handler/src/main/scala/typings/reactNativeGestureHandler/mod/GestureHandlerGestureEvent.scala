package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureHandlerGestureEvent extends js.Object {
  var nativeEvent: GestureHandlerGestureEventNativeEvent = js.native
}

object GestureHandlerGestureEvent {
  @scala.inline
  def apply(nativeEvent: GestureHandlerGestureEventNativeEvent): GestureHandlerGestureEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerGestureEvent]
  }
  @scala.inline
  implicit class GestureHandlerGestureEventOps[Self <: GestureHandlerGestureEvent] (val x: Self) extends AnyVal {
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
    def setNativeEvent(value: GestureHandlerGestureEventNativeEvent): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
  
}

