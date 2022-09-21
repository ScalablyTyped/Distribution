package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.gestureMod.BaseGesture
import typings.reactNativeGestureHandler.gestureMod.BaseGestureConfig
import typings.reactNativeGestureHandler.jestUtilsJestUtilsMod.AllGestures
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureConfig
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureHandlerEventPayload
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/tapGesture", "TapGesture")
  @js.native
  open class TapGesture ()
    extends BaseGesture[TapGestureHandlerEventPayload]
       with AllGestures {
    
    @JSName("config")
    var config_TapGesture: BaseGestureConfig & TapGestureConfig = js.native
    
    def maxDelay(delay: Double): this.type = js.native
    
    def maxDeltaX(delta: Double): this.type = js.native
    
    def maxDeltaY(delta: Double): this.type = js.native
    
    def maxDistance(maxDist: Double): this.type = js.native
    
    def maxDuration(duration: Double): this.type = js.native
    
    def minPointers(minPointers: Double): this.type = js.native
    
    def numberOfTaps(count: Double): this.type = js.native
  }
  
  type TapGestureType = InstanceType[Instantiable0[TapGesture]]
}
