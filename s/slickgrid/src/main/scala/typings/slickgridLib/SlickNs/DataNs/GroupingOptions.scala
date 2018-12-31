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

