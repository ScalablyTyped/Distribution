package typings.atPulumiAws.typesOutputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfigTrafficRoutingConfig extends js.Object {
  var timeBasedCanary: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedCanary] = js.undefined
  var timeBasedLinear: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedLinear] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DeploymentConfigTrafficRoutingConfig {
  @scala.inline
  def apply(
    timeBasedCanary: DeploymentConfigTrafficRoutingConfigTimeBasedCanary = null,
    timeBasedLinear: DeploymentConfigTrafficRoutingConfigTimeBasedLinear = null,
    `type`: String = null
  ): DeploymentConfigTrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (timeBasedCanary != null) __obj.updateDynamic("timeBasedCanary")(timeBasedCanary)
    if (timeBasedLinear != null) __obj.updateDynamic("timeBasedLinear")(timeBasedLinear)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfig]
  }
}

