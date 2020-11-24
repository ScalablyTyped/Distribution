package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizePerPageDropDownProps extends js.Object {
  
  /**
    * Bootstrap css style class for the button, e.g. 'btn-warning'
    */
  var btnContextual: js.UndefOr[String] = js.native
  
  /**
    * Custom class name to use for the component.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Current size per page
    */
  var currSizePerPage: js.UndefOr[String] = js.native
  
  /**
    * Flag to indicate that the dropdown is currently hidden
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback function that should be triggered when the user clicks on the dropdown button.
    */
  var onClick: js.UndefOr[js.Function1[/* toggleDropDown */ js.Function0[Unit], Unit]] = js.native
  
  /**
    * Flag to indicate that the dropdown is open
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * Size Per Page options list
    */
  var options: js.UndefOr[js.Array[Double | Text]] = js.native
  
  /**
    * Whether the button menu should 'dropup' or 'dropdown'.
    */
  var variation: js.UndefOr[DropDirection] = js.native
}
object SizePerPageDropDownProps {
  
  @scala.inline
  def apply(): SizePerPageDropDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizePerPageDropDownProps]
  }
  
  @scala.inline
  implicit class SizePerPageDropDownPropsOps[Self <: SizePerPageDropDownProps] (val x: Self) extends AnyVal {
    
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
    def setBtnContextual(value: String): Self = this.set("btnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnContextual: Self = this.set("btnContextual", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCurrSizePerPage(value: String): Self = this.set("currSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrSizePerPage: Self = this.set("currSizePerPage", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* toggleDropDown */ js.Function0[Unit] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (Double | Text)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Double | Text]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setVariation(value: DropDirection): Self = this.set("variation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariation: Self = this.set("variation", js.undefined)
  }
}
