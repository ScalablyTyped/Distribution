package typings.rateLimitRedis.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.expressRateLimit.mod.Store
import typings.expressRateLimit.mod.StoreIncrementCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rate-limit-redis", JSImport.Namespace)
@js.native
class ^ () extends Store {
  def this(options: RedisStoreOptions) = this()
  /* CompleteClass */
  override def decrement(key: String): Unit = js.native
  /* CompleteClass */
  override def incr(key: String, cb: StoreIncrementCallback): Unit = js.native
  /* CompleteClass */
  override def resetAll(): Unit = js.native
  /* CompleteClass */
  override def resetKey(key: String): Unit = js.native
}

@JSImport("rate-limit-redis", JSImport.Namespace)
@js.native
object ^ extends TopLevel[
      Instantiable0[Store] with (Instantiable1[/* options */ RedisStoreOptions, Store])
    ]

