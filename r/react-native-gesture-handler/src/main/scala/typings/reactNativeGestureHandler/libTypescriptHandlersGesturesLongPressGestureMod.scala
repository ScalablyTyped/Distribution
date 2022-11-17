package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesLongPressGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/longPressGesture", "LongPressGesture")
  @js.native
  open class LongPressGesture () extends BaseGesture[LongPressGestureHandlerEventPayload] {
    
    @JSName("config")
    var config_LongPressGesture: BaseGestureConfig & LongPressGestureConfig = js.native
    
    def maxDistance(distance: Double): this.type = js.native
    
    def minDuration(duration: Double): this.type = js.native
  }
  
  type LongPressGestureType = InstanceType[Instantiable0[LongPressGesture]]
}
