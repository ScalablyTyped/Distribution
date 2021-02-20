package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.OperationMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TxChangesAfter extends StObject {
  
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
  implicit class TxChangesAfterMutableBuilder[Self <: TxChangesAfter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: js.Array[OperationMeta]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: OperationMeta*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setTxChangesAfter(value: js.Array[LedgerEntryChange]): Self = StObject.set(x, "txChangesAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxChangesAfterVarargs(value: LedgerEntryChange*): Self = StObject.set(x, "txChangesAfter", js.Array(value :_*))
    
    @scala.inline
    def setTxChangesBefore(value: js.Array[LedgerEntryChange]): Self = StObject.set(x, "txChangesBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxChangesBeforeVarargs(value: LedgerEntryChange*): Self = StObject.set(x, "txChangesBefore", js.Array(value :_*))
  }
}
