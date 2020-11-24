package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizePerPageFunctionProps extends js.Object {
  
  /**
    * Callback function to use to change the current size per page.
    */
  def changeSizePerPage(newSizePerPage: Double): Unit = js.native
  
  /**
    * Current size per page as a string value.
    */
  var currSizePerPage: String = js.native
  
  /**
    * Flag indicating that the sizePerPage dropdown should be hidden.
    */
  var hideSizePerPage: Boolean = js.native
  
  /**
    * Flag to indicate that the sizePerPage dropdown should currently be 'open'.
    */
  var open: Boolean = js.native
  
  /**
    * Array of the size per page options to display in the dropdown.
    */
  var sizePerPageList: SizePerPageList = js.native
  
  /**
    * On-click toggle function callback to open/close the size per page dropdown list.
    */
  def toggleDropDown(): Unit = js.native
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
    val __obj = js.Dynamic.literal(changeSizePerPage = js.Any.fromFunction1(changeSizePerPage), currSizePerPage = currSizePerPage.asInstanceOf[js.Any], hideSizePerPage = hideSizePerPage.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sizePerPageList = sizePerPageList.asInstanceOf[js.Any], toggleDropDown = js.Any.fromFunction0(toggleDropDown))
    __obj.asInstanceOf[SizePerPageFunctionProps]
  }
  
  @scala.inline
  implicit class SizePerPageFunctionPropsOps[Self <: SizePerPageFunctionProps] (val x: Self) extends AnyVal {
    
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
    def setChangeSizePerPage(value: Double => Unit): Self = this.set("changeSizePerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrSizePerPage(value: String): Self = this.set("currSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSizePerPage(value: Boolean): Self = this.set("hideSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPageListVarargs(value: (Double | Text)*): Self = this.set("sizePerPageList", js.Array(value :_*))
    
    @scala.inline
    def setSizePerPageList(value: SizePerPageList): Self = this.set("sizePerPageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleDropDown(value: () => Unit): Self = this.set("toggleDropDown", js.Any.fromFunction0(value))
  }
}
