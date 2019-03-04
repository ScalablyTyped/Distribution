package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthCheckPortMapping extends js.Object {
  var healthCheck: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_HealthyThresholdIntervalMillisPath]] = js.undefined
  var portMapping: atPulumiPulumiLib.outputMod.Input[Anon_PortProtocol]
}

object Anon_HealthCheckPortMapping {
  @scala.inline
  def apply(
    portMapping: atPulumiPulumiLib.outputMod.Input[Anon_PortProtocol],
    healthCheck: atPulumiPulumiLib.outputMod.Input[Anon_HealthyThresholdIntervalMillisPath] = null
  ): Anon_HealthCheckPortMapping = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HealthCheckPortMapping]
  }
}

