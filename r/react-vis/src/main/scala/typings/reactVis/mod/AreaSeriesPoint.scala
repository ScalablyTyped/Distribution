package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaSeriesPoint
  extends StObject
     with AbstractSeriesPoint {
  
  var x: Double
  
  var y: Double
  
  var y0: js.UndefOr[Double] = js.undefined
}
object AreaSeriesPoint {
  
  inline def apply(x: Double, y: Double): AreaSeriesPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaSeriesPoint]
  }
  
  extension [Self <: AreaSeriesPoint](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
  }
}
