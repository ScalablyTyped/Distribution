package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modals extends StObject {
  
  var modals: js.Array[Any]
  
  var overlays: js.Array[Any]
  
  var root: Any
}
object Modals {
  
  inline def apply(modals: js.Array[Any], overlays: js.Array[Any], root: Any): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modals]
  }
  
  extension [Self <: Modals](x: Self) {
    
    inline def setModals(value: js.Array[Any]): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
    
    inline def setModalsVarargs(value: Any*): Self = StObject.set(x, "modals", js.Array(value*))
    
    inline def setOverlays(value: js.Array[Any]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysVarargs(value: Any*): Self = StObject.set(x, "overlays", js.Array(value*))
    
    inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
