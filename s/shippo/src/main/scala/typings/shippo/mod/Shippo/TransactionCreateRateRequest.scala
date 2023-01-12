package typings.shippo.mod.Shippo

import typings.shippo.shippoStrings.PDF
import typings.shippo.shippoStrings.PDF_4x6
import typings.shippo.shippoStrings.PNG
import typings.shippo.shippoStrings.ZPLII
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionCreateRateRequest extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var label_file_type: js.UndefOr[PNG | PDF | PDF_4x6 | ZPLII | String] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var rate: String
}
object TransactionCreateRateRequest {
  
  inline def apply(rate: String): TransactionCreateRateRequest = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionCreateRateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionCreateRateRequest] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setLabel_file_type(value: PNG | PDF | PDF_4x6 | ZPLII | String): Self = StObject.set(x, "label_file_type", value.asInstanceOf[js.Any])
    
    inline def setLabel_file_typeUndefined: Self = StObject.set(x, "label_file_type", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
