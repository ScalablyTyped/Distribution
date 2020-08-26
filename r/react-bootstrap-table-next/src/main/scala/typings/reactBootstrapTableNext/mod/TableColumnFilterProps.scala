package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  id :string,   placeholder :string,   className :string,   defaultValue :any,   style :react.react.CSSProperties,   delay :number, getFilter (filter : FT): void, onFilter (filterValue : FT): void | std.Array<T>}> */
@js.native
trait TableColumnFilterProps[FT, T /* <: js.Object */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var getFilter: js.UndefOr[js.Function1[/* filter */ FT, Unit]] = js.native
  var id: js.UndefOr[String] = js.native
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ FT, Unit | js.Array[T]]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableColumnFilterProps {
  @scala.inline
  def apply[FT, /* <: js.Object */ T](): TableColumnFilterProps[FT, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnFilterProps[FT, T]]
  }
  @scala.inline
  implicit class TableColumnFilterPropsOps[Self <: TableColumnFilterProps[_, _], FT, /* <: js.Object */ T] (val x: Self with (TableColumnFilterProps[FT, T])) extends AnyVal {
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
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setGetFilter(value: /* filter */ FT => Unit): Self = this.set("getFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFilter: Self = this.set("getFilter", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnFilter(value: /* filterValue */ FT => Unit | js.Array[T]): Self = this.set("onFilter", js.Any.fromFunction1(value))
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

