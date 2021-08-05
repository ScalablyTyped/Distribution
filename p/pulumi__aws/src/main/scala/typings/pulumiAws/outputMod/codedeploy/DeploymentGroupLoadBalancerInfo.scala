package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfo extends StObject {
  
  /**
    * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `targetGroupInfo` and `targetGroupPairInfo`.
    */
  var elbInfos: js.UndefOr[js.Array[DeploymentGroupLoadBalancerInfoElbInfo]] = js.undefined
  
  /**
    * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elbInfo` and `targetGroupPairInfo`.
    */
  var targetGroupInfos: js.UndefOr[js.Array[DeploymentGroupLoadBalancerInfoTargetGroupInfo]] = js.undefined
  
  /**
    * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elbInfo` and `targetGroupInfo`.
    */
  var targetGroupPairInfo: js.UndefOr[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo] = js.undefined
}
object DeploymentGroupLoadBalancerInfo {
  
  inline def apply(): DeploymentGroupLoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfo]
  }
  
  extension [Self <: DeploymentGroupLoadBalancerInfo](x: Self) {
    
    inline def setElbInfos(value: js.Array[DeploymentGroupLoadBalancerInfoElbInfo]): Self = StObject.set(x, "elbInfos", value.asInstanceOf[js.Any])
    
    inline def setElbInfosUndefined: Self = StObject.set(x, "elbInfos", js.undefined)
    
    inline def setElbInfosVarargs(value: DeploymentGroupLoadBalancerInfoElbInfo*): Self = StObject.set(x, "elbInfos", js.Array(value :_*))
    
    inline def setTargetGroupInfos(value: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupInfo]): Self = StObject.set(x, "targetGroupInfos", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupInfosUndefined: Self = StObject.set(x, "targetGroupInfos", js.undefined)
    
    inline def setTargetGroupInfosVarargs(value: DeploymentGroupLoadBalancerInfoTargetGroupInfo*): Self = StObject.set(x, "targetGroupInfos", js.Array(value :_*))
    
    inline def setTargetGroupPairInfo(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo): Self = StObject.set(x, "targetGroupPairInfo", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupPairInfoUndefined: Self = StObject.set(x, "targetGroupPairInfo", js.undefined)
  }
}
