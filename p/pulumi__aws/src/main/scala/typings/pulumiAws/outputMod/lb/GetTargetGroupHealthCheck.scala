package typings.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTargetGroupHealthCheck extends js.Object {
  var enabled: Boolean = js.native
  var healthyThreshold: Double = js.native
  var interval: Double = js.native
  var matcher: String = js.native
  var path: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var timeout: Double = js.native
  var unhealthyThreshold: Double = js.native
}

object GetTargetGroupHealthCheck {
  @scala.inline
  def apply(
    enabled: Boolean,
    healthyThreshold: Double,
    interval: Double,
    matcher: String,
    path: String,
    port: String,
    protocol: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): GetTargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTargetGroupHealthCheck]
  }
}

