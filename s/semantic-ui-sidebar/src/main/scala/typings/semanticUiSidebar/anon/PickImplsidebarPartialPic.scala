package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, 'sidebar'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl>> */
trait PickImplsidebarPartialPic
  extends StObject
     with Param {
  
  var fixed: js.UndefOr[String] = js.undefined
  
  var omitted: js.UndefOr[String] = js.undefined
  
  var pusher: js.UndefOr[String] = js.undefined
  
  var sidebar: String & js.UndefOr[String]
}
object PickImplsidebarPartialPic {
  
  inline def apply(sidebar: String & js.UndefOr[String]): PickImplsidebarPartialPic = {
    val __obj = js.Dynamic.literal(sidebar = sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsidebarPartialPic]
  }
  
  extension [Self <: PickImplsidebarPartialPic](x: Self) {
    
    inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setOmitted(value: String): Self = StObject.set(x, "omitted", value.asInstanceOf[js.Any])
    
    inline def setOmittedUndefined: Self = StObject.set(x, "omitted", js.undefined)
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setPusherUndefined: Self = StObject.set(x, "pusher", js.undefined)
    
    inline def setSidebar(value: String & js.UndefOr[String]): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
  }
}
