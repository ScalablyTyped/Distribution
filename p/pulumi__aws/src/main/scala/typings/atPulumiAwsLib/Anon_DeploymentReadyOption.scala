package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeploymentReadyOption extends js.Object {
  var deploymentReadyOption: js.UndefOr[Anon_ActionOnTimeout] = js.undefined
  var greenFleetProvisioningOption: Anon_ActionString
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[Anon_ActionTerminationWaitTimeInMinutes] = js.undefined
}

object Anon_DeploymentReadyOption {
  @scala.inline
  def apply(
    greenFleetProvisioningOption: Anon_ActionString,
    deploymentReadyOption: Anon_ActionOnTimeout = null,
    terminateBlueInstancesOnDeploymentSuccess: Anon_ActionTerminationWaitTimeInMinutes = null
  ): Anon_DeploymentReadyOption = {
    val __obj = js.Dynamic.literal(greenFleetProvisioningOption = greenFleetProvisioningOption)
    if (deploymentReadyOption != null) __obj.updateDynamic("deploymentReadyOption")(deploymentReadyOption)
    if (terminateBlueInstancesOnDeploymentSuccess != null) __obj.updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(terminateBlueInstancesOnDeploymentSuccess)
    __obj.asInstanceOf[Anon_DeploymentReadyOption]
  }
}

