package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerCreateInput extends StObject {
  
  var acceptsMarketing: js.UndefOr[Boolean] = js.undefined
  
  var email: String
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var password: String
  
  var phone: js.UndefOr[String] = js.undefined
}
object CustomerCreateInput {
  
  inline def apply(email: String, password: String): CustomerCreateInput = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerCreateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerCreateInput] (val x: Self) extends AnyVal {
    
    inline def setAcceptsMarketing(value: Boolean): Self = StObject.set(x, "acceptsMarketing", value.asInstanceOf[js.Any])
    
    inline def setAcceptsMarketingUndefined: Self = StObject.set(x, "acceptsMarketing", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
  }
}
