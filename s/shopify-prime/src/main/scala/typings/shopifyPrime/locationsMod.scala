package typings.shopifyPrime

import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.locationMod.Location
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/locations", JSImport.Namespace)
@js.native
object locationsMod extends js.Object {
  @js.native
  class Locations protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Counts the amount of locations.
      */
    def count(): js.Promise[Double] = js.native
    /**
      * Gets a location with the given id.
      * @param id Id of the location being retrieved.
      * @param options Options for filtering the result.
      */
    def get(id: Double): js.Promise[Location] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Location] = js.native
    /**
      * Lists all the inventory levels on a location.
      */
    def inventoryLevels(locationId: Double): js.Promise[Location] = js.native
    /**
      * Lists up to 250 locations.
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Location]] = js.native
    def list(options: FieldOptions): js.Promise[js.Array[Location]] = js.native
  }
  
  @js.native
  class default protected () extends Locations {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

