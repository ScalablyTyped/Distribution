package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.TransactionMeta
import typings.stellarBase.xdrMod.xdr.TransactionResultPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeProcessing extends StObject {
  
  var feeProcessing: js.Array[LedgerEntryChange] = js.native
  
  var result: TransactionResultPair = js.native
  
  var txApplyProcessing: TransactionMeta = js.native
}
object FeeProcessing {
  
  @scala.inline
  def apply(
    feeProcessing: js.Array[LedgerEntryChange],
    result: TransactionResultPair,
    txApplyProcessing: TransactionMeta
  ): FeeProcessing = {
    val __obj = js.Dynamic.literal(feeProcessing = feeProcessing.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], txApplyProcessing = txApplyProcessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeProcessing]
  }
  
  @scala.inline
  implicit class FeeProcessingMutableBuilder[Self <: FeeProcessing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeeProcessing(value: js.Array[LedgerEntryChange]): Self = StObject.set(x, "feeProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeProcessingVarargs(value: LedgerEntryChange*): Self = StObject.set(x, "feeProcessing", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: TransactionResultPair): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxApplyProcessing(value: TransactionMeta): Self = StObject.set(x, "txApplyProcessing", value.asInstanceOf[js.Any])
  }
}
