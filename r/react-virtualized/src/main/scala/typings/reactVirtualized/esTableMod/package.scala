package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esTableMod {
  
  type SortDirectionMap = org.scalablytyped.runtime.StringDictionary[typings.reactVirtualized.esTableMod.SortDirectionType]
  
  type TableCellDataGetter = js.Function1[/* params */ typings.reactVirtualized.esTableMod.TableCellDataGetterParams, js.Any]
  
  type TableCellRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esTableMod.TableCellProps, 
    typings.react.mod.ReactNode
  ]
  
  type TableHeaderRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esTableMod.TableHeaderProps, 
    typings.react.mod.ReactNode
  ]
  
  type TableHeaderRowRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esTableMod.TableHeaderRowProps, 
    typings.react.mod.ReactNode
  ]
  
  type TableRowRenderer = js.Function1[
    /* props */ typings.reactVirtualized.esTableMod.TableRowProps, 
    typings.react.mod.ReactNode
  ]
}
