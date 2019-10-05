package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption extends js.Object {
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.
    * * `TERMINATE`: Instances are terminated after a specified wait time.
    * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
    */
  var action: js.UndefOr[Input[String]] = js.undefined
}

object DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption {
  @scala.inline
  def apply(action: Input[String] = null): DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]
  }
}

