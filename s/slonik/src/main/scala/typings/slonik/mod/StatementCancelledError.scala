package typings.slonik.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "StatementCancelledError")
@js.native
class StatementCancelledError protected () extends Error {
  def this(error: Error) = this()
  
  var originalError: Error = js.native
}
