package typings.reactSelect

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nonceProviderMod {
  
  @JSImport("react-select/src/NonceProvider", "NonceProvider")
  @js.native
  class NonceProvider protected ()
    extends Component[NonceProviderProps, js.Object, js.Any] {
    def this(props: NonceProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NonceProviderProps, context: js.Any) = this()
  }
  
  @js.native
  trait NonceProviderProps extends StObject {
    
    var nonce: String = js.native
  }
  object NonceProviderProps {
    
    @scala.inline
    def apply(nonce: String): NonceProviderProps = {
      val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonceProviderProps]
    }
    
    @scala.inline
    implicit class NonceProviderPropsMutableBuilder[Self <: NonceProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
}
