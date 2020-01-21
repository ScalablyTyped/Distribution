package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var exec: js.UndefOr[Input[ExecAction]] = js.undefined
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: js.UndefOr[Input[HTTPGetAction]] = js.undefined
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: js.UndefOr[Input[TCPSocketAction]] = js.undefined
}

object Handler {
  @scala.inline
  def apply(
    exec: Input[ExecAction] = null,
    httpGet: Input[HTTPGetAction] = null,
    tcpSocket: Input[TCPSocketAction] = null
  ): Handler = {
    val __obj = js.Dynamic.literal()
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (httpGet != null) __obj.updateDynamic("httpGet")(httpGet.asInstanceOf[js.Any])
    if (tcpSocket != null) __obj.updateDynamic("tcpSocket")(tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
}

