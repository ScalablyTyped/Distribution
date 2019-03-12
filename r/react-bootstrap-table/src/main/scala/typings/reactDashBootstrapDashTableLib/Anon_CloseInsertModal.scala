package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseInsertModal extends js.Object {
  /**
  		 * Callback to close the insert row modal window.
  		 */
  def closeInsertModal(): scala.Unit
  /**
  		 * Callback to delete selected row(s) from the table.
  		 */
  def dropRow(): scala.Unit
  /**
  		 * Callback to export the table to a CSV file.
  		 */
  def exportCSV(): scala.Unit
  /**
  		 * Callback to activate the insert row modal window.
  		 */
  def openInsertModal(): scala.Unit
  /**
  		 * Callback to apply a search.
  		 */
  def search(): scala.Unit
  /**
  		 * Callback to toggle between showing all rows and showing only selected rows.
  		 */
  def showOnlyToogle(): scala.Unit
}

object Anon_CloseInsertModal {
  @scala.inline
  def apply(
    closeInsertModal: () => scala.Unit,
    dropRow: () => scala.Unit,
    exportCSV: () => scala.Unit,
    openInsertModal: () => scala.Unit,
    search: () => scala.Unit,
    showOnlyToogle: () => scala.Unit
  ): Anon_CloseInsertModal = {
    val __obj = js.Dynamic.literal(closeInsertModal = js.Any.fromFunction0(closeInsertModal), dropRow = js.Any.fromFunction0(dropRow), exportCSV = js.Any.fromFunction0(exportCSV), openInsertModal = js.Any.fromFunction0(openInsertModal), search = js.Any.fromFunction0(search), showOnlyToogle = js.Any.fromFunction0(showOnlyToogle))
  
    __obj.asInstanceOf[Anon_CloseInsertModal]
  }
}

