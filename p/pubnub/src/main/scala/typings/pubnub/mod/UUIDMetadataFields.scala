package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// UUID metadata
@js.native
trait UUIDMetadataFields extends js.Object {
  var email: String = js.native
  var externalId: String = js.native
  var name: String = js.native
  var profileUrl: String = js.native
}

object UUIDMetadataFields {
  @scala.inline
  def apply(email: String, externalId: String, name: String, profileUrl: String): UUIDMetadataFields = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDMetadataFields]
  }
  @scala.inline
  implicit class UUIDMetadataFieldsOps[Self <: UUIDMetadataFields] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileUrl(value: String): Self = this.set("profileUrl", value.asInstanceOf[js.Any])
  }
  
}

