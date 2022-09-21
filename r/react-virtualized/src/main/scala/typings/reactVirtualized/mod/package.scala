package typings.reactVirtualized.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.reactVirtualized.anon.SortBy
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esMasonryMod.Positioner
import typings.reactVirtualized.esMasonryMod.createCellPositionerParams
import typings.reactVirtualized.esTableMod.MultiSortOptions
import typings.reactVirtualized.esTableMod.MultiSortReturn
import typings.reactVirtualized.esTableMod.SortDirectionStatic
import typings.reactVirtualized.esTableMod.TableCellDataGetter
import typings.reactVirtualized.esTableMod.TableCellRenderer
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableRowRenderer
import typings.reactVirtualized.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def IS_SCROLLING_TIMEOUT: /* 150 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("IS_SCROLLING_TIMEOUT").asInstanceOf[/* 150 */ Double]

inline def SortDirection: SortDirectionStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("SortDirection").asInstanceOf[SortDirectionStatic]

inline def SortIndicator: FunctionComponent[typings.reactVirtualized.anon.SortDirection] = ^.asInstanceOf[js.Dynamic].selectDynamic("SortIndicator").asInstanceOf[FunctionComponent[typings.reactVirtualized.anon.SortDirection]]

inline def accessibilityOverscanIndicesGetter: OverscanIndicesGetter = ^.asInstanceOf[js.Dynamic].selectDynamic("accessibilityOverscanIndicesGetter").asInstanceOf[OverscanIndicesGetter]

inline def createMasonryCellPositioner(params: createCellPositionerParams): Positioner = ^.asInstanceOf[js.Dynamic].applyDynamic("createMasonryCellPositioner")(params.asInstanceOf[js.Any]).asInstanceOf[Positioner]

inline def createTableMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit]): MultiSortReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("createTableMultiSort")(sortCallback.asInstanceOf[js.Any]).asInstanceOf[MultiSortReturn]
inline def createTableMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit], options: MultiSortOptions): MultiSortReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("createTableMultiSort")(sortCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiSortReturn]

inline def defaultCellRangeRenderer: GridCellRangeRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellRangeRenderer").asInstanceOf[GridCellRangeRenderer]

inline def defaultOverscanIndicesGetter: OverscanIndicesGetter = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultOverscanIndicesGetter").asInstanceOf[OverscanIndicesGetter]

inline def defaultTableCellDataGetter: TableCellDataGetter = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTableCellDataGetter").asInstanceOf[TableCellDataGetter]

inline def defaultTableCellRenderer: TableCellRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTableCellRenderer").asInstanceOf[TableCellRenderer]

inline def defaultTableHeaderRenderer(): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTableHeaderRenderer")().asInstanceOf[js.Array[ReactElement]]

inline def defaultTableHeaderRowRenderer: TableHeaderRowRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTableHeaderRowRenderer").asInstanceOf[TableHeaderRowRenderer]

inline def defaultTableRowRenderer: TableRowRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTableRowRenderer").asInstanceOf[TableRowRenderer]

type Map[T] = StringDictionary[T]
