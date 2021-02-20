package typings.reactNavigationStack

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNavigationStack.anon.OnPageChangeCancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardManagerMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/KeyboardManager", JSImport.Default)
  @js.native
  class default () extends KeyboardManager
  
  @js.native
  trait KeyboardManager
    extends Component[Props, js.Object, js.Any] {
    
    var clearKeyboardTimeout: js.Any = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MKeyboardManager(): Unit = js.native
    
    var handlePageChangeCancel: js.Any = js.native
    
    var handlePageChangeConfirm: js.Any = js.native
    
    var handlePageChangeStart: js.Any = js.native
    
    var keyboardTimeout: js.Any = js.native
    
    var previouslyFocusedTextInput: js.Any = js.native
    
    var startTimestamp: js.Any = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    def children(props: OnPageChangeCancel): ReactNode = js.native
    
    var enabled: Boolean = js.native
  }
  object Props {
    
    @scala.inline
    def apply(children: OnPageChangeCancel => ReactNode, enabled: Boolean): Props = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: OnPageChangeCancel => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
}
