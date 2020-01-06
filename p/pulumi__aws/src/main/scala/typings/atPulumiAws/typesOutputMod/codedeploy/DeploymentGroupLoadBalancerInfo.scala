package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfo extends js.Object {
  /**
    * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `targetGroupInfo` and `targetGroupPairInfo`.
    */
  var elbInfos: js.UndefOr[js.Array[DeploymentGroupLoadBalancerInfoElbInfo]] = js.native
  /**
    * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elbInfo` and `targetGroupPairInfo`.
    */
  var targetGroupInfos: js.UndefOr[js.Array[DeploymentGroupLoadBalancerInfoTargetGroupInfo]] = js.native
  /**
    * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elbInfo` and `targetGroupInfo`.
    */
  var targetGroupPairInfo: js.UndefOr[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo] = js.native
}

object DeploymentGroupLoadBalancerInfo {
  @scala.inline
  def apply(
    elbInfos: js.Array[DeploymentGroupLoadBalancerInfoElbInfo] = null,
    targetGroupInfos: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupInfo] = null,
    targetGroupPairInfo: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo = null
  ): DeploymentGroupLoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    if (elbInfos != null) __obj.updateDynamic("elbInfos")(elbInfos.asInstanceOf[js.Any])
    if (targetGroupInfos != null) __obj.updateDynamic("targetGroupInfos")(targetGroupInfos.asInstanceOf[js.Any])
    if (targetGroupPairInfo != null) __obj.updateDynamic("targetGroupPairInfo")(targetGroupPairInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfo]
  }
}

