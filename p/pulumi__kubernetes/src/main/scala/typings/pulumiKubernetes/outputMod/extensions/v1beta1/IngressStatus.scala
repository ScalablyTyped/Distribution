package typings.pulumiKubernetes.outputMod.extensions.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.LoadBalancerStatus
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
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressStatus]
  }
}

