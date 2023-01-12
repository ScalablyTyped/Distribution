package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.PageList
import typings.reactBootstrapTable.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationPanelProps extends StObject {
  
  /**
    * Callback function to use to change page.
    */
  def changePage(pageNum: Double): Unit
  
  /**
    * Callback function to use to set a new size per page.
    */
  def changeSizePerPage(sizePerPage: Double): Unit
  
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
    * Callback function to trigger the toggle on sizePerPage dropdown button
    */
  def toggleDropDown(): Unit
}
object PaginationPanelProps {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: PaginationPanelProps] (val x: Self) extends AnyVal {
    
    inline def setChangePage(value: Double => Unit): Self = StObject.set(x, "changePage", js.Any.fromFunction1(value))
    
    inline def setChangeSizePerPage(value: Double => Unit): Self = StObject.set(x, "changeSizePerPage", js.Any.fromFunction1(value))
    
    inline def setComponents(value: PageList): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setCurrPage(value: Double): Self = StObject.set(x, "currPage", value.asInstanceOf[js.Any])
    
    inline def setPageStartIndex(value: Double): Self = StObject.set(x, "pageStartIndex", value.asInstanceOf[js.Any])
    
    inline def setSizePerPage(value: Double): Self = StObject.set(x, "sizePerPage", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageList(value: SizePerPageList): Self = StObject.set(x, "sizePerPageList", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageListVarargs(value: (Double | Text)*): Self = StObject.set(x, "sizePerPageList", js.Array(value*))
    
    inline def setToggleDropDown(value: () => Unit): Self = StObject.set(x, "toggleDropDown", js.Any.fromFunction0(value))
  }
}
