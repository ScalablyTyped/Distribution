package typings.reduxReactSession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducerMod {
  
  @JSImport("redux-react-session/reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(state: SessionState, action: Any): SessionState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[SessionState]
  
  trait SessionState extends StObject {
    
    var authenticated: Boolean
    
    var checked: Boolean
    
    var invalid: Boolean
    
    var user: Any
  }
  object SessionState {
    
    inline def apply(authenticated: Boolean, checked: Boolean, invalid: Boolean, user: Any): SessionState = {
      val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SessionState] (val x: Self) extends AnyVal {
      
      inline def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
