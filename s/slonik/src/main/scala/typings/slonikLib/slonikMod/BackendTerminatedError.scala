package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "BackendTerminatedError")
@js.native
class BackendTerminatedError protected () extends SlonikError {
  def this(error: stdLib.Error) = this()
  var originalError: stdLib.Error = js.native
}

