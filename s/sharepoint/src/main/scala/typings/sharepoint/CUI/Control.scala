package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control
  extends IDisposable
     with IMenuItem {
  
  def createComponentForDisplayMode(displayMode: String): js.Any = js.native
  
  def get_enabled(): Boolean = js.native
  
  def get_id(): String = js.native
  
  def get_root(): Root = js.native
  
  def set_enabled(enabled: Boolean): Boolean = js.native
}
object Control {
  
  @scala.inline
  def apply(
    createComponentForDisplayMode: String => js.Any,
    dispose: () => scala.Unit,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_root: () => Root,
    set_enabled: Boolean => Boolean
  ): Control = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = js.Any.fromFunction0(dispose), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit class ControlOps[Self <: Control] (val x: Self) extends AnyVal {
    
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
    def setCreateComponentForDisplayMode(value: String => js.Any): Self = this.set("createComponentForDisplayMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_enabled(value: () => Boolean): Self = this.set("get_enabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_id(value: () => String): Self = this.set("get_id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_root(value: () => Root): Self = this.set("get_root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_enabled(value: Boolean => Boolean): Self = this.set("set_enabled", js.Any.fromFunction1(value))
  }
}
