package typings
package slickgridLib.SlickNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupingOptions[T] extends js.Object {
  var aggregateChildGroups: js.UndefOr[scala.Boolean] = js.undefined
  var aggregateCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var aggregateEmpty: js.UndefOr[scala.Boolean] = js.undefined
  	// todo
  var aggregators: js.UndefOr[js.Array[slickgridLib.SlickNs.DataNs.AggregatorsNs.Aggregator[T]]] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var comparer: js.UndefOr[
    js.Function2[
      /* a */ slickgridLib.SlickNs.Group[T], 
      /* b */ slickgridLib.SlickNs.Group[T], 
      scala.Double
    ]
  ] = js.undefined
  var displayTotalsRow: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], java.lang.String]] = js.undefined
  var getter: js.UndefOr[(js.Function1[/* item */ js.UndefOr[T], _]) | java.lang.String] = js.undefined
  var predefinedValues: js.UndefOr[js.Array[_]] = js.undefined
}

object GroupingOptions {
  @scala.inline
  def apply[T](
    aggregateChildGroups: js.UndefOr[scala.Boolean] = js.undefined,
    aggregateCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    aggregateEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    aggregators: js.Array[slickgridLib.SlickNs.DataNs.AggregatorsNs.Aggregator[T]] = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    comparer: (/* a */ slickgridLib.SlickNs.Group[T], /* b */ slickgridLib.SlickNs.Group[T]) => scala.Double = null,
    displayTotalsRow: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: /* item */ js.UndefOr[T] => java.lang.String = null,
    getter: (js.Function1[/* item */ js.UndefOr[T], _]) | java.lang.String = null,
    predefinedValues: js.Array[_] = null
  ): GroupingOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregateChildGroups)) __obj.updateDynamic("aggregateChildGroups")(aggregateChildGroups)
    if (!js.isUndefined(aggregateCollapsed)) __obj.updateDynamic("aggregateCollapsed")(aggregateCollapsed)
    if (!js.isUndefined(aggregateEmpty)) __obj.updateDynamic("aggregateEmpty")(aggregateEmpty)
    if (aggregators != null) __obj.updateDynamic("aggregators")(aggregators)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (comparer != null) __obj.updateDynamic("comparer")(js.Any.fromFunction2(comparer))
    if (!js.isUndefined(displayTotalsRow)) __obj.updateDynamic("displayTotalsRow")(displayTotalsRow)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (getter != null) __obj.updateDynamic("getter")(getter.asInstanceOf[js.Any])
    if (predefinedValues != null) __obj.updateDynamic("predefinedValues")(predefinedValues)
    __obj.asInstanceOf[GroupingOptions[T]]
  }
}

