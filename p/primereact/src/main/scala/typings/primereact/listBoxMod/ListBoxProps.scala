package typings.primereact.listBoxMod

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var dataKey: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterBy: js.UndefOr[String] = js.native
  var filterLocale: js.UndefOr[String] = js.native
  var filterMatchMode: js.UndefOr[String] = js.native
  var filterPlaceholder: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.native
  var listStyle: js.UndefOr[js.Object] = js.native
  var metaKeySelection: js.UndefOr[Boolean] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.native
  var optionLabel: js.UndefOr[String] = js.native
  var optionValue: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Array[_]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object ListBoxProps {
  @scala.inline
  def apply(): ListBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxProps]
  }
  @scala.inline
  implicit class ListBoxPropsOps[Self <: ListBoxProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemTemplate(value: /* item */ js.Any => js.UndefOr[Element]): Self = this.set("itemTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setListStyle(value: js.Object): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setMetaKeySelection(value: Boolean): Self = this.set("metaKeySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaKeySelection: Self = this.set("metaKeySelection", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnChange(value: /* e */ Target => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
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
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
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

