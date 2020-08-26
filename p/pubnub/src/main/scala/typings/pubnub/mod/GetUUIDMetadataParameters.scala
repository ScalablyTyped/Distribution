package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUUIDMetadataParameters extends js.Object {
  var include: js.UndefOr[CustomFields] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object GetUUIDMetadataParameters {
  @scala.inline
  def apply(): GetUUIDMetadataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUUIDMetadataParameters]
  }
  @scala.inline
  implicit class GetUUIDMetadataParametersOps[Self <: GetUUIDMetadataParameters] (val x: Self) extends AnyVal {
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
    def setInclude(value: CustomFields): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

