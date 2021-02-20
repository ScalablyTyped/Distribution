package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderUpdated")
@js.native
class OrderUpdated () extends StObject {
  
  /**
    * Timestamp for when the order was created in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The ID of the merchant location this order is associated with.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The order's unique ID.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * The state of the order. See [OrderState](#type-orderstate) for possible values
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Timestamp for when the order was last updated in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
  
  /**
    * Version number which is incremented each time an update is committed to the order.
    * Orders that were not created through the API will not include a version and thus cannot be updated.
    * [Read more about working with versions](https://developer.squareup.com/docs/docs/orders-api/manage-orders#update-orders).
    */
  var version: js.UndefOr[Double] = js.native
}
