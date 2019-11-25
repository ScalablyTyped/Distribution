package typings.rollingDashRateDashLimiter.rollingDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralOptions extends js.Object {
  var interval: Double
  var maxInInterval: Double
  var minDifference: js.UndefOr[Double] = js.undefined
}

object GeneralOptions {
  @scala.inline
  def apply(interval: Double, maxInInterval: Double, minDifference: Int | Double = null): GeneralOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any])
    if (minDifference != null) __obj.updateDynamic("minDifference")(minDifference.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralOptions]
  }
}

