package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateShiftRequest")
@js.native
class CreateShiftRequest () extends StObject {
  
  /**
    * Unique string value to insure the idempotency of the operation.
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * The `Shift` to be created
    */
  var shift: Shift = js.native
}
