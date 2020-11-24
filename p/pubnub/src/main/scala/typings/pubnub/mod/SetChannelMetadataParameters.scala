package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetChannelMetadataParameters[Custom /* <: ObjectCustom */] extends js.Object {
  
  var channel: String = js.native
  
  var data: ChannelMetadata[Custom] = js.native
  
  var include: js.UndefOr[CustomFields] = js.native
}
object SetChannelMetadataParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](channel: String, data: ChannelMetadata[Custom]): SetChannelMetadataParameters[Custom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChannelMetadataParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetChannelMetadataParametersOps[Self <: SetChannelMetadataParameters[_], Custom /* <: ObjectCustom */] (val x: Self with SetChannelMetadataParameters[Custom]) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: ChannelMetadata[Custom]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude(value: CustomFields): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
}
