package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrdersApi")
@js.native
/**
  * Constructs a new OrdersApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class OrdersApi () extends js.Object {
  def this(apiClient: ApiClient) = this()
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
  /**
    * Pay for an [order](#type-order) using one or more approved [payments](#type-payment), or settle an order with a total of `0`.
    * The total of the `payment_ids` listed in the request must be equal to the order total. Orders with a total amount
    * of `0` can be marked as paid by specifying an empty array of `payment_ids` in the request. To be used with PayOrder,
    * a payment must: - Reference the order by specifying the `order_id` when [creating the payment](#endpoint-payments-createpayment).
    * Any approved payments that reference the same `order_id` not specified in the `payment_ids` will be canceled.
    * - Be approved with [delayed capture](/payments-api/take-payments#delayed-capture). Using a delayed capture payment
    * with PayOrder will complete the approved payment. Learn how to [pay for orders with a single payment using the
    * Payments API](/orders-api/pay-for-orders).
    */
  def payOrder(orderId: String, body: PayOrderRequest): js.Promise[PayOrderResponse] = js.native
  /**
    * Search all orders for one or more locations. Orders include all sales, returns, and exchanges regardless of how
    * or when they entered the Square Ecosystem (e.g. Point of Sale, Invoices, Connect APIs, etc). SearchOrders requests
    * need to specify which locations to search and define a [`SearchOrdersQuery`](#type-searchordersquery) object which
    * controls how to sort or filter the results. Your SearchOrdersQuery can: Set filter criteria. Set sort order.
    * Determine whether to return results as complete Order objects, or as [OrderEntry](#type-orderentry) objects.
    * Note that details for orders processed with Square Point of Sale while in offline mode may not be transmitted to
    * Square for up to 72 hours. Offline orders have a `created_at` value that reflects the time the order was created,
    * not the time it was subsequently transmitted to Square.
    */
  def searchOrders(body: SearchOrdersRequest): js.Promise[SearchOrdersResponse] = js.native
  /**
    * Updates an open [Order](#type-order) by adding, replacing, or deleting fields. Orders with a `COMPLETED` or `CANCELED`
    * state cannot be updated. An UpdateOrder request requires the following:
    * - The `order_id` in the endpoint path, identifying the order to update.
    * - The latest `version` of the order to update.
    * - The [sparse order](/orders-api/manage-orders#sparse-order-objects) containing only the fields to update and the version the update is being applied to.
    * - If deleting fields, the [dot notation paths](/orders-api/manage-orders#on-dot-notation) identifying fields to clear.
    * To pay for an order, please refer to the [Pay for Orders](/orders-api/pay-for-orders) guide.
    * To learn more about the Orders API, see the [Orders API Overview](/orders-api/what-it-does).
    */
  def updateOrder(body: UpdateOrderRequest): js.Promise[UpdateOrderResponse] = js.native
}

