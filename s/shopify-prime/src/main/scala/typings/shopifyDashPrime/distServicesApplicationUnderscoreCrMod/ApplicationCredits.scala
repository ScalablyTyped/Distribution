package typings.shopifyDashPrime.distServicesApplicationUnderscoreCrMod

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsApplicationUnderscoreCreditMod.ApplicationCredit
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/application_cr", "ApplicationCredits")
@js.native
class ApplicationCredits protected () extends BaseService {
  def this(shopDomain: String, accessToken: String) = this()
  /**
    * Creates a new Application Credit.
    */
  def create(credit: ApplicationCredit): js.Promise[ApplicationCredit] = js.native
  /**
    * Gets an application credit with the given id.
    * @param id The id of the credit to get.
    * @param options Options for filtering the result.
    */
  def get(id: Double): js.Promise[ApplicationCredit] = js.native
  def get(id: Double, options: FieldOptions): js.Promise[ApplicationCredit] = js.native
  /**
    * Retrieves a list of all past and present application credits.
    * @param options Options for filtering the result.
    */
  def list(): js.Promise[js.Array[ApplicationCredit]] = js.native
  def list(options: FieldOptions): js.Promise[js.Array[ApplicationCredit]] = js.native
}

