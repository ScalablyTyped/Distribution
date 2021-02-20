package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntry
import typings.stellarBase.xdrMod.xdr.ScpHistoryEntry
import typings.stellarBase.xdrMod.xdr.TransactionResultMeta
import typings.stellarBase.xdrMod.xdr.TransactionSet
import typings.stellarBase.xdrMod.xdr.UpgradeEntryMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerHeader extends StObject {
  
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
  implicit class LedgerHeaderMutableBuilder[Self <: LedgerHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLedgerHeader(value: LedgerHeaderHistoryEntry): Self = StObject.set(x, "ledgerHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScpInfo(value: js.Array[ScpHistoryEntry]): Self = StObject.set(x, "scpInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScpInfoVarargs(value: ScpHistoryEntry*): Self = StObject.set(x, "scpInfo", js.Array(value :_*))
    
    @scala.inline
    def setTxProcessing(value: js.Array[TransactionResultMeta]): Self = StObject.set(x, "txProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxProcessingVarargs(value: TransactionResultMeta*): Self = StObject.set(x, "txProcessing", js.Array(value :_*))
    
    @scala.inline
    def setTxSet(value: TransactionSet): Self = StObject.set(x, "txSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradesProcessing(value: js.Array[UpgradeEntryMeta]): Self = StObject.set(x, "upgradesProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradesProcessingVarargs(value: UpgradeEntryMeta*): Self = StObject.set(x, "upgradesProcessing", js.Array(value :_*))
  }
}
