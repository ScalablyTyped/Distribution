package typings.reactBootstrapTable2Filter

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable2Filter.mod.Comparator
import typings.reactBootstrapTable2Filter.mod.SelectFilterOptions
import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterProps<any>> */
trait PartialSelectFilterPropsa extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var comparator: js.UndefOr[Comparator] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[_]]] = js.undefined
  var options: js.UndefOr[
    SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[_, _], SelectFilterOptions])
  ] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
}

object PartialSelectFilterPropsa {
  @scala.inline
  def apply(
    className: String = null,
    comparator: Comparator = null,
    defaultValue: js.Any = null,
    delay: Int | Double = null,
    getFilter: /* filter */ String => Unit = null,
    id: String = null,
    onFilter: /* filterValue */ String => Unit | js.Array[_] = null,
    options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[_, _], SelectFilterOptions]) = null,
    placeholder: String = null,
    style: CSSProperties = null,
    withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  ): PartialSelectFilterPropsa = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (getFilter != null) __obj.updateDynamic("getFilter")(js.Any.fromFunction1(getFilter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyOption)) __obj.updateDynamic("withoutEmptyOption")(withoutEmptyOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSelectFilterPropsa]
  }
}

