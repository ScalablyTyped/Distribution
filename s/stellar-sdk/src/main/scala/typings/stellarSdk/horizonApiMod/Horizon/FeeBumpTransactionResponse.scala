package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeeBumpTransactionResponse extends StObject {
  
  var hash: String = js.native
  
  var signatures: js.Array[String] = js.native
}
object FeeBumpTransactionResponse {
  
  @scala.inline
  def apply(hash: String, signatures: js.Array[String]): FeeBumpTransactionResponse = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeeBumpTransactionResponse]
  }
  
  @scala.inline
  implicit class FeeBumpTransactionResponseMutableBuilder[Self <: FeeBumpTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[String]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: String*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
