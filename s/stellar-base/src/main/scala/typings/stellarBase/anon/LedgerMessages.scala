package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerScpMessages
import typings.stellarBase.xdrMod.xdr.ScpQuorumSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerMessages extends js.Object {
  var ledgerMessages: LedgerScpMessages = js.native
  var quorumSets: js.Array[ScpQuorumSet] = js.native
}

object LedgerMessages {
  @scala.inline
  def apply(ledgerMessages: LedgerScpMessages, quorumSets: js.Array[ScpQuorumSet]): LedgerMessages = {
    val __obj = js.Dynamic.literal(ledgerMessages = ledgerMessages.asInstanceOf[js.Any], quorumSets = quorumSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerMessages]
  }
  @scala.inline
  implicit class LedgerMessagesOps[Self <: LedgerMessages] (val x: Self) extends AnyVal {
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
    def setLedgerMessages(value: LedgerScpMessages): Self = this.set("ledgerMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuorumSetsVarargs(value: ScpQuorumSet*): Self = this.set("quorumSets", js.Array(value :_*))
    @scala.inline
    def setQuorumSets(value: js.Array[ScpQuorumSet]): Self = this.set("quorumSets", value.asInstanceOf[js.Any])
  }
  
}

