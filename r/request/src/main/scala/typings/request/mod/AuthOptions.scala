package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthOptions extends StObject {
  
  var bearer: js.UndefOr[String | js.Function0[String]] = js.native
  
  var pass: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var sendImmediately: js.UndefOr[Boolean] = js.native
  
  var user: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object AuthOptions {
  
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearer(value: String | js.Function0[String]): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearerFunction0(value: () => String): Self = StObject.set(x, "bearer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
    
    @scala.inline
    def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSendImmediately(value: Boolean): Self = StObject.set(x, "sendImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendImmediatelyUndefined: Self = StObject.set(x, "sendImmediately", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
