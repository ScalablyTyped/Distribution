package typings
package rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralOptions extends js.Object {
  var interval: scala.Double
  var maxInInterval: scala.Double
  var minDifference: js.UndefOr[scala.Double] = js.undefined
}

object GeneralOptions {
  @scala.inline
  def apply(
    interval: scala.Double,
    maxInInterval: scala.Double,
    minDifference: scala.Int | scala.Double = null
  ): GeneralOptions = {
    val __obj = js.Dynamic.literal(interval = interval, maxInInterval = maxInInterval)
    if (minDifference != null) __obj.updateDynamic("minDifference")(minDifference.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralOptions]
  }
}

