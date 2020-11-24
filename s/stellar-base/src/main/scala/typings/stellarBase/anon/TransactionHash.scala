package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.TransactionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionHash extends js.Object {
  
  var result: TransactionResult = js.native
  
  var transactionHash: Buffer = js.native
}
object TransactionHash {
  
  @scala.inline
  def apply(result: TransactionResult, transactionHash: Buffer): TransactionHash = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionHash]
  }
  
  @scala.inline
  implicit class TransactionHashOps[Self <: TransactionHash] (val x: Self) extends AnyVal {
    
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
    def setResult(value: TransactionResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: Buffer): Self = this.set("transactionHash", value.asInstanceOf[js.Any])
  }
}
