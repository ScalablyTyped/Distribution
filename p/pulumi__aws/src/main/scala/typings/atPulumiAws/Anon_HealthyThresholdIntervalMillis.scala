package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HealthyThresholdIntervalMillis extends js.Object {
  var healthyThreshold: Input[Double]
  var intervalMillis: Input[Double]
  var path: js.UndefOr[Input[String]] = js.undefined
  var port: js.UndefOr[Input[Double]] = js.undefined
  var protocol: Input[String]
  var timeoutMillis: Input[Double]
  var unhealthyThreshold: Input[Double]
}

object Anon_HealthyThresholdIntervalMillis {
  @scala.inline
  def apply(
    healthyThreshold: Input[Double],
    intervalMillis: Input[Double],
    protocol: Input[String],
    timeoutMillis: Input[Double],
    unhealthyThreshold: Input[Double],
    path: Input[String] = null,
    port: Input[Double] = null
  ): Anon_HealthyThresholdIntervalMillis = {
    val __obj = js.Dynamic.literal(healthyThreshold = healthyThreshold.asInstanceOf[js.Any], intervalMillis = intervalMillis.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeoutMillis = timeoutMillis.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HealthyThresholdIntervalMillis]
  }
}

