package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Settlement")
@js.native
class V1Settlement () extends js.Object {
  /**
    * The Square-issued unique identifier for the bank account associated with the settlement.
    */
  var bank_account_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The entries included in this settlement.
    */
  var entries: js.UndefOr[js.Array[V1SettlementEntry]] = js.native
  /**
    * The settlement's unique identifier.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * The time when the settlement was submitted for deposit or withdrawal, in ISO 8601 format.
    */
  var initiated_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The settlement's current status. See [V1SettlementStatus](#type-v1settlementstatus) for possible values
    */
  var status: js.UndefOr[squareDashConnectLib.squareDashConnectMod.V1SettlementNs.StatusEnum] = js.native
  /**
    * The amount of money involved in the settlement. A positive amount indicates a deposit, and a negative amount
    * indicates a withdrawal. This amount is never zero.
    */
  var total_money: js.UndefOr[V1Money] = js.native
}

