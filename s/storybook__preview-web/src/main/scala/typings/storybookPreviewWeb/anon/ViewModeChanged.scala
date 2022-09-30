package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModeChanged extends StObject {
  
  var viewModeChanged: js.UndefOr[Boolean] = js.undefined
}
object ViewModeChanged {
  
  inline def apply(): ViewModeChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewModeChanged]
  }
  
  extension [Self <: ViewModeChanged](x: Self) {
    
    inline def setViewModeChanged(value: Boolean): Self = StObject.set(x, "viewModeChanged", value.asInstanceOf[js.Any])
    
    inline def setViewModeChangedUndefined: Self = StObject.set(x, "viewModeChanged", js.undefined)
  }
}
