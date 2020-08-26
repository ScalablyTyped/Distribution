package typings.pubnub.mod

import typings.pubnub.anon.DataUuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveMembershipEvent
  extends BaseObjectsEvent
     with ObjectsEvent[js.Any, js.Any, js.Any] {
  @JSName("message")
  var message_RemoveMembershipEvent: DataUuid = js.native
}

object RemoveMembershipEvent {
  @scala.inline
  def apply(channel: String, message: DataUuid, timetoken: Double): RemoveMembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMembershipEvent]
  }
  @scala.inline
  implicit class RemoveMembershipEventOps[Self <: RemoveMembershipEvent] (val x: Self) extends AnyVal {
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
    def setMessage(value: DataUuid): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

