package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Money")
@js.native
class V1Money () extends js.Object {
  /**
    * Amount in the lowest denominated value of this Currency. E.g. in USD these are cents, in JPY they are Yen (which
    * do not have a 'cent' concept).
    */
  var amount: js.UndefOr[scala.Double] = js.native
  /**
    * See [Currency](#type-currency) for possible values.
    */
  var currency_code: js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1MoneyNs.CurrencyCodeEnum] = js.native
}

