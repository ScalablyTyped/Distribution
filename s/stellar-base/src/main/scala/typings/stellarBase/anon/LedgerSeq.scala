package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt
import typings.stellarBase.xdrMod.xdr.TransactionSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerSeq extends StObject {
  
  var ext: TransactionHistoryEntryExt = js.native
  
  var ledgerSeq: Double = js.native
  
  var txSet: TransactionSet = js.native
}
object LedgerSeq {
  
  @scala.inline
  def apply(ext: TransactionHistoryEntryExt, ledgerSeq: Double, txSet: TransactionSet): LedgerSeq = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], ledgerSeq = ledgerSeq.asInstanceOf[js.Any], txSet = txSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerSeq]
  }
  
  @scala.inline
  implicit class LedgerSeqMutableBuilder[Self <: LedgerSeq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: TransactionHistoryEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerSeq(value: Double): Self = StObject.set(x, "ledgerSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxSet(value: TransactionSet): Self = StObject.set(x, "txSet", value.asInstanceOf[js.Any])
  }
}
