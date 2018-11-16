package typings
package reactDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTableMod {
  type Accessor[D] = java.lang.String | js.Array[java.lang.String] | AccessorFunction[D]
  type AccessorFunction[D] = js.Function1[/* row */ D, js.Any]
  type Aggregator = js.Function2[/* values */ js.Any, /* rows */ js.Any, js.Any]
  type ComponentPropsGetter0 = js.Function4[
    /* finalState */ js.Any, 
    /* rowInfo */ js.UndefOr[scala.Nothing], 
    /* column */ js.UndefOr[scala.Nothing], 
    /* instance */ js.UndefOr[js.Any], 
    js.UndefOr[js.Object]
  ]
  type ComponentPropsGetterC = js.Function4[
    /* finalState */ js.Any, 
    /* rowInfo */ js.UndefOr[scala.Nothing], 
    /* column */ js.UndefOr[Column[js.Any]], 
    /* instance */ js.UndefOr[js.Any], 
    js.UndefOr[js.Object]
  ]
  type ComponentPropsGetterR = js.Function4[
    /* finalState */ js.Any, 
    /* rowInfo */ js.UndefOr[RowInfo], 
    /* column */ js.UndefOr[scala.Nothing], 
    /* instance */ js.UndefOr[js.Any], 
    js.UndefOr[js.Object]
  ]
  type ComponentPropsGetterRC = js.Function4[
    /* finalState */ js.Any, 
    /* rowInfo */ js.UndefOr[RowInfo], 
    /* column */ js.UndefOr[Column[js.Any]], 
    /* instance */ js.UndefOr[js.Any], 
    js.UndefOr[js.Object]
  ]
  type DefaultFilterFunction = js.Function3[/* filter */ Filter, /* row */ js.Any, /* column */ js.Any, scala.Boolean]
  type ExpandedChangeFunction = js.Function3[/* column */ js.Any, /* event */ js.Any, /* isTouch */ scala.Boolean, scala.Unit]
  type FilterFunction = js.Function3[/* filter */ Filter, /* rows */ js.Array[js.Any], /* column */ js.Any, scala.Boolean]
  type FilterRender = js.Function1[
    /* params */ reactDashTableLib.Anon_Filter, 
    reactLib.reactMod.ReactNs.ReactElement[js.Any]
  ]
  type FilteredChangeFunction = js.Function3[
    /* newFiltering */ js.Array[Filter], 
    /* column */ js.Any, 
    /* value */ js.Any, 
    scala.Unit
  ]
  type PageChangeFunction = js.Function1[/* page */ scala.Double, scala.Unit]
  type PageSizeChangeFunction = js.Function2[/* newPageSize */ scala.Double, /* newPage */ scala.Double, scala.Unit]
  type PivotRenderer = (js.Function1[/* cellInfo */ CellInfo, reactLib.reactMod.ReactNs.ReactNode]) | js.Function0[js.Any] | java.lang.String | reactLib.reactMod.ReactNs.ReactNode
  type ReactTable[D] = reactLib.reactMod.Component[stdLib.Partial[TableProps[D]], js.Object, js.Any]
  type ReactTableFunction = js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]
  type ResizedChangeFunction = js.Function2[/* newResized */ js.Array[Resize], /* event */ js.Any, scala.Unit]
  type SortFunction = js.Function3[/* a */ js.Any, /* b */ js.Any, /* desc */ js.Any, scala.Double]
  type SortedChangeFunction = js.Function3[
    /* newSorted */ js.Array[SortingRule], 
    /* column */ js.Any, 
    /* additive */ scala.Boolean, 
    scala.Unit
  ]
  type SubComponentFunction = js.Function1[/* rowInfo */ RowInfo, reactLib.reactMod.ReactNs.ReactNode]
  type TableCellRenderer = (js.Function2[/* cellInfo */ CellInfo, /* column */ js.Any, reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
}
