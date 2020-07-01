package typings.reactBootstrapTable2Filter.mod

import typings.react.mod.CSSProperties
import typings.reactBootstrapTable2Filter.anon.Date
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFilter_[T /* <: js.Object */]
  extends TableColumnFilterProps[TableColumnFilterProps[js.Any, js.Any], T] {
  var comparator: js.UndefOr[js.Array[Comparator]] = js.undefined
  var comparatorClassName: js.UndefOr[String] = js.undefined
  var comparatorStyle: js.UndefOr[CSSProperties] = js.undefined
  var dateClassName: js.UndefOr[String] = js.undefined
  var dateStyle: js.UndefOr[CSSProperties] = js.undefined
  @JSName("defaultValue")
  var defaultValue_DateFilter_ : js.UndefOr[Date] = js.undefined
  var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
}

object DateFilter_ {
  @scala.inline
  def apply[/* <: js.Object */ T](
    className: String = null,
    comparator: js.Array[Comparator] = null,
    comparatorClassName: String = null,
    comparatorStyle: CSSProperties = null,
    dateClassName: String = null,
    dateStyle: CSSProperties = null,
    defaultValue: Date = null,
    delay: js.UndefOr[Double] = js.undefined,
    getFilter: TableColumnFilterProps[js.Any, js.Any] => Unit = null,
    id: String = null,
    onFilter: TableColumnFilterProps[js.Any, js.Any] => Unit | js.Array[T] = null,
    placeholder: String = null,
    style: CSSProperties = null,
    withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
  ): DateFilter_[T] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (comparatorClassName != null) __obj.updateDynamic("comparatorClassName")(comparatorClassName.asInstanceOf[js.Any])
    if (comparatorStyle != null) __obj.updateDynamic("comparatorStyle")(comparatorStyle.asInstanceOf[js.Any])
    if (dateClassName != null) __obj.updateDynamic("dateClassName")(dateClassName.asInstanceOf[js.Any])
    if (dateStyle != null) __obj.updateDynamic("dateStyle")(dateStyle.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (getFilter != null) __obj.updateDynamic("getFilter")(js.Any.fromFunction1(getFilter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutEmptyComparatorOption)) __obj.updateDynamic("withoutEmptyComparatorOption")(withoutEmptyComparatorOption.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilter_[T]]
  }
}

