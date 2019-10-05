package typings.atPulumiKubernetes.typesOutputMod.core.v1

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

object LoadBalancerStatus {
  @scala.inline
  def apply(ingress: js.Array[LoadBalancerIngress]): LoadBalancerStatus = {
    val __obj = js.Dynamic.literal(ingress = ingress)
  
    __obj.asInstanceOf[LoadBalancerStatus]
  }
}

