package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * LoadBalancerStatus represents the status of a load-balancer.
         */

trait LoadBalancerStatus extends js.Object {
  /**
               * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the
               * service should be sent to these ingress points.
               */
  val ingress: js.Array[LoadBalancerIngress]
}

