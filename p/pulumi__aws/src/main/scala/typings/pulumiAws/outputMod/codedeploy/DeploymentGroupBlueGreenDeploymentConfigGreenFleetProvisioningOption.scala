package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigGreenFleetProvisioningOption extends js.Object {
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.
    * * `TERMINATE`: Instances are terminated after a specified wait time.
    * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
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

