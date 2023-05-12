package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerActivateInput extends StObject {
  
  var activationToken: String
  
  var password: String
}
object CustomerActivateInput {
  
  inline def apply(activationToken: String, password: String): CustomerActivateInput = {
    val __obj = js.Dynamic.literal(activationToken = activationToken.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerActivateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerActivateInput] (val x: Self) extends AnyVal {
    
    inline def setActivationToken(value: String): Self = StObject.set(x, "activationToken", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
