package typings.primereact.multiSelectMod

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSelectProps extends js.Object {
  
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
  implicit class MultiSelectPropsOps[Self <: MultiSelectProps] (val x: Self) extends AnyVal {
    
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
    def setAppendTo(value: HTMLElement): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEmptyFilterMessage(value: js.Any): Self = this.set("emptyFilterMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyFilterMessage: Self = this.set("emptyFilterMessage", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterBy(value: String): Self = this.set("filterBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    
    @scala.inline
    def setFilterLocale(value: String): Self = this.set("filterLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterLocale: Self = this.set("filterLocale", js.undefined)
    
    @scala.inline
    def setFilterMatchMode(value: String): Self = this.set("filterMatchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterMatchMode: Self = this.set("filterMatchMode", js.undefined)
    
    @scala.inline
    def setFilterPlaceholder(value: String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    
    @scala.inline
    def setFixedPlaceholder(value: Boolean): Self = this.set("fixedPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPlaceholder: Self = this.set("fixedPlaceholder", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    
    @scala.inline
    def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setMaxSelectedLabels(value: Double): Self = this.set("maxSelectedLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSelectedLabels: Self = this.set("maxSelectedLabels", js.undefined)
    
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
    def setOnFocus(value: /* event */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOptionLabel(value: String): Self = this.set("optionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionLabel: Self = this.set("optionLabel", js.undefined)
    
    @scala.inline
    def setOptionValue(value: String): Self = this.set("optionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionValue: Self = this.set("optionValue", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: js.Any*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[_]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPanelClassName(value: String): Self = this.set("panelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelClassName: Self = this.set("panelClassName", js.undefined)
    
    @scala.inline
    def setPanelStyle(value: js.Object): Self = this.set("panelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelStyle: Self = this.set("panelStyle", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResetFilterOnHide(value: Boolean): Self = this.set("resetFilterOnHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetFilterOnHide: Self = this.set("resetFilterOnHide", js.undefined)
    
    @scala.inline
    def setScrollHeight(value: String): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollHeight: Self = this.set("scrollHeight", js.undefined)
    
    @scala.inline
    def setSelectedItemTemplate(value: /* value */ js.Any => js.UndefOr[Element]): Self = this.set("selectedItemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectedItemTemplate: Self = this.set("selectedItemTemplate", js.undefined)
    
    @scala.inline
    def setSelectedItemsLabel(value: String): Self = this.set("selectedItemsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItemsLabel: Self = this.set("selectedItemsLabel", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Boolean): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
