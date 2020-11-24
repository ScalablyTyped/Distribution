package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TCPSocketAction describes an action based on opening a socket
  */
@js.native
trait TCPSocketAction extends js.Object {
  
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
  implicit class TCPSocketActionOps[Self <: TCPSocketAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPort(value: Input[Double | String]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Input[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
}
