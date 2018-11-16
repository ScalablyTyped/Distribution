package typings
package shopifyDashPrimeLib.distServicesDraftUnderscoreOrdersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/draft_orders", "DraftOrders")
@js.native
class DraftOrders protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Completes the draft order, transitioning it to a full order.
       */
  def complete(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
       * Completes the draft order, transitioning it to a full order.
       */
  def complete(id: scala.Double, paymentPending: scala.Boolean): stdLib.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
       * Counts the draft orders on the shop.
       */
  def count(): stdLib.Promise[scala.Double] = js.native
  /**
       * Counts the draft orders on the shop.
       */
  def count(options: js.Any): stdLib.Promise[scala.Double] = js.native
  /**
       * Creates a new draft order.
       */
  def create(order: stdLib.Partial[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]): stdLib.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
       * Creates a new draft order.
       */
  def create(
    order: stdLib.Partial[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder],
    useCustomerDefaultAddress: scala.Boolean
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
       * Deletes the draft order with the given id.
       */
  def delete(id: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Retrieves the draft order with the given id.
       */
  def get(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
       * Gets a list of up to 250 of the shop's draft orders.
       * @param options Options for filtering the results.
       */
  def list(): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]] = js.native
  /**
       * Gets a list of up to 250 of the shop's draft orders.
       * @param options Options for filtering the results.
       */
  def list(options: shopifyDashPrimeLib.distOptionsBaseMod.ListOptions): stdLib.Promise[js.Array[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]] = js.native
  /**
       * Updates the draft order with the given id.
       */
  def update(
    id: scala.Double,
    order: stdLib.Partial[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
}

