package typings
package redisDashRateDashLimiterLib.redisDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
class namespaced () extends RedisRateLimiter

/* static members */
@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def create(options: redisDashRateDashLimiterLib.redisDashRateDashLimiterMod.RedisRateLimiterNs.Options): js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error, 
      /* res */ redisDashRateDashLimiterLib.redisDashRateDashLimiterMod.RedisRateLimiterNs.Response, 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  def middleware(options: redisDashRateDashLimiterLib.redisDashRateDashLimiterMod.RedisRateLimiterNs.Options): expressLib.expressMod.eNs.RequestHandler = js.native
}

