package typings
package atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns

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
  val port: scala.Double | java.lang.String
  /**
    * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field
    * defaults to TCP.
    */
  val protocol: java.lang.String
}

