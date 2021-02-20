package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCredentials extends Result {
  
  var password: String = js.native
  
  var username: String = js.native
}
object UserCredentials {
  
  @scala.inline
  def apply(password: String, service: String, storage: String, username: String): UserCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredentials]
  }
  
  @scala.inline
  implicit class UserCredentialsMutableBuilder[Self <: UserCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
