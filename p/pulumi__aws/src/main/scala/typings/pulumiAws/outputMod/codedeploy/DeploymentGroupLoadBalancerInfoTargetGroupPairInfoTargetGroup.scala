package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup extends js.Object {
  /**
    * Name of the target group.
    */
  var name: String = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup {
  @scala.inline
  def apply(name: String): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  }
}

