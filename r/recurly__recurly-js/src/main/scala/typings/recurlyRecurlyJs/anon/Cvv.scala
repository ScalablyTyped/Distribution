package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvv extends StObject {
  
  /**
    * Placeholder content for the card verification value input.
    */
  var cvv: js.UndefOr[String] = js.undefined
  
  /**
    * Placeholder content for the expiry input.
    */
  var expiry: js.UndefOr[String] = js.undefined
  
  /**
    * Placeholder content (e.g. 'Card number', 'CVV')
    */
  var number: js.UndefOr[String] = js.undefined
}
object Cvv {
  
  inline def apply(): Cvv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvv]
  }
  
  extension [Self <: Cvv](x: Self) {
    
    inline def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
