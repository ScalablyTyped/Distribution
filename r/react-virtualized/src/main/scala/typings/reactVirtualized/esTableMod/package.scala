package typings.reactVirtualized.esTableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def SortDirection: typings.reactVirtualized.esTableMod.SortDirectionStatic = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("SortDirection").asInstanceOf[typings.reactVirtualized.esTableMod.SortDirectionStatic]

inline def SortIndicator: typings.react.mod.StatelessComponent[typings.reactVirtualized.anon.SortDirection] = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("SortIndicator").asInstanceOf[typings.react.mod.StatelessComponent[typings.reactVirtualized.anon.SortDirection]]

inline def createMultiSort(sortCallback: js.Function1[/* params */ typings.reactVirtualized.anon.SortBy, scala.Unit]): typings.reactVirtualized.esTableMod.MultiSortReturn = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMultiSort")(sortCallback.asInstanceOf[js.Any]).asInstanceOf[typings.reactVirtualized.esTableMod.MultiSortReturn]
inline def createMultiSort(
  sortCallback: js.Function1[/* params */ typings.reactVirtualized.anon.SortBy, scala.Unit],
  options: typings.reactVirtualized.esTableMod.MultiSortOptions
): typings.reactVirtualized.esTableMod.MultiSortReturn = (typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].applyDynamic("createMultiSort")(sortCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.reactVirtualized.esTableMod.MultiSortReturn]

inline def defaultCellDataGetter: typings.reactVirtualized.esTableMod.TableCellDataGetter = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellDataGetter").asInstanceOf[typings.reactVirtualized.esTableMod.TableCellDataGetter]

inline def defaultCellRenderer: typings.reactVirtualized.esTableMod.TableCellRenderer = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellRenderer").asInstanceOf[typings.reactVirtualized.esTableMod.TableCellRenderer]

inline def defaultHeaderRenderer(): js.Array[typings.react.mod.ReactElement] = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderRenderer")().asInstanceOf[js.Array[typings.react.mod.ReactElement]]

inline def defaultHeaderRowRenderer: typings.reactVirtualized.esTableMod.TableHeaderRowRenderer = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultHeaderRowRenderer").asInstanceOf[typings.reactVirtualized.esTableMod.TableHeaderRowRenderer]

inline def defaultRowRenderer: typings.reactVirtualized.esTableMod.TableRowRenderer = typings.reactVirtualized.esTableMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultRowRenderer").asInstanceOf[typings.reactVirtualized.esTableMod.TableRowRenderer]

type SortDirectionMap = org.scalablytyped.runtime.StringDictionary[typings.reactVirtualized.esTableMod.SortDirectionType]

type TableCellDataGetter = js.Function1[/* params */ typings.reactVirtualized.esTableMod.TableCellDataGetterParams, js.Any]

type TableCellRenderer = js.Function1[
/* props */ typings.reactVirtualized.esTableMod.TableCellProps, 
typings.react.mod.ReactNode]

type TableHeaderRenderer = js.Function1[
/* props */ typings.reactVirtualized.esTableMod.TableHeaderProps, 
typings.react.mod.ReactNode]

type TableHeaderRowRenderer = js.Function1[
/* props */ typings.reactVirtualized.esTableMod.TableHeaderRowProps, 
typings.react.mod.ReactNode]

type TableRowRenderer = js.Function1[
/* props */ typings.reactVirtualized.esTableMod.TableRowProps, 
typings.react.mod.ReactNode]
