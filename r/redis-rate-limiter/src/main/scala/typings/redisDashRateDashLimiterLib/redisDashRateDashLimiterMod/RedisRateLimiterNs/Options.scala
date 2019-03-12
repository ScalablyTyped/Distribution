package typings
package redisDashRateDashLimiterLib.redisDashRateDashLimiterMod.RedisRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deleteImmediatelyIfRaceCondition: js.UndefOr[scala.Boolean] = js.undefined
  var key: redisDashRateDashLimiterLib.redisDashRateDashLimiterLibStrings.ip | (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String])
  var limit: js.UndefOr[scala.Double] = js.undefined
  var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Unit]] = js.undefined
  var rate: js.UndefOr[java.lang.String] = js.undefined
  var redis: redisLib.redisMod.RedisClient
  var window: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: redisDashRateDashLimiterLib.redisDashRateDashLimiterLibStrings.ip | (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]),
    redis: redisLib.redisMod.RedisClient,
    deleteImmediatelyIfRaceCondition: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    onPossibleRaceCondition: /* key */ java.lang.String => scala.Unit = null,
    rate: java.lang.String = null,
    window: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis)
    if (!js.isUndefined(deleteImmediatelyIfRaceCondition)) __obj.updateDynamic("deleteImmediatelyIfRaceCondition")(deleteImmediatelyIfRaceCondition)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onPossibleRaceCondition != null) __obj.updateDynamic("onPossibleRaceCondition")(js.Any.fromFunction1(onPossibleRaceCondition))
    if (rate != null) __obj.updateDynamic("rate")(rate)
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

