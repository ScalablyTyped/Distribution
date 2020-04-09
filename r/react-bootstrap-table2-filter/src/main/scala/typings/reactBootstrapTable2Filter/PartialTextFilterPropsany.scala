package typings.reactBootstrapTable2Filter

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTable2Filter.mod.Comparator
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.TextFilterProps<any>> */
trait PartialTextFilterPropsany extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var comparator: js.UndefOr[Comparator] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event_], Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[_]]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialTextFilterPropsany {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    comparator: Comparator = null,
    defaultValue: js.Any = null,
    delay: Int | Double = null,
    getFilter: /* filter */ TableColumnFilterProps[_, _] => Unit = null,
    id: String = null,
    onClick: /* e */ SyntheticEvent[Element, Event_] => Unit = null,
    onFilter: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[_] = null,
    placeholder: String = null,
    style: CSSProperties = null
  ): PartialTextFilterPropsany = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (getFilter != null) __obj.updateDynamic("getFilter")(js.Any.fromFunction1(getFilter))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction1(onFilter))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTextFilterPropsany]
  }
}

