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
    closeInsertModal: js.Function0[scala.Unit],
    dropRow: js.Function0[scala.Unit],
    exportCSV: js.Function0[scala.Unit],
    openInsertModal: js.Function0[scala.Unit],
    search: js.Function0[scala.Unit],
    showOnlyToogle: js.Function0[scala.Unit]
  ): Anon_CloseInsertModal = {
    val __obj = js.Dynamic.literal(closeInsertModal = closeInsertModal, dropRow = dropRow, exportCSV = exportCSV, openInsertModal = openInsertModal, search = search, showOnlyToogle = showOnlyToogle)
  
    __obj.asInstanceOf[Anon_CloseInsertModal]
  }
}

