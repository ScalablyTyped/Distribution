package typings.scErrors.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "UnknownError")
@js.native
class UnknownError protected () extends Error {
  def this(message: String) = this()
}

