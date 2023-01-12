package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModeChangedBoolean extends StObject {
  
  var viewModeChanged: Boolean
}
object ViewModeChangedBoolean {
  
  inline def apply(viewModeChanged: Boolean): ViewModeChangedBoolean = {
    val __obj = js.Dynamic.literal(viewModeChanged = viewModeChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModeChangedBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewModeChangedBoolean] (val x: Self) extends AnyVal {
    
    inline def setViewModeChanged(value: Boolean): Self = StObject.set(x, "viewModeChanged", value.asInstanceOf[js.Any])
  }
}
