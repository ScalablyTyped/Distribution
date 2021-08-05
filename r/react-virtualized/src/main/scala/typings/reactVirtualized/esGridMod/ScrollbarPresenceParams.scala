package typings.reactVirtualized.esGridMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollbarPresenceParams extends StObject {
  
  var horizontal: Boolean
  
  var size: Double
  
  var vertical: Boolean
}
object ScrollbarPresenceParams {
  
  inline def apply(horizontal: Boolean, size: Double, vertical: Boolean): ScrollbarPresenceParams = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarPresenceParams]
  }
  
  extension [Self <: ScrollbarPresenceParams](x: Self) {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
