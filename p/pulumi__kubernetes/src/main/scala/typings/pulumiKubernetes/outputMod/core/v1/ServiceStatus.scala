package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceStatus represents the current status of a service.
  */
trait ServiceStatus extends js.Object {
  /**
    * LoadBalancer contains the current status of the load-balancer, if one is present.
    */
  val loadBalancer: LoadBalancerStatus
}

object ServiceStatus {
  @scala.inline
  def apply(loadBalancer: LoadBalancerStatus): ServiceStatus = {
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceStatus]
  }
}

