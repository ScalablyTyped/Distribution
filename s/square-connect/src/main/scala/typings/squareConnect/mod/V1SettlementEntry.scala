package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1SettlementEntry")
@js.native
class V1SettlementEntry () extends js.Object {
  /**
    * The total amount of money this entry contributes to the total settlement amount.
    */
  var amount_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount of all Square fees associated with this settlement entry. This value is always negative or zero.
    */
  var fee_money: js.UndefOr[V1Money] = js.native
  /**
    * The settlement's unique identifier.
    */
  var payment_id: js.UndefOr[String] = js.native
  /**
    * The settlement's current status. See [V1SettlementEntryType](#type-v1settlemententrytype) for possible values.
    */
  var `type`: js.UndefOr[String] = js.native
}

