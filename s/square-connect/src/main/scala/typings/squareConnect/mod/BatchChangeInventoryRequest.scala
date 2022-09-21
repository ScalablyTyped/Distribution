package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchChangeInventoryRequest")
@js.native
open class BatchChangeInventoryRequest () extends StObject {
  
  /**
    * The set of physical counts and inventory adjustments to be made.
    * Changes are applied based on the client-supplied timestamp and may be sent out of order.
    */
  var changes: js.UndefOr[js.Array[InventoryChange]] = js.native
  
  /**
    * A client-supplied, universally unique identifier (UUID) for the request.
    * See [Idempotency](https://developer.squareup.com/docs/basics/api101/idempotency) in the
    * [API Development 101](https://developer.squareup.com/docs/basics/api101/overview) section for more information.
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the current physical count should be ignored if the quantity is unchanged since the last physical count.
    * Default: `true`.
    */
  var ignore_unchanged_counts: js.UndefOr[Boolean] = js.native
}
