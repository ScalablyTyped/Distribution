package typings.redisDashErrors.redisDashErrorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-errors", "InterruptError")
@js.native
class InterruptError () extends RedisError {
  var args: js.UndefOr[js.Array[_]] = js.native
  var command: js.UndefOr[String] = js.native
  var origin: Error = js.native
}

