package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Money")
@js.native
class Money () extends js.Object {
  /**
    * The amount of money, in the smallest denomination of the currency indicated by `currency`. For example, when
    * `currency` is `USD`, `amount` is in cents.
    */
  var amount: js.UndefOr[scala.Double] = js.native
  /**
    * The type of currency, in __ISO 4217 format__. For example, the currency code for US dollars is `USD`.  See
    * [Currency](#type-currency) for possible values.
    */
  var currency: js.UndefOr[squareDashConnectLib.squareDashConnectMod.MoneyNs.CurrencyEnum] = js.native
}

