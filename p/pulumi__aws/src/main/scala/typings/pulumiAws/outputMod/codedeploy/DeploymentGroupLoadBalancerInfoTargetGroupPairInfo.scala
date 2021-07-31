package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfo extends StObject {
  
  /**
    * Configuration block for the production traffic route (documented below).
    */
  var prodTrafficRoute: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute
  
  /**
    * Configuration blocks for a target group within a target group pair (documented below).
    */
  var targetGroups: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  
  /**
    * Configuration block for the test traffic route (documented below).
    */
  var testTrafficRoute: js.UndefOr[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute] = js.undefined
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfo {
  
  @scala.inline
  def apply(
    prodTrafficRoute: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute,
    targetGroups: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  ): DeploymentGroupLoadBalancerInfoTargetGroupPairInfo = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute.asInstanceOf[js.Any], targetGroups = targetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfo]
  }
  
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoMutableBuilder[Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProdTrafficRoute(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute): Self = StObject.set(x, "prodTrafficRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroups(value: js.Array[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]): Self = StObject.set(x, "targetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupsVarargs(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup*): Self = StObject.set(x, "targetGroups", js.Array(value :_*))
    
    @scala.inline
    def setTestTrafficRoute(value: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute): Self = StObject.set(x, "testTrafficRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestTrafficRouteUndefined: Self = StObject.set(x, "testTrafficRoute", js.undefined)
  }
}
