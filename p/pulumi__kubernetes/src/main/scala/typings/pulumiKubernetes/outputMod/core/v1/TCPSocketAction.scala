package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TCPSocketAction describes an action based on opening a socket
  */
trait TCPSocketAction extends js.Object {
  /**
    * Optional: Host name to connect to, defaults to the pod IP.
    */
  val host: String
  /**
    * Number or name of the port to access on the container. Number must be in the range 1 to
    * 65535. Name must be an IANA_SVC_NAME.
    */
  val port: Double | String
}

object TCPSocketAction {
  @scala.inline
  def apply(host: String, port: Double | String): TCPSocketAction = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCPSocketAction]
  }
}

