package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustX extends StObject {
  
  var adjustX: Double
  
  var adjustY: Double
}
object AdjustX {
  
  inline def apply(adjustX: Double, adjustY: Double): AdjustX = {
    val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjustX]
  }
  
  extension [Self <: AdjustX](x: Self) {
    
    inline def setAdjustX(value: Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
    
    inline def setAdjustY(value: Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
  }
}
