package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThreshold extends js.Object {
  var healthyThreshold: Double
  var intervalMillis: Double
  var path: js.UndefOr[String] = js.undefined
  var port: Double
  var protocol: String
  var timeoutMillis: Double
  var unhealthyThreshold: Double
}

object Anon_HealthyThreshold {
  @scala.inline
  def apply(
    healthyThreshold: Double,
    intervalMillis: Double,
    port: Double,
    protocol: String,
    timeoutMillis: Double,
    unhealthyThreshold: Double,
    path: String = null
  ): Anon_HealthyThreshold = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold, intervalMillis = intervalMillis, port = port, protocol = protocol, timeoutMillis = timeoutMillis, unhealthyThreshold = unhealthyThreshold)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_HealthyThreshold]
  }
}

