package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", "ParserError")
@js.native
class ParserError () extends RedisError {
  var buffer: nodeLib.Buffer = js.native
  var offset: scala.Double = js.native
}

