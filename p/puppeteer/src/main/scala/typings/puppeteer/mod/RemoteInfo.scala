package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteInfo extends StObject {
  
  /** the IP address of the remote server */
  var ip: String
  
  /** the port used to connect to the remote server */
  var port: Double
}
object RemoteInfo {
  
  inline def apply(ip: String, port: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteInfo]
  }
  
  extension [Self <: RemoteInfo](x: Self) {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
