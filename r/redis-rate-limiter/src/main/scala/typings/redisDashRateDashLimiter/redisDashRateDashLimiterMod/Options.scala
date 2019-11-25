package typings.redisDashRateDashLimiter.redisDashRateDashLimiterMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.redis.redisMod.RedisClient
import typings.redisDashRateDashLimiter.redisDashRateDashLimiterStrings.ip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.undefined
  var key: ip | (js.Function1[/* req */ Request[ParamsDictionary], String])
  var limit: js.UndefOr[Double] = js.undefined
  var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var rate: js.UndefOr[String] = js.undefined
  var redis: RedisClient
  var window: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    key: ip | (js.Function1[/* req */ Request[ParamsDictionary], String]),
    redis: RedisClient,
    deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    onPossibleRaceCondition: /* key */ String => Unit = null,
    rate: String = null,
    window: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteImmediatelyIfRaceCondition)) __obj.updateDynamic("deleteImmediatelyIfRaceCondition")(deleteImmediatelyIfRaceCondition.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onPossibleRaceCondition != null) __obj.updateDynamic("onPossibleRaceCondition")(js.Any.fromFunction1(onPossibleRaceCondition))
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

