package typings.reactBootstrapTable2Filter.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<any, any>, T> & {  options ? :std.Array<number>,   comparators ? :std.Array<react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator>,   withoutEmptyComparatorOption ? :boolean,   withoutEmptyNumberOption ? :boolean,   comparatorClassName ? :string,   numberClassName ? :string,   comparatorStyle ? :react.react.CSSProperties,   numberStyle ? :react.react.CSSProperties,   defaultValue ? :{  number  :number,   comparator  :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator}} */
trait NumberFilterProps[T /* <: js.Object */] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var comparatorClassName: js.UndefOr[String] = js.undefined
  var comparatorStyle: js.UndefOr[CSSProperties] = js.undefined
  var comparators: js.UndefOr[js.Array[Comparator]] = js.undefined
  var defaultValue: js.UndefOr[js.Any with typings.reactBootstrapTable2Filter.anon.Comparator] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var numberClassName: js.UndefOr[String] = js.undefined
  var numberStyle: js.UndefOr[CSSProperties] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[T]]] = js.undefined
  var options: js.UndefOr[js.Array[Double]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * When set to true comparator dropdown does not show a "no selection" option
    */
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
  var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined
}

object NumberFilterProps {
  @scala.inline
  def apply[T](
    className: String = null,
    comparatorClassName: String = null,
    comparatorStyle: CSSProperties = null,
    comparators: js.Array[Comparator] = null,
    defaultValue: js.Any with typings.reactBootstrapTable2Filter.anon.Comparator = null,
    delay: js.UndefOr[Double] = js.undefined,
    getFilter: /* filter */ TableColumnFilterProps[_, _] => Unit = null,
    id: String = null,
    numberClassName: String = null,
    numberStyle: CSSProperties = null,
    onFilter: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[T] = null,
    options: js.Array[Double] = null,
    placeholder: String = null,
    style: CSSProperties = null,
    withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined,
    withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined
  ): NumberFilterProps[T] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (comparatorClassName != null) __obj.updateDynamic("comparatorClassName")(comparatorClassName.asInstanceOf[js.Any])
    if (comparatorStyle != null) __obj.updateDynamic("comparatorStyle")(comparatorStyle.asInstanceOf[js.Any])
    if (comparators != null) __obj.updateDynamic("comparators")(comparators.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (getFilter != null) __obj.updateDynamic("getFilter")(js.Any.fromFunction1(getFilter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (numberClassName != null) __obj.updateDynamic("numberClassName")(numberClassName.asInstanceOf[js.Any])
    if (numberStyle != null) __obj.updateDynamic("numberStyle")(numberStyle.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyComparatorOption)) __obj.updateDynamic("withoutEmptyComparatorOption")(withoutEmptyComparatorOption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyNumberOption)) __obj.updateDynamic("withoutEmptyNumberOption")(withoutEmptyNumberOption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFilterProps[T]]
  }
}

