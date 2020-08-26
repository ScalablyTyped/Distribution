package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ScpEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  var ledgerSeq: Double = js.native
  var messages: js.Array[ScpEnvelope] = js.native
}

object Messages {
  @scala.inline
  def apply(ledgerSeq: Double, messages: js.Array[ScpEnvelope]): Messages = {
    val __obj = js.Dynamic.literal(ledgerSeq = ledgerSeq.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  @scala.inline
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
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
    def setLedgerSeq(value: Double): Self = this.set("ledgerSeq", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: ScpEnvelope*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[ScpEnvelope]): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
  
}

