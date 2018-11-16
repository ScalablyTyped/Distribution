package typings
package redisDashErrorsLib.redisDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-errors", "ReplyError")
@js.native
class ReplyError protected () extends RedisError {
  def this(message: java.lang.String) = this()
  var args: js.UndefOr[js.Array[_]] = js.native
  var code: js.UndefOr[java.lang.String] = js.native
  var command: js.UndefOr[java.lang.String] = js.native
}

