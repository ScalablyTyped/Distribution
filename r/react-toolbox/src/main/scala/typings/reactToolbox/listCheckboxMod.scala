package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listCheckboxMod {
  
  @JSImport("react-toolbox/components/list/ListCheckbox", "ListCheckbox")
  @js.native
  open class ListCheckbox protected ()
    extends Component[ListCheckboxProps, js.Object, Any] {
    def this(props: ListCheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListCheckboxProps, context: Any) = this()
  }
  
  trait ListCheckboxProps
    extends StObject
       with Props {
    
    /**
      * Main text of the item. Required.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * If true the checkbox appears checked by default.
      * @default false
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the item is displayed as disabled and it's not clickable.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Secondary text to display under the caption.
      */
    var legend: js.UndefOr[String] = js.undefined
    
    /**
      * Name for the checkbox input item.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback called when the input element is blurred.
      */
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the input element is changed.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the input element is focused.
      */
    var onFocus: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[ListCheckboxTheme] = js.undefined
  }
  object ListCheckboxProps {
    
    inline def apply(): ListCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListCheckboxProps]
    }
    
    extension [Self <: ListCheckboxProps](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setTheme(value: ListCheckboxTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListCheckboxTheme extends StObject {
    
    /**
      * Used as a wrapper class for the subheader element.
      */
    var checkbox: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the checkbox element.
      */
    var checkboxItem: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the inner content if its a disabled item.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the inner content of a list item.
      */
    var item: js.UndefOr[String] = js.undefined
  }
  object ListCheckboxTheme {
    
    inline def apply(): ListCheckboxTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListCheckboxTheme]
    }
    
    extension [Self <: ListCheckboxTheme](x: Self) {
      
      inline def setCheckbox(value: String): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCheckboxItem(value: String): Self = StObject.set(x, "checkboxItem", value.asInstanceOf[js.Any])
      
      inline def setCheckboxItemUndefined: Self = StObject.set(x, "checkboxItem", js.undefined)
      
      inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
}
