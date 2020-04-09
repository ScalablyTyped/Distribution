package typings.rateLimitRedis.mod

import typings.expressRateLimit.mod.StoreIncrementCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rate-limit-redis", JSImport.Namespace)
@js.native
class ^ () extends RedisStore {
  def this(options: Options) = this()
  /* CompleteClass */
  override def decrement(key: String): Unit = js.native
  /* CompleteClass */
  override def incr(key: String, cb: StoreIncrementCallback): Unit = js.native
  /* CompleteClass */
  override def resetAll(): Unit = js.native
  /* CompleteClass */
  override def resetKey(key: String): Unit = js.native
}

