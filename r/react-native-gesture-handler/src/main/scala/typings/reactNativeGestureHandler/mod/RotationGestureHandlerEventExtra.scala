package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationGestureHandlerEventExtra extends StObject {
  
  var anchorX: Double
  
  var anchorY: Double
  
  var rotation: Double
  
  var velocity: Double
}
object RotationGestureHandlerEventExtra {
  
  inline def apply(anchorX: Double, anchorY: Double, rotation: Double, velocity: Double): RotationGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationGestureHandlerEventExtra]
  }
  
  extension [Self <: RotationGestureHandlerEventExtra](x: Self) {
    
    inline def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
    
    inline def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
