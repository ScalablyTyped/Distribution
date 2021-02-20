package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.TransactionEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousLedgerHash extends StObject {
  
  var previousLedgerHash: Buffer = js.native
  
  var txes: js.Array[TransactionEnvelope] = js.native
}
object PreviousLedgerHash {
  
  @scala.inline
  def apply(previousLedgerHash: Buffer, txes: js.Array[TransactionEnvelope]): PreviousLedgerHash = {
    val __obj = js.Dynamic.literal(previousLedgerHash = previousLedgerHash.asInstanceOf[js.Any], txes = txes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousLedgerHash]
  }
  
  @scala.inline
  implicit class PreviousLedgerHashMutableBuilder[Self <: PreviousLedgerHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousLedgerHash(value: Buffer): Self = StObject.set(x, "previousLedgerHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxes(value: js.Array[TransactionEnvelope]): Self = StObject.set(x, "txes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxesVarargs(value: TransactionEnvelope*): Self = StObject.set(x, "txes", js.Array(value :_*))
  }
}
