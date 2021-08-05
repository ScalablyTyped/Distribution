package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupBlueGreenDeploymentConfig extends StObject {
  
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment (documented below).
    */
  var deploymentReadyOption: js.UndefOr[Input[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption]] = js.undefined
  
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment (documented below).
    */
  var greenFleetProvisioningOption: js.UndefOr[Input[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]] = js.undefined
  
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment (documented below).
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[
    Input[
      DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess
    ]
  ] = js.undefined
}
object DeploymentGroupBlueGreenDeploymentConfig {
  
  inline def apply(): DeploymentGroupBlueGreenDeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfig]
  }
  
  extension [Self <: DeploymentGroupBlueGreenDeploymentConfig](x: Self) {
    
    inline def setDeploymentReadyOption(value: Input[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption]): Self = StObject.set(x, "deploymentReadyOption", value.asInstanceOf[js.Any])
    
    inline def setDeploymentReadyOptionUndefined: Self = StObject.set(x, "deploymentReadyOption", js.undefined)
    
    inline def setGreenFleetProvisioningOption(value: Input[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]): Self = StObject.set(x, "greenFleetProvisioningOption", value.asInstanceOf[js.Any])
    
    inline def setGreenFleetProvisioningOptionUndefined: Self = StObject.set(x, "greenFleetProvisioningOption", js.undefined)
    
    inline def setTerminateBlueInstancesOnDeploymentSuccess(
      value: Input[
          DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess
        ]
    ): Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", value.asInstanceOf[js.Any])
    
    inline def setTerminateBlueInstancesOnDeploymentSuccessUndefined: Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", js.undefined)
  }
}
