package typings.primereact

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait MultiSelectProps extends StObject {
    
    var appendTo: js.UndefOr[HTMLElement] = js.native
    
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dataKey: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var emptyFilterMessage: js.UndefOr[js.Any] = js.native
    
    var filter: js.UndefOr[Boolean] = js.native
    
    var filterBy: js.UndefOr[String] = js.native
    
    var filterLocale: js.UndefOr[String] = js.native
    
    var filterMatchMode: js.UndefOr[String] = js.native
    
    var filterPlaceholder: js.UndefOr[String] = js.native
    
    var fixedPlaceholder: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inputId: js.UndefOr[String] = js.native
    
    var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
    
    var maxSelectedLabels: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var optionLabel: js.UndefOr[String] = js.native
    
    var optionValue: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[js.Array[_]] = js.native
    
    var panelClassName: js.UndefOr[String] = js.native
    
    var panelStyle: js.UndefOr[js.Object] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resetFilterOnHide: js.UndefOr[Boolean] = js.native
    
    var scrollHeight: js.UndefOr[String] = js.native
    
    var selectedItemTemplate: js.UndefOr[js.Function1[/* value */ js.Any, js.UndefOr[Element]]] = js.native
    
    var selectedItemsLabel: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var tabIndex: js.UndefOr[Boolean] = js.native
    
    var tooltip: js.UndefOr[js.Any] = js.native
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object MultiSelectProps {
    
    @scala.inline
    def apply(): MultiSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSelectProps]
    }
    
    @scala.inline
    implicit class MultiSelectPropsMutableBuilder[Self <: MultiSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEmptyFilterMessage(value: js.Any): Self = StObject.set(x, "emptyFilterMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyFilterMessageUndefined: Self = StObject.set(x, "emptyFilterMessage", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterBy(value: String): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      @scala.inline
      def setFilterLocale(value: String): Self = StObject.set(x, "filterLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterLocaleUndefined: Self = StObject.set(x, "filterLocale", js.undefined)
      
      @scala.inline
      def setFilterMatchMode(value: String): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
      
      @scala.inline
      def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFixedPlaceholder(value: Boolean): Self = StObject.set(x, "fixedPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedPlaceholderUndefined: Self = StObject.set(x, "fixedPlaceholder", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setMaxSelectedLabels(value: Double): Self = StObject.set(x, "maxSelectedLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSelectedLabelsUndefined: Self = StObject.set(x, "maxSelectedLabels", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOptionLabel(value: String): Self = StObject.set(x, "optionLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionLabelUndefined: Self = StObject.set(x, "optionLabel", js.undefined)
      
      @scala.inline
      def setOptionValue(value: String): Self = StObject.set(x, "optionValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionValueUndefined: Self = StObject.set(x, "optionValue", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      @scala.inline
      def setPanelStyle(value: js.Object): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResetFilterOnHide(value: Boolean): Self = StObject.set(x, "resetFilterOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetFilterOnHideUndefined: Self = StObject.set(x, "resetFilterOnHide", js.undefined)
      
      @scala.inline
      def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      @scala.inline
      def setSelectedItemTemplate(value: /* value */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "selectedItemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectedItemTemplateUndefined: Self = StObject.set(x, "selectedItemTemplate", js.undefined)
      
      @scala.inline
      def setSelectedItemsLabel(value: String): Self = StObject.set(x, "selectedItemsLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsLabelUndefined: Self = StObject.set(x, "selectedItemsLabel", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Boolean): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
