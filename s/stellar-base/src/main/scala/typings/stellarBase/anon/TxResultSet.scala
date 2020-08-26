package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.TransactionHistoryResultEntryExt
import typings.stellarBase.xdrMod.xdr.TransactionResultSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TxResultSet extends js.Object {
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
  implicit class TxResultSetOps[Self <: TxResultSet] (val x: Self) extends AnyVal {
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
    def setExt(value: TransactionHistoryResultEntryExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerSeq(value: Double): Self = this.set("ledgerSeq", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxResultSet(value: TransactionResultSet): Self = this.set("txResultSet", value.asInstanceOf[js.Any])
  }
  
}

