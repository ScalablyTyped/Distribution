package typings.primereact.autocompleteAutoCompleteMod

import typings.primereact.anon.OriginalEvent
import typings.primereact.anon.Target
import typings.primereact.anon.Value
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.global.JSX.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.native
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var completeMethod: js.UndefOr[js.Function1[/* e */ OriginalEvent, Unit]] = js.native
  var delay: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdown: js.UndefOr[Boolean] = js.native
  var dropdownMode: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inputClassName: js.UndefOr[String] = js.native
  var inputId: js.UndefOr[String] = js.native
  var inputStyle: js.UndefOr[js.Object] = js.native
  var itemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.native
  var maxlength: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.native
  var onClear: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onDblClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onDropdownClick: js.UndefOr[js.Function1[/* e */ OriginalEvent, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var onUnselect: js.UndefOr[js.Function1[/* e */ Value, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var scrollHeight: js.UndefOr[String] = js.native
  var selectedItemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, String]] = js.native
  var size: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var suggestions: js.UndefOr[js.Array[_]] = js.native
  var tabindex: js.UndefOr[Double] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object AutoCompleteProps {
  @scala.inline
  def apply(): AutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteProps]
  }
  @scala.inline
  implicit class AutoCompletePropsOps[Self <: AutoCompleteProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCompleteMethod(value: /* e */ OriginalEvent => Unit): Self = this.set("completeMethod", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompleteMethod: Self = this.set("completeMethod", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdown(value: Boolean): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    @scala.inline
    def setDropdownMode(value: String): Self = this.set("dropdownMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMode: Self = this.set("dropdownMode", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setInputStyle(value: js.Object): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    @scala.inline
    def setItemTemplate(value: /* data */ js.Any => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnBlur(value: /* event */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ Target => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClear(value: /* event */ Event => Unit): Self = this.set("onClear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnContextMenu(value: /* event */ Event => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    @scala.inline
    def setOnDblClick(value: /* event */ Event => Unit): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    @scala.inline
    def setOnDropdownClick(value: /* e */ OriginalEvent => Unit): Self = this.set("onDropdownClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDropdownClick: Self = this.set("onDropdownClick", js.undefined)
    @scala.inline
    def setOnFocus(value: /* event */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnKeyPress(value: /* event */ Event => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setOnKeyUp(value: /* event */ Event => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* event */ Event => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnSelect(value: /* e */ Value => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnUnselect(value: /* e */ Value => Unit): Self = this.set("onUnselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUnselect: Self = this.set("onUnselect", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setScrollHeight(value: String): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    @scala.inline
    def setSelectedItemTemplate(value: /* data */ js.Any => String): Self = this.set("selectedItemTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectedItemTemplate: Self = this.set("selectedItemTemplate", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuggestionsVarargs(value: js.Any*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[_]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

