package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembershipData extends js.Object {
  var created: String = js.native
  var custom: js.UndefOr[js.Object | Null] = js.native
  var eTag: String = js.native
  var spaceId: String = js.native
  var updated: String = js.native
  var userId: String = js.native
}

object MembershipData {
  @scala.inline
  def apply(created: String, eTag: String, spaceId: String, updated: String, userId: String): MembershipData = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], spaceId = spaceId.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipData]
  }
  @scala.inline
  implicit class MembershipDataOps[Self <: MembershipData] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpaceId(value: String): Self = this.set("spaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: js.Object): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setCustomNull: Self = this.set("custom", null)
  }
  
}

