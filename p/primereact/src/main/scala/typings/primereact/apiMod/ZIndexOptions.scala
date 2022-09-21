package typings.primereact.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndexOptions extends StObject {
  
  var menu: Double
  
  var modal: Double
  
  var overlay: Double
  
  var toast: Double
  
  var tooltip: Double
}
object ZIndexOptions {
  
  inline def apply(menu: Double, modal: Double, overlay: Double, toast: Double, tooltip: Double): ZIndexOptions = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndexOptions]
  }
  
  extension [Self <: ZIndexOptions](x: Self) {
    
    inline def setMenu(value: Double): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: Double): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setToast(value: Double): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Double): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
