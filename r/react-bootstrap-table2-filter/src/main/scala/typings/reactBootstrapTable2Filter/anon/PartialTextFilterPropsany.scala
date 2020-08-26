package typings.reactBootstrapTable2Filter.anon

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.TextFilterProps<any>> */
@js.native
trait PartialTextFilterPropsany extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var comparator: js.UndefOr[typings.reactBootstrapTable2Filter.mod.Comparator] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[_]]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object PartialTextFilterPropsany {
  @scala.inline
  def apply(): PartialTextFilterPropsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTextFilterPropsany]
  }
  @scala.inline
  implicit class PartialTextFilterPropsanyOps[Self <: PartialTextFilterPropsany] (val x: Self) extends AnyVal {
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
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
    def setGetFilter(value: /* filter */ TableColumnFilterProps[_, _] => Unit): Self = this.set("getFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFilter: Self = this.set("getFilter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnFilter(value: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[_]): Self = this.set("onFilter", js.Any.fromFunction1(value))
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
  }
  
}

