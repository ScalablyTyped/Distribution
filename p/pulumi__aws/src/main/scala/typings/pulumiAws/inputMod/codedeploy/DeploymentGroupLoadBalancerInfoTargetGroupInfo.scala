package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfoTargetGroupInfo extends StObject {
  
  /**
    * The name of the target group that instances in the original environment are deregistered from, and instances in the replacement environment registered with. For in-place deployments, the name of the target group that instances are deregistered from, so they are not serving traffic during a deployment, and then re-registered with after the deployment completes.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object DeploymentGroupLoadBalancerInfoTargetGroupInfo {
  
  inline def apply(): DeploymentGroupLoadBalancerInfoTargetGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupInfo]
  }
  
  extension [Self <: DeploymentGroupLoadBalancerInfoTargetGroupInfo](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
