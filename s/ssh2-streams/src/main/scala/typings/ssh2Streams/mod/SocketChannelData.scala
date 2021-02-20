package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketChannelData extends StObject {
  
  var socketPath: String = js.native
}
object SocketChannelData {
  
  @scala.inline
  def apply(socketPath: String): SocketChannelData = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketChannelData]
  }
  
  @scala.inline
  implicit class SocketChannelDataMutableBuilder[Self <: SocketChannelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
