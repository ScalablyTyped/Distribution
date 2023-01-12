package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpipBindInfo extends StObject {
  
  /** The IP address to start/stop binding to. */
  var bindAddr: String
  
  /** The port to start/stop binding to. */
  var bindPort: Double
}
object TcpipBindInfo {
  
  inline def apply(bindAddr: String, bindPort: Double): TcpipBindInfo = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipBindInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TcpipBindInfo] (val x: Self) extends AnyVal {
    
    inline def setBindAddr(value: String): Self = StObject.set(x, "bindAddr", value.asInstanceOf[js.Any])
    
    inline def setBindPort(value: Double): Self = StObject.set(x, "bindPort", value.asInstanceOf[js.Any])
  }
}
