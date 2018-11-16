package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SizePerPageFunctionProps extends js.Object {
  /**
  	 * Current size per page as a string value.
  	 */
  var currSizePerPage: java.lang.String
  /**
  	 * Flag indicating that the sizePerPage dropdown should be hidden.
  	 */
  var hideSizePerPage: scala.Boolean
  /**
  	 * Flag to indicate that the sizePerPage dropdown should currently be 'open'.
  	 */
  var open: scala.Boolean
  /**
  	 * Array of the size per page options to display in the dropdown.
  	 */
  var sizePerPageList: SizePerPageList
  /**
  	 * Callback function to use to change the current size per page.
  	 */
  def changeSizePerPage(newSizePerPage: scala.Double): scala.Unit
  /**
  	 * On-click toggle function callback to open/close the size per page dropdown list.
  	 */
  def toggleDropDown(): scala.Unit
}

