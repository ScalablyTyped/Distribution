package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMembershipsParametersv2 extends ChannelMembersParameters {
  
  var uuid: js.UndefOr[String] = js.native
}
object GetMembershipsParametersv2 {
  
  @scala.inline
  def apply(): GetMembershipsParametersv2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMembershipsParametersv2]
  }
  
  @scala.inline
  implicit class GetMembershipsParametersv2Ops[Self <: GetMembershipsParametersv2] (val x: Self) extends AnyVal {
    
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
