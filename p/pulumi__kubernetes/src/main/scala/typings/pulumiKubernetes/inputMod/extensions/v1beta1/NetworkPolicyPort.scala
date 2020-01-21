package typings.pulumiKubernetes.inputMod.extensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by
  * networking/v1/NetworkPolicyPort.
  */
trait NetworkPolicyPort extends js.Object {
  /**
    * If specified, the port on the given protocol.  This can either be a numerical or named port
    * on a pod.  If this field is not provided, this matches all port names and numbers. If
    * present, only traffic on the specified protocol AND port will be matched.
    */
  var port: js.UndefOr[Input[Double | String]] = js.undefined
  /**
    * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified,
    * this field defaults to TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
}

object NetworkPolicyPort {
  @scala.inline
  def apply(port: Input[Double | String] = null, protocol: Input[String] = null): NetworkPolicyPort = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPort]
  }
}

