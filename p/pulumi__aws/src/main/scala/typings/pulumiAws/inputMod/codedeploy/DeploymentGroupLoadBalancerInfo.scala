package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfo extends StObject {
  
  /**
    * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `targetGroupInfo` and `targetGroupPairInfo`.
    */
  var elbInfos: js.UndefOr[Input[js.Array[Input[DeploymentGroupLoadBalancerInfoElbInfo]]]] = js.undefined
  
  /**
    * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elbInfo` and `targetGroupPairInfo`.
    */
  var targetGroupInfos: js.UndefOr[Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupInfo]]]] = js.undefined
  
  /**
    * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elbInfo` and `targetGroupInfo`.
    */
  var targetGroupPairInfo: js.UndefOr[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]] = js.undefined
}
object DeploymentGroupLoadBalancerInfo {
  
  @scala.inline
  def apply(): DeploymentGroupLoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfo]
  }
  
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoMutableBuilder[Self <: DeploymentGroupLoadBalancerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElbInfos(value: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoElbInfo]]]): Self = StObject.set(x, "elbInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElbInfosUndefined: Self = StObject.set(x, "elbInfos", js.undefined)
    
    @scala.inline
    def setElbInfosVarargs(value: Input[DeploymentGroupLoadBalancerInfoElbInfo]*): Self = StObject.set(x, "elbInfos", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupInfos(value: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupInfo]]]): Self = StObject.set(x, "targetGroupInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupInfosUndefined: Self = StObject.set(x, "targetGroupInfos", js.undefined)
    
    @scala.inline
    def setTargetGroupInfosVarargs(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupInfo]*): Self = StObject.set(x, "targetGroupInfos", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupPairInfo(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]): Self = StObject.set(x, "targetGroupPairInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupPairInfoUndefined: Self = StObject.set(x, "targetGroupPairInfo", js.undefined)
  }
}
