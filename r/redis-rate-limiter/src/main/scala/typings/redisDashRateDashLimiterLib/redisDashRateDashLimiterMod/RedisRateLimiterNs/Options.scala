package typings
package redisDashRateDashLimiterLib.redisDashRateDashLimiterMod.RedisRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var key: redisDashRateDashLimiterLib.redisDashRateDashLimiterLibStrings.ip | (js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String])
  var limit: js.UndefOr[scala.Double] = js.undefined
  var rate: js.UndefOr[java.lang.String] = js.undefined
  var redis: redisLib.redisMod.RedisClient
  var window: js.UndefOr[scala.Double] = js.undefined
}

