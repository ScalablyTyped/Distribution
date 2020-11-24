package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.OperationMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TxChangesAfter extends js.Object {
  
  var operations: js.Array[OperationMeta] = js.native
  
  var txChangesAfter: js.Array[LedgerEntryChange] = js.native
  
  var txChangesBefore: js.Array[LedgerEntryChange] = js.native
}
object TxChangesAfter {
  
  @scala.inline
  def apply(
    operations: js.Array[OperationMeta],
    txChangesAfter: js.Array[LedgerEntryChange],
    txChangesBefore: js.Array[LedgerEntryChange]
  ): TxChangesAfter = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], txChangesAfter = txChangesAfter.asInstanceOf[js.Any], txChangesBefore = txChangesBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxChangesAfter]
  }
  
  @scala.inline
  implicit class TxChangesAfterOps[Self <: TxChangesAfter] (val x: Self) extends AnyVal {
    
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
    def setTxChangesAfterVarargs(value: LedgerEntryChange*): Self = this.set("txChangesAfter", js.Array(value :_*))
    
    @scala.inline
    def setTxChangesAfter(value: js.Array[LedgerEntryChange]): Self = this.set("txChangesAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxChangesBeforeVarargs(value: LedgerEntryChange*): Self = this.set("txChangesBefore", js.Array(value :_*))
    
    @scala.inline
    def setTxChangesBefore(value: js.Array[LedgerEntryChange]): Self = this.set("txChangesBefore", value.asInstanceOf[js.Any])
  }
}
