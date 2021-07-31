package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'scrollLock'> */
trait PickImplscrollLock extends StObject {
  
  var scrollLock: Boolean
}
object PickImplscrollLock {
  
  @scala.inline
  def apply(scrollLock: Boolean): PickImplscrollLock = {
    val __obj = js.Dynamic.literal(scrollLock = scrollLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrollLock]
  }
  
  @scala.inline
  implicit class PickImplscrollLockMutableBuilder[Self <: PickImplscrollLock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLock(value: Boolean): Self = StObject.set(x, "scrollLock", value.asInstanceOf[js.Any])
  }
}
