package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerEntryChange
import typings.stellarBase.xdrMod.xdr.TransactionMeta
import typings.stellarBase.xdrMod.xdr.TransactionResultPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeeProcessing extends js.Object {
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
  implicit class FeeProcessingOps[Self <: FeeProcessing] (val x: Self) extends AnyVal {
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
    def setFeeProcessingVarargs(value: LedgerEntryChange*): Self = this.set("feeProcessing", js.Array(value :_*))
    @scala.inline
    def setFeeProcessing(value: js.Array[LedgerEntryChange]): Self = this.set("feeProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: TransactionResultPair): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxApplyProcessing(value: TransactionMeta): Self = this.set("txApplyProcessing", value.asInstanceOf[js.Any])
  }
  
}

