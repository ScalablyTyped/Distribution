package typings.redis.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", "ParserError")
@js.native
class ParserError () extends Error {
  var buffer: Buffer = js.native
  var offset: Double = js.native
}

