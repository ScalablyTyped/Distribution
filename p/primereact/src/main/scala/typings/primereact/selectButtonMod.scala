package typings.primereact

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectButtonMod {
  
  @JSImport("primereact/components/selectbutton/SelectButton", "SelectButton")
  @js.native
  class SelectButton protected ()
    extends Component[SelectButtonProps, js.Any, js.Any] {
    def this(props: SelectButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectButtonProps, context: js.Any) = this()
  }
  
  trait SelectButtonProps extends StObject {
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataKey: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var itemTemplate: js.UndefOr[js.Function1[/* option */ js.Any, ReactNode]] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
    
    var optionDisabled: js.UndefOr[String] = js.undefined
    
    var optionLabel: js.UndefOr[String] = js.undefined
    
    var optionValue: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[js.Any] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object SelectButtonProps {
    
    inline def apply(): SelectButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectButtonProps]
    }
    
    extension [Self <: SelectButtonProps](x: Self) {
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemTemplate(value: /* option */ js.Any => ReactNode): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(value: /* e */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptionDisabled(value: String): Self = StObject.set(x, "optionDisabled", value.asInstanceOf[js.Any])
      
      inline def setOptionDisabledUndefined: Self = StObject.set(x, "optionDisabled", js.undefined)
      
      inline def setOptionLabel(value: String): Self = StObject.set(x, "optionLabel", value.asInstanceOf[js.Any])
      
      inline def setOptionLabelUndefined: Self = StObject.set(x, "optionLabel", js.undefined)
      
      inline def setOptionValue(value: String): Self = StObject.set(x, "optionValue", value.asInstanceOf[js.Any])
      
      inline def setOptionValueUndefined: Self = StObject.set(x, "optionValue", js.undefined)
      
      inline def setOptions(value: js.Array[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
