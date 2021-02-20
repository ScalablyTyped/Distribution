package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, 'sidebar'> */
@js.native
trait PickImplsidebar extends StObject {
  
  var sidebar: String = js.native
}
object PickImplsidebar {
  
  @scala.inline
  def apply(sidebar: String): PickImplsidebar = {
    val __obj = js.Dynamic.literal(sidebar = sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsidebar]
  }
  
  @scala.inline
  implicit class PickImplsidebarMutableBuilder[Self <: PickImplsidebar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSidebar(value: String): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
  }
}
