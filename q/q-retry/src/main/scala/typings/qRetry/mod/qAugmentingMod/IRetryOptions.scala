package typings.qRetry.mod.qAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRetryOptions extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  var intervalMultiplier: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var maxInterval: js.UndefOr[Double] = js.undefined
}

object IRetryOptions {
  @scala.inline
  def apply(
    interval: js.UndefOr[Double] = js.undefined,
    intervalMultiplier: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    maxInterval: js.UndefOr[Double] = js.undefined
  ): IRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intervalMultiplier)) __obj.updateDynamic("intervalMultiplier")(intervalMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInterval)) __obj.updateDynamic("maxInterval")(maxInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRetryOptions]
  }
}

