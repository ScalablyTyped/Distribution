package typings.slonik.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("slonik", "BackendTerminatedError")
@js.native
class BackendTerminatedError protected () extends SlonikError {
  def this(error: Error) = this()
  
  var originalError: Error = js.native
}
