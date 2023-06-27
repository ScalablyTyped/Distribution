package typings.sendsayApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Login extends StObject {
    
    var login: String
    
    var password: String
    
    var sublogin: js.UndefOr[String] = js.undefined
  }
  object Login {
    
    inline def apply(login: String, password: String): Login = {
      val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Login]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Login] (val x: Self) extends AnyVal {
      
      inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setSublogin(value: String): Self = StObject.set(x, "sublogin", value.asInstanceOf[js.Any])
      
      inline def setSubloginUndefined: Self = StObject.set(x, "sublogin", js.undefined)
    }
  }
}
