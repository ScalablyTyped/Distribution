package typings.atPulumiKubernetes.typesOutputMod.networkingNs.v1beta1Ns

import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.LoadBalancerStatus
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
  val loadBalancer: LoadBalancerStatus
}

object IngressStatus {
  @scala.inline
  def apply(loadBalancer: LoadBalancerStatus): IngressStatus = {
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer)
  
    __obj.asInstanceOf[IngressStatus]
  }
}

