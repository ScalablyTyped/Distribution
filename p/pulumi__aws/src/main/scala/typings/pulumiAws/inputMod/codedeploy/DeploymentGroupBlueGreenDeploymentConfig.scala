package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupBlueGreenDeploymentConfig extends js.Object {
  
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment (documented below).
    */
  var deploymentReadyOption: js.UndefOr[Input[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption]] = js.native
  
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment (documented below).
    */
  var greenFleetProvisioningOption: js.UndefOr[Input[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]] = js.native
  
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment (documented below).
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[
    Input[
      DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess
    ]
  ] = js.native
}
object DeploymentGroupBlueGreenDeploymentConfig {
  
  @scala.inline
  def apply(): DeploymentGroupBlueGreenDeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfig]
  }
  
  @scala.inline
  implicit class DeploymentGroupBlueGreenDeploymentConfigOps[Self <: DeploymentGroupBlueGreenDeploymentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentReadyOption(value: Input[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption]): Self = this.set("deploymentReadyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentReadyOption: Self = this.set("deploymentReadyOption", js.undefined)
    
    @scala.inline
    def setGreenFleetProvisioningOption(value: Input[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]): Self = this.set("greenFleetProvisioningOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenFleetProvisioningOption: Self = this.set("greenFleetProvisioningOption", js.undefined)
    
    @scala.inline
    def setTerminateBlueInstancesOnDeploymentSuccess(
      value: Input[
          DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess
        ]
    ): Self = this.set("terminateBlueInstancesOnDeploymentSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateBlueInstancesOnDeploymentSuccess: Self = this.set("terminateBlueInstancesOnDeploymentSuccess", js.undefined)
  }
}
