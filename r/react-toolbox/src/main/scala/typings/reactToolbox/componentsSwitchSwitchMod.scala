package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSwitchSwitchMod {
  
  @JSImport("react-toolbox/components/switch/Switch", JSImport.Default)
  @js.native
  open class default protected () extends Switch {
    def this(props: SwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/switch/Switch", "Switch")
  @js.native
  open class Switch protected ()
    extends Component[SwitchProps, js.Object, Any] {
    def this(props: SwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: Any) = this()
  }
  
  trait SwitchProps
    extends StObject
       with Props {
    
    /**
      * If true, the switch will be enabled.
      * @default false
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, component will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The text string to use for the floating label element.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * The text string used as name of the input.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback function that is fired when when the switch is blurred.
      */
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when the component's value changes.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when the switch is focused.
      */
    var onFocus: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[SwitchTheme] = js.undefined
  }
  object SwitchProps {
    
    inline def apply(): SwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchProps]
    }
    
    extension [Self <: SwitchProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setTheme(value: SwitchTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait SwitchTheme extends StObject {
    
    /**
      * Used for the root element if the component is disabled.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element if the component is not disabled.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the input element.
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Used for a wrapper around the thumb if checked is false.
      */
    var off: js.UndefOr[String] = js.undefined
    
    /**
      * Used for a wrapper around the thumb if checked is true.
      */
    var on: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the ripple inside the switch.
      */
    var ripple: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the text label element.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the thumb element.
      */
    var thumb: js.UndefOr[String] = js.undefined
  }
  object SwitchTheme {
    
    inline def apply(): SwitchTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchTheme]
    }
    
    extension [Self <: SwitchTheme](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setOff(value: String): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setRipple(value: String): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    }
  }
}
