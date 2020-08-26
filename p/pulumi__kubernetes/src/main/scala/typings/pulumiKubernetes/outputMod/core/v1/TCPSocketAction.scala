package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TCPSocketAction describes an action based on opening a socket
  */
@js.native
trait TCPSocketAction extends js.Object {
  /**
    * Optional: Host name to connect to, defaults to the pod IP.
    */
  var host: String = js.native
  /**
    * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Double | String = js.native
}

object TCPSocketAction {
  @scala.inline
  def apply(host: String, port: Double | String): TCPSocketAction = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}

