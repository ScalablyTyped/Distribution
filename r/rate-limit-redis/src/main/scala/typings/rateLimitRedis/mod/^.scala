package typings.rateLimitRedis.mod

import typings.expressRateLimit.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rate-limit-redis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Store = js.native
  def apply(options: RedisStoreOptions): Store = js.native
}

