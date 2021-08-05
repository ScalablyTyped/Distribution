package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup extends StObject {
  
  /**
    * Name of the target group.
    */
  var name: String
}
object DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup {
  
  inline def apply(name: String): DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup]
  }
  
  extension [Self <: DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroup](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
