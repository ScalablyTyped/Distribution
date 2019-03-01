package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No static is available
trait Transaction extends js.Object {
  var amount: scala.Double
  var description: java.lang.String
  var from: java.lang.String
  var order: js.UndefOr[TransactionOrder] = js.undefined
  var recipient: js.UndefOr[Anon_Username] = js.undefined
  var resourceType: MarketResourceConstant
  var sender: js.UndefOr[Anon_Username] = js.undefined
  var time: scala.Double
  var to: java.lang.String
  var transactionId: java.lang.String
}

object Transaction {
  @scala.inline
  def apply(
    amount: scala.Double,
    description: java.lang.String,
    from: java.lang.String,
    resourceType: MarketResourceConstant,
    time: scala.Double,
    to: java.lang.String,
    transactionId: java.lang.String,
    order: TransactionOrder = null,
    recipient: Anon_Username = null,
    sender: Anon_Username = null
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("transactionId")(transactionId)
    if (order != null) __obj.updateDynamic("order")(order)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Transaction]
  }
}

