package typings
package redisDashRateDashLimiterLib.redisDashRateDashLimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
class ^ () extends RedisRateLimiter

@JSImport("redis-rate-limiter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(options: Options): js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* callback */ js.Function2[/* err */ stdLib.Error, /* res */ Response, scala.Unit], 
    scala.Unit
  ] = js.native
  def middleware(options: Options): expressLib.expressMod.RequestHandler = js.native
}

