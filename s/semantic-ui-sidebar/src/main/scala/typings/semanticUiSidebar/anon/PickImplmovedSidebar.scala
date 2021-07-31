package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'movedSidebar'> */
trait PickImplmovedSidebar extends StObject {
  
  var movedSidebar: String
}
object PickImplmovedSidebar {
  
  @scala.inline
  def apply(movedSidebar: String): PickImplmovedSidebar = {
    val __obj = js.Dynamic.literal(movedSidebar = movedSidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmovedSidebar]
  }
  
  @scala.inline
  implicit class PickImplmovedSidebarMutableBuilder[Self <: PickImplmovedSidebar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMovedSidebar(value: String): Self = StObject.set(x, "movedSidebar", value.asInstanceOf[js.Any])
  }
}
