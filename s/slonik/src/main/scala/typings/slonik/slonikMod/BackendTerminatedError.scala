package typings.slonik.slonikMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "BackendTerminatedError")
@js.native
class BackendTerminatedError protected () extends SlonikError {
  def this(error: Error) = this()
  var originalError: Error = js.native
}

