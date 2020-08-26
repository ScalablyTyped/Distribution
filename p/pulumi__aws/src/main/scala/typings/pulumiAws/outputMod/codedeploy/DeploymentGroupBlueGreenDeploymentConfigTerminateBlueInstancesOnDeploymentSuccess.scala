package typings.pulumiAws.outputMod.codedeploy

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
  var action: js.UndefOr[String] = js.native
  /**
    * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
    */
  var terminationWaitTimeInMinutes: js.UndefOr[Double] = js.native
}

object DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess {
  @scala.inline
  def apply(): DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess]
  }
  @scala.inline
  implicit class DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccessOps[Self <: DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setTerminationWaitTimeInMinutes(value: Double): Self = this.set("terminationWaitTimeInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminationWaitTimeInMinutes: Self = this.set("terminationWaitTimeInMinutes", js.undefined)
  }
  
}

