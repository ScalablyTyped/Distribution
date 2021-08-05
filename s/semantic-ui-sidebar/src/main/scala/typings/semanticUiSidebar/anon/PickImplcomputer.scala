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
  
  inline def apply(computer: ComputerSettings): PickImplcomputer = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcomputer]
  }
  
  extension [Self <: PickImplcomputer](x: Self) {
    
    inline def setComputer(value: ComputerSettings): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
  }
}
