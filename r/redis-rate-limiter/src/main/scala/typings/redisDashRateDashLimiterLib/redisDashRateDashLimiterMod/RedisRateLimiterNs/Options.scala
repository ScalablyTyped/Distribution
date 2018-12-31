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

