package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opensshStreamLocalForwardGlobalRequest
  extends StObject
     with _GlobalRequest {
  
  var socketPath: String
}
object opensshStreamLocalForwardGlobalRequest {
  
  @scala.inline
  def apply(socketPath: String): opensshStreamLocalForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[opensshStreamLocalForwardGlobalRequest]
  }
  
  @scala.inline
  implicit class opensshStreamLocalForwardGlobalRequestMutableBuilder[Self <: opensshStreamLocalForwardGlobalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
  }
}
