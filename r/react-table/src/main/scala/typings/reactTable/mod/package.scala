package typings.reactTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionType = typings.reactTable.AnonType with (typings.std.Record[java.lang.String, _])
  type AggregatedValue = js.Any
  type Aggregator[D /* <: js.Object */] = typings.reactTable.mod.AggregatorFn[D] | typings.reactTable.mod.DefaultAggregators | java.lang.String
  type AggregatorFn[D /* <: js.Object */] = js.Function3[
    /* columnValues */ js.Array[typings.reactTable.mod.CellValue], 
    /* rows */ js.Array[typings.reactTable.mod.Row[D]], 
    /* isAggregated */ scala.Boolean, 
    typings.reactTable.mod.AggregatedValue
  ]
  type Cell[D /* <: js.Object */] = typings.reactTable.mod.UseTableCellProps[D]
  type CellPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableCellProps, 
    typings.reactTable.AnonCellD[D], 
    typings.std.Partial[typings.reactTable.mod.TableCellProps]
  ]
  type CellProps[D /* <: js.Object */] = typings.reactTable.mod.TableInstance[D] with typings.reactTable.AnonCellColumn[D]
  type CellValue = js.Any
  type FilterProps[D /* <: js.Object */] = typings.reactTable.mod.HeaderProps[D]
  type FilterTypes[D /* <: js.Object */] = typings.std.Record[java.lang.String, typings.reactTable.mod.FilterValue]
  type FilterValue = js.Any
  type Filters[D /* <: js.Object */] = js.Array[typings.reactTable.AnonId[D]]
  type FooterGroupPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableFooterGroupProps, 
    typings.reactTable.AnonColumn[D], 
    typings.std.Partial[typings.reactTable.mod.TableFooterGroupProps]
  ]
  type FooterPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableFooterProps, 
    typings.reactTable.AnonColumn[D], 
    typings.std.Partial[typings.reactTable.mod.TableFooterProps]
  ]
  type HeaderGroupPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableHeaderGroupProps, 
    typings.reactTable.AnonColumn[D], 
    typings.std.Partial[typings.reactTable.mod.TableHeaderGroupProps]
  ]
  type HeaderPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableHeaderProps, 
    typings.reactTable.AnonColumn[D], 
    typings.std.Partial[typings.reactTable.mod.TableHeaderProps]
  ]
  type HeaderProps[D /* <: js.Object */] = typings.reactTable.mod.TableInstance[D] with typings.reactTable.AnonColumnColumnInstance[D]
  type Hooks[D /* <: js.Object */] = typings.reactTable.mod.UseTableHooks[D]
  type IdType[D] = typings.reactTable.mod.StringKey[D] | java.lang.String
  type Meta[D /* <: js.Object */, Extension, M] = (M with Extension) | M
  type PropGetter[D /* <: js.Object */, Props, T /* <: js.Object */, P] = (js.Function2[
    /* props */ P, 
    /* meta */ typings.reactTable.mod.Meta[D, T, typings.reactTable.mod.MetaBase[D]], 
    P | js.Array[P]
  ]) | P | js.Array[P]
  type Renderer[Props] = typings.react.mod.ComponentType[Props] | typings.react.mod.ReactElement | typings.react.mod.ReactText | typings.react.mod.ReactFragment
  type Row[D /* <: js.Object */] = typings.reactTable.mod.UseTableRowProps[D]
  type RowPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableRowProps, 
    typings.reactTable.AnonRow[D], 
    typings.std.Partial[typings.reactTable.mod.TableRowProps]
  ]
  type SortByFn[D /* <: js.Object */] = js.Function3[
    /* rowA */ typings.reactTable.mod.Row[D], 
    /* rowB */ typings.reactTable.mod.Row[D], 
    /* columnId */ typings.reactTable.mod.IdType[D], 
    scala.Double
  ]
  type StringKey[D] = typings.std.Extract[java.lang.String, java.lang.String]
  type TableBodyPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableBodyProps, 
    scala.Nothing, 
    typings.std.Partial[typings.reactTable.mod.TableBodyProps]
  ]
  type TableBodyProps = typings.reactTable.mod.TableCommonProps
  type TableCellProps = typings.reactTable.mod.TableKeyedProps
  type TableDispatch[A] = js.Function1[/* action */ A, scala.Unit]
  type TableExpandedToggleProps = typings.reactTable.mod.TableKeyedProps
  type TableFooterGroupProps = typings.reactTable.mod.TableKeyedProps
  type TableFooterProps = typings.reactTable.mod.TableKeyedProps
  type TableHeaderGroupProps = typings.reactTable.mod.TableKeyedProps
  type TableHeaderProps = typings.reactTable.mod.TableKeyedProps
  type TablePropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
    D, 
    typings.reactTable.mod.TableProps, 
    scala.Nothing, 
    typings.std.Partial[typings.reactTable.mod.TableProps]
  ]
  type TableProps = typings.reactTable.mod.TableCommonProps
  type TableRowProps = typings.reactTable.mod.TableKeyedProps
  type TableToggleAllRowsSelectedProps = typings.reactTable.mod.TableToggleCommonProps
  type TableToggleHideAllColumnProps = typings.reactTable.mod.TableToggleCommonProps
  type TableToggleRowsSelectedProps = typings.reactTable.mod.TableToggleCommonProps
  type UpdateHiddenColumns[D /* <: js.Object */] = js.Function1[
    /* oldHidden */ js.Array[typings.reactTable.mod.IdType[D]], 
    js.Array[typings.reactTable.mod.IdType[D]]
  ]
  type UseExpandedOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAutoResetExpanded[D]]
  type UseFiltersColumnOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonDefaultCanFilter[D]]
  type UseFiltersOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAutoResetFilters[D]]
  type UseGlobalFiltersOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAutoResetGlobalFilter[D]]
  type UseGroupByColumnOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAggregate[D]]
  type UseGroupByOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAggregations[D]]
  type UsePaginationOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAutoResetPage]
  type UseRowSelectOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAutoResetSelectedRows[D]]
  type UseRowStateLocalState[D /* <: js.Object */, T] = typings.std.Record[typings.reactTable.mod.IdType[D], T]
  type UseRowStateOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAutoResetRowState[D]]
  type UseRowUpdater[T] = T | (js.Function1[/* prev */ T, T])
  type UseSortByColumnOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonDefaultCanSort[D]]
  type UseSortByOptions[D /* <: js.Object */] = typings.std.Partial[typings.reactTable.AnonAutoResetSortBy[D]]
  type UseTableOptions[D /* <: js.Object */] = typings.reactTable.AnonColumns[D] with typings.std.Partial[typings.reactTable.AnonAction[D]]
}
