package typings.soupbintcp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginAcceptedPayload extends js.Object {
  
  var sequenceNumber: Double = js.native
  
  var username: String = js.native
}
object LoginAcceptedPayload {
  
  @scala.inline
  def apply(sequenceNumber: Double, username: String): LoginAcceptedPayload = {
    val __obj = js.Dynamic.literal(sequenceNumber = sequenceNumber.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginAcceptedPayload]
  }
  
  @scala.inline
  implicit class LoginAcceptedPayloadOps[Self <: LoginAcceptedPayload] (val x: Self) extends AnyVal {
    
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
    def setSequenceNumber(value: Double): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
