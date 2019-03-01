package typings
package qDashRetryLib.qDashRetryMod.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRetryOptions extends js.Object {
  var interval: js.UndefOr[scala.Double] = js.undefined
  var intervalMultiplier: js.UndefOr[scala.Double] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var maxInterval: js.UndefOr[scala.Double] = js.undefined
}

object IRetryOptions {
  @scala.inline
  def apply(
    interval: scala.Int | scala.Double = null,
    intervalMultiplier: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    maxInterval: scala.Int | scala.Double = null
  ): IRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervalMultiplier != null) __obj.updateDynamic("intervalMultiplier")(intervalMultiplier.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxInterval != null) __obj.updateDynamic("maxInterval")(maxInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRetryOptions]
  }
}

