package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends StObject {
  
  /**
    * Configuration block for the production traffic route (documented below).
    */
  var prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute]
  
  /**
    * Configuration blocks for a target group within a target group pair (documented below).
    */
  var targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]]
  
  /**
    * Configuration block for the test traffic route (documented below).
    */
  var testTrafficRoute: js.UndefOr[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]] = js.undefined
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
  
  inline def apply(
    prodTrafficRoute: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute],
    targetGroups: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]]
  ): DeploymentGroupLoadBalancerInfoTargetGroupPairInfo = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute.asInstanceOf[js.Any], targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]
  }
  
  extension [Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo](x: Self) {
    
    inline def setProdTrafficRoute(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute]): Self = StObject.set(x, "prodTrafficRoute", value.asInstanceOf[js.Any])
    
    inline def setTargetGroups(value: Input[js.Array[Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]]]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsVarargs(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
    
    inline def setTestTrafficRoute(value: Input[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute]): Self = StObject.set(x, "testTrafficRoute", value.asInstanceOf[js.Any])
    
    inline def setTestTrafficRouteUndefined: Self = StObject.set(x, "testTrafficRoute", js.undefined)
  }
}
