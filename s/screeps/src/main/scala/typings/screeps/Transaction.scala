package typings.screeps

import typings.screeps.anon.Username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No static is available
@js.native
trait Transaction extends js.Object {
  var amount: Double = js.native
  var description: String = js.native
  var from: String = js.native
  var order: js.UndefOr[TransactionOrder] = js.native
  var recipient: js.UndefOr[Username] = js.native
  var resourceType: MarketResourceConstant = js.native
  var sender: js.UndefOr[Username] = js.native
  var time: Double = js.native
  var to: String = js.native
  var transactionId: String = js.native
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
    transactionId: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: MarketResourceConstant): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: TransactionOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setRecipient(value: Username): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    @scala.inline
    def setSender(value: Username): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
  }
  
}

