package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarAngleAxisTick extends StObject {
  
  var coordinate: Double
  
  var value: js.Any
}
object PolarAngleAxisTick {
  
  @scala.inline
  def apply(coordinate: Double, value: js.Any): PolarAngleAxisTick = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarAngleAxisTick]
  }
  
  @scala.inline
  implicit class PolarAngleAxisTickMutableBuilder[Self <: PolarAngleAxisTick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: Double): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
