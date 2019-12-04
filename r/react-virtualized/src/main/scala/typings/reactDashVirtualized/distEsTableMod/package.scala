package typings.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsTableMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ReactNode
  import typings.reactDashVirtualized.Anon_ArialabelAutoHeightChildren
  import typings.reactDashVirtualized.distEsGridMod.GridCoreProps

  type SortDirectionMap = StringDictionary[SortDirectionType]
  type TableCellDataGetter = js.Function1[/* params */ TableCellDataGetterParams, js.Any]
  type TableCellRenderer = js.Function1[/* props */ TableCellProps, ReactNode]
  type TableHeaderRenderer = js.Function1[/* props */ TableHeaderProps, ReactNode]
  type TableHeaderRowRenderer = js.Function1[/* props */ TableHeaderRowProps, ReactNode]
  type TableProps = GridCoreProps with Anon_ArialabelAutoHeightChildren
  type TableRowRenderer = js.Function1[/* props */ TableRowProps, ReactNode]
}
