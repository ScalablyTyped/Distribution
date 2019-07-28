package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthCheck extends js.Object {
  var healthCheck: js.UndefOr[Anon_HealthyThreshold] = js.undefined
  var portMapping: Anon_Port
}

object Anon_HealthCheck {
  @scala.inline
  def apply(portMapping: Anon_Port, healthCheck: Anon_HealthyThreshold = null): Anon_HealthCheck = {
    val __obj = js.Dynamic.literal(portMapping = portMapping)
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck)
    __obj.asInstanceOf[Anon_HealthCheck]
  }
}

