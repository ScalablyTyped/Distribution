package typings
package shopifyDashPrimeLib.distServicesLocationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/locations", "Locations")
@js.native
class Locations protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Counts the amount of locations.
    */
  def count(): js.Promise[scala.Double] = js.native
  /**
    * Gets a location with the given id.
    * @param id Id of the location being retrieved.
    * @param options Options for filtering the result.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsLocationMod.Location] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsLocationMod.Location] = js.native
  /**
    * Lists all the inventory levels on a location.
    */
  def inventoryLevels(locationId: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsLocationMod.Location] = js.native
  /**
    * Lists up to 250 locations.
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsLocationMod.Location]] = js.native
  def list(options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[js.Array[shopifyDashPrimeLib.distModelsLocationMod.Location]] = js.native
}

