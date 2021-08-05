package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketChannelData extends StObject {
  
  var socketPath: String
}
object SocketChannelData {
  
  inline def apply(socketPath: String): SocketChannelData = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketChannelData]
  }
  
  extension [Self <: SocketChannelData](x: Self) {
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
