package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'easing'> */
@js.native
trait PickImpleasing extends StObject {
  
  var easing: String = js.native
}
object PickImpleasing {
  
  @scala.inline
  def apply(easing: String): PickImpleasing = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpleasing]
  }
  
  @scala.inline
  implicit class PickImpleasingMutableBuilder[Self <: PickImpleasing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
  }
}
