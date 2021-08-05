package typings.reactNativeAuth0.mod

import typings.reactNativeAuth0.reactNativeAuth0Strings.code
import typings.reactNativeAuth0.reactNativeAuth0Strings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordlessWithEmailParams extends StObject {
  
  var authParams: js.UndefOr[AuthParams] = js.undefined
  
  var email: String
  
  var send: js.UndefOr[link | code] = js.undefined
}
object PasswordlessWithEmailParams {
  
  inline def apply(email: String): PasswordlessWithEmailParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessWithEmailParams]
  }
  
  extension [Self <: PasswordlessWithEmailParams](x: Self) {
    
    inline def setAuthParams(value: AuthParams): Self = StObject.set(x, "authParams", value.asInstanceOf[js.Any])
    
    inline def setAuthParamsUndefined: Self = StObject.set(x, "authParams", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setSend(value: link | code): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
  }
}
