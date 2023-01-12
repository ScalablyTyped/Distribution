package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPOLine extends StObject {
  
  var address: String
  
  var addressType: String
  
  var netType: String
  
  var sessionId: String
  
  var sessionVersion: Double
  
  var username: String
}
object SDPOLine {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SDPOLine] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressType(value: String): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
    
    inline def setNetType(value: String): Self = StObject.set(x, "netType", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionVersion(value: Double): Self = StObject.set(x, "sessionVersion", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
