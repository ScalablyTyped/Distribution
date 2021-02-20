package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cvv extends StObject {
  
  /**
    * Placeholder content for the card verification value input.
    */
  var cvv: js.UndefOr[String] = js.native
  
  /**
    * Placeholder content for the expiry input.
    */
  var expiry: js.UndefOr[String] = js.native
  
  /**
    * Placeholder content (e.g. 'Card number', 'CVV')
    */
  var number: js.UndefOr[String] = js.native
}
object Cvv {
  
  @scala.inline
  def apply(): Cvv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvv]
  }
  
  @scala.inline
  implicit class CvvMutableBuilder[Self <: Cvv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    @scala.inline
    def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
