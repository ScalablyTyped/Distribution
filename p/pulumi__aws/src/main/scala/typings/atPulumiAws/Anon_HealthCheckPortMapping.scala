package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthCheckPortMapping extends js.Object {
  var healthCheck: js.UndefOr[Input[Anon_HealthyThresholdIntervalMillis]] = js.undefined
  var portMapping: Input[Anon_PortProtocol]
}

object Anon_HealthCheckPortMapping {
  @scala.inline
  def apply(
    portMapping: Input[Anon_PortProtocol],
    healthCheck: Input[Anon_HealthyThresholdIntervalMillis] = null
  ): Anon_HealthCheckPortMapping = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HealthCheckPortMapping]
  }
}

