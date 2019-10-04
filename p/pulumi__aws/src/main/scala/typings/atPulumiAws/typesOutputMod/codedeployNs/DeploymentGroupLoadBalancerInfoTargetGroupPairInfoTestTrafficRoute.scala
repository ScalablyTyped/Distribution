package typings.atPulumiAws.typesOutputMod.codedeployNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the load balancer listeners.
    */
  var listenerArns: js.Array[String]
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute {
  @scala.inline
  def apply(listenerArns: js.Array[String]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute = {
    val __obj = js.Dynamic.literal(listenerArns = listenerArns)
  
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]
  }
}

