package typings.redisRateLimiter.mod

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
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
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* callback */ js.Function2[/* err */ Error, /* res */ Response, Unit], 
    Unit
  ] = js.native
  def middleware(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

