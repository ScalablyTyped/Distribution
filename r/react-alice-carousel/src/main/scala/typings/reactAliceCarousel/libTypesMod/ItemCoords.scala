package typings.reactAliceCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCoords extends StObject {
  
  var position: Double
  
  var width: Double
}
object ItemCoords {
  
  inline def apply(position: Double, width: Double): ItemCoords = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemCoords]
  }
  
  extension [Self <: ItemCoords](x: Self) {
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
