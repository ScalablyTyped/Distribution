package typings.reactDashVirtualized.distEsTableMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import typings.reactDashVirtualized.Anon_SortBy
import typings.reactDashVirtualized.Anon_SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Table", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SortDirection: SortDirectionStatic = js.native
  val SortIndicator: StatelessComponent[Anon_SortDirection] = js.native
  val defaultCellDataGetter: TableCellDataGetter = js.native
  val defaultCellRenderer: TableCellRenderer = js.native
  val defaultHeaderRowRenderer: TableHeaderRowRenderer = js.native
  val defaultRowRenderer: TableRowRenderer = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit]): MultiSortReturn = js.native
  def createMultiSort(sortCallback: js.Function1[/* params */ Anon_SortBy, Unit], options: MultiSortOptions): MultiSortReturn = js.native
  def defaultHeaderRenderer(): js.Array[ReactElement] = js.native
}

