package typings.skiaCanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamily extends StObject {
  
  var family: String
  
  var styles: js.Array[String]
  
  var weights: js.Array[Double]
  
  var widths: js.Array[String]
}
object FontFamily {
  
  inline def apply(family: String, styles: js.Array[String], weights: js.Array[Double], widths: js.Array[String]): FontFamily = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], weights = weights.asInstanceOf[js.Any], widths = widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  
  extension [Self <: FontFamily](x: Self) {
    
    inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setWeights(value: js.Array[Double]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value*))
    
    inline def setWidths(value: js.Array[String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    inline def setWidthsVarargs(value: String*): Self = StObject.set(x, "widths", js.Array(value*))
  }
}
