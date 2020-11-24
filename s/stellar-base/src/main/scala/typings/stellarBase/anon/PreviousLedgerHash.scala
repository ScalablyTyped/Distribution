package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousLedgerHash extends js.Object {
  
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
  implicit class PreviousLedgerHashOps[Self <: PreviousLedgerHash] (val x: Self) extends AnyVal {
    
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
    def setPreviousLedgerHash(value: Buffer): Self = this.set("previousLedgerHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxesVarargs(value: TransactionEnvelope*): Self = this.set("txes", js.Array(value :_*))
    
    @scala.inline
    def setTxes(value: js.Array[TransactionEnvelope]): Self = this.set("txes", value.asInstanceOf[js.Any])
  }
}
