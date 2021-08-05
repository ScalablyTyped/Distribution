package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarData extends StObject {
  
  var height: Double
  
  var radius: Double | js.Array[js.Any]
  
  var value: Double | String | js.Array[js.Any]
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object BarData {
  
  inline def apply(
    height: Double,
    radius: Double | js.Array[js.Any],
    value: Double | String | js.Array[js.Any],
    width: Double,
    x: Double,
    y: Double
  ): BarData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarData]
  }
  
  extension [Self <: BarData](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double | js.Array[js.Any]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusVarargs(value: js.Any*): Self = StObject.set(x, "radius", js.Array(value :_*))
    
    inline def setValue(value: Double | String | js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
