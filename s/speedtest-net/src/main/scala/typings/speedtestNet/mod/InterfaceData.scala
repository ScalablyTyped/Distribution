package typings.speedtestNet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceData extends StObject {
  
  var externalIp: String
  
  var internalIp: String
  
  var isVpn: Boolean
  
  var macAddr: String
  
  var name: String
}
object InterfaceData {
  
  inline def apply(externalIp: String, internalIp: String, isVpn: Boolean, macAddr: String, name: String): InterfaceData = {
    val __obj = js.Dynamic.literal(externalIp = externalIp.asInstanceOf[js.Any], internalIp = internalIp.asInstanceOf[js.Any], isVpn = isVpn.asInstanceOf[js.Any], macAddr = macAddr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterfaceData] (val x: Self) extends AnyVal {
    
    inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    inline def setIsVpn(value: Boolean): Self = StObject.set(x, "isVpn", value.asInstanceOf[js.Any])
    
    inline def setMacAddr(value: String): Self = StObject.set(x, "macAddr", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
