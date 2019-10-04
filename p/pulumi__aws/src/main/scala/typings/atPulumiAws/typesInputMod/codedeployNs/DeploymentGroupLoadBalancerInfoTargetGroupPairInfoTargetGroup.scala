package typings.atPulumiAws.typesInputMod.codedeployNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup extends js.Object {
  /**
    * Name of the target group.
    */
  var name: Input[String]
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup {
  @scala.inline
  def apply(name: Input[String]): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  }
}

