package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.OperationMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operations extends js.Object {
  var operations: js.Array[OperationMeta] = js.native
  var txChanges: js.Array[LedgerEntryChange] = js.native
}

object Operations {
  @scala.inline
  def apply(operations: js.Array[OperationMeta], txChanges: js.Array[LedgerEntryChange]): Operations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], txChanges = txChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operations]
  }
  @scala.inline
  implicit class OperationsOps[Self <: Operations] (val x: Self) extends AnyVal {
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
    def setOperationsVarargs(value: OperationMeta*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[OperationMeta]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxChangesVarargs(value: LedgerEntryChange*): Self = this.set("txChanges", js.Array(value :_*))
    @scala.inline
    def setTxChanges(value: js.Array[LedgerEntryChange]): Self = this.set("txChanges", value.asInstanceOf[js.Any])
  }
  
}

