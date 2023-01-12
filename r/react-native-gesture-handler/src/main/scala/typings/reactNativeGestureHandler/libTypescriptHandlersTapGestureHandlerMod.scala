package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.BaseGestureHandlerProps_
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDelayMs
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaX
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaY
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDist
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDurationMs
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minPointers
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.numberOfTaps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersTapGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/TapGestureHandler", "TapGestureHandler")
  @js.native
  val TapGestureHandler: ComponentType[TapGestureHandlerProps_ & RefAttributes[Any]] = js.native
  type TapGestureHandler = ComponentType[TapGestureHandlerProps_ & RefAttributes[Any]]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/TapGestureHandler", "tapGestureHandlerProps")
  @js.native
  val tapGestureHandlerProps: js.Tuple7[maxDurationMs, maxDelayMs, numberOfTaps, maxDeltaX, maxDeltaY, maxDist, minPointers] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/TapGestureHandler", "tapHandlerName")
  @js.native
  val tapHandlerName: /* "TapGestureHandler" */ String = js.native
  
  trait TapGestureConfig extends StObject {
    
    /**
      * Maximum time, expressed in milliseconds, that can pass before the next tap
      * if many taps are required. The default value is 500.
      */
    var maxDelayMs: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum distance, expressed in points, that defines how far the finger is
      * allowed to travel along the X axis during a tap gesture. If the finger
      * travels further than the defined distance along the X axis and the handler
      * hasn't yet activated, it will fail to recognize the gesture.
      */
    var maxDeltaX: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum distance, expressed in points, that defines how far the finger is
      * allowed to travel along the Y axis during a tap gesture. If the finger
      * travels further than the defined distance along the Y axis and the handler
      * hasn't yet activated, it will fail to recognize the gesture.
      */
    var maxDeltaY: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum distance, expressed in points, that defines how far the finger is
      * allowed to travel during a tap gesture. If the finger travels further than
      * the defined distance and the handler hasn't yet
      * activated, it will fail to recognize the gesture.
      */
    var maxDist: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum time, expressed in milliseconds, that defines how fast a finger
      * must be released after a touch. The default value is 500.
      */
    var maxDurationMs: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum number of pointers (fingers) required to be placed before the
      * handler activates. Should be a positive integer.
      * The default value is 1.
      */
    var minPointers: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of tap gestures required to activate the handler. The default value
      * is 1.
      */
    var numberOfTaps: js.UndefOr[Double] = js.undefined
  }
  object TapGestureConfig {
    
    inline def apply(): TapGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TapGestureConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TapGestureConfig] (val x: Self) extends AnyVal {
      
      inline def setMaxDelayMs(value: Double): Self = StObject.set(x, "maxDelayMs", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayMsUndefined: Self = StObject.set(x, "maxDelayMs", js.undefined)
      
      inline def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
      
      inline def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
      
      inline def setMaxDist(value: Double): Self = StObject.set(x, "maxDist", value.asInstanceOf[js.Any])
      
      inline def setMaxDistUndefined: Self = StObject.set(x, "maxDist", js.undefined)
      
      inline def setMaxDurationMs(value: Double): Self = StObject.set(x, "maxDurationMs", value.asInstanceOf[js.Any])
      
      inline def setMaxDurationMsUndefined: Self = StObject.set(x, "maxDurationMs", js.undefined)
      
      inline def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
      
      inline def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
      
      inline def setNumberOfTaps(value: Double): Self = StObject.set(x, "numberOfTaps", value.asInstanceOf[js.Any])
      
      inline def setNumberOfTapsUndefined: Self = StObject.set(x, "numberOfTaps", js.undefined)
    }
  }
  
  trait TapGestureHandlerEventPayload extends StObject {
    
    var absoluteX: Double
    
    var absoluteY: Double
    
    var x: Double
    
    var y: Double
  }
  object TapGestureHandlerEventPayload {
    
    inline def apply(absoluteX: Double, absoluteY: Double, x: Double, y: Double): TapGestureHandlerEventPayload = {
      val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TapGestureHandlerEventPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TapGestureHandlerEventPayload] (val x: Self) extends AnyVal {
      
      inline def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait TapGestureHandlerProps_
    extends StObject
       with BaseGestureHandlerProps_[TapGestureHandlerEventPayload]
       with TapGestureConfig
  object TapGestureHandlerProps_ {
    
    inline def apply(): TapGestureHandlerProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TapGestureHandlerProps_]
    }
  }
}
