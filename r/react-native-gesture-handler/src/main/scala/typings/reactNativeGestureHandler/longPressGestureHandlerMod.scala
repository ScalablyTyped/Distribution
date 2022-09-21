package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.BaseGestureHandlerProps_
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDist
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDurationMs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object longPressGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/LongPressGestureHandler", "LongPressGestureHandler")
  @js.native
  val LongPressGestureHandler: ComponentType[LongPressGestureHandlerProps_ & RefAttributes[Any]] = js.native
  type LongPressGestureHandler = ComponentType[LongPressGestureHandlerProps_ & RefAttributes[Any]]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/LongPressGestureHandler", "longPressGestureHandlerProps")
  @js.native
  val longPressGestureHandlerProps: js.Tuple2[minDurationMs, maxDist] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/LongPressGestureHandler", "longPressHandlerName")
  @js.native
  val longPressHandlerName: /* "LongPressGestureHandler" */ String = js.native
  
  trait LongPressGestureConfig extends StObject {
    
    /**
      * Maximum distance, expressed in points, that defines how far the finger is
      * allowed to travel during a long press gesture. If the finger travels
      * further than the defined distance and the handler hasn't yet activated, it
      * will fail to recognize the gesture. The default value is 10.
      */
    var maxDist: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum time, expressed in milliseconds, that a finger must remain pressed on
      * the corresponding view. The default value is 500.
      */
    var minDurationMs: js.UndefOr[Double] = js.undefined
  }
  object LongPressGestureConfig {
    
    inline def apply(): LongPressGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LongPressGestureConfig]
    }
    
    extension [Self <: LongPressGestureConfig](x: Self) {
      
      inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
      
      inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
      
      inline def setMinDurationMs(value: Double): Self = StObject.set(x, "minDurationMs", value.asInstanceOf[js.Any])
      
      inline def setMinDurationMsUndefined: Self = StObject.set(x, "minDurationMs", js.undefined)
    }
  }
  
  trait LongPressGestureHandlerEventPayload extends StObject {
    
    /**
      * X coordinate, expressed in points, of the current position of the pointer
      * (finger or a leading pointer when there are multiple fingers placed)
      * relative to the window. It is recommended to use `absoluteX` instead of
      * `x` in cases when the view attached to the handler can be transformed as an
      * effect of the gesture.
      */
    var absoluteX: Double
    
    /**
      * Y coordinate, expressed in points, of the current position of the pointer
      * (finger or a leading pointer when there are multiple fingers placed)
      * relative to the window. It is recommended to use `absoluteY` instead of
      * `y` in cases when the view attached to the handler can be transformed as an
      * effect of the gesture.
      */
    var absoluteY: Double
    
    /**
      * Duration of the long press (time since the start of the event), expressed
      * in milliseconds.
      */
    var duration: Double
    
    /**
      * X coordinate, expressed in points, of the current position of the pointer
      * (finger or a leading pointer when there are multiple fingers placed)
      * relative to the view attached to the handler.
      */
    var x: Double
    
    /**
      * Y coordinate, expressed in points, of the current position of the pointer
      * (finger or a leading pointer when there are multiple fingers placed)
      * relative to the view attached to the handler.
      */
    var y: Double
  }
  object LongPressGestureHandlerEventPayload {
    
    inline def apply(absoluteX: Double, absoluteY: Double, duration: Double, x: Double, y: Double): LongPressGestureHandlerEventPayload = {
      val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LongPressGestureHandlerEventPayload]
    }
    
    extension [Self <: LongPressGestureHandlerEventPayload](x: Self) {
      
      inline def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait LongPressGestureHandlerProps_
    extends StObject
       with BaseGestureHandlerProps_[LongPressGestureHandlerEventPayload]
       with LongPressGestureConfig
  object LongPressGestureHandlerProps_ {
    
    inline def apply(): LongPressGestureHandlerProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LongPressGestureHandlerProps_]
    }
  }
}
