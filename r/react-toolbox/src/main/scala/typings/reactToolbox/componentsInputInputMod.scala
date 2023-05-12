package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsInputInputMod {
  
  @JSImport("react-toolbox/components/input/Input", JSImport.Default)
  @js.native
  open class default protected () extends Input {
    def this(props: InputProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: InputProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/input/Input", "Input")
  @js.native
  open class Input protected ()
    extends Component[InputProps, js.Object, Any] {
    def this(props: InputProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: InputProps, context: Any) = this()
    
    /**
      * Used to blur the input element.
      */
    def blur(): Unit = js.native
    
    /**
      * Used to focus the input element.
      */
    def focus(): Unit = js.native
  }
  
  trait InputProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, component will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Give an error node to display under the field.
      */
    var error: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Indicates if the label is floating in the input field or not.
      * @default true
      */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The text string to use for hint text element.
      */
    var hint: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Name of an icon to use as a label for the input.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The text string to use for the floating label element.
      */
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Specifies the maximum number of characters allowed in the component
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, a textarea element will be rendered. The textarea also grows and shrinks according to the number of lines.
      * @default false
      */
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name for the input field.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback function that is fired when component is blurred.
      */
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when the component's value changes
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when component is focused.
      */
    var onFocus: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when a key is pressed down.
      */
    var onKeyDown: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when a key is pressed.
      */
    var onKeyPress: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when a key is released.
      */
    var onKeyUp: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, the html input has a required attribute.
      * @default false
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of rows the multiline input field has.
      */
    var rows: js.UndefOr[Double] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[InputTheme] = js.undefined
    
    /**
      * Type of the input element. It can be a valid HTML5 input type.
      * @default "text"
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Current value of the input element.
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setHint(value: ReactNode): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: js.Function): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: js.Function): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnKeyUp(value: js.Function): Self = StObject.set(x, "onKeyUp", value.asInstanceOf[js.Any])
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setTheme(value: InputTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait InputTheme extends StObject {
    
    /**
      * Used for the bar under the input.
      */
    var bar: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the counter element.
      */
    var counter: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root class when input is disabled.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the text error.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root class when input is errored.
      */
    var errored: js.UndefOr[String] = js.undefined
    
    /**
      * Used when the input is hidden.
      */
    var hidden: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the hint text.
      */
    var hint: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the icon in case the input has icon.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Used as root class for the component.
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the HTML input element.
      */
    var inputElement: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the label when the input has a label.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Used in case the input is required.
      */
    var required: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root class if the input has icon.
      */
    var withIcon: js.UndefOr[String] = js.undefined
  }
  object InputTheme {
    
    inline def apply(): InputTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputTheme] (val x: Self) extends AnyVal {
      
      inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      inline def setCounter(value: String): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrored(value: String): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputElement(value: String): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      inline def setInputElementUndefined: Self = StObject.set(x, "inputElement", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setWithIcon(value: String): Self = StObject.set(x, "withIcon", value.asInstanceOf[js.Any])
      
      inline def setWithIconUndefined: Self = StObject.set(x, "withIcon", js.undefined)
    }
  }
}
