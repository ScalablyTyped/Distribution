package typings.rascal.mod

import typings.rascal.rascalStrings.exponential
import typings.rascal.rascalStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryConfig extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var factor: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var strategy: js.UndefOr[exponential | linear] = js.undefined
}

object RetryConfig {
  @scala.inline
  def apply(
    delay: js.UndefOr[Double] = js.undefined,
    factor: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    strategy: exponential | linear = null
  ): RetryConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
}

