package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderFulfillmentRecipient")
@js.native
class OrderFulfillmentRecipient () extends js.Object {
  /**
    * The address of the fulfillment recipient.
    * If provided, overrides the value pulled from the customer profile indicated by `customer_id`.
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * The Customer ID of the customer associated with the fulfillment.
    * If `customer_id` is provided, the fulfillment recipient's `display_name`, `email_address`, and `phone_number`
    * are automatically populated from the targeted customer profile. If these fields are set in the request,
    * the request values will override the information from the customer profile. If the targeted customer profile
    * does not contain the necessary information and these fields are left unset, the request will result in an error.
    */
  var customer_id: js.UndefOr[String] = js.native
  /**
    * The display name of the fulfillment recipient.
    * If provided, overrides the value pulled from the customer profile indicated by `customer_id`.
    */
  var display_name: js.UndefOr[String] = js.native
  /**
    * The email address of the fulfillment recipient.
    * If provided, overrides the value pulled from the customer profile indicated by `customer_id`.
    */
  var email_address: js.UndefOr[String] = js.native
  /**
    * The phone number of the fulfillment recipient.
    * If provided, overrides the value pulled from the customer profile indicated by `customer_id`.
    */
  var phone_number: js.UndefOr[String] = js.native
}

