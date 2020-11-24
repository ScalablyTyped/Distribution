package typings.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginRejectedPayload extends js.Object {
  
  var rejectReasonCode: String = js.native
}
object LoginRejectedPayload {
  
  @scala.inline
  def apply(rejectReasonCode: String): LoginRejectedPayload = {
    val __obj = js.Dynamic.literal(rejectReasonCode = rejectReasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRejectedPayload]
  }
  
  @scala.inline
  implicit class LoginRejectedPayloadOps[Self <: LoginRejectedPayload] (val x: Self) extends AnyVal {
    
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
    def setRejectReasonCode(value: String): Self = this.set("rejectReasonCode", value.asInstanceOf[js.Any])
  }
}
