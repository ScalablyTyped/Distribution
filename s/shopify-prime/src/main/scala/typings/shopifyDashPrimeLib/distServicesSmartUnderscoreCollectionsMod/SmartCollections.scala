package typings
package shopifyDashPrimeLib.distServicesSmartUnderscoreCollectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/smart_collections", "SmartCollections")
@js.native
class SmartCollections protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
       * Get a count of all smart collections that contain a given product
       * @param options Options for filtering the results.
       * @see https://help.shopify.com/api/reference/smartcollection#count
       */
  def count(): stdLib.Promise[scala.Double] = js.native
  /**
       * Get a count of all smart collections that contain a given product
       * @param options Options for filtering the results.
       * @see https://help.shopify.com/api/reference/smartcollection#count
       */
  def count(
    options: shopifyDashPrimeLib.Anon_Productid with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.PublishedOptions
  ): stdLib.Promise[scala.Double] = js.native
  /**
       * Create a new smart collection.
       * @param collection The collection being created.
       * @param options Options for creating the collection.
       */
  def create(collection: shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection] = js.native
  /**
       * Deletes an collection with the given id.
       * @param id The collection's id.
       */
  def delete(id: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Get a single collection
       * @param id The collection's id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection] = js.native
  /**
       * Get a single collection
       * @param id The collection's id.
       * @param options Options for filtering the results.
       */
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection] = js.native
  /**
       * Get a list of all smart collections that contain a given product
       * @param options Options for filtering the results.
       */
  def list(): stdLib.Promise[
    js.Array[shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection]
  ] = js.native
  /**
       * Get a list of all smart collections that contain a given product
       * @param options Options for filtering the results.
       */
  def list(options: shopifyDashPrimeLib.distOptionsProductUnderscoreCollectionMod.CollectionListOptions): stdLib.Promise[
    js.Array[shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection]
  ] = js.native
  /**
       * Updates an collection with the given id.
       * @param id The collection's id.
       * @param collection The updated collection.
       */
  def update(
    id: scala.Double,
    collection: shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection
  ): stdLib.Promise[shopifyDashPrimeLib.distModelsProductUnderscoreCollectionMod.SmartCollection] = js.native
}

