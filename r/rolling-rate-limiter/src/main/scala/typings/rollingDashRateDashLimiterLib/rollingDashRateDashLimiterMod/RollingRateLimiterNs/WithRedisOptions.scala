package typings
package rollingDashRateDashLimiterLib.rollingDashRateDashLimiterMod.RollingRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRedisOptions extends GeneralOptions {
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var redis: CompatibleRedisClient
}

object WithRedisOptions {
  @scala.inline
  def apply(
    interval: scala.Double,
    maxInInterval: scala.Double,
    redis: CompatibleRedisClient,
    minDifference: scala.Int | scala.Double = null,
    namespace: java.lang.String = null
  ): WithRedisOptions = {
    val __obj = js.Dynamic.literal(interval = interval, maxInInterval = maxInInterval, redis = redis)
    if (minDifference != null) __obj.updateDynamic("minDifference")(minDifference.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[WithRedisOptions]
  }
}

