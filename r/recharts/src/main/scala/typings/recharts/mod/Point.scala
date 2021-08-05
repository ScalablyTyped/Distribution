package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var value: Double | js.Array[js.Any]
  
  var x: Double
  
  var y: Double
}
object Point {
  
  inline def apply(value: Double | js.Array[js.Any], x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  extension [Self <: Point](x: Self) {
    
    inline def setValue(value: Double | js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
