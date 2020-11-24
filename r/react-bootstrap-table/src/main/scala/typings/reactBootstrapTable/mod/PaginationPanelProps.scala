package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.PageList
import typings.reactBootstrapTable.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationPanelProps extends js.Object {
  
  /**
    * Callback function to use to change page.
    */
  def changePage(pageNum: Double): Unit = js.native
  
  /**
    * Callback function to use to set a new size per page.
    */
  def changeSizePerPage(sizePerPage: Double): Unit = js.native
  
  /**
    * The basic components for the pagination panel, provided here so that you have the option to use some of them
    * if you don't want to customize all of them.
    */
  var components: PageList = js.native
  
  /**
    * Current page number
    */
  var currPage: Double = js.native
  
  /**
    * Index number for the first page of data.
    * Comes from Options.pageStartIndex.
    */
  var pageStartIndex: Double = js.native
  
  /**
    * Current number of rows to show per page
    */
  var sizePerPage: Double = js.native
  
  /**
    * Choices for size per page dropdown component
    */
  var sizePerPageList: SizePerPageList = js.native
  
  /**
    * Callback function to trigger the toggle on sizePerPage dropdown button
    */
  def toggleDropDown(): Unit = js.native
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
  
  @scala.inline
  implicit class PaginationPanelPropsOps[Self <: PaginationPanelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangePage(value: Double => Unit): Self = this.set("changePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeSizePerPage(value: Double => Unit): Self = this.set("changeSizePerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponents(value: PageList): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrPage(value: Double): Self = this.set("currPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStartIndex(value: Double): Self = this.set("pageStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPage(value: Double): Self = this.set("sizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPageListVarargs(value: (Double | Text)*): Self = this.set("sizePerPageList", js.Array(value :_*))
    
    @scala.inline
    def setSizePerPageList(value: SizePerPageList): Self = this.set("sizePerPageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleDropDown(value: () => Unit): Self = this.set("toggleDropDown", js.Any.fromFunction0(value))
  }
}
