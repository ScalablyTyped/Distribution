package typings
package reactDashVirtualizedLib.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IS_SCROLLING_TIMEOUT: /* 150 */ scala.Double = js.native
  val SortDirection: reactDashVirtualizedLib.distEsTableMod.SortDirectionStatic = js.native
  val SortIndicator: reactLib.reactMod.ReactNs.StatelessComponent[reactDashVirtualizedLib.Anon_SortDirection] = js.native
  val accessibilityOverscanIndicesGetter: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter = js.native
  val defaultCellRangeRenderer: reactDashVirtualizedLib.distEsGridMod.GridCellRangeRenderer = js.native
  val defaultOverscanIndicesGetter: reactDashVirtualizedLib.distEsGridMod.OverscanIndicesGetter = js.native
  val defaultTableCellDataGetter: reactDashVirtualizedLib.distEsTableMod.TableCellDataGetter = js.native
  val defaultTableCellRenderer: reactDashVirtualizedLib.distEsTableMod.TableCellRenderer = js.native
  val defaultTableHeaderRowRenderer: reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer = js.native
  val defaultTableRowRenderer: reactDashVirtualizedLib.distEsTableMod.TableRowRenderer = js.native
  def createMasonryCellPositioner(params: reactDashVirtualizedLib.distEsMasonryMod.createCellPositionerParams): reactDashVirtualizedLib.distEsMasonryMod.Positioner = js.native
  def createTableMultiSort(sortCallback: js.Function1[/* params */ reactDashVirtualizedLib.Anon_SortBy, scala.Unit]): reactDashVirtualizedLib.distEsTableMod.MultiSortReturn = js.native
  def createTableMultiSort(
    sortCallback: js.Function1[/* params */ reactDashVirtualizedLib.Anon_SortBy, scala.Unit],
    options: reactDashVirtualizedLib.distEsTableMod.MultiSortOptions
  ): reactDashVirtualizedLib.distEsTableMod.MultiSortReturn = js.native
  def defaultTableHeaderRenderer(): js.Array[reactLib.reactMod.ReactNs.ReactElement] = js.native
}

