package typings.shopifyPrime.customerMod

import typings.shopifyPrime.addressMod.Address
import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customer extends ShopifyObject {
  /**
    * Indicates whether the customer has consented to be sent marketing material via email.
    */
  var accepts_marketing: js.UndefOr[Boolean] = js.native
  /**
    * A list of addresses for the customer.
    */
  var addresses: js.UndefOr[js.Array[Address]] = js.native
  /**
    * The date and time when the customer was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The default address for the customer.
    */
  var default_address: js.UndefOr[Address] = js.native
  /**
    * The email address of the customer.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The customer's first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The customer's last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * The id of the customer's last order.
    */
  var last_order_id: js.UndefOr[Double] = js.native
  /**
    * The name of the customer's last order. This is directly related to the Order's name field.
    */
  var last_order_name: js.UndefOr[String] = js.native
  /**
    * The customer's identifier used with Multipass login
    */
  var multipass_identifier: js.UndefOr[String] = js.native
  /**
    * A note about the customer.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * The number of orders associated with this customer.
    */
  var orders_count: js.UndefOr[Double] = js.native
  /**
    * The state of the customer in a shop. Known values are 'disabled', 'decline', 'invited' and 'enabled'.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Tags are additional short descriptors formatted as a string of comma-separated values.
    */
  var tags: js.UndefOr[String] = js.native
  /**
    * Indicates whether the customer should be charged taxes when placing orders.
    */
  var tax_exempt: js.UndefOr[Boolean] = js.native
  /**
    * The total amount of money that the customer has spent at the shop. Note: the Shopify API may return this as a string value.
    */
  var total_spent: js.UndefOr[String | Double] = js.native
  /**
    * The date and time when the customer information was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * States whether or not the email address has been verified.
    */
  var verified_email: js.UndefOr[Boolean] = js.native
}

object Customer {
  @scala.inline
  def apply(): Customer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customer]
  }
  @scala.inline
  implicit class CustomerOps[Self <: Customer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccepts_marketing(value: Boolean): Self = this.set("accepts_marketing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccepts_marketing: Self = this.set("accepts_marketing", js.undefined)
    @scala.inline
    def setAddressesVarargs(value: Address*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[Address]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setDefault_address(value: Address): Self = this.set("default_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_address: Self = this.set("default_address", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    @scala.inline
    def setLast_order_id(value: Double): Self = this.set("last_order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_order_id: Self = this.set("last_order_id", js.undefined)
    @scala.inline
    def setLast_order_name(value: String): Self = this.set("last_order_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_order_name: Self = this.set("last_order_name", js.undefined)
    @scala.inline
    def setMultipass_identifier(value: String): Self = this.set("multipass_identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipass_identifier: Self = this.set("multipass_identifier", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOrders_count(value: Double): Self = this.set("orders_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrders_count: Self = this.set("orders_count", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTax_exempt(value: Boolean): Self = this.set("tax_exempt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_exempt: Self = this.set("tax_exempt", js.undefined)
    @scala.inline
    def setTotal_spent(value: String | Double): Self = this.set("total_spent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_spent: Self = this.set("total_spent", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setVerified_email(value: Boolean): Self = this.set("verified_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified_email: Self = this.set("verified_email", js.undefined)
  }
  
}

