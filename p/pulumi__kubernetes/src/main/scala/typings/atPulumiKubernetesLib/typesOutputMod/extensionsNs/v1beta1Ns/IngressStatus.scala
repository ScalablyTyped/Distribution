package typings
package atPulumiKubernetesLib.typesOutputMod.extensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * IngressStatus describe the current state of the Ingress.
         */

trait IngressStatus extends js.Object {
  /**
               * LoadBalancer contains the current status of the load-balancer.
               */
  val loadBalancer: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LoadBalancerStatus
}

