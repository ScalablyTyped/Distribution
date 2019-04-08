package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateOrderRequest")
@js.native
class CreateOrderRequest () extends js.Object {
  /**
    * @deprecated Please set the discounts on the nested [order](#type-order) field instead.  The discounts to
    * include on the order.
    */
  var discounts: js.UndefOr[js.Array[CreateOrderRequestDiscount]] = js.native
  /**
    * A value you specify that uniquely identifies this order among orders you've created.  If you're unsure whether a
    * particular order was created successfully, you can reattempt it with the same idempotency key without worrying
    * about creating duplicate orders.  See [Idempotency](/basics/api101/idempotency) for more information.
    */
  var idempotency_key: js.UndefOr[java.lang.String] = js.native
  /**
    * @deprecated Please set the line_items on the nested [order](#type-order) field instead.  The line items to
    * associate with this order.  Each line item represents a different product to include in a purchase.
    */
  var line_items: js.UndefOr[js.Array[CreateOrderRequestLineItem]] = js.native
  /**
    * The order to create. If this field is set, then the only other top-level field that can be set is the idempotency_key.
    */
  var order: js.UndefOr[Order] = js.native
  /**
    * @deprecated Please set the reference_id on the nested [order](#type-order) field instead.  An optional ID you
    * can associate with the order for your own purposes (such as to associate the order with an entity ID in your own
    * database).  This value cannot exceed 40 characters.
    */
  var reference_id: js.UndefOr[java.lang.String] = js.native
  /**
    * @deprecated Please set the taxes on the nested [order](#type-order) field instead.  The taxes to include on
    * the order.
    */
  var taxes: js.UndefOr[js.Array[CreateOrderRequestTax]] = js.native
}

