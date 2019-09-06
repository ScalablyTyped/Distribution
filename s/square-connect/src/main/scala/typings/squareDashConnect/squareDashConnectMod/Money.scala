package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Money")
@js.native
class Money () extends js.Object {
  /**
    * The amount of money, in the smallest denomination of the currency indicated by `currency`.
    * For example, when `currency` is `USD`, `amount` is in cents. Monetary amounts can be positive or negative.
    * See the specific API documentation to determine the meaning of the sign in a particular case.
    */
  var amount: js.UndefOr[Double] = js.native
  /**
    * The type of currency, in __ISO 4217 format__. For example, the currency code for US dollars is `USD`.
    * See [Currency](#type-currency) for possible values. See [Currency](#type-currency) for possible values
    */
  var currency: js.UndefOr[CurrencyEnum] = js.native
}

