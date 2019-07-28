package typings.redis.redisMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", "ParserError")
@js.native
class ParserError () extends RedisError {
  var buffer: Buffer = js.native
  var offset: Double = js.native
}

