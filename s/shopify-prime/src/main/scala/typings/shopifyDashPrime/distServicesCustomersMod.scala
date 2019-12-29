package typings.shopifyDashPrime

import typings.shopifyDashPrime.distInfrastructureMod.BaseService
import typings.shopifyDashPrime.distModelsCustomerMod.Customer
import typings.shopifyDashPrime.distModelsCustomerMod.CustomerInvite
import typings.shopifyDashPrime.distOptionsBaseMod.BasicListOptions
import typings.shopifyDashPrime.distOptionsBaseMod.DateOptions
import typings.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typings.shopifyDashPrime.distOptionsBaseMod.ListOptions
import typings.shopifyDashPrime.distOptionsCustomersMod.CustomerSearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/customers", JSImport.Namespace)
@js.native
object distServicesCustomersMod extends js.Object {
  @js.native
  class Customers protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Get a count of all customers
      */
    def count(): js.Promise[Double] = js.native
    /**
      * Creates a customer.
      * @param customer The customer being created.
      * @param options Options for creating the customer.
      */
    def create(customer: Customer): js.Promise[Customer] = js.native
    /**
      * Generate an account activation URL for a customer whose account is not yet enabled
      * @param id The customer's ids
      */
    def createActivationUrl(id: Double): js.Promise[String] = js.native
    /**
      * Deletes a customer with the given id.
      * @param id The customer's id.
      */
    def delete(id: Double): js.Promise[Unit] = js.native
    /**
      * Get a single customer
      * @param id The customer's id.
      * @param options Options for filtering the results.
      */
    def get(id: Double): js.Promise[Customer] = js.native
    def get(id: Double, options: FieldOptions): js.Promise[Customer] = js.native
    /**
      * Sends an account invite to a customer.
      * @param invite Optional invitation to send
      */
    def invite(): js.Promise[CustomerInvite] = js.native
    def invite(invite: CustomerInvite): js.Promise[CustomerInvite] = js.native
    /**
      * Get a list of all customers
      * @param options Options for filtering the results.
      */
    def list(): js.Promise[js.Array[Customer]] = js.native
    def list(options: DateOptions with FieldOptions with ListOptions): js.Promise[js.Array[Customer]] = js.native
    /**
      * Searches for customers that match a supplied query.
      * @param options Options for searching customers
      */
    def search(): js.Promise[js.Array[Customer]] = js.native
    def search(options: CustomerSearchOptions with FieldOptions with BasicListOptions): js.Promise[js.Array[Customer]] = js.native
    /**
      * Updates a customer with the given id.
      * @param id The customer's id.
      * @param customer The updated customer.
      */
    def update(id: Double, customer: Customer): js.Promise[Customer] = js.native
  }
  
  @js.native
  class default protected () extends Customers {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

