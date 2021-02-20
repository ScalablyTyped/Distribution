package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption extends StObject {
  
  /**
    * The method used to add instances to a replacement environment.
    * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
    * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscalingGroups` to specify the Auto Scaling group.
    */
  var action: js.UndefOr[Input[String]] = js.native
}
object DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption {
  
  @scala.inline
  def apply(): DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]
  }
  
  @scala.inline
  implicit class DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOptionMutableBuilder[Self <: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
