package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrdersApi")
@js.native
class OrdersApi () extends js.Object {
  /**
    * Retrieves a set of [Order](#type-order)s by their IDs.
    * If a given Order ID does not exist, the ID is ignored instead of generating an error.
    */
  def batchRetrieveOrders(params: BatchRetrieveOrdersRequest): js.Promise[BatchRetrieveOrdersResponse] = js.native
  /**
    * Creates an [Order](#type-order) that can then be referenced as `order_id` in a request to the [Charge](#endpoint-charge)
    * endpoint. Orders specify products for purchase, along with discounts, taxes, and other settings to apply to the purchase.
    * To associate a created order with a request to the Charge endpoint, provide the order's `id` in the `order_id` field of
    * your request. You cannot modify an order after you create it. If you need to modify an order, instead create a new order
    * with modified details. To learn more about the Orders API, see the [Orders API Overview](/products/orders/overview).
    */
  def createOrder(params: CreateOrderRequest): js.Promise[CreateOrderResponse] = js.native
}

