package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.SortBy
import typings.reactVirtualized.esTableMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def SortDirection: SortDirectionStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("SortDirection").asInstanceOf[SortDirectionStatic]

inline def SortIndicator: FunctionComponent[typings.reactVirtualized.anon.SortDirection] = ^.asInstanceOf[js.Dynamic].selectDynamic("SortIndicator").asInstanceOf[FunctionComponent[typings.reactVirtualized.anon.SortDirection]]

inline def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit]): MultiSortReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultiSort")(sortCallback.asInstanceOf[js.Any]).asInstanceOf[MultiSortReturn]
inline def createMultiSort(sortCallback: js.Function1[/* params */ SortBy, Unit], options: MultiSortOptions): MultiSortReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiSort")(sortCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiSortReturn]

inline def defaultCellDataGetter: TableCellDataGetter = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellDataGetter").asInstanceOf[TableCellDataGetter]

inline def defaultCellRenderer: TableCellRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellRenderer").asInstanceOf[TableCellRenderer]

inline def defaultHeaderRenderer(): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderRenderer")().asInstanceOf[js.Array[ReactElement]]

inline def defaultHeaderRowRenderer: TableHeaderRowRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultHeaderRowRenderer").asInstanceOf[TableHeaderRowRenderer]

inline def defaultRowRenderer: TableRowRenderer = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultRowRenderer").asInstanceOf[TableRowRenderer]

type SortDirectionMap = StringDictionary[SortDirectionType]

type TableCellDataGetter = js.Function1[/* params */ TableCellDataGetterParams, Any]

type TableCellRenderer = js.Function1[/* props */ TableCellProps, ReactNode]

type TableHeaderRenderer = js.Function1[/* props */ TableHeaderProps, ReactNode]

type TableHeaderRowRenderer = js.Function1[/* props */ TableHeaderRowProps, ReactNode]

type TableRowRenderer = js.Function1[/* props */ TableRowProps, ReactNode]
