package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.InnerTransactionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends StObject {
  
  var result: InnerTransactionResult = js.native
  
  var transactionHash: Buffer = js.native
}
object Result {
  
  @scala.inline
  def apply(result: InnerTransactionResult, transactionHash: Buffer): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  @scala.inline
  implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: InnerTransactionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionHash(value: Buffer): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
  }
}
