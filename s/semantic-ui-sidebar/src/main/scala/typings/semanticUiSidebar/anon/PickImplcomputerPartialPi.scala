package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, 'computer'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl>> */
trait PickImplcomputerPartialPi
  extends StObject
     with Param {
  
  var computer: ComputerSettings
  
  var mobile: js.UndefOr[MobileSettings] = js.undefined
}
object PickImplcomputerPartialPi {
  
  inline def apply(computer: ComputerSettings): PickImplcomputerPartialPi = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcomputerPartialPi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplcomputerPartialPi] (val x: Self) extends AnyVal {
    
    inline def setComputer(value: ComputerSettings): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: MobileSettings): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
