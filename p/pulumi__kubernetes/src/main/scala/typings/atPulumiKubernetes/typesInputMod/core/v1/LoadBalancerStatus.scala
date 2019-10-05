package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var ingress: js.UndefOr[Input[js.Array[Input[LoadBalancerIngress]]]] = js.undefined
}

object LoadBalancerStatus {
  @scala.inline
  def apply(ingress: Input[js.Array[Input[LoadBalancerIngress]]] = null): LoadBalancerStatus = {
    val __obj = js.Dynamic.literal()
    if (ingress != null) __obj.updateDynamic("ingress")(ingress.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerStatus]
  }
}

