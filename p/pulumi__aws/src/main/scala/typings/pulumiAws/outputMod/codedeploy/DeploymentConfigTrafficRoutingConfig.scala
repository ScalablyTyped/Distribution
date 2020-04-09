package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigTrafficRoutingConfig extends js.Object {
  /**
    * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `timeBasedLinear` instead.
    */
  var timeBasedCanary: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedCanary] = js.native
  /**
    * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `timeBasedCanary` instead.
    */
  var timeBasedLinear: js.UndefOr[DeploymentConfigTrafficRoutingConfigTimeBasedLinear] = js.native
  /**
    * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object DeploymentConfigTrafficRoutingConfig {
  @scala.inline
  def apply(
    timeBasedCanary: DeploymentConfigTrafficRoutingConfigTimeBasedCanary = null,
    timeBasedLinear: DeploymentConfigTrafficRoutingConfigTimeBasedLinear = null,
    `type`: String = null
  ): DeploymentConfigTrafficRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (timeBasedCanary != null) __obj.updateDynamic("timeBasedCanary")(timeBasedCanary.asInstanceOf[js.Any])
    if (timeBasedLinear != null) __obj.updateDynamic("timeBasedLinear")(timeBasedLinear.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfig]
  }
}

