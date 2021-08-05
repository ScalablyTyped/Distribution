package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var x: Double
  
  var y: Double
}
object PolygonSeriesPoint {
  
  inline def apply(x: Double, y: Double): PolygonSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonSeriesPoint]
  }
  
  extension [Self <: PolygonSeriesPoint](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
