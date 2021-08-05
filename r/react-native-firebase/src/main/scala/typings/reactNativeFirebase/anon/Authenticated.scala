package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authenticated extends StObject {
  
  var authenticated: Boolean
  
  var user: js.Object | Null
}
object Authenticated {
  
  inline def apply(authenticated: Boolean): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[Authenticated]
  }
  
  extension [Self <: Authenticated](x: Self) {
    
    inline def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
    
    inline def setUser(value: js.Object): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
