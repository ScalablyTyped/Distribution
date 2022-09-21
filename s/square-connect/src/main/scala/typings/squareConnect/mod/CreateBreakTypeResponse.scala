package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateBreakTypeResponse")
@js.native
open class CreateBreakTypeResponse () extends StObject {
  
  /**
    * The `BreakType` that was created by the request.
    */
  var break_type: js.UndefOr[BreakType] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
