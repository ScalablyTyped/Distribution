package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchGestureHandlerEventExtra extends StObject {
  
  var focalX: Double
  
  var focalY: Double
  
  var scale: Double
  
  var velocity: Double
}
object PinchGestureHandlerEventExtra {
  
  @scala.inline
  def apply(focalX: Double, focalY: Double, scale: Double, velocity: Double): PinchGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(focalX = focalX.asInstanceOf[js.Any], focalY = focalY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchGestureHandlerEventExtra]
  }
  
  @scala.inline
  implicit class PinchGestureHandlerEventExtraMutableBuilder[Self <: PinchGestureHandlerEventExtra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocalX(value: Double): Self = StObject.set(x, "focalX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalY(value: Double): Self = StObject.set(x, "focalY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
