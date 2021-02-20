package typings.sharepoint.CUI

import typings.microsoftAjax.Sys.IDisposable
import org.scalablytyped.runtime.StObject
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
  implicit class ControlMutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateComponentForDisplayMode(value: String => js.Any): Self = StObject.set(x, "createComponentForDisplayMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_enabled(value: () => Boolean): Self = StObject.set(x, "get_enabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_id(value: () => String): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_root(value: () => Root): Self = StObject.set(x, "get_root", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_enabled(value: Boolean => Boolean): Self = StObject.set(x, "set_enabled", js.Any.fromFunction1(value))
  }
}
