package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.undefined
}

object ServiceStatus {
  @scala.inline
  def apply(loadBalancer: Input[LoadBalancerStatus] = null): ServiceStatus = {
    val __obj = js.Dynamic.literal()
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
}

