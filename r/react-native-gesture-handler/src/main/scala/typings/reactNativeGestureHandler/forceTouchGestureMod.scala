package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureConfig
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.gestureMod.BaseGestureConfig
import typings.reactNativeGestureHandler.gestureMod.ContinousBaseGesture
import typings.reactNativeGestureHandler.jestUtilsJestUtilsMod.AllGestures
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forceTouchGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/forceTouchGesture", "ForceTouchGesture")
  @js.native
  open class ForceTouchGesture ()
    extends ContinousBaseGesture[ForceTouchGestureHandlerEventPayload, ForceTouchGestureChangeEventPayload]
       with AllGestures {
    
    @JSName("config")
    var config_ForceTouchGesture: BaseGestureConfig & ForceTouchGestureConfig = js.native
    
    def feedbackOnActivation(value: Boolean): this.type = js.native
    
    def maxForce(force: Double): this.type = js.native
    
    def minForce(force: Double): this.type = js.native
  }
  
  trait ForceTouchGestureChangeEventPayload extends StObject {
    
    var forceChange: Double
  }
  object ForceTouchGestureChangeEventPayload {
    
    inline def apply(forceChange: Double): ForceTouchGestureChangeEventPayload = {
      val __obj = js.Dynamic.literal(forceChange = forceChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceTouchGestureChangeEventPayload]
    }
    
    extension [Self <: ForceTouchGestureChangeEventPayload](x: Self) {
      
      inline def setForceChange(value: Double): Self = StObject.set(x, "forceChange", value.asInstanceOf[js.Any])
    }
  }
  
  type ForceTouchGestureType = InstanceType[Instantiable0[ForceTouchGesture]]
}
