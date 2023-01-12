package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAddress extends StObject {
  
  var address: String
  
  var networkAddress: String
}
object NetworkAddress {
  
  inline def apply(address: String, networkAddress: String): NetworkAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], networkAddress = networkAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setNetworkAddress(value: String): Self = StObject.set(x, "networkAddress", value.asInstanceOf[js.Any])
  }
}
