package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withAuthHeaderMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withAuthHeader", JSImport.Default)
  @js.native
  def default[P /* <: withAuthHeaderProps */](Component: ComponentType[P]): FC[P] = js.native
  
  @js.native
  trait withAuthHeaderProps extends StObject {
    
    var authHeader: String = js.native
  }
  object withAuthHeaderProps {
    
    @scala.inline
    def apply(authHeader: String): withAuthHeaderProps = {
      val __obj = js.Dynamic.literal(authHeader = authHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[withAuthHeaderProps]
    }
    
    @scala.inline
    implicit class withAuthHeaderPropsMutableBuilder[Self <: withAuthHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthHeader(value: String): Self = StObject.set(x, "authHeader", value.asInstanceOf[js.Any])
    }
  }
}
