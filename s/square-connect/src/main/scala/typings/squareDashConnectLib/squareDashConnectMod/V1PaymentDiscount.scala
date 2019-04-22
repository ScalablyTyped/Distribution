package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentDiscount")
@js.native
class V1PaymentDiscount () extends js.Object {
  /**
    * The amount of money that this discount adds to the payment (note that this value is always negative or zero).
    */
  var applied_money: js.UndefOr[V1Money] = js.native
  /**
    * The ID of the applied discount, if available. Discounts applied in older versions of Square Register might not have an ID.
    */
  var discount_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The discount's name.
    */
  var name: js.UndefOr[java.lang.String] = js.native
}

