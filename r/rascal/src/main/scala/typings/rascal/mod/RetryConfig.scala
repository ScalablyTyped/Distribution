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
    delay: Int | Double = null,
    factor: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    strategy: exponential | linear = null
  ): RetryConfig = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryConfig]
  }
}

