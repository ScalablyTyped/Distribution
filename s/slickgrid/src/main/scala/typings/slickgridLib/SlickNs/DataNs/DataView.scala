package typings
package slickgridLib.SlickNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data.DataView")
@js.native
class DataView[T /* <: slickgridLib.SlickNs.SlickData */] ()
  extends slickgridLib.SlickNs.DataProvider[T] {
  def this(options: DataViewOptions[T]) = this()
  var onPagingInfoChanged: slickgridLib.SlickNs.Event[OnPagingInfoChangedEventData] = js.native
  var onRowCountChanged: slickgridLib.SlickNs.Event[OnRowCountChangedEventData] = js.native
  var onRowsChanged: slickgridLib.SlickNs.Event[OnRowsChangedEventData] = js.native
  def addItem(item: T): scala.Unit = js.native
  def beginUpdate(): scala.Unit = js.native
  /**
  			* @param level Optional level to collapse.  If not specified, applies to all levels.
  			**/
  def collapseAllGroups(): scala.Unit = js.native
  /**
  			* @param level Optional level to collapse.  If not specified, applies to all levels.
  			**/
  def collapseAllGroups(level: scala.Double): scala.Unit = js.native
  /**
  			* @param varArgs Either a Slick.Group's "groupingKey" property, or a
  			*     variable argument list of grouping values denoting a unique path to the row.  For
  			*     example, calling collapseGroup('high', '10%') will collapse the '10%' subgroup of
  			*     the 'high' setGrouping.
  			*/
  def collapseGroup(varArgs: java.lang.String*): scala.Unit = js.native
  def deleteItem(id: java.lang.String): scala.Unit = js.native
  def endUpdate(): scala.Unit = js.native
  /**
  			* @param level Optional level to collapse.  If not specified, applies to all levels.
  			**/
  def expandAllGroups(): scala.Unit = js.native
  /**
  			* @param level Optional level to collapse.  If not specified, applies to all levels.
  			**/
  def expandAllGroups(level: scala.Double): scala.Unit = js.native
  /**
  			* @param varArgs Either a Slick.Group's "groupingKey" property, or a
  			*     variable argument list of grouping values denoting a unique path to the row.  For
  			*     example, calling expandGroup('high', '10%') will expand the '10%' subgroup of
  			*     the 'high' setGrouping.
  			*/
  def expandGroup(varArgs: java.lang.String*): scala.Unit = js.native
  		// todo: typeof(comparer), should be the same callback as Array.sort
  def fastSort(field: java.lang.String, ascending: scala.Boolean): scala.Unit = js.native
  def fastSort(field: js.Function, ascending: scala.Boolean): scala.Unit = js.native
  def getGrouping(): js.Array[GroupingOptions[T]] = js.native
  def getGroups(): js.Array[slickgridLib.SlickNs.Group[T]] = js.native
  def getIdxById(id: java.lang.String): scala.Double = js.native
  /**
  		 * Returns the item at a given index.
  		 * @param index
  		 */
  /* CompleteClass */
  override def getItem(index: scala.Double): T = js.native
  def getItemById(id: js.Any): T = js.native
  def getItemByIdx(idx: scala.Double): T = js.native
  @JSName("getItemMetadata")
  def getItemMetadata_MDataView(index: scala.Double): slickgridLib.SlickNs.RowMetadata[T] = js.native
  def getItems(): js.Array[T] = js.native
  /**
  		 * Returns the number of data items in the set.
  		 */
  /* CompleteClass */
  override def getLength(): scala.Double = js.native
  def getPagingInfo(): PagingOptions = js.native
  def getRowById(id: java.lang.String): scala.Double = js.native
  /**
  			* @deprecated
  			**/
  def groupBy(valueGetter: js.Any, valueFormatter: js.Any, sortComparer: js.Any): scala.Unit = js.native
  def insertItem(insertBefore: scala.Double, item: T): scala.Unit = js.native
  def mapRowsToIds(rowArray: js.Array[scala.Double]): js.Array[java.lang.String] = js.native
  		// todo: typeof(field), should be the same callback as Array.sort
  def reSort(): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  /**
  			* @deprecated
  			**/
  def setAggregators(groupAggregators: js.Any, includeCollapsed: js.Any): scala.Unit = js.native
  def setFilter(filterFn: js.Function2[/* item */ T, /* args */ js.Any, scala.Boolean]): scala.Unit = js.native
  def setFilterArgs(args: js.Any): scala.Unit = js.native
  def setGrouping(groupingInfos: js.Array[GroupingOptions[T]]): scala.Unit = js.native
  def setGrouping(groupingInfos: GroupingOptions[T]): scala.Unit = js.native
  def setItems(data: js.Array[T]): scala.Unit = js.native
  def setItems(data: js.Array[T], objectIdProperty: java.lang.String): scala.Unit = js.native
  def setPagingOptions(args: PagingOptions): scala.Unit = js.native
  def setRefreshHints(hints: RefreshHints): scala.Unit = js.native
  	// todo: typeof(args)
  def sort(comparer: js.Function, ascending: scala.Boolean): scala.Unit = js.native
  def syncGridCellCssStyles(grid: slickgridLib.SlickNs.Grid[T], key: java.lang.String): scala.Unit = js.native
  def syncGridSelection(grid: slickgridLib.SlickNs.Grid[T], preserveHidden: scala.Boolean): scala.Unit = js.native
  def updateItem(id: java.lang.String, item: T): scala.Unit = js.native
}

