package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaheOptions extends StObject {
  
  /** height of the region */
  var height: Double
  
  /** max slope of the cumulative contrast. (optional, default 3) */
  var maxSlope: js.UndefOr[Double] = js.undefined
  
  /** width of the region */
  var width: Double
}
object ClaheOptions {
  
  inline def apply(height: Double, width: Double): ClaheOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaheOptions]
  }
  
  extension [Self <: ClaheOptions](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxSlope(value: Double): Self = StObject.set(x, "maxSlope", value.asInstanceOf[js.Any])
    
    inline def setMaxSlopeUndefined: Self = StObject.set(x, "maxSlope", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
