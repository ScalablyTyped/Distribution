package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    deploymentReadyOption: Input[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption] = null,
    greenFleetProvisioningOption: Input[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption] = null,
    terminateBlueInstancesOnDeploymentSuccess: Input[
      DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess
    ] = null
  ): DeploymentGroupBlueGreenDeploymentConfig = {
    val __obj = js.Dynamic.literal()
    if (deploymentReadyOption != null) __obj.updateDynamic("deploymentReadyOption")(deploymentReadyOption.asInstanceOf[js.Any])
    if (greenFleetProvisioningOption != null) __obj.updateDynamic("greenFleetProvisioningOption")(greenFleetProvisioningOption.asInstanceOf[js.Any])
    if (terminateBlueInstancesOnDeploymentSuccess != null) __obj.updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(terminateBlueInstancesOnDeploymentSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfig]
  }
}

