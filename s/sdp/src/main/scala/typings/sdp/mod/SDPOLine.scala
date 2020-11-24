package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPOLine extends js.Object {
  
  var address: String = js.native
  
  var addressType: String = js.native
  
  var netType: String = js.native
  
  var sessionId: String = js.native
  
  var sessionVersion: Double = js.native
  
  var username: String = js.native
}
object SDPOLine {
  
  @scala.inline
  def apply(
    address: String,
    addressType: String,
    netType: String,
    sessionId: String,
    sessionVersion: Double,
    username: String
  ): SDPOLine = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressType = addressType.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], sessionVersion = sessionVersion.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPOLine]
  }
  
  @scala.inline
  implicit class SDPOLineOps[Self <: SDPOLine] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressType(value: String): Self = this.set("addressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetType(value: String): Self = this.set("netType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionVersion(value: Double): Self = this.set("sessionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
