package typings.shopifyPrime

import typings.shopifyPrime.infrastructureMod.BaseService
import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.usageChargeMod.UsageCharge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/usage_charges", JSImport.Namespace)
@js.native
object usageChargesMod extends js.Object {
  @js.native
  class UsageCharges protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Creates a new charge.
      * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
      */
    def create(recurringChargeId: Double, charge: UsageCharge): js.Promise[UsageCharge] = js.native
    /**
      * Gets a charge with the given id.
      * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
      * @param id The id of the charge to get.
      * @param options Options for filtering the result.
      */
    def get(recurringChargeId: Double, id: Double): js.Promise[UsageCharge] = js.native
    def get(recurringChargeId: Double, id: Double, options: FieldOptions): js.Promise[UsageCharge] = js.native
    /**
      * Retrieves a list of all charges.
      * @param recurringChargeId The id of the recurring charge that this usage charge belongs to.
      * @param options Options for filtering the result.
      */
    def list(recurringChargeId: Double): js.Promise[js.Array[UsageCharge]] = js.native
    def list(recurringChargeId: Double, options: FieldOptions): js.Promise[js.Array[UsageCharge]] = js.native
  }
  
  @js.native
  class default protected () extends UsageCharges {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

