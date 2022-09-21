package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeltaRotation extends StObject {
  
  var deltaRotation: Double
  
  var pointerLength: Double
  
  var scale: Double
}
object DeltaRotation {
  
  inline def apply(deltaRotation: Double, pointerLength: Double, scale: Double): DeltaRotation = {
    val __obj = js.Dynamic.literal(deltaRotation = deltaRotation.asInstanceOf[js.Any], pointerLength = pointerLength.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaRotation]
  }
  
  extension [Self <: DeltaRotation](x: Self) {
    
    inline def setDeltaRotation(value: Double): Self = StObject.set(x, "deltaRotation", value.asInstanceOf[js.Any])
    
    inline def setPointerLength(value: Double): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
