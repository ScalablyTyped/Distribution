package typings.scErrors.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "SilentMiddlewareBlockedError")
@js.native
class SilentMiddlewareBlockedError protected () extends Error {
  def this(message: String, `type`: String) = this()
  var `type`: String = js.native
}

