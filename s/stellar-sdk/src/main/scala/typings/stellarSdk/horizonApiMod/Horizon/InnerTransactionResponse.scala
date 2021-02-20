package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerTransactionResponse extends StObject {
  
  var hash: String = js.native
  
  var max_fee: String = js.native
  
  var signatures: js.Array[String] = js.native
}
object InnerTransactionResponse {
  
  @scala.inline
  def apply(hash: String, max_fee: String, signatures: js.Array[String]): InnerTransactionResponse = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], max_fee = max_fee.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerTransactionResponse]
  }
  
  @scala.inline
  implicit class InnerTransactionResponseMutableBuilder[Self <: InnerTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_fee(value: String): Self = StObject.set(x, "max_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
