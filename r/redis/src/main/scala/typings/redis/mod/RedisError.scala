package typings.redis.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", "RedisError")
@js.native
class RedisError () extends Error {
  var args: js.UndefOr[js.Array[_]] = js.native
  var command: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

