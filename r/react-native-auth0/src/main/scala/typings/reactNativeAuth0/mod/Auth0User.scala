package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0User[T] extends StObject {
  
  var created_at: String
  
  var email: String
  
  var emailVerified: Boolean
  
  var identities: js.Array[Any]
  
  var last_ip: js.UndefOr[String] = js.undefined
  
  var last_login: js.UndefOr[String] = js.undefined
  
  var logins_count: Double
  
  var name: String
  
  var nickname: String
  
  var picture: js.UndefOr[String] = js.undefined
  
  var updated_at: String
  
  var userId: String
  
  var userMetadata: js.UndefOr[T] = js.undefined
}
object Auth0User {
  
  inline def apply[T](
    created_at: String,
    email: String,
    emailVerified: Boolean,
    identities: js.Array[Any],
    logins_count: Double,
    name: String,
    nickname: String,
    updated_at: String,
    userId: String
  ): Auth0User[T] = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], logins_count = logins_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0User[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auth0User[?], T] (val x: Self & Auth0User[T]) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setIdentities(value: js.Array[Any]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Any*): Self = StObject.set(x, "identities", js.Array(value*))
    
    inline def setLast_ip(value: String): Self = StObject.set(x, "last_ip", value.asInstanceOf[js.Any])
    
    inline def setLast_ipUndefined: Self = StObject.set(x, "last_ip", js.undefined)
    
    inline def setLast_login(value: String): Self = StObject.set(x, "last_login", value.asInstanceOf[js.Any])
    
    inline def setLast_loginUndefined: Self = StObject.set(x, "last_login", js.undefined)
    
    inline def setLogins_count(value: Double): Self = StObject.set(x, "logins_count", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserMetadata(value: T): Self = StObject.set(x, "userMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserMetadataUndefined: Self = StObject.set(x, "userMetadata", js.undefined)
  }
}
