package typings.reactNavigationStack

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNavigationStack.anon.OnPageChangeCancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardManagerMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/KeyboardManager", JSImport.Default)
  @js.native
  open class default () extends KeyboardManager
  
  @js.native
  trait KeyboardManager
    extends Component[Props, js.Object, Any] {
    
    /* private */ var clearKeyboardTimeout: Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MKeyboardManager(): Unit = js.native
    
    /* private */ var handlePageChangeCancel: Any = js.native
    
    /* private */ var handlePageChangeConfirm: Any = js.native
    
    /* private */ var handlePageChangeStart: Any = js.native
    
    /* private */ var keyboardTimeout: Any = js.native
    
    /* private */ var previouslyFocusedTextInput: Any = js.native
    
    /* private */ var startTimestamp: Any = js.native
  }
  
  trait Props extends StObject {
    
    def children(props: OnPageChangeCancel): ReactNode
    
    var enabled: Boolean
  }
  object Props {
    
    inline def apply(children: OnPageChangeCancel => ReactNode, enabled: Boolean): Props = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: OnPageChangeCancel => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
