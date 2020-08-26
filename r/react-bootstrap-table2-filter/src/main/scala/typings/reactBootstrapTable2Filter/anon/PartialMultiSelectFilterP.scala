package typings.reactBootstrapTable2Filter.anon

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable2Filter.mod.MultiSelectFilterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.MultiSelectFilterProps<any>> */
@js.native
trait PartialMultiSelectFilterP extends js.Object {
  var className: js.UndefOr[String] = js.native
  var comparator: js.UndefOr[typings.reactBootstrapTable2Filter.mod.Comparator] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[_]]] = js.native
  var options: js.UndefOr[MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var withoutEmptyOption: js.UndefOr[Boolean] = js.native
}

object PartialMultiSelectFilterP {
  @scala.inline
  def apply(): PartialMultiSelectFilterP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMultiSelectFilterP]
  }
  @scala.inline
  implicit class PartialMultiSelectFilterPOps[Self <: PartialMultiSelectFilterP] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComparator(value: typings.reactBootstrapTable2Filter.mod.Comparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setGetFilter(value: /* filter */ String => Unit): Self = this.set("getFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFilter: Self = this.set("getFilter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnFilter(value: /* filterValue */ String => Unit | js.Array[_]): Self = this.set("onFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    @scala.inline
    def setOptionsFunction0(value: () => MultiSelectFilterOptions): Self = this.set("options", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWithoutEmptyOption(value: Boolean): Self = this.set("withoutEmptyOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithoutEmptyOption: Self = this.set("withoutEmptyOption", js.undefined)
  }
  
}

