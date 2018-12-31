package typings
package shopifyDashPrimeLib.distServicesRecurringUnderscoreChargesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/recurring_charges", "RecurringCharges")
@js.native
class RecurringCharges protected ()
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
  def create(charge: shopifyDashPrimeLib.distModelsRecurringUnderscoreChargeMod.RecurringCharge): js.Promise[shopifyDashPrimeLib.distModelsRecurringUnderscoreChargeMod.RecurringCharge] = js.native
  /**
    * Deletes a charge.
    * @param id The id of the charge to delete.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Gets a charge with the given id.
    * @param id The id of the charge to get.
    * @param options Options for filtering the result.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsRecurringUnderscoreChargeMod.RecurringCharge] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsRecurringUnderscoreChargeMod.RecurringCharge] = js.native
  /**
    * Retrieves a list of all past and present charges.
    * @param options Options for filtering the result.
    */
  def list(): js.Promise[
    js.Array[shopifyDashPrimeLib.distModelsRecurringUnderscoreChargeMod.RecurringCharge]
  ] = js.native
  def list(
    options: shopifyDashPrimeLib.distOptionsBaseMod.ListOptions with shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions
  ): js.Promise[
    js.Array[shopifyDashPrimeLib.distModelsRecurringUnderscoreChargeMod.RecurringCharge]
  ] = js.native
}

