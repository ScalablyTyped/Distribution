package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPanelProps extends js.Object {
  /**
  	 * The basic components for the pagination panel, provided here so that you have the option to use some of them
  	 * if you don't want to customize all of them.
  	 */
  var components: reactDashBootstrapDashTableLib.Anon_PageList
  /**
  	 * Current page number
  	 */
  var currPage: scala.Double
  /**
  	 * Index number for the first page of data.
  	 * Comes from Options.pageStartIndex.
  	 */
  var pageStartIndex: scala.Double
  /**
  	 * Current number of rows to show per page
  	 */
  var sizePerPage: scala.Double
  /**
  	 * Choices for size per page dropdown component
  	 */
  var sizePerPageList: SizePerPageList
  /**
  	 * Callback function to use to change page.
  	 */
  def changePage(pageNum: scala.Double): scala.Unit
  /**
  	 * Callback function to use to set a new size per page.
  	 */
  def changeSizePerPage(sizePerPage: scala.Double): scala.Unit
  /**
  	 * Callback function to trigger the toggle on sizePerPage dropdown button
  	 */
  def toggleDropDown(): scala.Unit
}

object PaginationPanelProps {
  @scala.inline
  def apply(
    changePage: scala.Double => scala.Unit,
    changeSizePerPage: scala.Double => scala.Unit,
    components: reactDashBootstrapDashTableLib.Anon_PageList,
    currPage: scala.Double,
    pageStartIndex: scala.Double,
    sizePerPage: scala.Double,
    sizePerPageList: SizePerPageList,
    toggleDropDown: () => scala.Unit
  ): PaginationPanelProps = {
    val __obj = js.Dynamic.literal(changePage = js.Any.fromFunction1(changePage), changeSizePerPage = js.Any.fromFunction1(changeSizePerPage), components = components, currPage = currPage, pageStartIndex = pageStartIndex, sizePerPage = sizePerPage, sizePerPageList = sizePerPageList.asInstanceOf[js.Any], toggleDropDown = js.Any.fromFunction0(toggleDropDown))
  
    __obj.asInstanceOf[PaginationPanelProps]
  }
}

