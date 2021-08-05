package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordRealmParams extends StObject {
  
  var audience: js.UndefOr[String] = js.undefined
  
  var password: String
  
  var realm: String
  
  var scope: js.UndefOr[String] = js.undefined
  
  var username: String
}
object PasswordRealmParams {
  
  inline def apply(password: String, realm: String, username: String): PasswordRealmParams = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRealmParams]
  }
  
  extension [Self <: PasswordRealmParams](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
