package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.ContinousBaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllGestures
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesPinchGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/pinchGesture", "PinchGesture")
  @js.native
  open class PinchGesture ()
    extends ContinousBaseGesture[PinchGestureHandlerEventPayload, PinchGestureChangeEventPayload]
       with AllGestures
  
  trait PinchGestureChangeEventPayload extends StObject {
    
    var scaleChange: Double
  }
  object PinchGestureChangeEventPayload {
    
    inline def apply(scaleChange: Double): PinchGestureChangeEventPayload = {
      val __obj = js.Dynamic.literal(scaleChange = scaleChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinchGestureChangeEventPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PinchGestureChangeEventPayload] (val x: Self) extends AnyVal {
      
      inline def setScaleChange(value: Double): Self = StObject.set(x, "scaleChange", value.asInstanceOf[js.Any])
    }
  }
  
  type PinchGestureType = InstanceType[Instantiable0[PinchGesture]]
}
