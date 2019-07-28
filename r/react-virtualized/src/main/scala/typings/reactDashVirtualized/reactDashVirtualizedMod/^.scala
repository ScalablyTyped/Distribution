package typings.reactDashVirtualized.reactDashVirtualizedMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import typings.reactDashVirtualized.Anon_SortBy
import typings.reactDashVirtualized.Anon_SortDirection
import typings.reactDashVirtualized.distEsGridMod.GridCellRangeRenderer
import typings.reactDashVirtualized.distEsGridMod.OverscanIndicesGetter
import typings.reactDashVirtualized.distEsMasonryMod.Positioner
import typings.reactDashVirtualized.distEsMasonryMod.createCellPositionerParams
import typings.reactDashVirtualized.distEsTableMod.MultiSortOptions
import typings.reactDashVirtualized.distEsTableMod.MultiSortReturn
import typings.reactDashVirtualized.distEsTableMod.SortDirectionStatic
import typings.reactDashVirtualized.distEsTableMod.TableCellDataGetter
import typings.reactDashVirtualized.distEsTableMod.TableCellRenderer
import typings.reactDashVirtualized.distEsTableMod.TableHeaderRowRenderer
import typings.reactDashVirtualized.distEsTableMod.TableRowRenderer
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val IS_SCROLLING_TIMEOUT: `150` = js.native
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: StatelessComponent[Anon_SortDirection] = js.native
  val accessibilityOverscanIndicesGetter: OverscanIndicesGetter = js.native
  val defaultCellRangeRenderer: GridCellRangeRenderer = js.native
  val defaultOverscanIndicesGetter: OverscanIndicesGetter = js.native
  val defaultTableCellDataGetter: TableCellDataGetter = js.native
  val defaultTableCellRenderer: TableCellRenderer = js.native
  val defaultTableHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultTableRowRenderer: TableRowRenderer = js.native
  def createMasonryCellPositioner(params: createCellPositionerParams): Positioner = js.native
  def createTableMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit]): MultiSortReturn = js.native
  def createTableMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  def defaultTableHeaderRenderer(): js.Array[ReactElement] = js.native
}

