package typings.reactBootstrapTable.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap-table", "BootstrapTable")
@js.native
open class BootstrapTable protected ()
  extends Component[BootstrapTableProps, js.Object, Any] {
  def this(props: BootstrapTableProps) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: BootstrapTableProps, context: Any) = this()
  
  /**
    * Deselect all rows in the table.
    */
  def cleanSelected(): Unit = js.native
  
  /**
    * Reset the sort options to the defaults. Documented in examples but missing from main options list.
    * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/sort/clean-sorted-table.js
    */
  def cleanSort(): Unit = js.native
  
  def getPageByRowKey(rowKey: String): Double = js.native
  /**
    * Call this function to get the page by a rowkey
    */
  def getPageByRowKey(rowKey: Double): Double = js.native
  
  /**
    * Call this function to insert a new row to table.
    */
  def handleAddRow(row: Any): Unit = js.native
  
  /**
    * Call this function to insert a new row as the first row in the table.
    */
  def handleAddRowAtBegin(row: Any): Unit = js.native
  
  /**
    * Call this function to drop/delete rows from the table.
    */
  def handleDropRow(rowKeys: js.Array[Double | String]): Unit = js.native
  
  /**
    * Call this function to export table as csv.
    */
  def handleExportCSV(): Unit = js.native
  
  /**
    * Call this function to do column filtering on table.
    * @example
    *  // Filtering passing an array of values
    *  this.refs.table.handleFilterData({
    *      name: { type: 'ArrayFilter', value: ['Item name 3', 'Item name 4'] },
    *      price: { type: 'ArrayFilter', value: [2100, 2104] }
    *  });
    */
  def handleFilterData(filter: FilterData[Any]): Unit = js.native
  
  /**
    * Call this function with search text for fully searching.
    */
  def handleSearch(search: String): Unit = js.native
  
  /**
    * Call this function to sort table.
    */
  def handleSort(order: SortOrder, dataField: String): Unit = js.native
  
  /**
    * Call reset to clean all the status on the table currently (sort, editing, filtering, search).
    */
  def reset(): Unit = js.native
}
