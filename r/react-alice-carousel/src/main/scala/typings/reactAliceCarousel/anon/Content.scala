package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.libTypesMod.ItemCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: Double
  
  var coords: js.Array[ItemCoords]
  
  var partial: Boolean
}
object Content {
  
  inline def apply(content: Double, coords: js.Array[ItemCoords], partial: Boolean): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], coords = coords.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Double): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCoords(value: js.Array[ItemCoords]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsVarargs(value: ItemCoords*): Self = StObject.set(x, "coords", js.Array(value*))
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
  }
}
