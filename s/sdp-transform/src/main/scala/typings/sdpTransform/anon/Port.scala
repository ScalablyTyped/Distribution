package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Port extends StObject {
  
  var component: Double
  
  var ip: String
  
  var port: Double
}
object Port {
  
  inline def apply(component: Double, ip: String, port: Double): Port = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  
  extension [Self <: Port](x: Self) {
    
    inline def setComponent(value: Double): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
