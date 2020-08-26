package typings.slonik.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "IntegrityConstraintViolationError")
@js.native
class IntegrityConstraintViolationError protected () extends Error {
  def this(error: Error, constraint: String) = this()
  var constraint: String = js.native
  var originalError: Error = js.native
}

