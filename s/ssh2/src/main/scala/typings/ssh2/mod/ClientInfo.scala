package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientInfo extends StObject {
  
  var family: String
  
  /** Information about the client. */
  var header: Header
  
  /** The remote address of the connection. */
  var ip: String
  
  var port: Double
}
object ClientInfo {
  
  inline def apply(family: String, header: Header, ip: String, port: Double): ClientInfo = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
