package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'delaySetup'> */
trait PickImpldelaySetup extends StObject {
  
  var delaySetup: Boolean
}
object PickImpldelaySetup {
  
  @scala.inline
  def apply(delaySetup: Boolean): PickImpldelaySetup = {
    val __obj = js.Dynamic.literal(delaySetup = delaySetup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelaySetup]
  }
  
  @scala.inline
  implicit class PickImpldelaySetupMutableBuilder[Self <: PickImpldelaySetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelaySetup(value: Boolean): Self = StObject.set(x, "delaySetup", value.asInstanceOf[js.Any])
  }
}
