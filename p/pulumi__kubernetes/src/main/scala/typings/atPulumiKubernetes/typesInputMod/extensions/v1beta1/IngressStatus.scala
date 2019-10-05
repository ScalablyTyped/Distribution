package typings.atPulumiKubernetes.typesInputMod.extensions.v1beta1

import typings.atPulumiKubernetes.typesInputMod.core.v1.LoadBalancerStatus
import typings.atPulumiPulumi.outputMod.Input
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
  var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.undefined
}

object IngressStatus {
  @scala.inline
  def apply(loadBalancer: Input[LoadBalancerStatus] = null): IngressStatus = {
    val __obj = js.Dynamic.literal()
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressStatus]
  }
}

