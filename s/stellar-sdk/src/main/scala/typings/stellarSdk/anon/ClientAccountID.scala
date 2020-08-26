package typings.stellarSdk.anon

import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.Operation
import typings.stellarBase.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientAccountID extends js.Object {
  var clientAccountID: String = js.native
  var tx: Transaction[Memo[MemoType], js.Array[Operation]] = js.native
}

object ClientAccountID {
  @scala.inline
  def apply(clientAccountID: String, tx: Transaction[Memo[MemoType], js.Array[Operation]]): ClientAccountID = {
    val __obj = js.Dynamic.literal(clientAccountID = clientAccountID.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAccountID]
  }
  @scala.inline
  implicit class ClientAccountIDOps[Self <: ClientAccountID] (val x: Self) extends AnyVal {
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
    def setClientAccountID(value: String): Self = this.set("clientAccountID", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx(value: Transaction[Memo[MemoType], js.Array[Operation]]): Self = this.set("tx", value.asInstanceOf[js.Any])
  }
  
}

