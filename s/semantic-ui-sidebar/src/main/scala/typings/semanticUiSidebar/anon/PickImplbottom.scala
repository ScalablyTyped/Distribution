package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'bottom'> */
trait PickImplbottom extends StObject {
  
  var bottom: String
}
object PickImplbottom {
  
  @scala.inline
  def apply(bottom: String): PickImplbottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbottom]
  }
  
  @scala.inline
  implicit class PickImplbottomMutableBuilder[Self <: PickImplbottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
  }
}
