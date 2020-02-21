package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupDeploymentStyle extends js.Object {
  /**
    * Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`. Default is `WITHOUT_TRAFFIC_CONTROL`.
    */
  var deploymentOption: js.UndefOr[String] = js.native
  /**
    * Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`. Default is `IN_PLACE`.
    */
  var deploymentType: js.UndefOr[String] = js.native
}

object DeploymentGroupDeploymentStyle {
  @scala.inline
  def apply(deploymentOption: String = null, deploymentType: String = null): DeploymentGroupDeploymentStyle = {
    val __obj = js.Dynamic.literal()
    if (deploymentOption != null) __obj.updateDynamic("deploymentOption")(deploymentOption.asInstanceOf[js.Any])
    if (deploymentType != null) __obj.updateDynamic("deploymentType")(deploymentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupDeploymentStyle]
  }
}

