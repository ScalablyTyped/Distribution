package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarAngleAxisTick extends StObject {
  
  var coordinate: Double
  
  var value: Any
}
object PolarAngleAxisTick {
  
  inline def apply(coordinate: Double, value: Any): PolarAngleAxisTick = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarAngleAxisTick]
  }
  
  extension [Self <: PolarAngleAxisTick](x: Self) {
    
    inline def setCoordinate(value: Double): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
