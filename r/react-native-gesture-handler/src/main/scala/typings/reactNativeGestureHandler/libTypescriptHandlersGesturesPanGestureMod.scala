package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.ContinousBaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureConfig
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllGestures
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesPanGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/panGesture", "PanGesture")
  @js.native
  open class PanGesture ()
    extends ContinousBaseGesture[PanGestureHandlerEventPayload, PanGestureChangeEventPayload]
       with AllGestures {
    
    def activateAfterLongPress(duration: Double): this.type = js.native
    
    def activeOffsetX(offset: js.Array[Double]): this.type = js.native
    def activeOffsetX(offset: Double): this.type = js.native
    
    def activeOffsetY(offset: js.Array[Double]): this.type = js.native
    def activeOffsetY(offset: Double): this.type = js.native
    
    def averageTouches(value: Boolean): this.type = js.native
    
    @JSName("config")
    var config_PanGesture: BaseGestureConfig & PanGestureConfig = js.native
    
    def enableTrackpadTwoFingerGesture(value: Boolean): this.type = js.native
    
    def failOffsetX(offset: js.Array[Double]): this.type = js.native
    def failOffsetX(offset: Double): this.type = js.native
    
    def failOffsetY(offset: js.Array[Double]): this.type = js.native
    def failOffsetY(offset: Double): this.type = js.native
    
    def maxPointers(maxPointers: Double): this.type = js.native
    
    def minDistance(distance: Double): this.type = js.native
    
    def minPointers(minPointers: Double): this.type = js.native
    
    def minVelocity(velocity: Double): this.type = js.native
    
    def minVelocityX(velocity: Double): this.type = js.native
    
    def minVelocityY(velocity: Double): this.type = js.native
  }
  
  trait PanGestureChangeEventPayload extends StObject {
    
    var changeX: Double
    
    var changeY: Double
  }
  object PanGestureChangeEventPayload {
    
    inline def apply(changeX: Double, changeY: Double): PanGestureChangeEventPayload = {
      val __obj = js.Dynamic.literal(changeX = changeX.asInstanceOf[js.Any], changeY = changeY.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanGestureChangeEventPayload]
    }
    
    extension [Self <: PanGestureChangeEventPayload](x: Self) {
      
      inline def setChangeX(value: Double): Self = StObject.set(x, "changeX", value.asInstanceOf[js.Any])
      
      inline def setChangeY(value: Double): Self = StObject.set(x, "changeY", value.asInstanceOf[js.Any])
    }
  }
  
  type PanGestureType = InstanceType[Instantiable0[PanGesture]]
}
