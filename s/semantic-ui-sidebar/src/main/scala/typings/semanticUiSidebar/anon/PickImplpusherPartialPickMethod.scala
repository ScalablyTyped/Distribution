package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'pusher'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl>> */
trait PickImplpusherPartialPickMethod
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var movedSidebar: js.UndefOr[String] = js.undefined
  
  var notFound: js.UndefOr[String] = js.undefined
  
  var overlay: js.UndefOr[String] = js.undefined
  
  var pusher: String
}
object PickImplpusherPartialPickMethod {
  
  inline def apply(pusher: String): PickImplpusherPartialPickMethod = {
    val __obj = js.Dynamic.literal(pusher = pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpusherPartialPickMethod]
  }
  
  extension [Self <: PickImplpusherPartialPickMethod](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMovedSidebar(value: String): Self = StObject.set(x, "movedSidebar", value.asInstanceOf[js.Any])
    
    inline def setMovedSidebarUndefined: Self = StObject.set(x, "movedSidebar", js.undefined)
    
    inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    
    inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
  }
}
