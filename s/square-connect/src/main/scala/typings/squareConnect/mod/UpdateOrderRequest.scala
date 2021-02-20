package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateOrderRequest")
@js.native
class UpdateOrderRequest () extends StObject {
  
  /**
    * The [dot notation paths](https://developer.squareup.com/docs/orders-api/manage-orders#on-dot-notation) fields to clear.
    * For example, `line_items[uid].note` [Read more about Deleting fields](https://developer.squareup.com/docs/orders-api/manage-orders#delete-fields).
    */
  var fields_to_clear: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A value you specify that uniquely identifies this update request If you're unsure whether a particular update was
    * applied to an order successfully, you can reattempt it with the same idempotency key without worrying about creating
    * duplicate updates to the order. The latest order version will be returned.
    * See [Idempotency](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    */
  var idempotency_key: js.UndefOr[String] = js.native
  
  /**
    * The [sparse order](https://developer.squareup.com/docs/orders-api/manage-orders#sparse-order-objects) containing
    * only the fields to update and the version the update is being applied to.
    */
  var order: js.UndefOr[Order] = js.native
}
