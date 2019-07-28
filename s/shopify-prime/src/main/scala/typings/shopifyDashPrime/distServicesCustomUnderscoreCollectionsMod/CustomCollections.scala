package typings.shopifyDashPrime.distServicesCustomUnderscoreCollectionsMod

import typings.shopifyDashPrime.Anon_Productid
import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsProductUnderscoreCollectionMod.CustomCollection
import typings.shopifyDashPrime.distOptionsBaseMod.DateOptions
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distOptionsBaseMod.PublishedOptions
import typings.shopifyDashPrime.distOptionsProductUnderscoreCollectionMod.CollectionListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/custom_collections", "CustomCollections")
@js.native
class CustomCollections protected () extends BaseService {
  def this(shopDomain: String, accessToken: String) = this()
  /**
    * Get a count of all custom collections that contain a given product
    * @param options Options for filtering the results.
    * @see https://help.shopify.com/api/reference/customcollection#count
    */
  def count(): js.Promise[Double] = js.native
  def count(options: Anon_Productid with DateOptions with PublishedOptions): js.Promise[Double] = js.native
  /**
    * Creates an collection.
    * @param collection The collection being created.
    * @param options Options for creating the collection.
    */
  def create(collection: CustomCollection): js.Promise[CustomCollection] = js.native
  /**
    * Deletes an collection with the given id.
    * @param id The collection's id.
    */
  def delete(id: Double): js.Promise[Unit] = js.native
  /**
    * Get a single custom collection
    * @param id The collection's id.
    * @param options Options for filtering the results.
    */
  def get(id: Double): js.Promise[CustomCollection] = js.native
  def get(id: Double, options: FieldOptions): js.Promise[CustomCollection] = js.native
  /**
    * Get a list of all custom collections that contain a given product
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[CustomCollection]] = js.native
  def list(options: CollectionListOptions): js.Promise[js.Array[CustomCollection]] = js.native
  /**
    * Updates an collection with the given id.
    * @param id The collection's id.
    * @param collection The updated collection.
    */
  def update(id: Double, collection: CustomCollection): js.Promise[CustomCollection] = js.native
}

