package typings.pubnub.mod

import typings.pubnub.anon.DataChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetMembershipEvent[MembershipCustom /* <: ObjectCustom */]
  extends BaseObjectsEvent
     with ObjectsEvent[js.Any, js.Any, MembershipCustom] {
  @JSName("message")
  var message_SetMembershipEvent: DataChannel[MembershipCustom] = js.native
}

object SetMembershipEvent {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): SetMembershipEvent[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMembershipEvent[MembershipCustom]]
  }
  @scala.inline
  implicit class SetMembershipEventOps[Self <: SetMembershipEvent[_], /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom] (val x: Self with SetMembershipEvent[MembershipCustom]) extends AnyVal {
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
    def setMessage(value: DataChannel[MembershipCustom]): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

