package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt
import typings.stellarBase.xdrMod.xdr.TransactionSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerSeq extends js.Object {
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
  implicit class LedgerSeqOps[Self <: LedgerSeq] (val x: Self) extends AnyVal {
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
    def setExt(value: TransactionHistoryEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerSeq(value: Double): Self = this.set("ledgerSeq", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxSet(value: TransactionSet): Self = this.set("txSet", value.asInstanceOf[js.Any])
  }
  
}

