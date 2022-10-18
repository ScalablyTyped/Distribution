package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.reactAuthKit.distTypesMod.AuthStateUserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHigherOrderComponentsWithAuthUserMod {
  
  @JSImport("react-auth-kit/dist/higherOrderComponents/withAuthUser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @function
    * @name withAuthUser
    * @description Inject Authenticated User's state inside the Component's Prop
    * @param Component
    */
  inline def default[P /* <: withAuthProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @interface withAuthProps
    */
  trait withAuthProps extends StObject {
    
    var authState: AuthStateUserObject | Null
  }
  object withAuthProps {
    
    inline def apply(): withAuthProps = {
      val __obj = js.Dynamic.literal(authState = null)
      __obj.asInstanceOf[withAuthProps]
    }
    
    extension [Self <: withAuthProps](x: Self) {
      
      inline def setAuthState(value: AuthStateUserObject): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      inline def setAuthStateNull: Self = StObject.set(x, "authState", null)
    }
  }
}
