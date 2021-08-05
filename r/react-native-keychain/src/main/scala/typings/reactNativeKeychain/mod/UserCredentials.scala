package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserCredentials
  extends StObject
     with Result {
  
  var password: String
  
  var username: String
}
object UserCredentials {
  
  inline def apply(password: String, service: String, storage: String, username: String): UserCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredentials]
  }
  
  extension [Self <: UserCredentials](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
