package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalTarget extends js.Object {
  var healthyThreshold: scala.Double
  var interval: scala.Double
  var target: java.lang.String
  var timeout: scala.Double
  var unhealthyThreshold: scala.Double
}

object Anon_HealthyThresholdIntervalTarget {
  @scala.inline
  def apply(
    healthyThreshold: scala.Double,
    interval: scala.Double,
    target: java.lang.String,
    timeout: scala.Double,
    unhealthyThreshold: scala.Double
  ): Anon_HealthyThresholdIntervalTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("healthyThreshold")(healthyThreshold)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold)
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalTarget]
  }
}

