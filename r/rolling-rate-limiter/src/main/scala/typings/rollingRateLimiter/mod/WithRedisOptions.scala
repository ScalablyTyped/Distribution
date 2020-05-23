package typings.rollingRateLimiter.mod

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
    minDifference: js.UndefOr[Double] = js.undefined,
    namespace: String = null
  ): WithRedisOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    if (!js.isUndefined(minDifference)) __obj.updateDynamic("minDifference")(minDifference.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRedisOptions]
  }
}

