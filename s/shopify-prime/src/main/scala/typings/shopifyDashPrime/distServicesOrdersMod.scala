package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsOrderMod.Order
import typings.shopifyDashPrime.distModelsTransactionMod.Transaction
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distOptionsOrdersMod.OrderCancelOptions
import typings.shopifyDashPrime.distOptionsOrdersMod.OrderCountOptions
import typings.shopifyDashPrime.distOptionsOrdersMod.OrderCreateOptions
import typings.shopifyDashPrime.distOptionsOrdersMod.OrderListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/orders", JSImport.Namespace)
@js.native
object distServicesOrdersMod extends js.Object {
  @js.native
  class Orders protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Cancels an order with the given id.
      * @param id The order's id.
      * @param options Options for canceling the order.
      */
    def cancel(id: Double): js.Promise[Order] = js.native
    def cancel(id: Double, options: OrderCancelOptions): js.Promise[Order] = js.native
    /**
      * Closes an order with the given id.
      * @param id The order's id.
      */
    def close(id: Double): js.Promise[Order] = js.native
    /**
      * Gets a count of all of the shop's orders.
      * @param options Options for filtering the results.
      */
    def count(): js.Promise[Double] = js.native
    def count(options: OrderCountOptions): js.Promise[Double] = js.native
    /**
      * Creates an order.
      * @param order The order being created.
      * @param options Options for creating the order.
      */
    def create(order: Order): js.Promise[Order] = js.native
    def create(order: Order, transactions: js.Array[Transaction]): js.Promise[Order] = js.native
    def create(order: Order, transactions: js.Array[Transaction], options: OrderCreateOptions): js.Promise[Order] = js.native
    /**
      * Deletes an order with the given id.
      * @param id The order's id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Gets the order with the given id.
      * @param orderId The order's id.
      * @param options Options for filtering the results.
      */
    def get(orderId: Double): js.Promise[Order] = js.native
    def get(orderId: Double, options: FieldOptions): js.Promise[Order] = js.native
    /**
      * Gets a list of up to 250 of the shop's orders.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Order]] = js.native
    def list(options: OrderListOptions): js.Promise[js.Array[Order]] = js.native
    /**
      * Gets a list of up to 250 orders from the given customer.
      * @param customerId The customer's id.
      * @param options Options for filtering the results.
      */
    def listForCustomer(customerId: Double): js.Promise[js.Array[Order]] = js.native
    def listForCustomer(customerId: Double, options: OrderListOptions): js.Promise[js.Array[Order]] = js.native
    /**
      * Opens an order with the given id.
      * @param id The order's id.
      */
    def open(id: Double): js.Promise[Order] = js.native
    /**
      * Updates an order with the given id.
      * @param id The order's id.
      * @param order The updated order.
      */
    def update(id: Double, order: Order): js.Promise[Order] = js.native
  }
  
  @js.native
  class default protected () extends Orders {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

