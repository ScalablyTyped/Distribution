package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'mobileTransition'> */
trait PickImplmobileTransition extends StObject {
  
  var mobileTransition: String
}
object PickImplmobileTransition {
  
  @scala.inline
  def apply(mobileTransition: String): PickImplmobileTransition = {
    val __obj = js.Dynamic.literal(mobileTransition = mobileTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobileTransition]
  }
  
  @scala.inline
  implicit class PickImplmobileTransitionMutableBuilder[Self <: PickImplmobileTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobileTransition(value: String): Self = StObject.set(x, "mobileTransition", value.asInstanceOf[js.Any])
  }
}
