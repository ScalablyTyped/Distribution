package typings.redisDashRateDashLimiter.redisDashRateDashLimiterMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.std.Error
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
    /* req */ Request[ParamsDictionary], 
    /* callback */ js.Function2[/* err */ Error, /* res */ Response, Unit], 
    Unit
  ] = js.native
  def middleware(options: Options): RequestHandler[ParamsDictionary] = js.native
}

