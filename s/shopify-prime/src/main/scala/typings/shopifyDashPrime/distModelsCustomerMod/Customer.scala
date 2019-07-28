package typings.shopifyDashPrime.distModelsCustomerMod

import typings.shopifyDashPrime.distModelsAddressMod.Address
import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer extends ShopifyObject {
  /**
    * Indicates whether the customer has consented to be sent marketing material via email.
    */
  var accepts_marketing: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of addresses for the customer.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  /**
    * The date and time when the customer was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The default address for the customer.
    */
  var default_address: js.UndefOr[Address] = js.undefined
  /**
    * The email address of the customer.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The customer's first name.
    */
  var first_name: js.UndefOr[String] = js.undefined
  /**
    * The customer's last name.
    */
  var last_name: js.UndefOr[String] = js.undefined
  /**
    * The id of the customer's last order.
    */
  var last_order_id: js.UndefOr[Double] = js.undefined
  /**
    * The name of the customer's last order. This is directly related to the Order's name field.
    */
  var last_order_name: js.UndefOr[String] = js.undefined
  /**
    * The customer's identifier used with Multipass login
    */
  var multipass_identifier: js.UndefOr[String] = js.undefined
  /**
    * A note about the customer.
    */
  var note: js.UndefOr[String] = js.undefined
  /**
    * The number of orders associated with this customer.
    */
  var orders_count: js.UndefOr[Double] = js.undefined
  /**
    * The state of the customer in a shop. Known values are 'disabled', 'decline', 'invited' and 'enabled'.
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values.
    */
  var tags: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the customer should be charged taxes when placing orders.
    */
  var tax_exempt: js.UndefOr[Boolean] = js.undefined
  /**
    * The total amount of money that the customer has spent at the shop. Note: the Shopify API may return this as a string value.
    */
  var total_spent: js.UndefOr[String | Double] = js.undefined
  /**
    * The date and time when the customer information was updated.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * States whether or not the email address has been verified.
    */
  var verified_email: js.UndefOr[Boolean] = js.undefined
}

object Customer {
  @scala.inline
  def apply(
    accepts_marketing: js.UndefOr[Boolean] = js.undefined,
    addresses: js.Array[Address] = null,
    admin_graphql_api_id: String = null,
    created_at: String = null,
    default_address: Address = null,
    email: String = null,
    first_name: String = null,
    id: Int | Double = null,
    last_name: String = null,
    last_order_id: Int | Double = null,
    last_order_name: String = null,
    multipass_identifier: String = null,
    note: String = null,
    orders_count: Int | Double = null,
    state: String = null,
    tags: String = null,
    tax_exempt: js.UndefOr[Boolean] = js.undefined,
    total_spent: String | Double = null,
    updated_at: String = null,
    verified_email: js.UndefOr[Boolean] = js.undefined
  ): Customer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accepts_marketing)) __obj.updateDynamic("accepts_marketing")(accepts_marketing)
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (default_address != null) __obj.updateDynamic("default_address")(default_address)
    if (email != null) __obj.updateDynamic("email")(email)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (last_order_id != null) __obj.updateDynamic("last_order_id")(last_order_id.asInstanceOf[js.Any])
    if (last_order_name != null) __obj.updateDynamic("last_order_name")(last_order_name)
    if (multipass_identifier != null) __obj.updateDynamic("multipass_identifier")(multipass_identifier)
    if (note != null) __obj.updateDynamic("note")(note)
    if (orders_count != null) __obj.updateDynamic("orders_count")(orders_count.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(tax_exempt)) __obj.updateDynamic("tax_exempt")(tax_exempt)
    if (total_spent != null) __obj.updateDynamic("total_spent")(total_spent.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (!js.isUndefined(verified_email)) __obj.updateDynamic("verified_email")(verified_email)
    __obj.asInstanceOf[Customer]
  }
}

