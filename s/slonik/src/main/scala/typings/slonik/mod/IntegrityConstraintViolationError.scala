package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "IntegrityConstraintViolationError")
@js.native
open class IntegrityConstraintViolationError protected () extends SlonikError {
  def this(error: js.Error, constraint: String) = this()
  
  var constraint: String = js.native
  
  var originalError: js.Error = js.native
}
