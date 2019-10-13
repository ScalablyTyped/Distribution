package typings.slonik.slonikMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "QueryCancelledError")
@js.native
class QueryCancelledError protected () extends Error {
  def this(error: Error) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var originalError: Error = js.native
}

