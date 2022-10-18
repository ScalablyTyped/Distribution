package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllGestures
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesNativeGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/nativeGesture", "NativeGesture")
  @js.native
  open class NativeGesture ()
    extends BaseGesture[NativeViewGestureHandlerPayload]
       with AllGestures {
    
    @JSName("config")
    var config_NativeGesture: BaseGestureConfig & NativeViewGestureConfig = js.native
    
    def disallowInterruption(value: Boolean): this.type = js.native
    
    def shouldActivateOnStart(value: Boolean): this.type = js.native
  }
  
  type NativeGestureType = InstanceType[Instantiable0[NativeGesture]]
}
