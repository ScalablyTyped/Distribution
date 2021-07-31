package typings.primereact

import typings.primereact.anon.OriginalEvent
import typings.primereact.anon.Target
import typings.primereact.anon.Value
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteAutoCompleteMod {
  
  @JSImport("primereact/components/autocomplete/AutoComplete", "AutoComplete")
  @js.native
  class AutoComplete protected ()
    extends Component[AutoCompleteProps, js.Any, js.Any] {
    def this(props: AutoCompleteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutoCompleteProps, context: js.Any) = this()
  }
  
  trait AutoCompleteProps extends StObject {
    
    var appendTo: js.UndefOr[js.Any] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var completeMethod: js.UndefOr[js.Function1[/* e */ OriginalEvent, Unit]] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropdown: js.UndefOr[Boolean] = js.undefined
    
    var dropdownMode: js.UndefOr[String] = js.undefined
    
    var field: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var inputId: js.UndefOr[String] = js.undefined
    
    var inputStyle: js.UndefOr[js.Object] = js.undefined
    
    var itemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
    
    var maxlength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
    
    var onClear: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onContextMenu: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onDblClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onDropdownClick: js.UndefOr[js.Function1[/* e */ OriginalEvent, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var onUnselect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.undefined
    
    var panelClassName: js.UndefOr[String] = js.undefined
    
    var panelStyle: js.UndefOr[js.Object] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var scrollHeight: js.UndefOr[String] = js.undefined
    
    var selectedItemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var suggestions: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var tabindex: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[js.Any] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object AutoCompleteProps {
    
    @scala.inline
    def apply(): AutoCompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoCompleteProps]
    }
    
    @scala.inline
    implicit class AutoCompletePropsMutableBuilder[Self <: AutoCompleteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompleteMethod(value: /* e */ OriginalEvent => Unit): Self = StObject.set(x, "completeMethod", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompleteMethodUndefined: Self = StObject.set(x, "completeMethod", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropdown(value: Boolean): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMode(value: String): Self = StObject.set(x, "dropdownMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownModeUndefined: Self = StObject.set(x, "dropdownMode", js.undefined)
      
      @scala.inline
      def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      @scala.inline
      def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      @scala.inline
      def setInputStyle(value: js.Object): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
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
      def setOnClear(value: /* event */ Event => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: /* event */ Event => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDblClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onDblClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
      
      @scala.inline
      def setOnDropdownClick(value: /* e */ OriginalEvent => Unit): Self = StObject.set(x, "onDropdownClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropdownClickUndefined: Self = StObject.set(x, "onDropdownClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ Event => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: /* event */ Event => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* event */ Event => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* e */ Value => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnUnselect(value: /* e */ Value => Unit): Self = StObject.set(x, "onUnselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnselectUndefined: Self = StObject.set(x, "onUnselect", js.undefined)
      
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
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setScrollHeight(value: String): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeightUndefined: Self = StObject.set(x, "scrollHeight", js.undefined)
      
      @scala.inline
      def setSelectedItemTemplate(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "selectedItemTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectedItemTemplateUndefined: Self = StObject.set(x, "selectedItemTemplate", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuggestions(value: js.Array[js.Any]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setSuggestionsVarargs(value: js.Any*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
      
      @scala.inline
      def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
