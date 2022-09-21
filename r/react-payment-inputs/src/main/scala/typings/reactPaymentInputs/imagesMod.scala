package typings.reactPaymentInputs

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagesMod {
  
  @JSImport("react-payment-inputs/images", "images")
  @js.native
  val images: CardImages = js.native
  
  trait CardImages extends StObject {
    
    var amex: ReactElement
    
    var dinersclub: ReactElement
    
    var discover: ReactElement
    
    var hipercard: ReactElement
    
    var jcb: ReactElement
    
    var mastercard: ReactElement
    
    var placeholder: ReactElement
    
    var unionpay: ReactElement
    
    var visa: ReactElement
  }
  object CardImages {
    
    inline def apply(
      amex: ReactElement,
      dinersclub: ReactElement,
      discover: ReactElement,
      hipercard: ReactElement,
      jcb: ReactElement,
      mastercard: ReactElement,
      placeholder: ReactElement,
      unionpay: ReactElement,
      visa: ReactElement
    ): CardImages = {
      val __obj = js.Dynamic.literal(amex = amex.asInstanceOf[js.Any], dinersclub = dinersclub.asInstanceOf[js.Any], discover = discover.asInstanceOf[js.Any], hipercard = hipercard.asInstanceOf[js.Any], jcb = jcb.asInstanceOf[js.Any], mastercard = mastercard.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], unionpay = unionpay.asInstanceOf[js.Any], visa = visa.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardImages]
    }
    
    extension [Self <: CardImages](x: Self) {
      
      inline def setAmex(value: ReactElement): Self = StObject.set(x, "amex", value.asInstanceOf[js.Any])
      
      inline def setDinersclub(value: ReactElement): Self = StObject.set(x, "dinersclub", value.asInstanceOf[js.Any])
      
      inline def setDiscover(value: ReactElement): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
      
      inline def setHipercard(value: ReactElement): Self = StObject.set(x, "hipercard", value.asInstanceOf[js.Any])
      
      inline def setJcb(value: ReactElement): Self = StObject.set(x, "jcb", value.asInstanceOf[js.Any])
      
      inline def setMastercard(value: ReactElement): Self = StObject.set(x, "mastercard", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: ReactElement): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setUnionpay(value: ReactElement): Self = StObject.set(x, "unionpay", value.asInstanceOf[js.Any])
      
      inline def setVisa(value: ReactElement): Self = StObject.set(x, "visa", value.asInstanceOf[js.Any])
    }
  }
}
