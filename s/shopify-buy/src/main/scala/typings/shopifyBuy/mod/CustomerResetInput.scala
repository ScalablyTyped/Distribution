package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerResetInput extends StObject {
  
  var password: String
  
  var resetToken: String
}
object CustomerResetInput {
  
  inline def apply(password: String, resetToken: String): CustomerResetInput = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], resetToken = resetToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerResetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerResetInput] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setResetToken(value: String): Self = StObject.set(x, "resetToken", value.asInstanceOf[js.Any])
  }
}
