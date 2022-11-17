package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.ContinousBaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesRotationGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/rotationGesture", "RotationGesture")
  @js.native
  open class RotationGesture () extends ContinousBaseGesture[RotationGestureHandlerEventPayload, RotationGestureChangeEventPayload]
  
  trait RotationGestureChangeEventPayload extends StObject {
    
    var rotationChange: Double
  }
  object RotationGestureChangeEventPayload {
    
    inline def apply(rotationChange: Double): RotationGestureChangeEventPayload = {
      val __obj = js.Dynamic.literal(rotationChange = rotationChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotationGestureChangeEventPayload]
    }
    
    extension [Self <: RotationGestureChangeEventPayload](x: Self) {
      
      inline def setRotationChange(value: Double): Self = StObject.set(x, "rotationChange", value.asInstanceOf[js.Any])
    }
  }
  
  type RotationGestureType = InstanceType[Instantiable0[RotationGesture]]
}
