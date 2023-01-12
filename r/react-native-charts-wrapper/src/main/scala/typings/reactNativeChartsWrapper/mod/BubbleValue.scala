package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleValue extends StObject {
  
  var marker: js.UndefOr[String] = js.undefined
  
  var size: Double
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: Double
}
object BubbleValue {
  
  inline def apply(size: Double, y: Double): BubbleValue = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BubbleValue] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
