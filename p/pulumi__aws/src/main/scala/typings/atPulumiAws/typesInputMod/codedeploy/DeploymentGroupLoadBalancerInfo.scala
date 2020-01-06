package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfo extends js.Object {
  /**
    * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `targetGroupInfo` and `targetGroupPairInfo`.
    */
  var elbInfos: js.UndefOr[Input[js.Array[Input[DeploymentGroupLoadBalancerInfoElbInfo]]]] = js.native
  /**
    * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elbInfo` and `targetGroupPairInfo`.
    */
  var targetGroupInfos: js.UndefOr[Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupInfo]]]] = js.native
  /**
    * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elbInfo` and `targetGroupInfo`.
    */
  var targetGroupPairInfo: js.UndefOr[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]] = js.native
}

object DeploymentGroupLoadBalancerInfo {
  @scala.inline
  def apply(
    elbInfos: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoElbInfo]]] = null,
    targetGroupInfos: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupInfo]]] = null,
    targetGroupPairInfo: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo] = null
  ): DeploymentGroupLoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    if (elbInfos != null) __obj.updateDynamic("elbInfos")(elbInfos.asInstanceOf[js.Any])
    if (targetGroupInfos != null) __obj.updateDynamic("targetGroupInfos")(targetGroupInfos.asInstanceOf[js.Any])
    if (targetGroupPairInfo != null) __obj.updateDynamic("targetGroupPairInfo")(targetGroupPairInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfo]
  }
}

