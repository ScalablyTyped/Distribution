package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.reactAuthKit.typesMod.signInFunctionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSignInMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withSignIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: withSignInProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  trait withSignInProps extends StObject {
    
    def signIn(params: signInFunctionParams): Boolean
  }
  object withSignInProps {
    
    inline def apply(signIn: signInFunctionParams => Boolean): withSignInProps = {
      val __obj = js.Dynamic.literal(signIn = js.Any.fromFunction1(signIn))
      __obj.asInstanceOf[withSignInProps]
    }
    
    extension [Self <: withSignInProps](x: Self) {
      
      inline def setSignIn(value: signInFunctionParams => Boolean): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
    }
  }
}
