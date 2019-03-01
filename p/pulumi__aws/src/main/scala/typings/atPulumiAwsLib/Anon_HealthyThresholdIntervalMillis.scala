package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalMillis extends js.Object {
  var healthyThreshold: scala.Double
  var intervalMillis: scala.Double
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var protocol: java.lang.String
  var timeoutMillis: scala.Double
  var unhealthyThreshold: scala.Double
}

object Anon_HealthyThresholdIntervalMillis {
  @scala.inline
  def apply(
    healthyThreshold: scala.Double,
    intervalMillis: scala.Double,
    port: scala.Double,
    protocol: java.lang.String,
    timeoutMillis: scala.Double,
    unhealthyThreshold: scala.Double,
    path: java.lang.String = null
  ): Anon_HealthyThresholdIntervalMillis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("healthyThreshold")(healthyThreshold)
    __obj.updateDynamic("intervalMillis")(intervalMillis)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("timeoutMillis")(timeoutMillis)
    __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalMillis]
  }
}

