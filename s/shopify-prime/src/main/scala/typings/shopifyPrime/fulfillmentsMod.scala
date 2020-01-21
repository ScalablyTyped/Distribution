package typings.shopifyPrime

import typings.shopifyPrime.fulfillmentMod.Fulfillment
import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.DateOptions
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/fulfillments", JSImport.Namespace)
@js.native
object fulfillmentsMod extends js.Object {
  @js.native
  class Fulfillments protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Cancels a fulfillment with the given fulfillmentId.
      * @param fulfillmentId The fulfillment's id.
      * @param options Options for canceling the fulfillment.
      */
    def cancel(orderId: Double, fulfillmentId: Double): js.Promise[Fulfillment] = js.native
    /**
      * Complete a fulfillment with the given id.
      * @param fulfillmentId The fulfillment's id.
      * @param options Options for canceling the fulfillment.
      */
    def complete(orderId: Double, fulfillmentId: Double): js.Promise[Fulfillment] = js.native
    /**
      * Counts the fulfillments on the given order.
      * @param orderId Id of the blog that the fulfillments belong to.
      * @param options Options for filtering the results.
      */
    def count(orderId: Double): js.Promise[Double] = js.native
    def count(orderId: Double, options: DateOptions): js.Promise[Double] = js.native
    /**
      * Creates a new fulfillment.
      * @param orderId Id of the blog that the fulfillment will belong to.
      * @param fulfillment The fulfillment being created.
      */
    def create(orderId: Double, fulfillment: Fulfillment): js.Promise[Fulfillment] = js.native
    /**
      * Gets an fulfillment with the given id.
      * @param orderId Id of the blog that the fulfillment belongs to.
      * @param fulfillmentId Id of the fulfillment being retrieved.
      * @param options Options for filtering the result.
      */
    def get(orderId: Double, fulfillmentId: Double): js.Promise[Fulfillment] = js.native
    def get(orderId: Double, fulfillmentId: Double, options: FieldOptions): js.Promise[Fulfillment] = js.native
    /* private */ def getPath(orderId: js.Any, path: js.Any): js.Any = js.native
    /**
      * Lists up to 250 fulfillments for the given order.
      * @param orderId Id of the blog that the fulfillments belong to.
      * @param options Options for filtering the results.
      */
    def list(orderId: Double): js.Promise[js.Array[Fulfillment]] = js.native
    def list(orderId: Double, options: FieldOptions with DateOptions with ListOptions): js.Promise[js.Array[Fulfillment]] = js.native
    /**
      * Opens a fulfillment with the given fulfillmentId.
      * @param orderId Id of the blog that the fulfillments belong to.
      * @param fulfillmentId The fulfillment's id.
      */
    def open(orderId: Double, fulfillmentId: Double): js.Promise[Fulfillment] = js.native
    /**
      * Updates an fulfillment with the given id.
      * @param orderId Id of the blog that the fulfillment belongs to.
      * @param fulfillmentId Id of the fulfillment to update.
      * @param fulfillment The updated fulfillment.
      */
    def update(orderId: Double, fulfillmentId: Double, fulfillment: Fulfillment): js.Promise[Fulfillment] = js.native
  }
  
  @js.native
  class default protected () extends Fulfillments {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

