package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdInterval extends js.Object {
  var healthyThreshold: scala.Double
  var interval: scala.Double
  var target: java.lang.String
  var timeout: scala.Double
  var unhealthyThreshold: scala.Double
}

object Anon_HealthyThresholdInterval {
  @scala.inline
  def apply(
    healthyThreshold: scala.Double,
    interval: scala.Double,
    target: java.lang.String,
    timeout: scala.Double,
    unhealthyThreshold: scala.Double
  ): Anon_HealthyThresholdInterval = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold, interval = interval, target = target, timeout = timeout, unhealthyThreshold = unhealthyThreshold)
  
    __obj.asInstanceOf[Anon_HealthyThresholdInterval]
  }
}

