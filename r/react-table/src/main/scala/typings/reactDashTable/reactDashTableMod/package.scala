package typings.reactDashTable

import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.reactDashTable.Anon_Column
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTableMod {
  type Accessor[D] = String | js.Array[String] | AccessorFunction[D]
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
  type DefaultFilterFunction = js.Function3[/* filter */ Filter, /* row */ js.Any, /* column */ js.Any, Boolean]
  type ExpandedChangeFunction = js.Function3[/* column */ js.Any, /* event */ js.Any, /* isTouch */ Boolean, Unit]
  type FilterFunction = js.Function3[
    /* filter */ Filter, 
    /* rows */ js.Array[js.Any], 
    /* column */ js.Any, 
    js.Array[js.Any]
  ]
  type FilterRender = js.Function1[/* params */ Anon_Column, ReactElement]
  type FilteredChangeFunction = js.Function3[/* newFiltering */ js.Array[Filter], /* column */ js.Any, /* value */ js.Any, Unit]
  type PageChangeFunction = js.Function1[/* page */ Double, Unit]
  type PageSizeChangeFunction = js.Function2[/* newPageSize */ Double, /* newPage */ Double, Unit]
  type PivotRenderer = (js.Function1[/* cellInfo */ CellInfo, ReactNode]) | js.Function0[js.Any] | String | ReactNode
  type ReactTable[D] = Component[Partial[TableProps[D, D]], js.Object, js.Any]
  type ReactTableFunction = js.Function1[/* value */ js.UndefOr[js.Any], Unit]
  type ResizedChangeFunction = js.Function2[/* newResized */ js.Array[Resize], /* event */ js.Any, Unit]
  type SortFunction = js.Function3[/* a */ js.Any, /* b */ js.Any, /* desc */ js.Any, Double]
  type SortedChangeFunction = js.Function3[
    /* newSorted */ js.Array[SortingRule], 
    /* column */ js.Any, 
    /* additive */ Boolean, 
    Unit
  ]
  type SubComponentFunction = js.Function1[/* rowInfo */ RowInfo, ReactNode]
  type TableCellRenderer = (js.Function2[/* cellInfo */ CellInfo, /* column */ js.Any, ReactNode]) | ReactNode
}
