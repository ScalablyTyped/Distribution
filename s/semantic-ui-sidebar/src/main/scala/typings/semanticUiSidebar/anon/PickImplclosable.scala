package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'closable'> */
trait PickImplclosable extends StObject {
  
  var closable: Boolean
}
object PickImplclosable {
  
  @scala.inline
  def apply(closable: Boolean): PickImplclosable = {
    val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclosable]
  }
  
  @scala.inline
  implicit class PickImplclosableMutableBuilder[Self <: PickImplclosable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
  }
}
