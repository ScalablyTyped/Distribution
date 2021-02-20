package typings.speedtestNet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceData extends StObject {
  
  var externalIp: String = js.native
  
  var internalIp: String = js.native
  
  var isVpn: Boolean = js.native
  
  var macAddr: String = js.native
  
  var name: String = js.native
}
object InterfaceData {
  
  @scala.inline
  def apply(externalIp: String, internalIp: String, isVpn: Boolean, macAddr: String, name: String): InterfaceData = {
    val __obj = js.Dynamic.literal(externalIp = externalIp.asInstanceOf[js.Any], internalIp = internalIp.asInstanceOf[js.Any], isVpn = isVpn.asInstanceOf[js.Any], macAddr = macAddr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceData]
  }
  
  @scala.inline
  implicit class InterfaceDataMutableBuilder[Self <: InterfaceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVpn(value: Boolean): Self = StObject.set(x, "isVpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddr(value: String): Self = StObject.set(x, "macAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
