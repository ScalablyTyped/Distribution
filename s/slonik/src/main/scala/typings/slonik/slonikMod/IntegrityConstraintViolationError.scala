package typings.slonik.slonikMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "IntegrityConstraintViolationError")
@js.native
class IntegrityConstraintViolationError protected () extends Error {
  def this(error: Error, constraint: String) = this()
  var constraint: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var originalError: Error = js.native
}

