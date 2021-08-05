package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  var isEventPerspective: Boolean
  
  var showAgenda: Boolean
  
  var viewName: js.UndefOr[String] = js.undefined
  
  var viewType: ViewTypes
}
object View {
  
  inline def apply(isEventPerspective: Boolean, showAgenda: Boolean, viewType: ViewTypes): View = {
    val __obj = js.Dynamic.literal(isEventPerspective = isEventPerspective.asInstanceOf[js.Any], showAgenda = showAgenda.asInstanceOf[js.Any], viewType = viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  
  extension [Self <: View](x: Self) {
    
    inline def setIsEventPerspective(value: Boolean): Self = StObject.set(x, "isEventPerspective", value.asInstanceOf[js.Any])
    
    inline def setShowAgenda(value: Boolean): Self = StObject.set(x, "showAgenda", value.asInstanceOf[js.Any])
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    
    inline def setViewType(value: ViewTypes): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
  }
}
