package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.PageList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPanelProps extends js.Object {
  /**
    * The basic components for the pagination panel, provided here so that you have the option to use some of them
    * if you don't want to customize all of them.
    */
  var components: PageList
  /**
    * Current page number
    */
  var currPage: Double
  /**
    * Index number for the first page of data.
    * Comes from Options.pageStartIndex.
    */
  var pageStartIndex: Double
  /**
    * Current number of rows to show per page
    */
  var sizePerPage: Double
  /**
    * Choices for size per page dropdown component
    */
  var sizePerPageList: SizePerPageList
  /**
    * Callback function to use to change page.
    */
  def changePage(pageNum: Double): Unit
  /**
    * Callback function to use to set a new size per page.
    */
  def changeSizePerPage(sizePerPage: Double): Unit
  /**
    * Callback function to trigger the toggle on sizePerPage dropdown button
    */
  def toggleDropDown(): Unit
}

object PaginationPanelProps {
  @scala.inline
  def apply(
    changePage: Double => Unit,
    changeSizePerPage: Double => Unit,
    components: PageList,
    currPage: Double,
    pageStartIndex: Double,
    sizePerPage: Double,
    sizePerPageList: SizePerPageList,
    toggleDropDown: () => Unit
  ): PaginationPanelProps = {
    val __obj = js.Dynamic.literal(changePage = js.Any.fromFunction1(changePage), changeSizePerPage = js.Any.fromFunction1(changeSizePerPage), components = components.asInstanceOf[js.Any], currPage = currPage.asInstanceOf[js.Any], pageStartIndex = pageStartIndex.asInstanceOf[js.Any], sizePerPage = sizePerPage.asInstanceOf[js.Any], sizePerPageList = sizePerPageList.asInstanceOf[js.Any], toggleDropDown = js.Any.fromFunction0(toggleDropDown))
    __obj.asInstanceOf[PaginationPanelProps]
  }
}

