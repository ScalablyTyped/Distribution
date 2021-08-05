package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderButton extends StObject {
  
  var command: js.UndefOr[String] = js.undefined
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var handler: js.UndefOr[js.Function] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var showOnHover: js.UndefOr[Boolean] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object HeaderButton {
  
  inline def apply(): HeaderButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderButton]
  }
  
  extension [Self <: HeaderButton](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setHandler(value: js.Function): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setShowOnHover(value: Boolean): Self = StObject.set(x, "showOnHover", value.asInstanceOf[js.Any])
    
    inline def setShowOnHoverUndefined: Self = StObject.set(x, "showOnHover", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
