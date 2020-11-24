package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetMembershipsParameters[Custom /* <: ObjectCustom */] extends ChannelMembersParameters {
  
  var channels: js.UndefOr[js.Array[String | SetCustom[Custom]]] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object SetMembershipsParameters {
  
  @scala.inline
  def apply[Custom /* <: ObjectCustom */](): SetMembershipsParameters[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetMembershipsParameters[Custom]]
  }
  
  @scala.inline
  implicit class SetMembershipsParametersOps[Self <: SetMembershipsParameters[_], Custom /* <: ObjectCustom */] (val x: Self with SetMembershipsParameters[Custom]) extends AnyVal {
    
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
    def setChannelsVarargs(value: (String | SetCustom[Custom])*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String | SetCustom[Custom]]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
