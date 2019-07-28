package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeploymentReadyOptionGreenFleetProvisioningOption extends js.Object {
  var deploymentReadyOption: js.UndefOr[Input[Anon_ActionOnTimeoutWaitTimeInMinutes]] = js.undefined
  var greenFleetProvisioningOption: js.UndefOr[Input[Anon_ActionInput]] = js.undefined
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[Input[Anon_ActionTerminationWaitTimeInMinutesInput]] = js.undefined
}

object Anon_DeploymentReadyOptionGreenFleetProvisioningOption {
  @scala.inline
  def apply(
    deploymentReadyOption: Input[Anon_ActionOnTimeoutWaitTimeInMinutes] = null,
    greenFleetProvisioningOption: Input[Anon_ActionInput] = null,
    terminateBlueInstancesOnDeploymentSuccess: Input[Anon_ActionTerminationWaitTimeInMinutesInput] = null
  ): Anon_DeploymentReadyOptionGreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    if (deploymentReadyOption != null) __obj.updateDynamic("deploymentReadyOption")(deploymentReadyOption.asInstanceOf[js.Any])
    if (greenFleetProvisioningOption != null) __obj.updateDynamic("greenFleetProvisioningOption")(greenFleetProvisioningOption.asInstanceOf[js.Any])
    if (terminateBlueInstancesOnDeploymentSuccess != null) __obj.updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(terminateBlueInstancesOnDeploymentSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeploymentReadyOptionGreenFleetProvisioningOption]
  }
}

