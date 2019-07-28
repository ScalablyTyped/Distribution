package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "TenderCashDetails")
@js.native
class TenderCashDetails () extends js.Object {
  /**
    * The total amount of cash provided by the buyer, before change is given.
    */
  var buyer_tendered_money: js.UndefOr[Money] = js.native
  /**
    * The amount of change returned to the buyer.
    */
  var change_back_money: js.UndefOr[Money] = js.native
}

