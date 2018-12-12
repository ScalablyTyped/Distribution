package typings
package reactDashVirtualizedLib.distCommonjsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Table", JSImport.Namespace)
@js.native
object distCommonjsTableModMembers extends js.Object {
  val SortDirection: reactDashVirtualizedLib.distEsTableMod.SortDirectionStatic = js.native
  val SortIndicator: reactLib.reactMod.ReactNs.StatelessComponent[reactDashVirtualizedLib.Anon_SortDirection] = js.native
  val defaultCellDataGetter: reactDashVirtualizedLib.distEsTableMod.TableCellDataGetter = js.native
  val defaultCellRenderer: reactDashVirtualizedLib.distEsTableMod.TableCellRenderer = js.native
  val defaultHeaderRowRenderer: reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer = js.native
  val defaultRowRenderer: reactDashVirtualizedLib.distEsTableMod.TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ reactDashVirtualizedLib.Anon_SortBy, scala.Unit]): reactDashVirtualizedLib.distEsTableMod.MultiSortReturn = js.native
  def createMultiSort(
    sortCallback: js.Function1[/* params */ reactDashVirtualizedLib.Anon_SortBy, scala.Unit],
    options: reactDashVirtualizedLib.distEsTableMod.MultiSortOptions
  ): reactDashVirtualizedLib.distEsTableMod.MultiSortReturn = js.native
  def defaultHeaderRenderer(): js.Array[
    reactLib.reactMod.ReactNs.ReactElement[reactDashVirtualizedLib.distEsTableMod.TableHeaderProps]
  ] = js.native
}

