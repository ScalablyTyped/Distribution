package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.BaseGestureHandlerProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersPinchGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/PinchGestureHandler", "PinchGestureHandler")
  @js.native
  val PinchGestureHandler: ComponentType[PinchGestureHandlerProps & RefAttributes[Any]] = js.native
  type PinchGestureHandler = ComponentType[PinchGestureHandlerProps & RefAttributes[Any]]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/PinchGestureHandler", "pinchHandlerName")
  @js.native
  val pinchHandlerName: /* "PinchGestureHandler" */ String = js.native
  
  trait PinchGestureHandlerEventPayload extends StObject {
    
    /**
      * Position expressed in points along X axis of center anchor point of
      * gesture.
      */
    var focalX: Double
    
    /**
      * Position expressed in points along Y axis of center anchor point of
      * gesture.
      */
    var focalY: Double
    
    /**
      * The scale factor relative to the points of the two touches in screen
      * coordinates.
      */
    var scale: Double
    
    /**
      *
      * Velocity of the pan gesture the current moment. The value is expressed in
      * point units per second.
      */
    var velocity: Double
  }
  object PinchGestureHandlerEventPayload {
    
    inline def apply(focalX: Double, focalY: Double, scale: Double, velocity: Double): PinchGestureHandlerEventPayload = {
      val __obj = js.Dynamic.literal(focalX = focalX.asInstanceOf[js.Any], focalY = focalY.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinchGestureHandlerEventPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinchGestureHandlerEventPayload] (val x: Self) extends AnyVal {
      
      inline def setFocalX(value: Double): Self = StObject.set(x, "focalX", value.asInstanceOf[js.Any])
      
      inline def setFocalY(value: Double): Self = StObject.set(x, "focalY", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    }
  }
  
  type PinchGestureHandlerProps = BaseGestureHandlerProps_[PinchGestureHandlerEventPayload]
}
