package typings
package shopifyDashPrimeLib.distServicesOrdersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/orders", "Orders")
@js.native
class Orders protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Cancels an order with the given id.
       * @param id The order's id.
       * @param options Options for canceling the order.
       */
  def cancel(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Cancels an order with the given id.
       * @param id The order's id.
       * @param options Options for canceling the order.
       */
  def cancel(id: scala.Double, options: shopifyDashPrimeLib.distOptionsOrdersMod.OrderCancelOptions): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Closes an order with the given id.
       * @param id The order's id.
       */
  def close(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Gets a count of all of the shop's orders.
       * @param options Options for filtering the results.
       */
  def count(): stdLib.Promise[scala.Double] = js.native
  /**
       * Gets a count of all of the shop's orders.
       * @param options Options for filtering the results.
       */
  def count(options: shopifyDashPrimeLib.distOptionsOrdersMod.OrderCountOptions): stdLib.Promise[scala.Double] = js.native
  /**
       * Creates an order.
       * @param order The order being created.
       * @param options Options for creating the order.
       */
  def create(order: shopifyDashPrimeLib.distModelsOrderMod.Order): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Creates an order.
       * @param order The order being created.
       * @param options Options for creating the order.
       */
  def create(
    order: shopifyDashPrimeLib.distModelsOrderMod.Order,
    transactions: js.Array[shopifyDashPrimeLib.distModelsTransactionMod.Transaction]
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Creates an order.
       * @param order The order being created.
       * @param options Options for creating the order.
       */
  def create(
    order: shopifyDashPrimeLib.distModelsOrderMod.Order,
    transactions: js.Array[shopifyDashPrimeLib.distModelsTransactionMod.Transaction],
    options: shopifyDashPrimeLib.distOptionsOrdersMod.OrderCreateOptions
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Deletes an order with the given id.
       * @param id The order's id.
       */
  def delete(id: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Gets the order with the given id.
       * @param orderId The order's id.
       * @param options Options for filtering the results.
       */
  def get(orderId: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Gets the order with the given id.
       * @param orderId The order's id.
       * @param options Options for filtering the results.
       */
  def get(orderId: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Gets a list of up to 250 of the shop's orders.
       * @param options Options for filtering the results.
       */
  def list(): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsOrderMod.Order]] = js.native
  /**
       * Gets a list of up to 250 of the shop's orders.
       * @param options Options for filtering the results.
       */
  def list(options: shopifyDashPrimeLib.distOptionsOrdersMod.OrderListOptions): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsOrderMod.Order]] = js.native
  /**
       * Gets a list of up to 250 orders from the given customer.
       * @param customerId The customer's id.
       * @param options Options for filtering the results.
       */
  def listForCustomer(customerId: scala.Double): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsOrderMod.Order]] = js.native
  /**
       * Gets a list of up to 250 orders from the given customer.
       * @param customerId The customer's id.
       * @param options Options for filtering the results.
       */
  def listForCustomer(customerId: scala.Double, options: shopifyDashPrimeLib.distOptionsOrdersMod.OrderListOptions): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsOrderMod.Order]] = js.native
  /**
       * Opens an order with the given id.
       * @param id The order's id.
       */
  def open(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
  /**
       * Updates an order with the given id.
       * @param id The order's id.
       * @param order The updated order.
       */
  def update(id: scala.Double, order: shopifyDashPrimeLib.distModelsOrderMod.Order): stdLib.Promise[shopifyDashPrimeLib.distModelsOrderMod.Order] = js.native
}

