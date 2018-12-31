package typings
package shopifyDashPrimeLib.distModelsCustomerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * Indicates whether the customer has consented to be sent marketing material via email.
    */
  var accepts_marketing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of addresses for the customer.
    */
  var addresses: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsAddressMod.Address]] = js.undefined
  /**
    * The date and time when the customer was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default address for the customer.
    */
  var default_address: js.UndefOr[shopifyDashPrimeLib.distModelsAddressMod.Address] = js.undefined
  /**
    * The email address of the customer.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer's first name.
    */
  var first_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer's last name.
    */
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of the customer's last order.
    */
  var last_order_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the customer's last order. This is directly related to the Order's name field.
    */
  var last_order_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The customer's identifier used with Multipass login
    */
  var multipass_identifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A note about the customer.
    */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of orders associated with this customer.
    */
  var orders_count: js.UndefOr[scala.Double] = js.undefined
  /**
    * The state of the customer in a shop. Known values are 'disabled', 'decline', 'invited' and 'enabled'.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values.
    */
  var tags: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the customer should be charged taxes when placing orders.
    */
  var tax_exempt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The total amount of money that the customer has spent at the shop. Note: the Shopify API may return this as a string value.
    */
  var total_spent: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The date and time when the customer information was updated.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * States whether or not the email address has been verified.
    */
  var verified_email: js.UndefOr[scala.Boolean] = js.undefined
}

