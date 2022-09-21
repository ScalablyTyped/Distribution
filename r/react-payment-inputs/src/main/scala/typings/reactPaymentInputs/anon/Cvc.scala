package typings.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvc extends StObject {
  
  var cardNumber: Boolean
  
  var cvc: Boolean
  
  var expiryDate: Boolean
  
  var zip: Boolean
}
object Cvc {
  
  inline def apply(cardNumber: Boolean, cvc: Boolean, expiryDate: Boolean, zip: Boolean): Cvc = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], expiryDate = expiryDate.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cvc]
  }
  
  extension [Self <: Cvc](x: Self) {
    
    inline def setCardNumber(value: Boolean): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
    
    inline def setCvc(value: Boolean): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setExpiryDate(value: Boolean): Self = StObject.set(x, "expiryDate", value.asInstanceOf[js.Any])
    
    inline def setZip(value: Boolean): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
  }
}
