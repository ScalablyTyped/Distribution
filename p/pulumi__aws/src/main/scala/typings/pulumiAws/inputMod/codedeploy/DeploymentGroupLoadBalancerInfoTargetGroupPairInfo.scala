package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends js.Object {
  /**
    * Configuration block for the production traffic route (documented below).
    */
  var prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute] = js.native
  /**
    * Configuration blocks for a target group within a target group pair (documented below).
    */
  var targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]] = js.native
  /**
    * Configuration block for the test traffic route (documented below).
    */
  var testTrafficRoute: js.UndefOr[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]] = js.native
}

object DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
  @scala.inline
  def apply(
    prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute],
    targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]]
  ): DeploymentGroupLoadBalancerInfoTargetGroupPairInfo = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute.asInstanceOf[js.Any], targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]
  }
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoOps[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo] (val x: Self) extends AnyVal {
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
    def setProdTrafficRoute(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute]): Self = this.set("prodTrafficRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetGroupsVarargs(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]*): Self = this.set("targetGroups", js.Array(value :_*))
    @scala.inline
    def setTargetGroups(value: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]]): Self = this.set("targetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestTrafficRoute(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]): Self = this.set("testTrafficRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestTrafficRoute: Self = this.set("testTrafficRoute", js.undefined)
  }
  
}

