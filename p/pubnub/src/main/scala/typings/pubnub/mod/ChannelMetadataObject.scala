package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectData<Custom> */
/* Inlined parent pubnub.pubnub.Nullable<pubnub.pubnub.ChannelMetadataFields> */
@js.native
trait ChannelMetadataObject[Custom /* <: ObjectCustom */] extends js.Object {
  
  var custom: js.UndefOr[Custom | Null] = js.native
  
  var description: js.UndefOr[String | Null] = js.native
  
  var eTag: String = js.native
  
  var id: String = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var updated: String = js.native
}
object ChannelMetadataObject {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](eTag: String, id: String, updated: String): ChannelMetadataObject[Custom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMetadataObject[Custom]]
  }
  
  @scala.inline
  implicit class ChannelMetadataObjectOps[Self <: ChannelMetadataObject[_], Custom /* <: ObjectCustom */] (val x: Self with ChannelMetadataObject[Custom]) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
