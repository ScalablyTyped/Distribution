package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RetrieveInventoryAdjustmentResponse")
@js.native
class RetrieveInventoryAdjustmentResponse () extends StObject {
  
  /**
    * The requested `InventoryAdjustment`.
    */
  var adjustment: js.UndefOr[InventoryAdjustment] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
