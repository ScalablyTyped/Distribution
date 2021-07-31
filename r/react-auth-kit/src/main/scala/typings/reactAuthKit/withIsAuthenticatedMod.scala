package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withIsAuthenticatedMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withIsAuthenticated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P /* <: withAuthHeaderProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  trait withAuthHeaderProps extends StObject {
    
    var isAuth: String
  }
  object withAuthHeaderProps {
    
    @scala.inline
    def apply(isAuth: String): withAuthHeaderProps = {
      val __obj = js.Dynamic.literal(isAuth = isAuth.asInstanceOf[js.Any])
      __obj.asInstanceOf[withAuthHeaderProps]
    }
    
    @scala.inline
    implicit class withAuthHeaderPropsMutableBuilder[Self <: withAuthHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAuth(value: String): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
    }
  }
}
