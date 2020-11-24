package typings.sharepoint.SP.UI

import typings.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoutMenu extends IDisposable {
  
  def closeMenu(): Unit = js.native
  
  def launchMenu(): Unit = js.native
}
object PopoutMenu {
  
  @scala.inline
  def apply(closeMenu: () => Unit, dispose: () => Unit, launchMenu: () => Unit): PopoutMenu = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu), dispose = js.Any.fromFunction0(dispose), launchMenu = js.Any.fromFunction0(launchMenu))
    __obj.asInstanceOf[PopoutMenu]
  }
  
  @scala.inline
  implicit class PopoutMenuOps[Self <: PopoutMenu] (val x: Self) extends AnyVal {
    
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
    def setCloseMenu(value: () => Unit): Self = this.set("closeMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLaunchMenu(value: () => Unit): Self = this.set("launchMenu", js.Any.fromFunction0(value))
  }
}
