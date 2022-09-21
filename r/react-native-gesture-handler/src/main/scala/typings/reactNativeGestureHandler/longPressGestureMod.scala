package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.gestureMod.BaseGesture
import typings.reactNativeGestureHandler.gestureMod.BaseGestureConfig
import typings.reactNativeGestureHandler.jestUtilsJestUtilsMod.AllGestures
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureConfig
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object longPressGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/longPressGesture", "LongPressGesture")
  @js.native
  open class LongPressGesture ()
    extends BaseGesture[LongPressGestureHandlerEventPayload]
       with AllGestures {
    
    @JSName("config")
    var config_LongPressGesture: BaseGestureConfig & LongPressGestureConfig = js.native
    
    def maxDistance(distance: Double): this.type = js.native
    
    def minDuration(duration: Double): this.type = js.native
  }
  
  type LongPressGestureType = InstanceType[Instantiable0[LongPressGesture]]
}
