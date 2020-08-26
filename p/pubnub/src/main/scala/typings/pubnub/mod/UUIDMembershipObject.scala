package typings.pubnub.mod

import typings.pubnub.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Memberships
/* Inlined parent std.Omit<pubnub.pubnub.v2ObjectData<MembershipCustom>, 'id'> */
@js.native
trait UUIDMembershipObject[MembershipCustom /* <: ObjectCustom */, UUIDCustom /* <: ObjectCustom */] extends js.Object {
  var custom: js.UndefOr[MembershipCustom | Null] = js.native
  var eTag: String = js.native
  var updated: String = js.native
  var uuid: UUIDMetadataObject[UUIDCustom] | Id = js.native
}

object UUIDMembershipObject {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom, /* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom](eTag: String, updated: String, uuid: UUIDMetadataObject[UUIDCustom] | Id): UUIDMembershipObject[MembershipCustom, UUIDCustom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDMembershipObject[MembershipCustom, UUIDCustom]]
  }
  @scala.inline
  implicit class UUIDMembershipObjectOps[Self <: UUIDMembershipObject[_, _], /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom, /* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom] (val x: Self with (UUIDMembershipObject[MembershipCustom, UUIDCustom])) extends AnyVal {
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
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: UUIDMetadataObject[UUIDCustom] | Id): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: MembershipCustom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setCustomNull: Self = this.set("custom", null)
  }
  
}

