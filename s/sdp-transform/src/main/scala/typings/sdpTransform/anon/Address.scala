package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var ipVer: js.UndefOr[Double] = js.undefined
  
  var netType: js.UndefOr[String] = js.undefined
  
  var port: Double
}
object Address {
  
  inline def apply(port: Double): Address = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIpVer(value: Double): Self = StObject.set(x, "ipVer", value.asInstanceOf[js.Any])
    
    inline def setIpVerUndefined: Self = StObject.set(x, "ipVer", js.undefined)
    
    inline def setNetType(value: String): Self = StObject.set(x, "netType", value.asInstanceOf[js.Any])
    
    inline def setNetTypeUndefined: Self = StObject.set(x, "netType", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
