package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfigTrafficRoutingConfig extends js.Object {
  var timeBasedCanary: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfigTimeBasedCanary]] = js.undefined
  var timeBasedLinear: js.UndefOr[Input[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object DeploymentConfigTrafficRoutingConfig {
  @scala.inline
  def apply(
    timeBasedCanary: Input[DeploymentConfigTrafficRoutingConfigTimeBasedCanary] = null,
    timeBasedLinear: Input[DeploymentConfigTrafficRoutingConfigTimeBasedLinear] = null,
    `type`: Input[String] = null
  ): DeploymentConfigTrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (timeBasedCanary != null) __obj.updateDynamic("timeBasedCanary")(timeBasedCanary.asInstanceOf[js.Any])
    if (timeBasedLinear != null) __obj.updateDynamic("timeBasedLinear")(timeBasedLinear.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfig]
  }
}

