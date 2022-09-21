package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Where Geometry Options
  */
trait WhereGeometryOptions extends StObject {
  
  var coordinates: js.Array[js.Array[Double] | Double]
  
  var `type`: String
}
object WhereGeometryOptions {
  
  inline def apply(coordinates: js.Array[js.Array[Double] | Double], `type`: String): WhereGeometryOptions = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereGeometryOptions]
  }
  
  extension [Self <: WhereGeometryOptions](x: Self) {
    
    inline def setCoordinates(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
