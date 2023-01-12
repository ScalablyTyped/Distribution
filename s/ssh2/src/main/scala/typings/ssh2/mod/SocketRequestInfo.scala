package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketRequestInfo extends StObject {
  
  /** Destination socket path of outgoing connection. */
  var socketPath: String
}
object SocketRequestInfo {
  
  inline def apply(socketPath: String): SocketRequestInfo = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketRequestInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketRequestInfo] (val x: Self) extends AnyVal {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
