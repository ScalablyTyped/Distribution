package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedSocket extends StObject {
  
  var socketPath: String
}
object ForwardedSocket {
  
  @scala.inline
  def apply(socketPath: String): ForwardedSocket = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedSocket]
  }
  
  @scala.inline
  implicit class ForwardedSocketMutableBuilder[Self <: ForwardedSocket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
