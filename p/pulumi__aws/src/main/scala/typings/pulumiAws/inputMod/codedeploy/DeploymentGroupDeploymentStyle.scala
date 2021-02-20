package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupDeploymentStyle extends StObject {
  
  /**
    * Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
    */
  var deploymentOption: js.UndefOr[Input[String]] = js.native
  
  /**
    * Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
    */
  var deploymentType: js.UndefOr[Input[String]] = js.native
}
object DeploymentGroupDeploymentStyle {
  
  @scala.inline
  def apply(): DeploymentGroupDeploymentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupDeploymentStyle]
  }
  
  @scala.inline
  implicit class DeploymentGroupDeploymentStyleMutableBuilder[Self <: DeploymentGroupDeploymentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentOption(value: Input[String]): Self = StObject.set(x, "deploymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentOptionUndefined: Self = StObject.set(x, "deploymentOption", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: Input[String]): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTypeUndefined: Self = StObject.set(x, "deploymentType", js.undefined)
  }
}
