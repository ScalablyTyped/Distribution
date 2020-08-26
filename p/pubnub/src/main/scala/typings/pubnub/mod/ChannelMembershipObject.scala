package typings.pubnub.mod

import typings.pubnub.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<pubnub.pubnub.v2ObjectData<MembershipCustom>, 'id'> */
@js.native
trait ChannelMembershipObject[MembershipCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */] extends js.Object {
  var channel: ChannelMetadataObject[ChannelCustom] | Id = js.native
  var custom: js.UndefOr[MembershipCustom | Null] = js.native
  var eTag: String = js.native
  var updated: String = js.native
}

object ChannelMembershipObject {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom](channel: ChannelMetadataObject[ChannelCustom] | Id, eTag: String, updated: String): ChannelMembershipObject[MembershipCustom, ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMembershipObject[MembershipCustom, ChannelCustom]]
  }
  @scala.inline
  implicit class ChannelMembershipObjectOps[Self <: ChannelMembershipObject[_, _], /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom] (val x: Self with (ChannelMembershipObject[MembershipCustom, ChannelCustom])) extends AnyVal {
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
    def setChannel(value: ChannelMetadataObject[ChannelCustom] | Id): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: MembershipCustom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setCustomNull: Self = this.set("custom", null)
  }
  
}

