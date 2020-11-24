package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetUUIDMetadataParameters[Custom /* <: ObjectCustom */] extends js.Object {
  
  var data: UUIDMetadata[Custom] = js.native
  
  var include: js.UndefOr[CustomFields] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object SetUUIDMetadataParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](data: UUIDMetadata[Custom]): SetUUIDMetadataParameters[Custom] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUUIDMetadataParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetUUIDMetadataParametersOps[Self <: SetUUIDMetadataParameters[_], Custom /* <: ObjectCustom */] (val x: Self with SetUUIDMetadataParameters[Custom]) extends AnyVal {
    
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
    def setData(value: UUIDMetadata[Custom]): Self = this.set("data", value.asInstanceOf[js.Any])
    
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
