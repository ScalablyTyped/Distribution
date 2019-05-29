package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slonik", "IntegrityConstraintViolationError")
@js.native
class IntegrityConstraintViolationError protected () extends SlonikError {
  def this(error: stdLib.Error, constraint: java.lang.String) = this()
  var constraint: java.lang.String = js.native
  var originalError: stdLib.Error = js.native
}

