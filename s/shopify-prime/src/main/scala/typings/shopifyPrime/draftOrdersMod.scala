package typings.shopifyPrime

import typings.shopifyPrime.draftOrderMod.DraftOrder
import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/draft_orders", JSImport.Namespace)
@js.native
object draftOrdersMod extends js.Object {
  @js.native
  class DraftOrders protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Completes the draft order, transitioning it to a full order.
      */
    def complete(id: Double): js.Promise[DraftOrder] = js.native
    def complete(id: Double, paymentPending: Boolean): js.Promise[DraftOrder] = js.native
    /**
      * Counts the draft orders on the shop.
      */
    def count(): js.Promise[Double] = js.native
    def count(options: js.Any): js.Promise[Double] = js.native
    /**
      * Creates a new draft order.
      */
    def create(order: PartialDraftOrder): js.Promise[DraftOrder] = js.native
    def create(order: PartialDraftOrder, useCustomerDefaultAddress: Boolean): js.Promise[DraftOrder] = js.native
    /**
      * Deletes the draft order with the given id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Retrieves the draft order with the given id.
      */
    def get(id: Double): js.Promise[DraftOrder] = js.native
    /**
      * Gets a list of up to 250 of the shop's draft orders.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[DraftOrder]] = js.native
    def list(options: ListOptions): js.Promise[js.Array[DraftOrder]] = js.native
    /**
      * Updates the draft order with the given id.
      */
    def update(id: Double, order: PartialDraftOrder): js.Promise[DraftOrder] = js.native
  }
  
  @js.native
  class default protected () extends DraftOrders {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

