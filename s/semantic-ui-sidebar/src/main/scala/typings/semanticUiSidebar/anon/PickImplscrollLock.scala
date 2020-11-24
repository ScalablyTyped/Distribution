package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'scrollLock'> */
@js.native
trait PickImplscrollLock extends js.Object {
  
  var scrollLock: Boolean = js.native
}
object PickImplscrollLock {
  
  @scala.inline
  def apply(scrollLock: Boolean): PickImplscrollLock = {
    val __obj = js.Dynamic.literal(scrollLock = scrollLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrollLock]
  }
  
  @scala.inline
  implicit class PickImplscrollLockOps[Self <: PickImplscrollLock] (val x: Self) extends AnyVal {
    
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
    def setScrollLock(value: Boolean): Self = this.set("scrollLock", value.asInstanceOf[js.Any])
  }
}
