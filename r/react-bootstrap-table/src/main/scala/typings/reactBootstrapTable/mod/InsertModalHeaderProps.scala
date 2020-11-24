package typings.reactBootstrapTable.mod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertModalHeaderProps extends js.Object {
  
  /**
    * Callback function to call prior to closing the Insert Modal window.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.native
  
  /**
    * Header class name.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Set to true to hide the close button. Default is false.
    */
  var hideClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback function to call to close the Insert Modal window.
    */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.native
  
  /**
    * Title to display in the header.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Bootstrap version.
    */
  var version: js.UndefOr[BootstrapVersion] = js.native
}
object InsertModalHeaderProps {
  
  @scala.inline
  def apply(): InsertModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertModalHeaderProps]
  }
  
  @scala.inline
  implicit class InsertModalHeaderPropsOps[Self <: InsertModalHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setBeforeClose(value: /* e */ SyntheticEvent[_, Event] => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHideClose(value: Boolean): Self = this.set("hideClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideClose: Self = this.set("hideClose", js.undefined)
    
    @scala.inline
    def setOnModalClose(value: /* closeModal */ js.Function0[Unit] => Unit): Self = this.set("onModalClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnModalClose: Self = this.set("onModalClose", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVersion(value: BootstrapVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
