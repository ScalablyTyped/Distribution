package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketForwardingConfig extends StObject {
  
  var socketPath: String
}
object SocketForwardingConfig {
  
  inline def apply(socketPath: String): SocketForwardingConfig = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketForwardingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketForwardingConfig] (val x: Self) extends AnyVal {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
