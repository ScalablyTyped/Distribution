package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthCheck extends js.Object {
  var healthCheck: js.UndefOr[Anon_HealthyThresholdIntervalMillis] = js.undefined
  var portMapping: Anon_Port
}

object Anon_HealthCheck {
  @scala.inline
  def apply(portMapping: Anon_Port, healthCheck: Anon_HealthyThresholdIntervalMillis = null): Anon_HealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("portMapping")(portMapping)
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck)
    __obj.asInstanceOf[Anon_HealthCheck]
  }
}

