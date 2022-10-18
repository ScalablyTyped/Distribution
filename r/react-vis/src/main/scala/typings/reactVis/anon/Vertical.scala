package typings.reactVis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vertical extends StObject {
  
  var horizontal: String
  
  var vertical: String
}
object Vertical {
  
  inline def apply(horizontal: String, vertical: String): Vertical = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertical]
  }
  
  extension [Self <: Vertical](x: Self) {
    
    inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
