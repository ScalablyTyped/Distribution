package typings.reactBootstrapTable2Filter.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable2Filter.anon.Label
import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<string, T> & {  options :react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterOptions | (column : react-bootstrap-table-next.react-bootstrap-table-next.ColumnDescription<T, any>): react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterOptions,   comparator :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator | undefined,   withoutEmptyOption :boolean | undefined} */
@js.native
trait SelectFilterProps[T /* <: js.Object */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var comparator: js.UndefOr[Comparator] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[T]]] = js.native
  var options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions]) = js.native
  var placeholder: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * When the default unset selection is hidden from dropdown
    */
  var withoutEmptyOption: js.UndefOr[Boolean] = js.native
}

object SelectFilterProps {
  @scala.inline
  def apply[/* <: js.Object */ T](
    options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions])
  ): SelectFilterProps[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFilterProps[T]]
  }
  @scala.inline
  implicit class SelectFilterPropsOps[Self <: SelectFilterProps[_], /* <: js.Object */ T] (val x: Self with SelectFilterProps[T]) extends AnyVal {
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
    def setOptionsVarargs(value: Label*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptionsFunction1(value: /* column */ ColumnDescription[T, _] => SelectFilterOptions): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(
      value: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions])
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComparator(value: Comparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
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
    def setOnFilter(value: /* filterValue */ String => Unit | js.Array[T]): Self = this.set("onFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
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

