package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'overlay'> */
trait PickImploverlay extends StObject {
  
  var overlay: String
}
object PickImploverlay {
  
  @scala.inline
  def apply(overlay: String): PickImploverlay = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploverlay]
  }
  
  @scala.inline
  implicit class PickImploverlayMutableBuilder[Self <: PickImploverlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
