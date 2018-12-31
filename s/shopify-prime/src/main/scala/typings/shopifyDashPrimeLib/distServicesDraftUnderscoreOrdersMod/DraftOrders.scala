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
  def complete(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  def complete(id: scala.Double, paymentPending: scala.Boolean): js.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
    * Counts the draft orders on the shop.
    */
  def count(): js.Promise[scala.Double] = js.native
  def count(options: js.Any): js.Promise[scala.Double] = js.native
  /**
    * Creates a new draft order.
    */
  def create(order: stdLib.Partial[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]): js.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  def create(
    order: stdLib.Partial[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder],
    useCustomerDefaultAddress: scala.Boolean
  ): js.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
    * Deletes the draft order with the given id.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Retrieves the draft order with the given id.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
  /**
    * Gets a list of up to 250 of the shop's draft orders.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]] = js.native
  def list(options: shopifyDashPrimeLib.distOptionsBaseMod.ListOptions): js.Promise[js.Array[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]] = js.native
  /**
    * Updates the draft order with the given id.
    */
  def update(
    id: scala.Double,
    order: stdLib.Partial[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder]
  ): js.Promise[shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod.DraftOrder] = js.native
}

