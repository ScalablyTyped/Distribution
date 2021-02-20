package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.TransactionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionHash extends StObject {
  
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
  implicit class TransactionHashMutableBuilder[Self <: TransactionHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: TransactionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: Buffer): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
  }
}
