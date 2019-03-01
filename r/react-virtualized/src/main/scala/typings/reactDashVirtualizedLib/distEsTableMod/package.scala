package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsTableMod {
  type TableCellDataGetter = js.Function1[/* params */ TableCellDataGetterParams, js.Any]
  type TableCellRenderer = js.Function1[/* props */ TableCellProps, reactLib.reactMod.ReactNs.ReactNode]
  type TableHeaderRenderer = js.Function1[/* props */ TableHeaderProps, reactLib.reactMod.ReactNs.ReactNode]
  type TableHeaderRowRenderer = js.Function1[/* props */ TableHeaderRowProps, reactLib.reactMod.ReactNs.ReactNode]
  type TableProps = reactDashVirtualizedLib.distEsGridMod.GridCoreProps with reactDashVirtualizedLib.Anon_ArialabelAutoHeightChildren
  type TableRowRenderer = js.Function1[/* props */ TableRowProps, reactLib.reactMod.ReactNs.ReactNode]
}
