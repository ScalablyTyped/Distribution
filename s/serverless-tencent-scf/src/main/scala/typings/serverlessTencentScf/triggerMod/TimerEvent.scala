package typings.serverlessTencentScf.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimerEvent extends js.Object {
  var Message: String = js.native
  var Time: String = js.native
  var TriggerName: String = js.native
  var Type: String = js.native
}

object TimerEvent {
  @scala.inline
  def apply(Message: String, Time: String, TriggerName: String, Type: String): TimerEvent = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], TriggerName = TriggerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerEvent]
  }
  @scala.inline
  implicit class TimerEventOps[Self <: TimerEvent] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("Time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: String): Self = this.set("TriggerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

