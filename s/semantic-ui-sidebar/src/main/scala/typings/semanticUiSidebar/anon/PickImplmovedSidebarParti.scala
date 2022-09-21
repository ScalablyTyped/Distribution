package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'movedSidebar'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl>> */
trait PickImplmovedSidebarParti
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var movedSidebar: String & js.UndefOr[String]
  
  var notFound: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[String] = js.undefined
  
  var pusher: js.UndefOr[String] = js.undefined
}
object PickImplmovedSidebarParti {
  
  inline def apply(movedSidebar: String & js.UndefOr[String]): PickImplmovedSidebarParti = {
    val __obj = js.Dynamic.literal(movedSidebar = movedSidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmovedSidebarParti]
  }
  
  extension [Self <: PickImplmovedSidebarParti](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMovedSidebar(value: String & js.UndefOr[String]): Self = StObject.set(x, "movedSidebar", value.asInstanceOf[js.Any])
    
    inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    
    inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setPusherUndefined: Self = StObject.set(x, "pusher", js.undefined)
  }
}
