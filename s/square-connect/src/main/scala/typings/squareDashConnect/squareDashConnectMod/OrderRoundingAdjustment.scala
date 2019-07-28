package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderRoundingAdjustment")
@js.native
class OrderRoundingAdjustment () extends js.Object {
  /**
    * Actual rounding adjustment amount.
    */
  var amount_money: js.UndefOr[Money] = js.native
  /**
    * The name of the rounding adjustment from the original sale Order.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The rounding adjustment's Unique identifier, unique only within this order. This field is read-only.
    */
  var uid: js.UndefOr[String] = js.native
}

