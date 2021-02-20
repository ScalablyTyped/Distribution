package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.OperationMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operations extends StObject {
  
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
  implicit class OperationsMutableBuilder[Self <: Operations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: js.Array[OperationMeta]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: OperationMeta*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setTxChanges(value: js.Array[LedgerEntryChange]): Self = StObject.set(x, "txChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxChangesVarargs(value: LedgerEntryChange*): Self = StObject.set(x, "txChanges", js.Array(value :_*))
  }
}
