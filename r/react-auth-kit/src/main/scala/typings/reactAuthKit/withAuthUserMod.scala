package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAuthUserMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withAuthUser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P /* <: withAuthProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  trait withAuthProps extends StObject {
    
    var authState: js.Object | Null
  }
  object withAuthProps {
    
    @scala.inline
    def apply(): withAuthProps = {
      val __obj = js.Dynamic.literal(authState = null)
      __obj.asInstanceOf[withAuthProps]
    }
    
    @scala.inline
    implicit class withAuthPropsMutableBuilder[Self <: withAuthProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthState(value: js.Object): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthStateNull: Self = StObject.set(x, "authState", null)
    }
  }
}
