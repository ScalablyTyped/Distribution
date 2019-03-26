package typings
package atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns

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

object IngressStatus {
  @scala.inline
  def apply(loadBalancer: atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns.LoadBalancerStatus): IngressStatus = {
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer)
  
    __obj.asInstanceOf[IngressStatus]
  }
}

