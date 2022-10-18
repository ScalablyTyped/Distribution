package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  var left: Double
  
  var width: Double
}
object Left {
  
  inline def apply(left: Double, width: Double): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  extension [Self <: Left](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
