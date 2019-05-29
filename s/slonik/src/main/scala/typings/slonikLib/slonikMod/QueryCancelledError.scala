package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "QueryCancelledError")
@js.native
class QueryCancelledError protected () extends SlonikError {
  def this(error: stdLib.Error) = this()
  var originalError: stdLib.Error = js.native
}

