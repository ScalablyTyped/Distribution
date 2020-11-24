package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetChannelMembersParameters[Custom /* <: ObjectCustom */] extends UUIDMembersParameters {
  
  var channel: String = js.native
  
  var uuids: js.Array[String | SetCustom[Custom]] = js.native
}
object SetChannelMembersParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](channel: String, uuids: js.Array[String | SetCustom[Custom]]): SetChannelMembersParameters[Custom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetChannelMembersParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetChannelMembersParametersOps[Self <: SetChannelMembersParameters[_], Custom /* <: ObjectCustom */] (val x: Self with SetChannelMembersParameters[Custom]) extends AnyVal {
    
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
    def setUuidsVarargs(value: (String | SetCustom[Custom])*): Self = this.set("uuids", js.Array(value :_*))
    
    @scala.inline
    def setUuids(value: js.Array[String | SetCustom[Custom]]): Self = this.set("uuids", value.asInstanceOf[js.Any])
  }
}
