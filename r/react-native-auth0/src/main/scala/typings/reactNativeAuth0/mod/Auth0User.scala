package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0User[T] extends StObject {
  
  var created_at: String = js.native
  
  var email: String = js.native
  
  var emailVerified: Boolean = js.native
  
  var identities: js.Array[_] = js.native
  
  var last_ip: js.UndefOr[String] = js.native
  
  var last_login: js.UndefOr[String] = js.native
  
  var logins_count: Double = js.native
  
  var name: String = js.native
  
  var nickname: String = js.native
  
  var picture: js.UndefOr[String] = js.native
  
  var updated_at: String = js.native
  
  var userId: String = js.native
  
  var userMetadata: js.UndefOr[T] = js.native
}
object Auth0User {
  
  @scala.inline
  def apply[T](
    created_at: String,
    email: String,
    emailVerified: Boolean,
    identities: js.Array[_],
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
  implicit class Auth0UserMutableBuilder[Self <: Auth0User[_], T] (val x: Self with Auth0User[T]) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentities(value: js.Array[_]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesVarargs(value: js.Any*): Self = StObject.set(x, "identities", js.Array(value :_*))
    
    @scala.inline
    def setLast_ip(value: String): Self = StObject.set(x, "last_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_ipUndefined: Self = StObject.set(x, "last_ip", js.undefined)
    
    @scala.inline
    def setLast_login(value: String): Self = StObject.set(x, "last_login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_loginUndefined: Self = StObject.set(x, "last_login", js.undefined)
    
    @scala.inline
    def setLogins_count(value: Double): Self = StObject.set(x, "logins_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMetadata(value: T): Self = StObject.set(x, "userMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMetadataUndefined: Self = StObject.set(x, "userMetadata", js.undefined)
  }
}
