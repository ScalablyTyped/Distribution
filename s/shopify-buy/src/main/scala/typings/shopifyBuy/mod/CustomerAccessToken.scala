package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerAccessToken extends StObject {
  
  var accessToken: String
  
  var expiresAt: DateTime
}
object CustomerAccessToken {
  
  inline def apply(accessToken: String, expiresAt: DateTime): CustomerAccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerAccessToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerAccessToken] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setExpiresAt(value: DateTime): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
  }
}
