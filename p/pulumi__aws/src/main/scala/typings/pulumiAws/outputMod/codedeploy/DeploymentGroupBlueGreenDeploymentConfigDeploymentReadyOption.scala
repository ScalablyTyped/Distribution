package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption extends js.Object {
  /**
    * When to reroute traffic from an original environment to a replacement environment in a blue/green deployment.
    * * `CONTINUE_DEPLOYMENT`: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.
    * * `STOP_DEPLOYMENT`: Do not register new instances with load balancer unless traffic is rerouted manually. If traffic is not rerouted manually before the end of the specified wait period, the deployment status is changed to Stopped.
    */
  var actionOnTimeout: js.UndefOr[String] = js.native
  /**
    * The number of minutes to wait before the status of a blue/green deployment changed to Stopped if rerouting is not started manually. Applies only to the `STOP_DEPLOYMENT` option for `actionOnTimeout`.
    */
  var waitTimeInMinutes: js.UndefOr[Double] = js.native
}

object DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption {
  @scala.inline
  def apply(actionOnTimeout: String = null, waitTimeInMinutes: js.UndefOr[Double] = js.undefined): DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption = {
    val __obj = js.Dynamic.literal()
    if (actionOnTimeout != null) __obj.updateDynamic("actionOnTimeout")(actionOnTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitTimeInMinutes)) __obj.updateDynamic("waitTimeInMinutes")(waitTimeInMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupBlueGreenDeploymentConfigDeploymentReadyOption]
  }
}

