package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def setElbInfosVarargs(value: DeploymentGroupLoadBalancerInfoElbInfo*): Self = this.set("elbInfos", js.Array(value :_*))
    
    @scala.inline
    def setElbInfos(value: js.Array[DeploymentGroupLoadBalancerInfoElbInfo]): Self = this.set("elbInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElbInfos: Self = this.set("elbInfos", js.undefined)
    
    @scala.inline
    def setTargetGroupInfosVarargs(value: DeploymentGroupLoadBalancerInfoTargetGroupInfo*): Self = this.set("targetGroupInfos", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupInfos(value: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupInfo]): Self = this.set("targetGroupInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroupInfos: Self = this.set("targetGroupInfos", js.undefined)
    
    @scala.inline
    def setTargetGroupPairInfo(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo): Self = this.set("targetGroupPairInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroupPairInfo: Self = this.set("targetGroupPairInfo", js.undefined)
  }
}
