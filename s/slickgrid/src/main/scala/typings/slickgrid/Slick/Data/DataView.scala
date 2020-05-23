package typings.slickgrid.Slick.Data

import typings.slickgrid.Slick.DataProvider
import typings.slickgrid.Slick.Event
import typings.slickgrid.Slick.Grid
import typings.slickgrid.Slick.Group
import typings.slickgrid.Slick.RowMetadata
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataView[T /* <: SlickData */] extends DataProvider[T] {
  var onPagingInfoChanged: Event[OnPagingInfoChangedEventData] = js.native
  var onRowCountChanged: Event[OnRowCountChangedEventData] = js.native
  var onRowsChanged: Event[OnRowsChangedEventData] = js.native
  def addItem(item: T): Unit = js.native
  def beginUpdate(): Unit = js.native
  /**
    * @param level Optional level to collapse.  If not specified, applies to all levels.
    **/
  def collapseAllGroups(): Unit = js.native
  def collapseAllGroups(level: Double): Unit = js.native
  /**
    * @param varArgs Either a Slick.Group's "groupingKey" property, or a
    *     variable argument list of grouping values denoting a unique path to the row.  For
    *     example, calling collapseGroup('high', '10%') will collapse the '10%' subgroup of
    *     the 'high' setGrouping.
    */
  def collapseGroup(varArgs: String*): Unit = js.native
  def deleteItem(id: String): Unit = js.native
  def endUpdate(): Unit = js.native
  /**
    * @param level Optional level to collapse.  If not specified, applies to all levels.
    **/
  def expandAllGroups(): Unit = js.native
  def expandAllGroups(level: Double): Unit = js.native
  /**
    * @param varArgs Either a Slick.Group's "groupingKey" property, or a
    *     variable argument list of grouping values denoting a unique path to the row.  For
    *     example, calling expandGroup('high', '10%') will expand the '10%' subgroup of
    *     the 'high' setGrouping.
    */
  def expandGroup(varArgs: String*): Unit = js.native
          // todo: typeof(comparer), should be the same callback as Array.sort
  def fastSort(field: String, ascending: Boolean): Unit = js.native
  def fastSort(field: js.Function, ascending: Boolean): Unit = js.native
  def getGrouping(): js.Array[GroupingOptions[T]] = js.native
  def getGroups(): js.Array[Group[T]] = js.native
  def getIdxById(id: String): Double = js.native
  def getItemById(id: js.Any): T = js.native
  def getItemByIdx(idx: Double): T = js.native
  @JSName("getItemMetadata")
  def getItemMetadata_MDataView(index: Double): RowMetadata[T] = js.native
  def getItems(): js.Array[T] = js.native
  def getPagingInfo(): PagingOptions = js.native
  def getRowById(id: String): Double = js.native
  /**
    * @deprecated
    **/
  def groupBy(valueGetter: js.Any, valueFormatter: js.Any, sortComparer: js.Any): Unit = js.native
  def insertItem(insertBefore: Double, item: T): Unit = js.native
  def mapRowsToIds(rowArray: js.Array[Double]): js.Array[String] = js.native
          // todo: typeof(field), should be the same callback as Array.sort
  def reSort(): Unit = js.native
  def refresh(): Unit = js.native
  /**
    * @deprecated
    **/
  def setAggregators(groupAggregators: js.Any, includeCollapsed: js.Any): Unit = js.native
  def setFilter(filterFn: js.Function2[/* item */ T, /* args */ js.Any, Boolean]): Unit = js.native
  def setFilterArgs(args: js.Any): Unit = js.native
  def setGrouping(groupingInfos: js.Array[GroupingOptions[T]]): Unit = js.native
  def setGrouping(groupingInfos: GroupingOptions[T]): Unit = js.native
  def setItems(data: js.Array[T]): Unit = js.native
  def setItems(data: js.Array[T], objectIdProperty: String): Unit = js.native
  def setPagingOptions(args: PagingOptions): Unit = js.native
  def setRefreshHints(hints: RefreshHints): Unit = js.native
      // todo: typeof(args)
  def sort(comparer: js.Function, ascending: Boolean): Unit = js.native
  def syncGridCellCssStyles(grid: Grid[T], key: String): Unit = js.native
  def syncGridSelection(grid: Grid[T], preserveHidden: Boolean): Unit = js.native
  def updateItem(id: String, item: T): Unit = js.native
}

