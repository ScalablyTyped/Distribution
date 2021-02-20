package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarSdk.anon.Operations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionFailedExtras extends StObject {
  
  var envelope_xdr: String = js.native
  
  var result_codes: Operations = js.native
  
  var result_xdr: String = js.native
}
object TransactionFailedExtras {
  
  @scala.inline
  def apply(envelope_xdr: String, result_codes: Operations, result_xdr: String): TransactionFailedExtras = {
    val __obj = js.Dynamic.literal(envelope_xdr = envelope_xdr.asInstanceOf[js.Any], result_codes = result_codes.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionFailedExtras]
  }
  
  @scala.inline
  implicit class TransactionFailedExtrasMutableBuilder[Self <: TransactionFailedExtras] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelope_xdr(value: String): Self = StObject.set(x, "envelope_xdr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_codes(value: Operations): Self = StObject.set(x, "result_codes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_xdr(value: String): Self = StObject.set(x, "result_xdr", value.asInstanceOf[js.Any])
  }
}
