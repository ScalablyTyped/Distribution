package typings
package shopifyDashPrimeLib.distServicesCustomersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/customers", "Customers")
@js.native
class Customers protected ()
  extends shopifyDashPrimeLib.distInfrastructureMod.BaseService {
  def this(shopDomain: java.lang.String, accessToken: java.lang.String) = this()
  /**
    * Get a count of all customers
    */
  def count(): js.Promise[scala.Double] = js.native
  /**
    * Creates a customer.
    * @param customer The customer being created.
    * @param options Options for creating the customer.
    */
  def create(customer: shopifyDashPrimeLib.distModelsCustomerMod.Customer): js.Promise[shopifyDashPrimeLib.distModelsCustomerMod.Customer] = js.native
  /**
    * Generate an account activation URL for a customer whose account is not yet enabled
    * @param id The customer's ids
    */
  def createActivationUrl(id: scala.Double): js.Promise[java.lang.String] = js.native
  /**
    * Deletes a customer with the given id.
    * @param id The customer's id.
    */
  def delete(id: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Get a single customer
    * @param id The customer's id.
    * @param options Options for filtering the results.
    */
  def get(id: scala.Double): js.Promise[shopifyDashPrimeLib.distModelsCustomerMod.Customer] = js.native
  def get(id: scala.Double, options: shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions): js.Promise[shopifyDashPrimeLib.distModelsCustomerMod.Customer] = js.native
  /**
    * Sends an account invite to a customer.
    * @param invite Optional invitation to send
    */
  def invite(): js.Promise[shopifyDashPrimeLib.distModelsCustomerMod.CustomerInvite] = js.native
  def invite(invite: shopifyDashPrimeLib.distModelsCustomerMod.CustomerInvite): js.Promise[shopifyDashPrimeLib.distModelsCustomerMod.CustomerInvite] = js.native
  /**
    * Get a list of all customers
    * @param options Options for filtering the results.
    */
  def list(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsCustomerMod.Customer]] = js.native
  def list(
    options: shopifyDashPrimeLib.distOptionsBaseMod.DateOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions with shopifyDashPrimeLib.distOptionsBaseMod.ListOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsCustomerMod.Customer]] = js.native
  /**
    * Searches for customers that match a supplied query.
    * @param options Options for searching customers
    */
  def search(): js.Promise[js.Array[shopifyDashPrimeLib.distModelsCustomerMod.Customer]] = js.native
  def search(
    options: shopifyDashPrimeLib.distOptionsCustomersMod.CustomerSearchOptions with shopifyDashPrimeLib.distOptionsBaseMod.FieldOptions with shopifyDashPrimeLib.distOptionsBaseMod.BasicListOptions
  ): js.Promise[js.Array[shopifyDashPrimeLib.distModelsCustomerMod.Customer]] = js.native
  /**
    * Updates a customer with the given id.
    * @param id The customer's id.
    * @param customer The updated customer.
    */
  def update(id: scala.Double, customer: shopifyDashPrimeLib.distModelsCustomerMod.Customer): js.Promise[shopifyDashPrimeLib.distModelsCustomerMod.Customer] = js.native
}

