package typings.redisRateLimiter.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.redis.mod.RedisClient
import typings.redisRateLimiter.redisRateLimiterStrings.ip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.undefined
  var key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String])
  var limit: js.UndefOr[Double] = js.undefined
  var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var rate: js.UndefOr[String] = js.undefined
  var redis: RedisClient
  var window: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]),
    redis: RedisClient,
    deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    onPossibleRaceCondition: /* key */ String => Unit = null,
    rate: String = null,
    window: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteImmediatelyIfRaceCondition)) __obj.updateDynamic("deleteImmediatelyIfRaceCondition")(deleteImmediatelyIfRaceCondition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (onPossibleRaceCondition != null) __obj.updateDynamic("onPossibleRaceCondition")(js.Any.fromFunction1(onPossibleRaceCondition))
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (!js.isUndefined(window)) __obj.updateDynamic("window")(window.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

