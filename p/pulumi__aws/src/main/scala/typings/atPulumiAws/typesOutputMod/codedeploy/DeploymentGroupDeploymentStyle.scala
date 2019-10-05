package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupDeploymentStyle extends js.Object {
  /**
    * Indicates whether to route deployment traffic behind a load balancer. Valid Values are `WITH_TRAFFIC_CONTROL` or `WITHOUT_TRAFFIC_CONTROL`.
    */
  var deploymentOption: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether to run an in-place deployment or a blue/green deployment. Valid Values are `IN_PLACE` or `BLUE_GREEN`.
    */
  var deploymentType: js.UndefOr[String] = js.undefined
}

object DeploymentGroupDeploymentStyle {
  @scala.inline
  def apply(deploymentOption: String = null, deploymentType: String = null): DeploymentGroupDeploymentStyle = {
    val __obj = js.Dynamic.literal()
    if (deploymentOption != null) __obj.updateDynamic("deploymentOption")(deploymentOption)
    if (deploymentType != null) __obj.updateDynamic("deploymentType")(deploymentType)
    __obj.asInstanceOf[DeploymentGroupDeploymentStyle]
  }
}

