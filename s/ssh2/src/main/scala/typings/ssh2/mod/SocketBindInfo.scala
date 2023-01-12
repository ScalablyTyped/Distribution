package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketBindInfo extends StObject {
  
  /** The socket path to start/stop binding to. */
  var socketPath: String
}
object SocketBindInfo {
  
  inline def apply(socketPath: String): SocketBindInfo = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketBindInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketBindInfo] (val x: Self) extends AnyVal {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
