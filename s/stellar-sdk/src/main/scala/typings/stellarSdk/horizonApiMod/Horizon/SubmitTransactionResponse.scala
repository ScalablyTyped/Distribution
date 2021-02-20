package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitTransactionResponse extends StObject {
  
  var envelope_xdr: String = js.native
  
  var hash: String = js.native
  
  var ledger: Double = js.native
  
  var result_meta_xdr: String = js.native
  
  var result_xdr: String = js.native
}
object SubmitTransactionResponse {
  
  @scala.inline
  def apply(envelope_xdr: String, hash: String, ledger: Double, result_meta_xdr: String, result_xdr: String): SubmitTransactionResponse = {
    val __obj = js.Dynamic.literal(envelope_xdr = envelope_xdr.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], result_meta_xdr = result_meta_xdr.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitTransactionResponse]
  }
  
  @scala.inline
  implicit class SubmitTransactionResponseMutableBuilder[Self <: SubmitTransactionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelope_xdr(value: String): Self = StObject.set(x, "envelope_xdr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedger(value: Double): Self = StObject.set(x, "ledger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_meta_xdr(value: String): Self = StObject.set(x, "result_meta_xdr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_xdr(value: String): Self = StObject.set(x, "result_xdr", value.asInstanceOf[js.Any])
  }
}
