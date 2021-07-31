package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, 'computer'> */
trait PickImplcomputer extends StObject {
  
  var computer: ComputerSettings
}
object PickImplcomputer {
  
  @scala.inline
  def apply(computer: ComputerSettings): PickImplcomputer = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcomputer]
  }
  
  @scala.inline
  implicit class PickImplcomputerMutableBuilder[Self <: PickImplcomputer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputer(value: ComputerSettings): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
  }
}
