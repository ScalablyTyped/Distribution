package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentModifier")
@js.native
class V1PaymentModifier () extends js.Object {
  /**
    * The amount of money that this modifier option adds to the payment.
    */
  var applied_money: js.UndefOr[V1Money] = js.native
  /**
    * TThe ID of the applied modifier option, if available. Modifier options applied in older versions of Square
    * Register might not have an ID.
    */
  var modifier_option_id: js.UndefOr[String] = js.native
  /**
    * The modifier option's name.
    */
  var name: js.UndefOr[String] = js.native
}

