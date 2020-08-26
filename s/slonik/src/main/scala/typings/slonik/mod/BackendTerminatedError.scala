package typings.slonik.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "BackendTerminatedError")
@js.native
class BackendTerminatedError protected () extends Error {
  def this(error: Error) = this()
  var originalError: Error = js.native
}

