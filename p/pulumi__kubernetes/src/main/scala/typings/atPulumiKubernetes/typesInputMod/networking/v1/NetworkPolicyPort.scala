package typings.atPulumiKubernetes.typesInputMod.networking.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicyPort describes a port to allow traffic on
  */
trait NetworkPolicyPort extends js.Object {
  /**
    * The port on the given protocol. This can either be a numerical or named port on a pod. If
    * this field is not provided, this matches all port names and numbers.
    */
  var port: js.UndefOr[Input[Double | String]] = js.undefined
  /**
    * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field
    * defaults to TCP.
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

