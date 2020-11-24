package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelFields extends js.Object {
  
  var channelFields: js.UndefOr[Boolean] = js.native
  
  var customChannelFields: js.UndefOr[Boolean] = js.native
  
  var customFields: js.UndefOr[Boolean] = js.native
  
  var totalCount: js.UndefOr[Boolean] = js.native
}
object ChannelFields {
  
  @scala.inline
  def apply(): ChannelFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelFields]
  }
  
  @scala.inline
  implicit class ChannelFieldsOps[Self <: ChannelFields] (val x: Self) extends AnyVal {
    
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
    def setChannelFields(value: Boolean): Self = this.set("channelFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelFields: Self = this.set("channelFields", js.undefined)
    
    @scala.inline
    def setCustomChannelFields(value: Boolean): Self = this.set("customChannelFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomChannelFields: Self = this.set("customChannelFields", js.undefined)
    
    @scala.inline
    def setCustomFields(value: Boolean): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Boolean): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
}
