package typings
package reactDashVirtualizedLib.distEsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Table", JSImport.Namespace)
@js.native
object distEsTableModMembers extends js.Object {
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: reactLib.reactMod.ReactNs.StatelessComponent[reactDashVirtualizedLib.Anon_SortDirection] = js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  val defaultHeaderRenderer: js.Function0[js.Array[reactLib.reactMod.ReactNs.ReactElement[TableHeaderProps]]] = js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultRowRenderer: TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ reactDashVirtualizedLib.Anon_SortBy, scala.Unit]): MultiSortReturn = js.native
  def createMultiSort(
    sortCallback: js.Function1[/* params */ reactDashVirtualizedLib.Anon_SortBy, scala.Unit],
    options: MultiSortOptions
  ): MultiSortReturn = js.native
}

