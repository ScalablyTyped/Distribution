package typings.pulumiKubernetes.outputMod.networking.v1

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
  val port: Double | String
  /**
    * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field
    * defaults to TCP.
    */
  val protocol: String
}

object NetworkPolicyPort {
  @scala.inline
  def apply(port: Double | String, protocol: String): NetworkPolicyPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPort]
  }
}

