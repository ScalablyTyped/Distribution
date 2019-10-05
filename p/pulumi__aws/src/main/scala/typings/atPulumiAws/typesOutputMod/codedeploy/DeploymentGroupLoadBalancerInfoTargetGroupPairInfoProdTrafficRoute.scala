package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the load balancer listeners.
    */
  var listenerArns: js.Array[String]
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute {
  @scala.inline
  def apply(listenerArns: js.Array[String]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute = {
    val __obj = js.Dynamic.literal(listenerArns = listenerArns)
  
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute]
  }
}

