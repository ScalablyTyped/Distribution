package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.anon.IceConnectionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventOnConnectionStateChange extends js.Object {
  var target: IceConnectionState = js.native
}

object EventOnConnectionStateChange {
  @scala.inline
  def apply(target: IceConnectionState): EventOnConnectionStateChange = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnConnectionStateChange]
  }
  @scala.inline
  implicit class EventOnConnectionStateChangeOps[Self <: EventOnConnectionStateChange] (val x: Self) extends AnyVal {
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
    def setTarget(value: IceConnectionState): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

