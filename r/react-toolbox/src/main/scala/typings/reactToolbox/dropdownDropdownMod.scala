package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownDropdownMod {
  
  @JSImport("react-toolbox/components/dropdown/Dropdown", JSImport.Default)
  @js.native
  open class default protected () extends Dropdown {
    def this(props: DropdownProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DropdownProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/dropdown/Dropdown", "Dropdown")
  @js.native
  open class Dropdown protected ()
    extends Component[DropdownProps, js.Object, Any] {
    def this(props: DropdownProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DropdownProps, context: Any) = this()
  }
  
  trait DropdownProps
    extends StObject
       with Props {
    
    /**
      * If true the dropdown will preselect the first item if the supplied value matches none of the options' values.
      * @default true
      */
    var allowBlank: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the dropdown will open up or down depending on the position in the screen.
      * @default true
      */
    var auto: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the component as disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Give an error string to display under the field.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * The text string to use for the floating label element.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Used for setting the label from source
      */
    var labelKey: js.UndefOr[String] = js.undefined
    
    /**
      * Name for the input field.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback function that is fired when the component is blurred.
      */
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when the component's value changes.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback function that is fired when the component is focused.
      */
    var onFocus: js.UndefOr[js.Function] = js.undefined
    
    /**
      * If true, the dropdown has a required attribute.
      * @default false
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array of data objects with the data to represent in the dropdown.
      */
    var source: js.Array[Any]
    
    /**
      * Callback function that returns a JSX template to represent the element.
      */
    var template: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[DropdownTheme] = js.undefined
    
    /**
      * Default value using JSON data.
      */
    var value: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Used for setting the value from source
      */
    var valueKey: js.UndefOr[String] = js.undefined
  }
  object DropdownProps {
    
    inline def apply(source: js.Array[Any]): DropdownProps = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownProps]
    }
    
    extension [Self <: DropdownProps](x: Self) {
      
      inline def setAllowBlank(value: Boolean): Self = StObject.set(x, "allowBlank", value.asInstanceOf[js.Any])
      
      inline def setAllowBlankUndefined: Self = StObject.set(x, "allowBlank", js.undefined)
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSource(value: js.Array[Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceVarargs(value: Any*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setTemplate(value: js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTheme(value: DropdownTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DropdownTheme extends StObject {
    
    /**
      * Added to the root element when the dropdown is active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when it's disabled.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Root element class.
      */
    var dropdown: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the error element.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the inner wrapper if it's errored.
      */
    var errored: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the inner wrapper of the component.
      */
    var field: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the the label element.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Used when dropdown has required attribute.
      */
    var required: js.UndefOr[String] = js.undefined
    
    /**
      * Used to highlight the selected value.
      */
    var selected: js.UndefOr[String] = js.undefined
    
    /**
      * Used as a wrapper for the given template value.
      */
    var templateValue: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element when it's opening up.
      */
    var up: js.UndefOr[String] = js.undefined
    
    /**
      * Used for each value in the dropdown component.
      */
    var value: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the list of values.
      */
    var values: js.UndefOr[String] = js.undefined
  }
  object DropdownTheme {
    
    inline def apply(): DropdownTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownTheme]
    }
    
    extension [Self <: DropdownTheme](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrored(value: String): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTemplateValue(value: String): Self = StObject.set(x, "templateValue", value.asInstanceOf[js.Any])
      
      inline def setTemplateValueUndefined: Self = StObject.set(x, "templateValue", js.undefined)
      
      inline def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
