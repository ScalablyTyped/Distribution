package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderFulfillmentRecipient")
@js.native
class OrderFulfillmentRecipient () extends js.Object {
  /**
    * The Customer ID of the customer associated with the fulfillment.  If customer_id is provided, the corresponding
    * recipient information fields (`display_name`, `email_address`, and `phone_number`) are automatically populated
    * from the relevant customer profile. If the targeted profile information does not contain the necessary required
    * information, the request will result in an error.
    */
  var customer_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The display name of the fulfillment recipient.  If provided, overrides the value from customer profile indicated
    * by customer_id.
    */
  var display_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The email address of the fulfillment recipient.  If provided, overrides the value from customer profile indicated
    * by customer_id.
    */
  var email_address: js.UndefOr[java.lang.String] = js.native
  /**
    * The phone number of the fulfillment recipient.  If provided, overrides the value from customer profile indicated
    * by customer_id.
    */
  var phone_number: js.UndefOr[java.lang.String] = js.native
}

