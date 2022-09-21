package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "BackendTerminatedError")
@js.native
open class BackendTerminatedError protected () extends SlonikError {
  def this(error: js.Error) = this()
  
  var originalError: js.Error = js.native
}
