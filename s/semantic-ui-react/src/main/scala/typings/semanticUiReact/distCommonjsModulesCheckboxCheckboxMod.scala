package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.FormEvent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactStrings.checkbox
import typings.semanticUiReact.semanticUiReactStrings.radio
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesCheckboxCheckboxMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox/Checkbox", JSImport.Default)
  @js.native
  open class default protected () extends Component[CheckboxProps, ComponentState, Any] {
    def this(props: CheckboxProps) = this()
    def this(props: CheckboxProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox/Checkbox", JSImport.Default)
  @js.native
  val default: ComponentClass[CheckboxProps, ComponentState] = js.native
  
  trait CheckboxProps
    extends StObject
       with StrictCheckboxProps
       with /* key */ StringDictionary[Any]
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
  }
  
  trait StrictCheckboxProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Whether or not checkbox is indeterminate. */
    var defaultIndeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** Removes padding for a label. Auto applied when there is no label. */
    var fitted: js.UndefOr[Boolean] = js.undefined
    
    /** A unique identifier. */
    @JSName("id")
    var id_StrictCheckboxProps: js.UndefOr[Double | String] = js.undefined
    
    /** Whether or not checkbox is indeterminate. */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** The text of the associated label element. */
    var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.undefined
    
    /**
      * Called when the user attempts to change the checked state.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed checked/indeterminate state.
      */
    @JSName("onChange")
    var onChange_StrictCheckboxProps: js.UndefOr[
        js.Function2[/* event */ FormEvent[HTMLInputElement], /* data */ CheckboxProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the checkbox or label is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    @JSName("onClick")
    var onClick_StrictCheckboxProps: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], 
          /* data */ CheckboxProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called when the user presses down on the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    @JSName("onMouseDown")
    var onMouseDown_StrictCheckboxProps: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], 
          /* data */ CheckboxProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called when the user releases the mouse.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and current checked/indeterminate state.
      */
    @JSName("onMouseUp")
    var onMouseUp_StrictCheckboxProps: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], 
          /* data */ CheckboxProps, 
          Unit
        ]
      ] = js.undefined
    
    /** Format as a radio element. This means it is an exclusive option. */
    var radio: js.UndefOr[Boolean] = js.undefined
    
    /** Format to emphasize the current selection state. */
    var slider: js.UndefOr[Boolean] = js.undefined
    
    /** A checkbox can receive focus. */
    @JSName("tabIndex")
    var tabIndex_StrictCheckboxProps: js.UndefOr[Double | String] = js.undefined
    
    /** Format to show an on or off choice. */
    var toggle: js.UndefOr[Boolean] = js.undefined
    
    /** HTML input type, either checkbox or radio. */
    @JSName("type")
    var type_StrictCheckboxProps: js.UndefOr[checkbox | radio] = js.undefined
    
    /** The HTML input value. */
    @JSName("value")
    var value_StrictCheckboxProps: js.UndefOr[Double | String] = js.undefined
  }
  object StrictCheckboxProps {
    
    inline def apply(): StrictCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictCheckboxProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setDefaultIndeterminate(value: Boolean): Self = StObject.set(x, "defaultIndeterminate", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndeterminateUndefined: Self = StObject.set(x, "defaultIndeterminate", js.undefined)
      
      inline def setFitted(value: Boolean): Self = StObject.set(x, "fitted", value.asInstanceOf[js.Any])
      
      inline def setFittedUndefined: Self = StObject.set(x, "fitted", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction3(
        value: (/* component */ ElementType[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: (/* event */ FormEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(
        value: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseDown(
        value: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit
      ): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseUp(
        value: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit
      ): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction2(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
      
      inline def setSlider(value: Boolean): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setType(value: checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComponentClass[CheckboxProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesCheckboxCheckboxMod.foo` */
  override def _to: ComponentClass[CheckboxProps, ComponentState] = default
}
