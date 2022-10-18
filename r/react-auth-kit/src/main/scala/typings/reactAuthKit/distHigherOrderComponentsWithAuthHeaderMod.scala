package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHigherOrderComponentsWithAuthHeaderMod {
  
  @JSImport("react-auth-kit/dist/higherOrderComponents/withAuthHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @public
    * @function
    * @name withAuthHeader
    * @description Inject Authentication Header inside the Component's Prop
    * @param Component - React Component
    */
  inline def default[P /* <: withAuthHeaderProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @interface withAuthHeaderProps
    */
  trait withAuthHeaderProps extends StObject {
    
    var authHeader: String
  }
  object withAuthHeaderProps {
    
    inline def apply(authHeader: String): withAuthHeaderProps = {
      val __obj = js.Dynamic.literal(authHeader = authHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[withAuthHeaderProps]
    }
    
    extension [Self <: withAuthHeaderProps](x: Self) {
      
      inline def setAuthHeader(value: String): Self = StObject.set(x, "authHeader", value.asInstanceOf[js.Any])
    }
  }
}
