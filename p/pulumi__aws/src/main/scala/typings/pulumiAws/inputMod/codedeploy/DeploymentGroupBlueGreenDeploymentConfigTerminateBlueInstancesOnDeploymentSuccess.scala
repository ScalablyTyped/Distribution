package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess extends js.Object {
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.
    * * `TERMINATE`: Instances are terminated after a specified wait time.
    * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
    */
  var action: js.UndefOr[Input[String]] = js.native
  /**
    * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
    */
  var terminationWaitTimeInMinutes: js.UndefOr[Input[Double]] = js.native
}

object DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess {
  @scala.inline
  def apply(action: Input[String] = null, terminationWaitTimeInMinutes: Input[Double] = null): DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (terminationWaitTimeInMinutes != null) __obj.updateDynamic("terminationWaitTimeInMinutes")(terminationWaitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess]
  }
}

