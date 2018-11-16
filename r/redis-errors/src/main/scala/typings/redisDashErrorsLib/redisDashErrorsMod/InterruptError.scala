package typings
package redisDashErrorsLib.redisDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-errors", "InterruptError")
@js.native
class InterruptError () extends RedisError {
  var args: js.UndefOr[js.Array[_]] = js.native
  var command: js.UndefOr[java.lang.String] = js.native
  var origin: stdLib.Error = js.native
}

