package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry
import typings.stellarBase.xdrMod.xdr.ScpHistoryEntry
import typings.stellarBase.xdrMod.xdr.TransactionResultMeta
import typings.stellarBase.xdrMod.xdr.TransactionSet
import typings.stellarBase.xdrMod.xdr.UpgradeEntryMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerHeader extends js.Object {
  var ledgerHeader: LedgerHeaderHistoryEntry = js.native
  var scpInfo: js.Array[ScpHistoryEntry] = js.native
  var txProcessing: js.Array[TransactionResultMeta] = js.native
  var txSet: TransactionSet = js.native
  var upgradesProcessing: js.Array[UpgradeEntryMeta] = js.native
}

object LedgerHeader {
  @scala.inline
  def apply(
    ledgerHeader: LedgerHeaderHistoryEntry,
    scpInfo: js.Array[ScpHistoryEntry],
    txProcessing: js.Array[TransactionResultMeta],
    txSet: TransactionSet,
    upgradesProcessing: js.Array[UpgradeEntryMeta]
  ): LedgerHeader = {
    val __obj = js.Dynamic.literal(ledgerHeader = ledgerHeader.asInstanceOf[js.Any], scpInfo = scpInfo.asInstanceOf[js.Any], txProcessing = txProcessing.asInstanceOf[js.Any], txSet = txSet.asInstanceOf[js.Any], upgradesProcessing = upgradesProcessing.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerHeader]
  }
  @scala.inline
  implicit class LedgerHeaderOps[Self <: LedgerHeader] (val x: Self) extends AnyVal {
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
    def setLedgerHeader(value: LedgerHeaderHistoryEntry): Self = this.set("ledgerHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setScpInfoVarargs(value: ScpHistoryEntry*): Self = this.set("scpInfo", js.Array(value :_*))
    @scala.inline
    def setScpInfo(value: js.Array[ScpHistoryEntry]): Self = this.set("scpInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxProcessingVarargs(value: TransactionResultMeta*): Self = this.set("txProcessing", js.Array(value :_*))
    @scala.inline
    def setTxProcessing(value: js.Array[TransactionResultMeta]): Self = this.set("txProcessing", value.asInstanceOf[js.Any])
    @scala.inline
    def setTxSet(value: TransactionSet): Self = this.set("txSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpgradesProcessingVarargs(value: UpgradeEntryMeta*): Self = this.set("upgradesProcessing", js.Array(value :_*))
    @scala.inline
    def setUpgradesProcessing(value: js.Array[UpgradeEntryMeta]): Self = this.set("upgradesProcessing", value.asInstanceOf[js.Any])
  }
  
}

