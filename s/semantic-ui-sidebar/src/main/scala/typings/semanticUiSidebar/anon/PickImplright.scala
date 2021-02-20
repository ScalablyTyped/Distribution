package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'right'> */
@js.native
trait PickImplright extends StObject {
  
  var right: String = js.native
}
object PickImplright {
  
  @scala.inline
  def apply(right: String): PickImplright = {
    val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplright]
  }
  
  @scala.inline
  implicit class PickImplrightMutableBuilder[Self <: PickImplright] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
