package typings.signalfx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalMetric extends js.Object {
  var metric: String
  var timestamp: js.UndefOr[Double] = js.undefined
  var value: Double
}

object SignalMetric {
  @scala.inline
  def apply(metric: String, value: Double, timestamp: js.UndefOr[Double] = js.undefined): SignalMetric = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalMetric]
  }
}

