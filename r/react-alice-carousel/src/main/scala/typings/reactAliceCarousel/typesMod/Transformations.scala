package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformations extends StObject {
  
  var content: Double
  
  var coords: js.Array[Any | ItemCoords]
  
  var partial: Boolean
}
object Transformations {
  
  inline def apply(content: Double, coords: js.Array[Any | ItemCoords], partial: Boolean): Transformations = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformations]
  }
  
  extension [Self <: Transformations](x: Self) {
    
    inline def setContent(value: Double): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCoords(value: js.Array[Any | ItemCoords]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsVarargs(value: (Any | ItemCoords)*): Self = StObject.set(x, "coords", js.Array(value*))
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
  }
}
