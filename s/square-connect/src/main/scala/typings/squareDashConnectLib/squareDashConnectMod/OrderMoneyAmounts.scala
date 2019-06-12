package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderMoneyAmounts")
@js.native
class OrderMoneyAmounts () extends js.Object {
  /**
    * Money associated with discounts.
    */
  var discount_money: js.UndefOr[Money] = js.native
  /**
    * Money associated with service charges.
    */
  var service_charge_money: js.UndefOr[Money] = js.native
  /**
    * Money associated with taxes.
    */
  var tax_money: js.UndefOr[Money] = js.native
  /**
    * Money associated with tips.
    */
  var tip_money: js.UndefOr[Money] = js.native
  /**
    * Total money.
    */
  var total_money: js.UndefOr[Money] = js.native
}

