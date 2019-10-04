package typings.atPulumiAws.typesOutputMod.codedeployNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupBlueGreenDeploymentConfig extends js.Object {
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
  @scala.inline
  def apply(
    greenFleetProvisioningOption: DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption,
    deploymentReadyOption: DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption = null,
    terminateBlueInstancesOnDeploymentSuccess: DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess = null
  ): DeploymentGroupBlueGreenDeploymentConfig = {
    val __obj = js.Dynamic.literal(greenFleetProvisioningOption = greenFleetProvisioningOption)
    if (deploymentReadyOption != null) __obj.updateDynamic("deploymentReadyOption")(deploymentReadyOption)
    if (terminateBlueInstancesOnDeploymentSuccess != null) __obj.updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(terminateBlueInstancesOnDeploymentSuccess)
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfig]
  }
}

