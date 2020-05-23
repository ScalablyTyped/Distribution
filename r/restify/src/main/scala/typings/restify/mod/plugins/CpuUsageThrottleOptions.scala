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
    halfLife: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined
  ): CpuUsageThrottleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(halfLife)) __obj.updateDynamic("halfLife")(halfLife.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuUsageThrottleOptions]
  }
}

