package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBodyInterface[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * The required getFieldValue method that must be implemented on a customized insert modal body that returns the
  	 * new row data when the save button is clicked in the modal window.
  	 */
  def getFieldValue(): TRow
}

