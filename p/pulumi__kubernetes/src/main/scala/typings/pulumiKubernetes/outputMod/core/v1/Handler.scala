package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handler defines a specific action that should be taken
  */
trait Handler extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  val exec: ExecAction
  /**
    * HTTPGet specifies the http request to perform.
    */
  val httpGet: HTTPGetAction
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  val tcpSocket: TCPSocketAction
}

object Handler {
  @scala.inline
  def apply(exec: ExecAction, httpGet: HTTPGetAction, tcpSocket: TCPSocketAction): Handler = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
}

