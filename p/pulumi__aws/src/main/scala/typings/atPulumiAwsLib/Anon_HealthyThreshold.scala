package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThreshold extends js.Object {
  var healthyThreshold: scala.Double
  var interval: scala.Double
  var matcher: java.lang.String
  var path: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var timeout: scala.Double
  var unhealthyThreshold: scala.Double
}

object Anon_HealthyThreshold {
  @scala.inline
  def apply(
    healthyThreshold: scala.Double,
    interval: scala.Double,
    matcher: java.lang.String,
    path: java.lang.String,
    port: java.lang.String,
    protocol: java.lang.String,
    timeout: scala.Double,
    unhealthyThreshold: scala.Double
  ): Anon_HealthyThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("healthyThreshold")(healthyThreshold)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("matcher")(matcher)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("unhealthyThreshold")(unhealthyThreshold)
    __obj.asInstanceOf[Anon_HealthyThreshold]
  }
}

