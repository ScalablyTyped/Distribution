package typings.reactInputMask

import typings.react.mod.Component
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-input-mask", JSImport.Default)
  @js.native
  open class default protected () extends ReactInputMask {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  @JSImport("react-input-mask", "ReactInputMask")
  @js.native
  open class ReactInputMask protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  
  trait BeforeMaskedStateChangeStates extends StObject {
    
    var currentState: InputState
    
    var nextState: InputState
    
    var previousState: InputState
  }
  object BeforeMaskedStateChangeStates {
    
    inline def apply(currentState: InputState, nextState: InputState, previousState: InputState): BeforeMaskedStateChangeStates = {
      val __obj = js.Dynamic.literal(currentState = currentState.asInstanceOf[js.Any], nextState = nextState.asInstanceOf[js.Any], previousState = previousState.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeMaskedStateChangeStates]
    }
    
    extension [Self <: BeforeMaskedStateChangeStates](x: Self) {
      
      inline def setCurrentState(value: InputState): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
      
      inline def setNextState(value: InputState): Self = StObject.set(x, "nextState", value.asInstanceOf[js.Any])
      
      inline def setPreviousState(value: InputState): Self = StObject.set(x, "previousState", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputState extends StObject {
    
    var selection: Selection | Null
    
    var value: String
  }
  object InputState {
    
    inline def apply(value: String): InputState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], selection = null)
      __obj.asInstanceOf[InputState]
    }
    
    extension [Self <: InputState](x: Self) {
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionNull: Self = StObject.set(x, "selection", null)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    /**
      * Show mask even in empty input without focus.
      */
    var alwaysShowMask: js.UndefOr[Boolean] = js.undefined
    
    /**
      * In case you need to implement more complex masking behavior, you can provide
      * beforeMaskedStateChange function to change masked value and cursor position
      * before it will be applied to the input.
      *
      * * previousState: Input state before change. Only defined on change event.
      * * currentState: Current raw input state. Not defined during component render.
      * * nextState: Input state with applied mask. Contains value and selection fields.
      */
    var beforeMaskedStateChange: js.UndefOr[js.Function1[/* states */ BeforeMaskedStateChangeStates, InputState]] = js.undefined
    
    /**
      * Use inputRef instead of ref if you need input node to manage focus, selection, etc.
      */
    var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    /**
      * Mask string. Format characters are:
      * * `9`: `0-9`
      * * `a`: `A-Z, a-z`
      * * `\*`: `A-Z, a-z, 0-9`
      *
      * Any character can be escaped with backslash, which usually will appear as double backslash in JS strings.
      * For example, German phone mask with unremoveable prefix +49 will look like `mask="+4\\9 99 999 99"` or `mask={"+4\\\\9 99 999 99"}`
      */
    var mask: String | (js.Array[String | js.RegExp])
    
    /**
      * Character to cover unfilled editable parts of mask. Default character is "_". If set to null, unfilled parts will be empty, like in ordinary input.
      */
    var maskChar: js.UndefOr[String | Null] = js.undefined
    
    var maskPlaceholder: js.UndefOr[String | Null] = js.undefined
  }
  object Props {
    
    inline def apply(mask: String | (js.Array[String | js.RegExp])): Props = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAlwaysShowMask(value: Boolean): Self = StObject.set(x, "alwaysShowMask", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowMaskUndefined: Self = StObject.set(x, "alwaysShowMask", js.undefined)
      
      inline def setBeforeMaskedStateChange(value: /* states */ BeforeMaskedStateChangeStates => InputState): Self = StObject.set(x, "beforeMaskedStateChange", js.Any.fromFunction1(value))
      
      inline def setBeforeMaskedStateChangeUndefined: Self = StObject.set(x, "beforeMaskedStateChange", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMask(value: String | (js.Array[String | js.RegExp])): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskChar(value: String): Self = StObject.set(x, "maskChar", value.asInstanceOf[js.Any])
      
      inline def setMaskCharNull: Self = StObject.set(x, "maskChar", null)
      
      inline def setMaskCharUndefined: Self = StObject.set(x, "maskChar", js.undefined)
      
      inline def setMaskPlaceholder(value: String): Self = StObject.set(x, "maskPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMaskPlaceholderNull: Self = StObject.set(x, "maskPlaceholder", null)
      
      inline def setMaskPlaceholderUndefined: Self = StObject.set(x, "maskPlaceholder", js.undefined)
      
      inline def setMaskVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "mask", js.Array(value*))
    }
  }
  
  trait Selection extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object Selection {
    
    inline def apply(end: Double, start: Double): Selection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selection]
    }
    
    extension [Self <: Selection](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
