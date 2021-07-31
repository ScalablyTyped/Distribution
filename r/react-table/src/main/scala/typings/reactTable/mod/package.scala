package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def actions: typings.std.Record[java.lang.String, java.lang.String] = typings.reactTable.mod.^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[typings.std.Record[java.lang.String, java.lang.String]]

@scala.inline
def defaultColumn: typings.std.Partial[typings.reactTable.mod.Column[js.Object]] & (typings.std.Record[java.lang.String, js.Any]) = typings.reactTable.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultColumn").asInstanceOf[typings.std.Partial[typings.reactTable.mod.Column[js.Object]] & (typings.std.Record[java.lang.String, js.Any])]

@scala.inline
def defaultGroupByFn[D /* <: js.Object */](rows: js.Array[typings.reactTable.mod.Row[D]], columnId: typings.reactTable.mod.IdType[D]): typings.std.Record[java.lang.String, js.Array[typings.reactTable.mod.Row[D]]] = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultGroupByFn")(rows.asInstanceOf[js.Any], columnId.asInstanceOf[js.Any])).asInstanceOf[typings.std.Record[java.lang.String, js.Array[typings.reactTable.mod.Row[D]]]]

@scala.inline
def defaultOrderByFn[D /* <: js.Object */](
  arr: js.Array[typings.reactTable.mod.Row[D]],
  funcs: js.Array[typings.reactTable.mod.SortByFn[D]],
  dirs: js.Array[scala.Boolean]
): js.Array[typings.reactTable.mod.Row[D]] = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultOrderByFn")(arr.asInstanceOf[js.Any], funcs.asInstanceOf[js.Any], dirs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.reactTable.mod.Row[D]]]

@scala.inline
def ensurePluginOrder[D /* <: js.Object */](
  plugins: js.Array[typings.reactTable.mod.PluginHook[D]],
  befores: js.Array[java.lang.String],
  pluginName: java.lang.String
): scala.Unit = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ensurePluginOrder")(plugins.asInstanceOf[js.Any], befores.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def functionalUpdate[D /* <: js.Object */](updater: js.Any, old: typings.std.Partial[typings.reactTable.mod.TableState[D]]): typings.std.Partial[typings.reactTable.mod.TableState[D]] = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("functionalUpdate")(updater.asInstanceOf[js.Any], old.asInstanceOf[js.Any])).asInstanceOf[typings.std.Partial[typings.reactTable.mod.TableState[D]]]

@scala.inline
def loopHooks(hooks: typings.reactTable.mod.Hooks[js.Object], args: js.Any*): scala.Unit = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loopHooks")(hooks.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def makePropGetter(hooks: typings.reactTable.mod.Hooks[js.Object], meta: js.Any*): js.Any = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makePropGetter")(hooks.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def makeRenderer(
  instance: typings.reactTable.mod.TableInstance[js.Object],
  column: typings.reactTable.mod.ColumnInstance[js.Object]
): typings.react.mod.ReactElement = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeRenderer")(instance.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]
@scala.inline
def makeRenderer(
  instance: typings.reactTable.mod.TableInstance[js.Object],
  column: typings.reactTable.mod.ColumnInstance[js.Object],
  meta: js.Any
): typings.react.mod.ReactElement = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeRenderer")(instance.asInstanceOf[js.Any], column.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ReactElement]

@scala.inline
def reduceHooks[T /* <: js.Object */](hooks: typings.reactTable.mod.Hooks[js.Object], initial: T, args: js.Any*): T = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reduceHooks")(hooks.asInstanceOf[js.Any], initial.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[T]

@scala.inline
def safeUseLayoutEffect(effect: typings.react.mod.EffectCallback): scala.Unit = typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("safeUseLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def safeUseLayoutEffect(effect: typings.react.mod.EffectCallback, deps: typings.react.mod.DependencyList): scala.Unit = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("safeUseLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def useAsyncDebounce[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](defaultFn: F): F = typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncDebounce")(defaultFn.asInstanceOf[js.Any]).asInstanceOf[F]
@scala.inline
def useAsyncDebounce[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](defaultFn: F, defaultWait: scala.Double): F = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncDebounce")(defaultFn.asInstanceOf[js.Any], defaultWait.asInstanceOf[js.Any])).asInstanceOf[F]

@scala.inline
def useGetLatest[T](obj: T): js.Function0[T] = typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useGetLatest")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]

@scala.inline
def useMountedLayoutEffect(effect: typings.react.mod.EffectCallback): scala.Unit = typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMountedLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def useMountedLayoutEffect(effect: typings.react.mod.EffectCallback, deps: typings.react.mod.DependencyList): scala.Unit = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMountedLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def useTable[D /* <: js.Object */](options: typings.reactTable.mod.TableOptions[D], plugins: typings.reactTable.mod.PluginHook[D]*): typings.reactTable.mod.TableInstance[D] = (typings.reactTable.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTable")(options.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[typings.reactTable.mod.TableInstance[D]]

type Accessor[D /* <: js.Object */] = js.Function3[
/* originalRow */ D, 
/* index */ scala.Double, 
/* sub */ typings.reactTable.anon.Data[D], 
typings.reactTable.mod.CellValue[js.Any]]

type ActionType = typings.reactTable.anon.Type & (typings.std.Record[java.lang.String, js.Any])

type AggregatedValue = js.Any

type Aggregator[D /* <: js.Object */] = typings.reactTable.mod.AggregatorFn[D] | typings.reactTable.mod.DefaultAggregators | java.lang.String

type AggregatorFn[D /* <: js.Object */] = js.Function3[
/* columnValues */ js.Array[typings.reactTable.mod.CellValue[js.Any]], 
/* rows */ js.Array[typings.reactTable.mod.Row[D]], 
/* isAggregated */ scala.Boolean, 
typings.reactTable.mod.AggregatedValue]

type Cell[D /* <: js.Object */, V] = typings.reactTable.mod.UseTableCellProps[D, V]

type CellPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableCellProps, 
typings.reactTable.anon.Cell[D], 
typings.reactTable.anon.PartialTableCellProps]

type CellValue[V] = V

type Column[D /* <: js.Object */] = typings.reactTable.mod.ColumnGroup[D] | typings.reactTable.mod.ColumnWithLooseAccessor[D] | typings.reactTable.mod.ColumnWithStrictAccessor[D]

type ColumnGroup[D /* <: js.Object */] = typings.reactTable.mod.ColumnInterface[D] & typings.reactTable.mod.ColumnGroupInterface[D] & (typings.reactTable.anon.Header | typings.reactTable.anon.Id[D]) & typings.reactTable.anon.Accessor[D]

type ColumnInterface[D /* <: js.Object */] = typings.reactTable.mod.UseTableColumnOptions[D]

type ColumnWithLooseAccessor[D /* <: js.Object */] = typings.reactTable.mod.ColumnInterface[D] & (typings.reactTable.mod.ColumnInterfaceBasedOnValue[D, js.Any]) & (typings.reactTable.anon.Header | typings.reactTable.anon.IdIdType[D] | typings.reactTable.anon.`0`[D]) & typings.reactTable.anon.`1`[D]

type ColumnWithStrictAccessor[D /* <: js.Object */] = typings.reactTable.mod.ColumnInterface[D] & (typings.reactTable.mod.ValueOf[
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof D ]: {  accessor :K} & react-table.react-table.ColumnInterfaceBasedOnValue<D, D[K]>}
  */ typings.reactTable.reactTableStrings.ColumnWithStrictAccessor & org.scalablytyped.runtime.TopLevel[D]])

type FilterProps[D /* <: js.Object */] = typings.reactTable.mod.HeaderProps[D]

type FilterTypes[D /* <: js.Object */] = typings.std.Record[java.lang.String, typings.reactTable.mod.FilterValue]

type FilterValue = js.Any

type Filters[D /* <: js.Object */] = js.Array[typings.reactTable.anon.Value[D]]

type FooterGroupPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableFooterGroupProps, 
typings.reactTable.anon.Column[D], 
typings.reactTable.anon.PartialTableFooterGroupPr]

type FooterPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableFooterProps, 
typings.reactTable.anon.Column[D], 
typings.reactTable.anon.PartialTableFooterProps]

type HeaderGroupPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableHeaderGroupProps, 
typings.reactTable.anon.Column[D], 
typings.reactTable.anon.PartialTableHeaderGroupPr]

type HeaderPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableHeaderProps, 
typings.reactTable.anon.Column[D], 
typings.reactTable.anon.PartialTableHeaderProps]

type Hooks[D /* <: js.Object */] = typings.reactTable.mod.UseTableHooks[D]

type IdType[D] = typings.reactTable.mod.StringKey[D] | java.lang.String

type Meta[D /* <: js.Object */, Extension, M] = (M & Extension) | M

type PropGetter[D /* <: js.Object */, Props, T /* <: js.Object */, P] = (js.Function2[
/* props */ P, 
/* meta */ typings.reactTable.mod.Meta[D, T, typings.reactTable.mod.MetaBase[D]], 
P | js.Array[P]]) | P | js.Array[P]

type Renderer[Props] = typings.react.mod.ComponentType[Props] | typings.react.mod.ReactElement | typings.react.mod.ReactText | typings.react.mod.ReactFragment

type Row[D /* <: js.Object */] = typings.reactTable.mod.UseTableRowProps[D]

type RowPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableRowProps, 
typings.reactTable.anon.Row[D], 
typings.reactTable.anon.PartialTableRowProps]

type SortByFn[D /* <: js.Object */] = js.Function4[
/* rowA */ typings.reactTable.mod.Row[D], 
/* rowB */ typings.reactTable.mod.Row[D], 
/* columnId */ typings.reactTable.mod.IdType[D], 
/* desc */ js.UndefOr[scala.Boolean], 
scala.Double]

type StringKey[D] = typings.std.Extract[/* keyof D */ java.lang.String, java.lang.String]

type TableBodyPropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableBodyProps, 
scala.Nothing, 
typings.reactTable.anon.PartialTableBodyProps]

type TableBodyProps = typings.reactTable.mod.TableCommonProps

type TableCellProps = typings.reactTable.mod.TableKeyedProps

type TableDispatch[A] = js.Function1[/* action */ A, scala.Unit]

type TableExpandedToggleProps = typings.reactTable.mod.TableKeyedProps

type TableFooterGroupProps = typings.reactTable.mod.TableKeyedProps

type TableFooterProps = typings.reactTable.mod.TableKeyedProps

type TableHeaderGroupProps = typings.reactTable.mod.TableKeyedProps

type TableHeaderProps = typings.reactTable.mod.TableKeyedProps

type TableOptions[D /* <: js.Object */] = typings.reactTable.mod.UseTableOptions[D]

type TablePropGetter[D /* <: js.Object */] = typings.reactTable.mod.PropGetter[
D, 
typings.reactTable.mod.TableProps, 
scala.Nothing, 
typings.reactTable.anon.PartialTableProps]

type TableProps = typings.reactTable.mod.TableCommonProps

type TableRowProps = typings.reactTable.mod.TableKeyedProps

type TableToggleAllRowsSelectedProps = typings.reactTable.mod.TableToggleCommonProps

type TableToggleHideAllColumnProps = typings.reactTable.mod.TableToggleCommonProps

type TableToggleRowsSelectedProps = typings.reactTable.mod.TableToggleCommonProps

type UpdateHiddenColumns[D /* <: js.Object */] = js.Function1[
/* oldHidden */ js.Array[typings.reactTable.mod.IdType[D]], 
js.Array[typings.reactTable.mod.IdType[D]]]

type UseRowStateLocalState[D /* <: js.Object */, T] = typings.std.Record[typings.reactTable.mod.IdType[D], T]

type UseRowUpdater[T] = T | (js.Function1[/* prev */ T, T])

type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
