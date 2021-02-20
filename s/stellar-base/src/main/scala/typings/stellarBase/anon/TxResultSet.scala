package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt
import typings.stellarBase.xdrMod.xdr.TransactionResultSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TxResultSet extends StObject {
  
  var ext: TransactionHistoryResultEntryExt = js.native
  
  var ledgerSeq: Double = js.native
  
  var txResultSet: TransactionResultSet = js.native
}
object TxResultSet {
  
  @scala.inline
  def apply(ext: TransactionHistoryResultEntryExt, ledgerSeq: Double, txResultSet: TransactionResultSet): TxResultSet = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], ledgerSeq = ledgerSeq.asInstanceOf[js.Any], txResultSet = txResultSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxResultSet]
  }
  
  @scala.inline
  implicit class TxResultSetMutableBuilder[Self <: TxResultSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: TransactionHistoryResultEntryExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerSeq(value: Double): Self = StObject.set(x, "ledgerSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxResultSet(value: TransactionResultSet): Self = StObject.set(x, "txResultSet", value.asInstanceOf[js.Any])
  }
}
