package typings.reactVirtualKeyboard

import typings.react.mod.Component
import typings.std.Element
import typings.std.Event
import typings.virtualKeyboard.mod.KeyboardOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-virtual-keyboard", JSImport.Default)
  @js.native
  class default ()
    extends Component[KeyboardProps, KeyboardState, js.Any]
  
  type Keyboard = Component[KeyboardProps, KeyboardState, js.Any]
  
  @js.native
  trait KeyboardProps extends StObject {
    
    var callbackParent: js.UndefOr[kbEvents] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onAccepted: js.UndefOr[kbEvents] = js.native
    
    var onChange: js.UndefOr[kbEvents] = js.native
    
    var options: js.UndefOr[ReactKeyboardOptions] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object KeyboardProps {
    
    @scala.inline
    def apply(): KeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardProps]
    }
    
    @scala.inline
    implicit class KeyboardPropsMutableBuilder[Self <: KeyboardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackParent(
        value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "callbackParent", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackParentUndefined: Self = StObject.set(x, "callbackParent", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnAccepted(
        value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "onAccepted", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnAcceptedUndefined: Self = StObject.set(x, "onAccepted", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: ReactKeyboardOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait KeyboardState extends StObject {
    
    var className: String = js.native
    
    var value: String = js.native
  }
  object KeyboardState {
    
    @scala.inline
    def apply(className: String, value: String): KeyboardState = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardState]
    }
    
    @scala.inline
    implicit class KeyboardStateMutableBuilder[Self <: KeyboardState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactKeyboardOptions extends KeyboardOptions {
    
    @JSName("accepted")
    var accepted_ReactKeyboardOptions: js.UndefOr[scala.Nothing] = js.native
  }
  object ReactKeyboardOptions {
    
    @scala.inline
    def apply(`type`: String): ReactKeyboardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactKeyboardOptions]
    }
  }
  
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[String | Event], 
    /* keyboard */ js.UndefOr[Element], 
    /* el */ js.UndefOr[Element], 
    Unit
  ]
}
