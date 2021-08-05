package typings.primereact

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectMod {
  
  @JSImport("primereact/components/multiselect/MultiSelect", "MultiSelect")
  @js.native
  class MultiSelect protected ()
    extends Component[MultiSelectProps, js.Any, js.Any] {
    def this(props: MultiSelectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MultiSelectProps, context: js.Any) = this()
  }
  
  trait MultiSelectProps extends StObject {
    
    var appendTo: js.UndefOr[HTMLElement] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataKey: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var emptyFilterMessage: js.UndefOr[js.Any] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var filterBy: js.UndefOr[String] = js.undefined
    
    var filterLocale: js.UndefOr[String] = js.undefined
    
    var filterMatchMode: js.UndefOr[String] = js.undefined
    
    var filterPlaceholder: js.UndefOr[String] = js.undefined
    
    var fixedPlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputId: js.UndefOr[String] = js.undefined
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
    
    var maxSelectedLabels: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var optionLabel: js.UndefOr[String] = js.undefined
    
    var optionValue: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var panelClassName: js.UndefOr[String] = js.undefined
    
    var panelStyle: js.UndefOr[js.Object] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var resetFilterOnHide: js.UndefOr[Boolean] = js.undefined
    
    var scrollHeight: js.UndefOr[String] = js.undefined
    
    var selectedItemTemplate: js.UndefOr[js.Function1[/* value */ js.Any, js.UndefOr[Element]]] = js.undefined
    
    var selectedItemsLabel: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[Boolean] = js.undefined
    
    var tooltip: js.UndefOr[js.Any] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object MultiSelectProps {
    
    inline def apply(): MultiSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSelectProps]
    }
    
    extension [Self <: MultiSelectProps](x: Self) {
      
      inline def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEmptyFilterMessage(value: js.Any): Self = StObject.set(x, "emptyFilterMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyFilterMessageUndefined: Self = StObject.set(x, "emptyFilterMessage", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterBy(value: String): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      inline def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      inline def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      inline def setFilterMatchMode(value: String): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
      
      inline def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
      
      inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFixedPlaceholder(value: Boolean): Self = StObject.set(x, "fixedPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFixedPlaceholderUndefined: Self = StObject.set(x, "fixedPlaceholder", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setMaxSelectedLabels(value: Double): Self = StObject.set(x, "maxSelectedLabels", value.asInstanceOf[js.Any])
      
      inline def setMaxSelectedLabelsUndefined: Self = StObject.set(x, "maxSelectedLabels", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* event */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* event */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOptionLabel(value: String): Self = StObject.set(x, "optionLabel", value.asInstanceOf[js.Any])
      
      inline def setOptionLabelUndefined: Self = StObject.set(x, "optionLabel", js.undefined)
      
      inline def setOptionValue(value: String): Self = StObject.set(x, "optionValue", value.asInstanceOf[js.Any])
      
      inline def setOptionValueUndefined: Self = StObject.set(x, "optionValue", js.undefined)
      
      inline def setOptions(value: js.Array[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      inline def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      inline def setPanelStyle(value: js.Object): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      inline def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResetFilterOnHide(value: Boolean): Self = StObject.set(x, "resetFilterOnHide", value.asInstanceOf[js.Any])
      
      inline def setResetFilterOnHideUndefined: Self = StObject.set(x, "resetFilterOnHide", js.undefined)
      
      inline def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      inline def setSelectedItemTemplate(value: /* value */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "selectedItemTemplate", js.Any.fromFunction1(value))
      
      inline def setSelectedItemTemplateUndefined: Self = StObject.set(x, "selectedItemTemplate", js.undefined)
      
      inline def setSelectedItemsLabel(value: String): Self = StObject.set(x, "selectedItemsLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsLabelUndefined: Self = StObject.set(x, "selectedItemsLabel", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Boolean): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
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
