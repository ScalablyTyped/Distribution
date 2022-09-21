package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, 'fixed'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl>> */
trait PickImplfixedPartialPickI
  extends StObject
     with Param {
  
  var fixed: String & js.UndefOr[String]
  
  var omitted: js.UndefOr[String] = js.undefined
  
  var pusher: js.UndefOr[String] = js.undefined
  
  var sidebar: js.UndefOr[String] = js.undefined
}
object PickImplfixedPartialPickI {
  
  inline def apply(fixed: String & js.UndefOr[String]): PickImplfixedPartialPickI = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfixedPartialPickI]
  }
  
  extension [Self <: PickImplfixedPartialPickI](x: Self) {
    
    inline def setFixed(value: String & js.UndefOr[String]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setOmitted(value: String): Self = StObject.set(x, "omitted", value.asInstanceOf[js.Any])
    
    inline def setOmittedUndefined: Self = StObject.set(x, "omitted", js.undefined)
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setPusherUndefined: Self = StObject.set(x, "pusher", js.undefined)
    
    inline def setSidebar(value: String): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
  }
}
