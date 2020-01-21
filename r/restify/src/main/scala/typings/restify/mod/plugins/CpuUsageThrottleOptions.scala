package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuUsageThrottleOptions extends js.Object {
  var halfLife: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
}

object CpuUsageThrottleOptions {
  @scala.inline
  def apply(
    halfLife: Int | Double = null,
    interval: Int | Double = null,
    limit: Int | Double = null,
    max: Int | Double = null
  ): CpuUsageThrottleOptions = {
    val __obj = js.Dynamic.literal()
    if (halfLife != null) __obj.updateDynamic("halfLife")(halfLife.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuUsageThrottleOptions]
  }
}

