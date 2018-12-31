package typings
package shopifyDashPrimeLib.distServicesFulfillmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/fulfillments", "Fulfillments")
@js.native
class Fulfillments protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Cancels a fulfillment with the given fulfillmentId.
    * @param fulfillmentId The fulfillment's id.
    * @param options Options for canceling the fulfillment.
    */
  def cancel(orderId: scala.Double, fulfillmentId: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = js.native
  /**
    * Complete a fulfillment with the given id.
    * @param fulfillmentId The fulfillment's id.
    * @param options Options for canceling the fulfillment.
    */
  def complete(orderId: scala.Double, fulfillmentId: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = js.native
  /**
    * Counts the fulfillments on the given order.
    * @param orderId Id of the blog that the fulfillments belong to.
    * @param options Options for filtering the results.
    */
  def count(orderId: scala.Double): js.Promise[scala.Double] = js.native
  def count(orderId: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.DateOptions): js.Promise[scala.Double] = js.native
  /**
    * Creates a new fulfillment.
    * @param orderId Id of the blog that the fulfillment will belong to.
    * @param fulfillment The fulfillment being created.
    */
  def create(orderId: scala.Double, fulfillment: shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment): js.Promise[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = js.native
  /**
    * Gets an fulfillment with the given id.
    * @param orderId Id of the blog that the fulfillment belongs to.
    * @param fulfillmentId Id of the fulfillment being retrieved.
    * @param options Options for filtering the result.
    */
  def get(orderId: scala.Double, fulfillmentId: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = js.native
  def get(
    orderId: scala.Double,
    fulfillmentId: scala.Double,
    options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): js.Promise[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = js.native
  /* private */ def getPath(orderId: js.Any, path: js.Any): js.Any = js.native
  /**
    * Lists up to 250 fulfillments for the given order.
    * @param orderId Id of the blog that the fulfillments belong to.
    * @param options Options for filtering the results.
    */
  def list(orderId: scala.Double): js.Promise[js.Array[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment]] = js.native
  def list(
    orderId: scala.Double,
    options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment]] = js.native
  /**
    * Opens a fulfillment with the given fulfillmentId.
    * @param orderId Id of the blog that the fulfillments belong to.
    * @param fulfillmentId The fulfillment's id.
    */
  def open(orderId: scala.Double, fulfillmentId: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = js.native
  /**
    * Updates an fulfillment with the given id.
    * @param orderId Id of the blog that the fulfillment belongs to.
    * @param fulfillmentId Id of the fulfillment to update.
    * @param fulfillment The updated fulfillment.
    */
  def update(
    orderId: scala.Double,
    fulfillmentId: scala.Double,
    fulfillment: shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment
  ): js.Promise[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = js.native
}

