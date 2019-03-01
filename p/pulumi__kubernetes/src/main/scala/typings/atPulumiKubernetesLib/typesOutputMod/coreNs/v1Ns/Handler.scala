package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("httpGet")(httpGet)
    __obj.updateDynamic("tcpSocket")(tcpSocket)
    __obj.asInstanceOf[Handler]
  }
}

