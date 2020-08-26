package typings.pubnub.anon

import typings.pubnub.mod.ObjectCustom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel[MembershipCustom /* <: ObjectCustom */] extends js.Object {
  var channel: Id = js.native
  var custom: MembershipCustom | Null = js.native
  var eTag: String = js.native
  var updated: String = js.native
  var uuid: Id = js.native
}

object Channel {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: Id, eTag: String, updated: String, uuid: Id): Channel[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel[MembershipCustom]]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel[_], /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom] (val x: Self with Channel[MembershipCustom]) extends AnyVal {
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
    def setChannel(value: Id): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: Id): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: MembershipCustom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomNull: Self = this.set("custom", null)
  }
  
}

