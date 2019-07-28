package typings.redisDashErrors.redisDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-errors", "ParserError")
@js.native
class ParserError protected () extends RedisError {
  def this(message: String, buffer: String, offset: Double) = this()
  var buffer: String = js.native
  var offset: Double = js.native
}

