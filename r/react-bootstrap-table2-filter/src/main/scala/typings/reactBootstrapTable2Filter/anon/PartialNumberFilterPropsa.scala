package typings.reactBootstrapTable2Filter.anon

import typings.react.mod.CSSProperties
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.NumberFilterProps<any>> */
@js.native
trait PartialNumberFilterPropsa extends js.Object {
  var className: js.UndefOr[String] = js.native
  var comparatorClassName: js.UndefOr[String] = js.native
  var comparatorStyle: js.UndefOr[CSSProperties] = js.native
  var comparators: js.UndefOr[js.Array[typings.reactBootstrapTable2Filter.mod.Comparator]] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var numberClassName: js.UndefOr[String] = js.native
  var numberStyle: js.UndefOr[CSSProperties] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[_]]] = js.native
  var options: js.UndefOr[js.Array[Double]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
  var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.native
}

object PartialNumberFilterPropsa {
  @scala.inline
  def apply(): PartialNumberFilterPropsa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNumberFilterPropsa]
  }
  @scala.inline
  implicit class PartialNumberFilterPropsaOps[Self <: PartialNumberFilterPropsa] (val x: Self) extends AnyVal {
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
    def setComparatorClassName(value: String): Self = this.set("comparatorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparatorClassName: Self = this.set("comparatorClassName", js.undefined)
    @scala.inline
    def setComparatorStyle(value: CSSProperties): Self = this.set("comparatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparatorStyle: Self = this.set("comparatorStyle", js.undefined)
    @scala.inline
    def setComparatorsVarargs(value: typings.reactBootstrapTable2Filter.mod.Comparator*): Self = this.set("comparators", js.Array(value :_*))
    @scala.inline
    def setComparators(value: js.Array[typings.reactBootstrapTable2Filter.mod.Comparator]): Self = this.set("comparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparators: Self = this.set("comparators", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setGetFilter(value: /* filter */ TableColumnFilterProps[_, _] => Unit): Self = this.set("getFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFilter: Self = this.set("getFilter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setNumberClassName(value: String): Self = this.set("numberClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberClassName: Self = this.set("numberClassName", js.undefined)
    @scala.inline
    def setNumberStyle(value: CSSProperties): Self = this.set("numberStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberStyle: Self = this.set("numberStyle", js.undefined)
    @scala.inline
    def setOnFilter(value: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[_]): Self = this.set("onFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Double*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[Double]): Self = this.set("options", value.asInstanceOf[js.Any])
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
    def setWithoutEmptyComparatorOption(value: Boolean): Self = this.set("withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithoutEmptyComparatorOption: Self = this.set("withoutEmptyComparatorOption", js.undefined)
    @scala.inline
    def setWithoutEmptyNumberOption(value: Boolean): Self = this.set("withoutEmptyNumberOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithoutEmptyNumberOption: Self = this.set("withoutEmptyNumberOption", js.undefined)
  }
  
}

