package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends StObject {
  
  var address: String = js.native
  
  var ipVer: Double = js.native
  
  var netType: String = js.native
  
  var sessionId: String | Double = js.native
  
  var sessionVersion: Double = js.native
  
  var username: String = js.native
}
object Address {
  
  @scala.inline
  def apply(
    address: String,
    ipVer: Double,
    netType: String,
    sessionId: String | Double,
    sessionVersion: Double,
    username: String
  ): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ipVer = ipVer.asInstanceOf[js.Any], netType = netType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], sessionVersion = sessionVersion.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpVer(value: Double): Self = StObject.set(x, "ipVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetType(value: String): Self = StObject.set(x, "netType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String | Double): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionVersion(value: Double): Self = StObject.set(x, "sessionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
