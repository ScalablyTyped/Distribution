package typings.serverlessTencentScf.triggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimerEvent extends js.Object {
  var Message: String
  var Time: String
  var TriggerName: String
  var Type: String
}

object TimerEvent {
  @scala.inline
  def apply(Message: String, Time: String, TriggerName: String, Type: String): TimerEvent = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], TriggerName = TriggerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerEvent]
  }
}

