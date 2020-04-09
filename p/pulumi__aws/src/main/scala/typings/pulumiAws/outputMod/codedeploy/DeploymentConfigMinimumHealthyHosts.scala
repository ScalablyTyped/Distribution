package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigMinimumHealthyHosts extends js.Object {
  /**
    * The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
    * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
    * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
    * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
    */
  var value: js.UndefOr[Double] = js.native
}

object DeploymentConfigMinimumHealthyHosts {
  @scala.inline
  def apply(`type`: String = null, value: Int | Double = null): DeploymentConfigMinimumHealthyHosts = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigMinimumHealthyHosts]
  }
}

