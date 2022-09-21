package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'overlay'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl>> */
trait PickImploverlayPartialPic
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var movedSidebar: js.UndefOr[String] = js.undefined
  
  var notFound: js.UndefOr[String] = js.undefined
  
  var overlay: String & js.UndefOr[String]
  
  var pusher: js.UndefOr[String] = js.undefined
}
object PickImploverlayPartialPic {
  
  inline def apply(overlay: String & js.UndefOr[String]): PickImploverlayPartialPic = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImploverlayPartialPic]
  }
  
  extension [Self <: PickImploverlayPartialPic](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMovedSidebar(value: String): Self = StObject.set(x, "movedSidebar", value.asInstanceOf[js.Any])
    
    inline def setMovedSidebarUndefined: Self = StObject.set(x, "movedSidebar", js.undefined)
    
    inline def setNotFound(value: String): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
    
    inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
    
    inline def setOverlay(value: String & js.UndefOr[String]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setPusherUndefined: Self = StObject.set(x, "pusher", js.undefined)
  }
}
