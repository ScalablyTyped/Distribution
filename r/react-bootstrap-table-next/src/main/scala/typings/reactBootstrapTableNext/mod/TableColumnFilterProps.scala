package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  id  :string,   placeholder  :string,   className  :string,   defaultValue  :any,   style  :react.react.CSSProperties,   delay  :number, getFilter (filter : FT): void, onFilter (filterValue : FT): void | std.Array<T>}> */
trait TableColumnFilterProps[FT, T /* <: js.Object */] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var getFilter: js.UndefOr[js.Function1[/* filter */ FT, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ FT, Unit | js.Array[T]]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableColumnFilterProps {
  @scala.inline
  def apply[FT, /* <: js.Object */ T](
    className: String = null,
    defaultValue: js.Any = null,
    delay: js.UndefOr[Double] = js.undefined,
    getFilter: /* filter */ FT => Unit = null,
    id: String = null,
    onFilter: /* filterValue */ FT => Unit | js.Array[T] = null,
    placeholder: String = null,
    style: CSSProperties = null
  ): TableColumnFilterProps[FT, T] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (getFilter != null) __obj.updateDynamic("getFilter")(js.Any.fromFunction1(getFilter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnFilterProps[FT, T]]
  }
}

