package typings.redis.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", "AbortError")
@js.native
class AbortError () extends Error {
  var args: js.UndefOr[js.Array[_]] = js.native
  var code: js.UndefOr[String] = js.native
  var command: String = js.native
}

