package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent pubnub.pubnub.v2ObjectParam<Custom> */
/* Inlined parent std.Partial<pubnub.pubnub.ChannelMetadataFields> */
@js.native
trait ChannelMetadata[Custom /* <: ObjectCustom */] extends js.Object {
  
  var custom: js.UndefOr[Custom] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object ChannelMetadata {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](): ChannelMetadata[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMetadata[Custom]]
  }
  
  @scala.inline
  implicit class ChannelMetadataOps[Self <: ChannelMetadata[_], Custom /* <: ObjectCustom */] (val x: Self with ChannelMetadata[Custom]) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
