package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHigherOrderComponentsWithSignOutMod {
  
  @JSImport("react-auth-kit/dist/higherOrderComponents/withSignOut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @public
    * @function
    * @name withSignOut
    * @description Inject sign Out functionality inside the Component's Prop
    * @param Component
    */
  inline def default[P /* <: withSignOutProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @interface withSignOutProps
    */
  trait withSignOutProps extends StObject {
    
    def signOut(): Boolean
  }
  object withSignOutProps {
    
    inline def apply(signOut: () => Boolean): withSignOutProps = {
      val __obj = js.Dynamic.literal(signOut = js.Any.fromFunction0(signOut))
      __obj.asInstanceOf[withSignOutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: withSignOutProps] (val x: Self) extends AnyVal {
      
      inline def setSignOut(value: () => Boolean): Self = StObject.set(x, "signOut", js.Any.fromFunction0(value))
    }
  }
}
