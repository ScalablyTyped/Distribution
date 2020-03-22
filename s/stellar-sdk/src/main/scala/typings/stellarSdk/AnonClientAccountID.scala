package typings.stellarSdk

import typings.stellarBase.mod.Memo
import typings.stellarBase.mod.MemoType
import typings.stellarBase.mod.Operation
import typings.stellarBase.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientAccountID extends js.Object {
  var clientAccountID: String
  var tx: Transaction[Memo[MemoType], js.Array[Operation]]
}

object AnonClientAccountID {
  @scala.inline
  def apply(clientAccountID: String, tx: Transaction[Memo[MemoType], js.Array[Operation]]): AnonClientAccountID = {
    val __obj = js.Dynamic.literal(clientAccountID = clientAccountID.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClientAccountID]
  }
}

