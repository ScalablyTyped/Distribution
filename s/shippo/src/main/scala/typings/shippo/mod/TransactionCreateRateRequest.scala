package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionCreateRateRequest
  extends StObject
     with Asyncable {
  
  var label_file_type: js.UndefOr[LabelFileType] = js.undefined
  
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
    
    inline def setLabel_file_type(value: LabelFileType): Self = StObject.set(x, "label_file_type", value.asInstanceOf[js.Any])
    
    inline def setLabel_file_typeUndefined: Self = StObject.set(x, "label_file_type", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
