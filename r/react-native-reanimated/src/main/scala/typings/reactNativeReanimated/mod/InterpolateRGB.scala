package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolateRGB extends StObject {
  
  var a: js.Array[Double]
  
  var b: js.Array[Double]
  
  var g: js.Array[Double]
  
  var r: js.Array[Double]
}
object InterpolateRGB {
  
  inline def apply(a: js.Array[Double], b: js.Array[Double], g: js.Array[Double], r: js.Array[Double]): InterpolateRGB = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolateRGB]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolateRGB] (val x: Self) extends AnyVal {
    
    inline def setA(value: js.Array[Double]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAVarargs(value: Double*): Self = StObject.set(x, "a", js.Array(value*))
    
    inline def setB(value: js.Array[Double]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBVarargs(value: Double*): Self = StObject.set(x, "b", js.Array(value*))
    
    inline def setG(value: js.Array[Double]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setGVarargs(value: Double*): Self = StObject.set(x, "g", js.Array(value*))
    
    inline def setR(value: js.Array[Double]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRVarargs(value: Double*): Self = StObject.set(x, "r", js.Array(value*))
  }
}
