package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateCustomerRequest")
@js.native
class CreateCustomerRequest () extends js.Object {
  /**
    * The customer's physical address.
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * The customer birthday in RFC-3339 format. Year is optional, timezone and times are not allowed. Example:
    * `0000-09-01T00:00:00-00:00` for a birthday on September 1st. `1998-09-01T00:00:00-00:00` for a birthday on
    * September 1st 1998.
    */
  var birthday: js.UndefOr[java.lang.String] = js.native
  /**
    * The name of the customer's company.
    */
  var company_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's email address.
    */
  var email_address: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's family (i.e., last) name.
    */
  var family_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's given (i.e., first) name.
    */
  var given_name: js.UndefOr[java.lang.String] = js.native
  /**
    * The idempotency key for the request. See the [Idempotency](/basics/api101/idempotency) guide for more
    * information.
    */
  var idempotency_key: js.UndefOr[java.lang.String] = js.native
  /**
    * A nickname for the customer.
    */
  var nickname: js.UndefOr[java.lang.String] = js.native
  /**
    * An optional note to associate with the customer.
    */
  var note: js.UndefOr[java.lang.String] = js.native
  /**
    * The customer's phone number.
    */
  var phone_number: js.UndefOr[java.lang.String] = js.native
  /**
    * An optional second ID you can set to associate the customer with an entity in another system.
    */
  var reference_id: js.UndefOr[java.lang.String] = js.native
}

