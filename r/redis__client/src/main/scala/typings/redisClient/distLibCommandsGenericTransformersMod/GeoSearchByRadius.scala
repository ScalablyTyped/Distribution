package typings.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoSearchByRadius
  extends StObject
     with GeoSearchBy {
  
  var radius: Double
  
  var unit: GeoUnits
}
object GeoSearchByRadius {
  
  inline def apply(radius: Double, unit: GeoUnits): GeoSearchByRadius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSearchByRadius]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoSearchByRadius] (val x: Self) extends AnyVal {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: GeoUnits): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
