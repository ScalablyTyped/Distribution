package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarValue extends StObject {
  
  var marker: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object BarValue {
  
  inline def apply(): BarValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarValue]
  }
  
  extension [Self <: BarValue](x: Self) {
    
    inline def setMarker(value: String | js.Array[String]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMarkerVarargs(value: String*): Self = StObject.set(x, "marker", js.Array(value :_*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}
