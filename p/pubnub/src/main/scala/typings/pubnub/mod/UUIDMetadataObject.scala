package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent pubnub.pubnub.v2ObjectData<Custom> */
/* Inlined parent pubnub.pubnub.Nullable<pubnub.pubnub.UUIDMetadataFields> */
@js.native
trait UUIDMetadataObject[Custom /* <: ObjectCustom */] extends js.Object {
  var custom: js.UndefOr[Custom | Null] = js.native
  var eTag: String = js.native
  var email: js.UndefOr[String | Null] = js.native
  var externalId: js.UndefOr[String | Null] = js.native
  var id: String = js.native
  var name: js.UndefOr[String | Null] = js.native
  var profileUrl: js.UndefOr[String | Null] = js.native
  var updated: String = js.native
}

object UUIDMetadataObject {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ Custom](eTag: String, id: String, updated: String): UUIDMetadataObject[Custom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDMetadataObject[Custom]]
  }
  @scala.inline
  implicit class UUIDMetadataObjectOps[Self <: UUIDMetadataObject[_], /* <: typings.pubnub.mod.ObjectCustom */ Custom] (val x: Self with UUIDMetadataObject[Custom]) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setCustomNull: Self = this.set("custom", null)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setExternalIdNull: Self = this.set("externalId", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setProfileUrl(value: String): Self = this.set("profileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileUrl: Self = this.set("profileUrl", js.undefined)
    @scala.inline
    def setProfileUrlNull: Self = this.set("profileUrl", null)
  }
  
}

