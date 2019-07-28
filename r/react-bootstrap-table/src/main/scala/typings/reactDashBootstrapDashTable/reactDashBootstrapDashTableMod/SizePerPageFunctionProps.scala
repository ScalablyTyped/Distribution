package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizePerPageFunctionProps extends js.Object {
  /**
  	 * Current size per page as a string value.
  	 */
  var currSizePerPage: String
  /**
  	 * Flag indicating that the sizePerPage dropdown should be hidden.
  	 */
  var hideSizePerPage: Boolean
  /**
  	 * Flag to indicate that the sizePerPage dropdown should currently be 'open'.
  	 */
  var open: Boolean
  /**
  	 * Array of the size per page options to display in the dropdown.
  	 */
  var sizePerPageList: SizePerPageList
  /**
  	 * Callback function to use to change the current size per page.
  	 */
  def changeSizePerPage(newSizePerPage: Double): Unit
  /**
  	 * On-click toggle function callback to open/close the size per page dropdown list.
  	 */
  def toggleDropDown(): Unit
}

object SizePerPageFunctionProps {
  @scala.inline
  def apply(
    changeSizePerPage: Double => Unit,
    currSizePerPage: String,
    hideSizePerPage: Boolean,
    open: Boolean,
    sizePerPageList: SizePerPageList,
    toggleDropDown: () => Unit
  ): SizePerPageFunctionProps = {
    val __obj = js.Dynamic.literal(changeSizePerPage = js.Any.fromFunction1(changeSizePerPage), currSizePerPage = currSizePerPage, hideSizePerPage = hideSizePerPage, open = open, sizePerPageList = sizePerPageList, toggleDropDown = js.Any.fromFunction0(toggleDropDown))
  
    __obj.asInstanceOf[SizePerPageFunctionProps]
  }
}

