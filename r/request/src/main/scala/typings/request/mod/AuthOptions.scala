package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthOptions extends StObject {
  
  var bearer: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  var pass: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var sendImmediately: js.UndefOr[Boolean] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object AuthOptions {
  
  inline def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
    inline def setBearer(value: String | js.Function0[String]): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
    
    inline def setBearerFunction0(value: () => String): Self = StObject.set(x, "bearer", js.Any.fromFunction0(value))
    
    inline def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
    
    inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSendImmediately(value: Boolean): Self = StObject.set(x, "sendImmediately", value.asInstanceOf[js.Any])
    
    inline def setSendImmediatelyUndefined: Self = StObject.set(x, "sendImmediately", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
