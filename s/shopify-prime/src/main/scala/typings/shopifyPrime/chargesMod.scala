package typings.shopifyPrime

import typings.shopifyPrime.chargeMod.Charge
import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.DateOptions
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/charges", JSImport.Namespace)
@js.native
object chargesMod extends js.Object {
  @js.native
  class Charges protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Activates a charge. Can only be activated if the charge's status is "accepted".
      * @param id The id of the charge to activate.
      */
    def activate(id: Double): js.Promise[Unit] = js.native
    /**
      * Creates a new charge.
      */
    def create(charge: Charge): js.Promise[Charge] = js.native
    /**
      * Gets a charge with the given id.
      * @param id The id of the charge to get.
      * @param options Options for filtering the result.
      */
    def get(id: Double): js.Promise[Charge] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Charge] = js.native
    /**
      * Retrieves a list of all past and present charges.
      * @param options Options for filtering the result.
      */
    def list(): js.Promise[js.Array[Charge]] = js.native
    def list(options: ListOptions with DateOptions with FieldOptions): js.Promise[js.Array[Charge]] = js.native
  }
  
  @js.native
  class default protected () extends Charges {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

