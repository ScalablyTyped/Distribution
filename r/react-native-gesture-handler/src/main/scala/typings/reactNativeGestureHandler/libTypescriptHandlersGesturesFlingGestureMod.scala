package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.libTypescriptHandlersFlingGestureHandlerMod.FlingGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersFlingGestureHandlerMod.FlingGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGestureConfig
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesFlingGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/flingGesture", "FlingGesture")
  @js.native
  open class FlingGesture () extends BaseGesture[FlingGestureHandlerEventPayload] {
    
    @JSName("config")
    var config_FlingGesture: BaseGestureConfig & FlingGestureConfig = js.native
    
    def direction(direction: Double): this.type = js.native
    
    def numberOfPointers(pointers: Double): this.type = js.native
  }
  
  type FlingGestureType = InstanceType[Instantiable0[FlingGesture]]
}
