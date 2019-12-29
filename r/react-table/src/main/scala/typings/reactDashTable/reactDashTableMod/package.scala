package typings.reactDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTableMod {
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ReactNode
  import typings.reactDashTable.Anon_Action
  import typings.reactDashTable.Anon_Aggregate
  import typings.reactDashTable.Anon_Aggregations
  import typings.reactDashTable.Anon_AutoResetExpanded
  import typings.reactDashTable.Anon_AutoResetFilters
  import typings.reactDashTable.Anon_AutoResetGlobalFilter
  import typings.reactDashTable.Anon_AutoResetPage
  import typings.reactDashTable.Anon_AutoResetRowState
  import typings.reactDashTable.Anon_AutoResetSelectedRows
  import typings.reactDashTable.Anon_AutoResetSortBy
  import typings.reactDashTable.Anon_CellColumn
  import typings.reactDashTable.Anon_CellD
  import typings.reactDashTable.Anon_Column
  import typings.reactDashTable.Anon_ColumnColumnInstance
  import typings.reactDashTable.Anon_Columns
  import typings.reactDashTable.Anon_DefaultCanFilter
  import typings.reactDashTable.Anon_DefaultCanSort
  import typings.reactDashTable.Anon_Id
  import typings.reactDashTable.Anon_Row
  import typings.reactDashTable.Anon_Type
  import typings.reactDashTable.reactDashTableNumbers.`-1`
  import typings.reactDashTable.reactDashTableNumbers.`0`
  import typings.reactDashTable.reactDashTableNumbers.`1`
  import typings.std.Extract
  import typings.std.Partial
  import typings.std.Record

  type ActionType = Anon_Type with (Record[String, _])
  type AggregatedValue = js.Any
  type Aggregator[D /* <: js.Object */] = AggregatorFn[D] | DefaultAggregators | String
  type AggregatorFn[D /* <: js.Object */] = js.Function3[
    /* columnValues */ js.Array[CellValue], 
    /* rows */ js.Array[Row[D]], 
    /* isAggregated */ Boolean, 
    AggregatedValue
  ]
  type Cell[D /* <: js.Object */] = UseTableCellProps[D]
  type CellPropGetter[D /* <: js.Object */] = PropGetter[D, TableCellProps, Anon_CellD[D], Partial[TableCellProps]]
  type CellProps[D /* <: js.Object */] = TableInstance[D] with Anon_CellColumn[D]
  type CellValue = js.Any
  type FilterProps[D /* <: js.Object */] = HeaderProps[D]
  type FilterTypes[D /* <: js.Object */] = Record[String, FilterValue]
  type FilterValue = js.Any
  type Filters[D /* <: js.Object */] = js.Array[Anon_Id[D]]
  type FooterGroupPropGetter[D /* <: js.Object */] = PropGetter[D, TableFooterGroupProps, Anon_Column[D], Partial[TableFooterGroupProps]]
  type FooterPropGetter[D /* <: js.Object */] = PropGetter[D, TableFooterProps, Anon_Column[D], Partial[TableFooterProps]]
  type HeaderGroupPropGetter[D /* <: js.Object */] = PropGetter[D, TableHeaderGroupProps, Anon_Column[D], Partial[TableHeaderGroupProps]]
  type HeaderPropGetter[D /* <: js.Object */] = PropGetter[D, TableHeaderProps, Anon_Column[D], Partial[TableHeaderProps]]
  type HeaderProps[D /* <: js.Object */] = TableInstance[D] with Anon_ColumnColumnInstance[D]
  type Hooks[D /* <: js.Object */] = UseTableHooks[D]
  type IdType[D] = StringKey[D] | String
  type Meta[D /* <: js.Object */, Extension, M] = (M with Extension) | M
  type PropGetter[D /* <: js.Object */, Props, T /* <: js.Object */, P] = (js.Function2[/* props */ P, /* meta */ Meta[D, T, MetaBase[D]], P | js.Array[P]]) | P | js.Array[P]
  type Renderer[Props] = ComponentType[Props] | ReactNode
  type Row[D /* <: js.Object */] = UseTableRowProps[D]
  type RowPropGetter[D /* <: js.Object */] = PropGetter[D, TableRowProps, Anon_Row[D], Partial[TableRowProps]]
  type SortByFn[D /* <: js.Object */] = js.Function3[/* rowA */ Row[D], /* rowB */ Row[D], /* columnId */ IdType[D], `0` | `1` | `-1`]
  type StringKey[D] = Extract[String, String]
  type TableBodyPropGetter[D /* <: js.Object */] = PropGetter[D, TableBodyProps, scala.Nothing, Partial[TableBodyProps]]
  type TableBodyProps = TableCommonProps
  type TableCellProps = TableKeyedProps
  type TableDispatch[A] = js.Function1[/* action */ A, Unit]
  type TableExpandedToggleProps = TableKeyedProps
  type TableFooterGroupProps = TableKeyedProps
  type TableFooterProps = TableKeyedProps
  type TableHeaderGroupProps = TableKeyedProps
  type TableHeaderProps = TableKeyedProps
  type TablePropGetter[D /* <: js.Object */] = PropGetter[D, TableProps, scala.Nothing, Partial[TableProps]]
  type TableProps = TableCommonProps
  type TableRowProps = TableKeyedProps
  type TableToggleAllRowsSelectedProps = TableToggleCommonProps
  type TableToggleHideAllColumnProps = TableToggleCommonProps
  type TableToggleRowsSelectedProps = TableToggleCommonProps
  type UpdateHiddenColumns[D /* <: js.Object */] = js.Function1[/* oldHidden */ js.Array[IdType[D]], js.Array[IdType[D]]]
  type UseExpandedOptions[D /* <: js.Object */] = Partial[Anon_AutoResetExpanded[D]]
  type UseFiltersColumnOptions[D /* <: js.Object */] = Partial[Anon_DefaultCanFilter[D]]
  type UseFiltersOptions[D /* <: js.Object */] = Partial[Anon_AutoResetFilters[D]]
  type UseGlobalFiltersOptions[D /* <: js.Object */] = Partial[Anon_AutoResetGlobalFilter[D]]
  type UseGroupByColumnOptions[D /* <: js.Object */] = Partial[Anon_Aggregate[D]]
  type UseGroupByOptions[D /* <: js.Object */] = Partial[Anon_Aggregations[D]]
  type UsePaginationOptions[D /* <: js.Object */] = Partial[Anon_AutoResetPage]
  type UseRowSelectOptions[D /* <: js.Object */] = Partial[Anon_AutoResetSelectedRows[D]]
  type UseRowStateLocalState[D /* <: js.Object */, T] = Record[IdType[D], T]
  type UseRowStateOptions[D /* <: js.Object */] = Partial[Anon_AutoResetRowState[D]]
  type UseRowUpdater[T] = T | (js.Function1[/* prev */ T, T])
  type UseSortByColumnOptions[D /* <: js.Object */] = Partial[Anon_DefaultCanSort[D]]
  type UseSortByOptions[D /* <: js.Object */] = Partial[Anon_AutoResetSortBy[D]]
  type UseTableOptions[D /* <: js.Object */] = Anon_Columns[D] with Partial[Anon_Action[D]]
}
