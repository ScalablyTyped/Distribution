package typings.reactVirtualKeyboard

import typings.react.mod.Component
import typings.std.Element
import typings.std.Event
import typings.virtualKeyboard.mod.KeyboardOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-virtual-keyboard", JSImport.Default)
  @js.native
  class default ()
    extends Component[KeyboardProps, KeyboardState, js.Any]
  
  type Keyboard = Component[KeyboardProps, KeyboardState, js.Any]
  
  trait KeyboardProps extends StObject {
    
    var callbackParent: js.UndefOr[kbEvents] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onAccepted: js.UndefOr[kbEvents] = js.undefined
    
    var onChange: js.UndefOr[kbEvents] = js.undefined
    
    var options: js.UndefOr[ReactKeyboardOptions] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object KeyboardProps {
    
    inline def apply(): KeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardProps]
    }
    
    extension [Self <: KeyboardProps](x: Self) {
      
      inline def setCallbackParent(
        value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "callbackParent", js.Any.fromFunction3(value))
      
      inline def setCallbackParentUndefined: Self = StObject.set(x, "callbackParent", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAccepted(
        value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "onAccepted", js.Any.fromFunction3(value))
      
      inline def setOnAcceptedUndefined: Self = StObject.set(x, "onAccepted", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: ReactKeyboardOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait KeyboardState extends StObject {
    
    var className: String
    
    var value: String
  }
  object KeyboardState {
    
    inline def apply(className: String, value: String): KeyboardState = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardState]
    }
    
    extension [Self <: KeyboardState](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReactKeyboardOptions
    extends StObject
       with KeyboardOptions {
    
    @JSName("accepted")
    var accepted_ReactKeyboardOptions: Unit
  }
  object ReactKeyboardOptions {
    
    inline def apply(accepted: Unit, `type`: String): ReactKeyboardOptions = {
      val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactKeyboardOptions]
    }
    
    extension [Self <: ReactKeyboardOptions](x: Self) {
      
      inline def setAccepted(value: Unit): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    }
  }
  
  type kbEvents = js.Function3[
    /* event */ js.UndefOr[String | Event], 
    /* keyboard */ js.UndefOr[Element], 
    /* el */ js.UndefOr[Element], 
    Unit
  ]
}
