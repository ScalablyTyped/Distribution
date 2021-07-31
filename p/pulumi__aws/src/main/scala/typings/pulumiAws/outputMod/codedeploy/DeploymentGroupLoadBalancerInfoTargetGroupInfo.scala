package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupLoadBalancerInfoTargetGroupInfo extends StObject {
  
  /**
    * The name of the target group that instances in the original environment are deregistered from, and instances in the replacement environment registered with. For in-place deployments, the name of the target group that instances are deregistered from, so they are not serving traffic during a deployment, and then re-registered with after the deployment completes.
    */
  var name: js.UndefOr[String] = js.undefined
}
object DeploymentGroupLoadBalancerInfoTargetGroupInfo {
  
  @scala.inline
  def apply(): DeploymentGroupLoadBalancerInfoTargetGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupLoadBalancerInfoTargetGroupInfo]
  }
  
  @scala.inline
  implicit class DeploymentGroupLoadBalancerInfoTargetGroupInfoMutableBuilder[Self <: DeploymentGroupLoadBalancerInfoTargetGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
