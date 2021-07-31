package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl>> */
trait PartialPickImplkeyofImplComputer extends StObject {
  
  var computer: js.UndefOr[ComputerSettings] = js.undefined
  
  var mobile: js.UndefOr[MobileSettings] = js.undefined
}
object PartialPickImplkeyofImplComputer {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplComputer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplComputer]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplComputerMutableBuilder[Self <: PartialPickImplkeyofImplComputer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputer(value: ComputerSettings): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerUndefined: Self = StObject.set(x, "computer", js.undefined)
    
    @scala.inline
    def setMobile(value: MobileSettings): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
