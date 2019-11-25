package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No static is available
trait Transaction extends js.Object {
  var amount: Double
  var description: String
  var from: String
  var order: js.UndefOr[TransactionOrder] = js.undefined
  var recipient: js.UndefOr[Anon_Username] = js.undefined
  var resourceType: MarketResourceConstant
  var sender: js.UndefOr[Anon_Username] = js.undefined
  var time: Double
  var to: String
  var transactionId: String
}

object Transaction {
  @scala.inline
  def apply(
    amount: Double,
    description: String,
    from: String,
    resourceType: MarketResourceConstant,
    time: Double,
    to: String,
    transactionId: String,
    order: TransactionOrder = null,
    recipient: Anon_Username = null,
    sender: Anon_Username = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

