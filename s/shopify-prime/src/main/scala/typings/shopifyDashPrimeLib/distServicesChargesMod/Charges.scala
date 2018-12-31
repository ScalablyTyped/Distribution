package typings
package shopifyDashPrimeLib.distServicesChargesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/charges", "Charges")
@js.native
class Charges protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Activates a charge. Can only be activated if the charge's status is "accepted".
    * @param id The id of the charge to activate.
    */
  def activate(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Creates a new charge.
    */
  def create(charge: shopifyDashPrimeLib.distModelsChargeMod.Charge): js.Promise[shopifyDashPrimeLib.distModelsChargeMod.Charge] = js.native
  /**
    * Gets a charge with the given id.
    * @param id The id of the charge to get.
    * @param options Options for filtering the result.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsChargeMod.Charge] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsChargeMod.Charge] = js.native
  /**
    * Retrieves a list of all past and present charges.
    * @param options Options for filtering the result.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsChargeMod.Charge]] = js.native
  def list(
    options: shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsChargeMod.Charge]] = js.native
}

