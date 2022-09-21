package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateBreakTypeRequest")
@js.native
open class CreateBreakTypeRequest () extends StObject {
  
  /**
    * The `BreakType` to be created.
    */
  var break_type: BreakType = js.native
  
  /**
    * Unique string value to insure idempotency of the operation.
    */
  var idempotency_key: js.UndefOr[String] = js.native
}
