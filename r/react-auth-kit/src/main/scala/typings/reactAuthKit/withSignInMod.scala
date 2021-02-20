package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.reactAuthKit.typesMod.signInFunctionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSignInMod {
  
  @JSImport("react-auth-kit/higherOrderComponents/withSignIn", JSImport.Default)
  @js.native
  def default[P /* <: withSignInProps */](Component: ComponentType[P]): FC[P] = js.native
  
  @js.native
  trait withSignInProps extends StObject {
    
    def signIn(params: signInFunctionParams): Boolean = js.native
  }
  object withSignInProps {
    
    @scala.inline
    def apply(signIn: signInFunctionParams => Boolean): withSignInProps = {
      val __obj = js.Dynamic.literal(signIn = js.Any.fromFunction1(signIn))
      __obj.asInstanceOf[withSignInProps]
    }
    
    @scala.inline
    implicit class withSignInPropsMutableBuilder[Self <: withSignInProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignIn(value: signInFunctionParams => Boolean): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
    }
  }
}
