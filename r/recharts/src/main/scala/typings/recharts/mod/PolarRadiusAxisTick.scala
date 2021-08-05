package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarRadiusAxisTick extends StObject {
  
  var coordinate: Double
  
  var value: js.Any
}
object PolarRadiusAxisTick {
  
  inline def apply(coordinate: Double, value: js.Any): PolarRadiusAxisTick = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarRadiusAxisTick]
  }
  
  extension [Self <: PolarRadiusAxisTick](x: Self) {
    
    inline def setCoordinate(value: Double): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
