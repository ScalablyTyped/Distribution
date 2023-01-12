package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.BaseGestureHandlerProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersRotationGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/RotationGestureHandler", "RotationGestureHandler")
  @js.native
  val RotationGestureHandler: ComponentType[RotationGestureHandlerProps & RefAttributes[Any]] = js.native
  type RotationGestureHandler = ComponentType[RotationGestureHandlerProps & RefAttributes[Any]]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/RotationGestureHandler", "rotationHandlerName")
  @js.native
  val rotationHandlerName: /* "RotationGestureHandler" */ String = js.native
  
  trait RotationGestureHandlerEventPayload extends StObject {
    
    /**
      * X coordinate, expressed in points, of the gesture's central focal point
      * (anchor).
      */
    var anchorX: Double
    
    /**
      * Y coordinate, expressed in points, of the gesture's central focal point
      * (anchor).
      */
    var anchorY: Double
    
    /**
      * Amount rotated, expressed in radians, from the gesture's focal point
      * (anchor).
      */
    var rotation: Double
    
    /**
      *
      * Instantaneous velocity, expressed in point units per second, of the
      * gesture.
      */
    var velocity: Double
  }
  object RotationGestureHandlerEventPayload {
    
    inline def apply(anchorX: Double, anchorY: Double, rotation: Double, velocity: Double): RotationGestureHandlerEventPayload = {
      val __obj = js.Dynamic.literal(anchorX = anchorX.asInstanceOf[js.Any], anchorY = anchorY.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotationGestureHandlerEventPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RotationGestureHandlerEventPayload] (val x: Self) extends AnyVal {
      
      inline def setAnchorX(value: Double): Self = StObject.set(x, "anchorX", value.asInstanceOf[js.Any])
      
      inline def setAnchorY(value: Double): Self = StObject.set(x, "anchorY", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  type RotationGestureHandlerProps = BaseGestureHandlerProps_[RotationGestureHandlerEventPayload]
}
