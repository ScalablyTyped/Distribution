package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TCPSocketAction describes an action based on opening a socket
  */
trait TCPSocketAction extends StObject {
  
  /**
    * Optional: Host name to connect to, defaults to the pod IP.
    */
  var host: String
  
  /**
    * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Double | String
}
object TCPSocketAction {
  
  @scala.inline
  def apply(host: String, port: Double | String): TCPSocketAction = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCPSocketAction]
  }
  
  @scala.inline
  implicit class TCPSocketActionMutableBuilder[Self <: TCPSocketAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
