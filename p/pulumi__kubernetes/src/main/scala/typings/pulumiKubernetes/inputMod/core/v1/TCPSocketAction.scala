package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TCPSocketAction describes an action based on opening a socket
  */
@js.native
trait TCPSocketAction extends StObject {
  
  /**
    * Optional: Host name to connect to, defaults to the pod IP.
    */
  var host: js.UndefOr[Input[String]] = js.native
  
  /**
    * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Input[Double | String] = js.native
}
object TCPSocketAction {
  
  @scala.inline
  def apply(port: Input[Double | String]): TCPSocketAction = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCPSocketAction]
  }
  
  @scala.inline
  implicit class TCPSocketActionMutableBuilder[Self <: TCPSocketAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double | String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
