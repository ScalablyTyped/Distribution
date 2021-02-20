package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserResponse extends StObject {
  
  var Id: String = js.native
  
  var email: String = js.native
  
  var emailVerified: Boolean = js.native
}
object CreateUserResponse {
  
  @scala.inline
  def apply(Id: String, email: String, emailVerified: Boolean): CreateUserResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserResponse]
  }
  
  @scala.inline
  implicit class CreateUserResponseMutableBuilder[Self <: CreateUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
