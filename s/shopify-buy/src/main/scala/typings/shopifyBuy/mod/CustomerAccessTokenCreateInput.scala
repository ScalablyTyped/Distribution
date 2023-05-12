package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerAccessTokenCreateInput extends StObject {
  
  var email: String
  
  var password: String
}
object CustomerAccessTokenCreateInput {
  
  inline def apply(email: String, password: String): CustomerAccessTokenCreateInput = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerAccessTokenCreateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerAccessTokenCreateInput] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
