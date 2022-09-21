package typings.redisClient.genericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoSearchByBox
  extends StObject
     with GeoSearchBy {
  
  var height: Double
  
  var unit: GeoUnits
  
  var width: Double
}
object GeoSearchByBox {
  
  inline def apply(height: Double, unit: GeoUnits, width: Double): GeoSearchByBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSearchByBox]
  }
  
  extension [Self <: GeoSearchByBox](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: GeoUnits): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
