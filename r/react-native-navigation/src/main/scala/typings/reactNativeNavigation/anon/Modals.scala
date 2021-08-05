package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modals extends StObject {
  
  var modals: js.Array[js.Any]
  
  var overlays: js.Array[js.Any]
  
  var root: js.Any
}
object Modals {
  
  inline def apply(modals: js.Array[js.Any], overlays: js.Array[js.Any], root: js.Any): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modals]
  }
  
  extension [Self <: Modals](x: Self) {
    
    inline def setModals(value: js.Array[js.Any]): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
    
    inline def setModalsVarargs(value: js.Any*): Self = StObject.set(x, "modals", js.Array(value :_*))
    
    inline def setOverlays(value: js.Array[js.Any]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysVarargs(value: js.Any*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    inline def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
