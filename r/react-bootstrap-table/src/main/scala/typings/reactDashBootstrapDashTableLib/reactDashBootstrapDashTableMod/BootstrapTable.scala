package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-bootstrap-table", "BootstrapTable")
@js.native
class BootstrapTable ()
  extends reactLib.reactMod.Component[BootstrapTableProps, js.Object, js.Any] {
  /**
  	 * Deselect all rows in the table.
  	 */
  def cleanSelected(): scala.Unit = js.native
  /**
  	 * Reset the sort options to the defaults. Documented in examples but missing from main options list.
  	 * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/sort/clean-sorted-table.js
  	 */
  def cleanSort(): scala.Unit = js.native
  def getPageByRowKey(rowKey: java.lang.String): scala.Double = js.native
  /**
  	 * Call this function to get the page by a rowkey
  	 */
  def getPageByRowKey(rowKey: scala.Double): scala.Double = js.native
  /**
  	 * Call this function to insert a new row to table.
  	 */
  def handleAddRow(row: js.Any): scala.Unit = js.native
  /**
  	 * Call this function to insert a new row as the first row in the table.
  	 */
  def handleAddRowAtBegin(row: js.Any): scala.Unit = js.native
  /**
  	 * Call this function to drop/delete rows from the table.
  	 */
  def handleDropRow(rowKeys: js.Array[scala.Double | java.lang.String]): scala.Unit = js.native
  /**
  	 * Call this function to export table as csv.
  	 */
  def handleExportCSV(): scala.Unit = js.native
  /**
  	 * Call this function to do column filtering on table.
  	 * @example:
  	 *  // Filtering passing an array of values
  	 *  this.refs.table.handleFilterData({
  	 *      name: { type: 'ArrayFilter', value: ['Item name 3', 'Item name 4'] },
  	 *      price: { type: 'ArrayFilter', value: [2100, 2104] }
  	 *  });
  	 */
  def handleFilterData(filter: FilterData[_]): scala.Unit = js.native
  /**
  	 * Call this function with search text for fully searching.
  	 */
  def handleSearch(search: java.lang.String): scala.Unit = js.native
  /**
  	 * Call this function to sort table.
  	 */
  def handleSort(order: SortOrder, dataField: java.lang.String): scala.Unit = js.native
  /**
  	 * Call reset to clean all the status on the table currently (sort, editing, filtering, search).
  	 */
  def reset(): scala.Unit = js.native
}

