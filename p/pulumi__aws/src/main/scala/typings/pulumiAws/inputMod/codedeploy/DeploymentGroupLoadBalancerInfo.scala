package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
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
  def apply(): DeploymentGroupLoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfo]
  }
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoOps[Self <: DeploymentGroupLoadBalancerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElbInfosVarargs(value: Input[DeploymentGroupLoadBalancerInfoElbInfo]*): Self = this.set("elbInfos", js.Array(value :_*))
    @scala.inline
    def setElbInfos(value: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoElbInfo]]]): Self = this.set("elbInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElbInfos: Self = this.set("elbInfos", js.undefined)
    @scala.inline
    def setTargetGroupInfosVarargs(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupInfo]*): Self = this.set("targetGroupInfos", js.Array(value :_*))
    @scala.inline
    def setTargetGroupInfos(value: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupInfo]]]): Self = this.set("targetGroupInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupInfos: Self = this.set("targetGroupInfos", js.undefined)
    @scala.inline
    def setTargetGroupPairInfo(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]): Self = this.set("targetGroupPairInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupPairInfo: Self = this.set("targetGroupPairInfo", js.undefined)
  }
  
}

