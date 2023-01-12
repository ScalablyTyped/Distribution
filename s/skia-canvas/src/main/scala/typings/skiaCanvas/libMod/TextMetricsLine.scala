package typings.skiaCanvas.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMetricsLine extends StObject {
  
  val baseline: Double
  
  val endIndex: Double
  
  val height: Double
  
  val startIndex: Double
  
  val width: Double
  
  val x: Double
  
  val y: Double
}
object TextMetricsLine {
  
  inline def apply(
    baseline: Double,
    endIndex: Double,
    height: Double,
    startIndex: Double,
    width: Double,
    x: Double,
    y: Double
  ): TextMetricsLine = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetricsLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextMetricsLine] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: Double): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
