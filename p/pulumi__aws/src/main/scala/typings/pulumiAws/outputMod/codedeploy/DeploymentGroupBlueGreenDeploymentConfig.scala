package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupBlueGreenDeploymentConfig extends js.Object {
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment (documented below).
    */
  var deploymentReadyOption: js.UndefOr[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption] = js.native
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment (documented below).
    */
  var greenFleetProvisioningOption: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption = js.native
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment (documented below).
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[
    DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess
  ] = js.native
}

object DeploymentGroupBlueGreenDeploymentConfig {
  @scala.inline
  def apply(greenFleetProvisioningOption: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption): DeploymentGroupBlueGreenDeploymentConfig = {
    val __obj = js.Dynamic.literal(greenFleetProvisioningOption = greenFleetProvisioningOption.asInstanceOf[js.Any])
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
    def setGreenFleetProvisioningOption(value: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption): Self = this.set("greenFleetProvisioningOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentReadyOption(value: DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption): Self = this.set("deploymentReadyOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentReadyOption: Self = this.set("deploymentReadyOption", js.undefined)
    @scala.inline
    def setTerminateBlueInstancesOnDeploymentSuccess(value: DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess): Self = this.set("terminateBlueInstancesOnDeploymentSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminateBlueInstancesOnDeploymentSuccess: Self = this.set("terminateBlueInstancesOnDeploymentSuccess", js.undefined)
  }
  
}

