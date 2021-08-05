package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGlobalConfig extends StObject {
  
  var host: String
  
  var identity: String
  
  var isSecure: Boolean
  
  var port: String
  
  var prefix: String
}
object GetGlobalConfig {
  
  inline def apply(host: String, identity: String, isSecure: Boolean, port: String, prefix: String): GetGlobalConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGlobalConfig]
  }
  
  extension [Self <: GetGlobalConfig](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
