package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolateHSV extends StObject {
  
  var h: js.Array[Double]
  
  var s: js.Array[Double]
  
  var v: js.Array[Double]
}
object InterpolateHSV {
  
  inline def apply(h: js.Array[Double], s: js.Array[Double], v: js.Array[Double]): InterpolateHSV = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolateHSV]
  }
  
  extension [Self <: InterpolateHSV](x: Self) {
    
    inline def setH(value: js.Array[Double]): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHVarargs(value: Double*): Self = StObject.set(x, "h", js.Array(value*))
    
    inline def setS(value: js.Array[Double]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSVarargs(value: Double*): Self = StObject.set(x, "s", js.Array(value*))
    
    inline def setV(value: js.Array[Double]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVVarargs(value: Double*): Self = StObject.set(x, "v", js.Array(value*))
  }
}
