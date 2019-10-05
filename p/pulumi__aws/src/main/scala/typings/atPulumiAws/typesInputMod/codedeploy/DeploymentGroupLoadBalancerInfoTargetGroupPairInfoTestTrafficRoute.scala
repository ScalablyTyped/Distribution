package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the load balancer listeners.
    */
  var listenerArns: Input[js.Array[Input[String]]]
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute {
  @scala.inline
  def apply(listenerArns: Input[js.Array[Input[String]]]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute = {
    val __obj = js.Dynamic.literal(listenerArns = listenerArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]
  }
}

