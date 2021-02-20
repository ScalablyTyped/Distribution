package typings.stellarBase.anon

import typings.stellarBase.mod.Operation
import typings.stellarBase.xdrMod.xdr.Memo
import typings.stellarBase.xdrMod.xdr.MuxedAccount
import typings.stellarBase.xdrMod.xdr.SequenceNumber
import typings.stellarBase.xdrMod.xdr.TimeBounds
import typings.stellarBase.xdrMod.xdr.TransactionExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fee extends StObject {
  
  var ext: TransactionExt = js.native
  
  var fee: Double = js.native
  
  var memo: Memo = js.native
  
  var operations: js.Array[typings.stellarBase.xdrMod.xdr.Operation[Operation]] = js.native
  
  var seqNum: SequenceNumber = js.native
  
  var sourceAccount: MuxedAccount = js.native
  
  var timeBounds: Null | TimeBounds = js.native
}
object Fee {
  
  @scala.inline
  def apply(
    ext: TransactionExt,
    fee: Double,
    memo: Memo,
    operations: js.Array[typings.stellarBase.xdrMod.xdr.Operation[Operation]],
    seqNum: SequenceNumber,
    sourceAccount: MuxedAccount
  ): Fee = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], memo = memo.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], seqNum = seqNum.asInstanceOf[js.Any], sourceAccount = sourceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
  
  @scala.inline
  implicit class FeeMutableBuilder[Self <: Fee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: TransactionExt): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemo(value: Memo): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: js.Array[typings.stellarBase.xdrMod.xdr.Operation[Operation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: typings.stellarBase.xdrMod.xdr.Operation[Operation]*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setSeqNum(value: SequenceNumber): Self = StObject.set(x, "seqNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccount(value: MuxedAccount): Self = StObject.set(x, "sourceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBounds(value: TimeBounds): Self = StObject.set(x, "timeBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBoundsNull: Self = StObject.set(x, "timeBounds", null)
  }
}
