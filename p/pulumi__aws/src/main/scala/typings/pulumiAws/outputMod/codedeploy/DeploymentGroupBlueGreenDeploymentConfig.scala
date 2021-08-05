package typings.pulumiAws.outputMod.codedeploy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroupBlueGreenDeploymentConfig extends StObject {
  
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment (documented below).
    */
  var deploymentReadyOption: js.UndefOr[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption] = js.undefined
  
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment (documented below).
    */
  var greenFleetProvisioningOption: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption
  
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment (documented below).
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[
    DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess
  ] = js.undefined
}
object DeploymentGroupBlueGreenDeploymentConfig {
  
  inline def apply(greenFleetProvisioningOption: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption): DeploymentGroupBlueGreenDeploymentConfig = {
    val __obj = js.Dynamic.literal(greenFleetProvisioningOption = greenFleetProvisioningOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfig]
  }
  
  extension [Self <: DeploymentGroupBlueGreenDeploymentConfig](x: Self) {
    
    inline def setDeploymentReadyOption(value: DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption): Self = StObject.set(x, "deploymentReadyOption", value.asInstanceOf[js.Any])
    
    inline def setDeploymentReadyOptionUndefined: Self = StObject.set(x, "deploymentReadyOption", js.undefined)
    
    inline def setGreenFleetProvisioningOption(value: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption): Self = StObject.set(x, "greenFleetProvisioningOption", value.asInstanceOf[js.Any])
    
    inline def setTerminateBlueInstancesOnDeploymentSuccess(value: DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess): Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", value.asInstanceOf[js.Any])
    
    inline def setTerminateBlueInstancesOnDeploymentSuccessUndefined: Self = StObject.set(x, "terminateBlueInstancesOnDeploymentSuccess", js.undefined)
  }
}
