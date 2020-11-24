package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectParam<Custom> */
/* Inlined parent std.Partial<pubnub.pubnub.UUIDMetadataFields> */
@js.native
trait UUIDMetadata[Custom /* <: ObjectCustom */] extends js.Object {
  
  var custom: js.UndefOr[Custom] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var externalId: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var profileUrl: js.UndefOr[String] = js.native
}
object UUIDMetadata {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](): UUIDMetadata[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UUIDMetadata[Custom]]
  }
  
  @scala.inline
  implicit class UUIDMetadataOps[Self <: UUIDMetadata[_], Custom /* <: ObjectCustom */] (val x: Self with UUIDMetadata[Custom]) extends AnyVal {
    
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
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfileUrl(value: String): Self = this.set("profileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileUrl: Self = this.set("profileUrl", js.undefined)
  }
}
