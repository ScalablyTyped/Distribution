package typings.rollingDashRateDashLimiter.rollingDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithRedisOptions extends GeneralOptions {
  var namespace: js.UndefOr[String] = js.undefined
  var redis: CompatibleRedisClient
}

object WithRedisOptions {
  @scala.inline
  def apply(
    interval: Double,
    maxInInterval: Double,
    redis: CompatibleRedisClient,
    minDifference: Int | Double = null,
    namespace: String = null
  ): WithRedisOptions = {
    val __obj = js.Dynamic.literal(interval = interval, maxInInterval = maxInInterval, redis = redis)
    if (minDifference != null) __obj.updateDynamic("minDifference")(minDifference.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[WithRedisOptions]
  }
}

