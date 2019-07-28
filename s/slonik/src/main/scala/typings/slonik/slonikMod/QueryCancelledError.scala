package typings.slonik.slonikMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "QueryCancelledError")
@js.native
class QueryCancelledError protected () extends SlonikError {
  def this(error: Error) = this()
  var originalError: Error = js.native
}

