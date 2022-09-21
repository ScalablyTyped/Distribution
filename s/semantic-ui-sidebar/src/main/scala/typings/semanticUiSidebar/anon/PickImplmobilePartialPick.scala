package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, 'mobile'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl>> */
trait PickImplmobilePartialPick
  extends StObject
     with Param {
  
  var computer: js.UndefOr[ComputerSettings] = js.undefined
  
  var mobile: MobileSettings & js.UndefOr[MobileSettings]
}
object PickImplmobilePartialPick {
  
  inline def apply(mobile: MobileSettings & js.UndefOr[MobileSettings]): PickImplmobilePartialPick = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobilePartialPick]
  }
  
  extension [Self <: PickImplmobilePartialPick](x: Self) {
    
    inline def setComputer(value: ComputerSettings): Self = StObject.set(x, "computer", value.asInstanceOf[js.Any])
    
    inline def setComputerUndefined: Self = StObject.set(x, "computer", js.undefined)
    
    inline def setMobile(value: MobileSettings & js.UndefOr[MobileSettings]): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
