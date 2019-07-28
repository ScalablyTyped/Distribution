package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdInterval extends js.Object {
  var healthyThreshold: Double
  var interval: Double
  var target: String
  var timeout: Double
  var unhealthyThreshold: Double
}

object Anon_HealthyThresholdInterval {
  @scala.inline
  def apply(
    healthyThreshold: Double,
    interval: Double,
    target: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): Anon_HealthyThresholdInterval = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold, interval = interval, target = target, timeout = timeout, unhealthyThreshold = unhealthyThreshold)
  
    __obj.asInstanceOf[Anon_HealthyThresholdInterval]
  }
}

