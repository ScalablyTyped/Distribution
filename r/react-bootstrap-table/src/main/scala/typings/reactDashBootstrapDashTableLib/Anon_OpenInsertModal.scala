package typings
package reactDashBootstrapDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpenInsertModal extends js.Object {
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

