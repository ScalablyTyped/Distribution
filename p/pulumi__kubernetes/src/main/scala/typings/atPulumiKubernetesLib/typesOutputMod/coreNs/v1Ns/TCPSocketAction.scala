package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val host: java.lang.String
  /**
    * Number or name of the port to access on the container. Number must be in the range 1 to
    * 65535. Name must be an IANA_SVC_NAME.
    */
  val port: scala.Double | java.lang.String
}

object TCPSocketAction {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double | java.lang.String): TCPSocketAction = {
    val __obj = js.Dynamic.literal(host = host, port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TCPSocketAction]
  }
}

