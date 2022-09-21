package typings.screeps

import typings.screeps.screepsStrings.dashed
import typings.screeps.screepsStrings.dotted
import typings.screeps.screepsStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapPolyStyle extends StObject {
  
  /**
    * Fill color in the following format: #ffffff (hex triplet). Default is undefined (no fill).
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * Either undefined (solid line), dashed, or dotted. Default is undefined.
    */
  var lineStyle: js.UndefOr[dashed | dotted | solid] = js.undefined
  
  /**
    * Opacity value, default is 0.5.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Stroke color in the following format: #ffffff (hex triplet). Default is #ffffff.
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * Stroke line width, default is 0.5.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object MapPolyStyle {
  
  inline def apply(): MapPolyStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapPolyStyle]
  }
  
  extension [Self <: MapPolyStyle](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setLineStyle(value: dashed | dotted | solid): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
