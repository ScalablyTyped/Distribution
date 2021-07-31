package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSignOutMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withSignOut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P /* <: withSignOutProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  trait withSignOutProps extends StObject {
    
    def signOut(): Boolean
  }
  object withSignOutProps {
    
    @scala.inline
    def apply(signOut: () => Boolean): withSignOutProps = {
      val __obj = js.Dynamic.literal(signOut = js.Any.fromFunction0(signOut))
      __obj.asInstanceOf[withSignOutProps]
    }
    
    @scala.inline
    implicit class withSignOutPropsMutableBuilder[Self <: withSignOutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignOut(value: () => Boolean): Self = StObject.set(x, "signOut", js.Any.fromFunction0(value))
    }
  }
}
