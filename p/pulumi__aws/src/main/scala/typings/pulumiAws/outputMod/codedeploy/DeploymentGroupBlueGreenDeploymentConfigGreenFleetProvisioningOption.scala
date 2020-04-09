package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption extends js.Object {
  /**
    * The method used to add instances to a replacement environment.
    * * `DISCOVER_EXISTING`: Use instances that already exist or will be created manually.
    * * `COPY_AUTO_SCALING_GROUP`: Use settings from a specified **Auto Scaling** group to define and create instances in a new Auto Scaling group. _Exactly one Auto Scaling group must be specified_ when selecting `COPY_AUTO_SCALING_GROUP`. Use `autoscalingGroups` to specify the Auto Scaling group.
    */
  var action: js.UndefOr[String] = js.native
}

object DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption {
  @scala.inline
  def apply(action: String = null): DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption]
  }
}

