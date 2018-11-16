package typings
package redisDashErrorsLib.redisDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-errors", "ParserError")
@js.native
class ParserError protected () extends RedisError {
  def this(message: java.lang.String, buffer: java.lang.String, offset: scala.Double) = this()
  var buffer: java.lang.String = js.native
  var offset: scala.Double = js.native
}

