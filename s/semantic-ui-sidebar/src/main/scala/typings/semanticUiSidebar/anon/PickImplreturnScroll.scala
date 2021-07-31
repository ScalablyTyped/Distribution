package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'returnScroll'> */
trait PickImplreturnScroll extends StObject {
  
  var returnScroll: Boolean
}
object PickImplreturnScroll {
  
  @scala.inline
  def apply(returnScroll: Boolean): PickImplreturnScroll = {
    val __obj = js.Dynamic.literal(returnScroll = returnScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreturnScroll]
  }
  
  @scala.inline
  implicit class PickImplreturnScrollMutableBuilder[Self <: PickImplreturnScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnScroll(value: Boolean): Self = StObject.set(x, "returnScroll", value.asInstanceOf[js.Any])
  }
}
