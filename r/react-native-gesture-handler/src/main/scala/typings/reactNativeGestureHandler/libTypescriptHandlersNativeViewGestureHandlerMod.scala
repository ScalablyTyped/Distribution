package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.BaseGestureHandlerProps_
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.cancelsTouchesInView
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.disallowInterruption
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onActivated
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onBegan
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onCancelled
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onEnded
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onFailed
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onGestureEvent
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.onHandlerStateChange
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldActivateOnStart
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers
import typings.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersNativeViewGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/NativeViewGestureHandler", "NativeViewGestureHandler")
  @js.native
  val NativeViewGestureHandler: ComponentType[NativeViewGestureHandlerProps_ & RefAttributes[Any]] = js.native
  type NativeViewGestureHandler = ComponentType[NativeViewGestureHandlerProps_ & RefAttributes[Any]]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/NativeViewGestureHandler", "nativeViewGestureHandlerProps")
  @js.native
  val nativeViewGestureHandlerProps: js.Tuple2[shouldActivateOnStart, disallowInterruption] = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/NativeViewGestureHandler", "nativeViewHandlerName")
  @js.native
  val nativeViewHandlerName: /* "NativeViewGestureHandler" */ String = js.native
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/NativeViewGestureHandler", "nativeViewProps")
  @js.native
  val nativeViewProps: js.Tuple16[
    id, 
    enabled, 
    shouldCancelWhenOutside, 
    hitSlop, 
    cancelsTouchesInView, 
    waitFor, 
    simultaneousHandlers, 
    onBegan, 
    onFailed, 
    onCancelled, 
    onActivated, 
    onEnded, 
    onGestureEvent, 
    onHandlerStateChange, 
    shouldActivateOnStart, 
    disallowInterruption
  ] = js.native
  
  trait NativeViewGestureConfig extends StObject {
    
    /**
      * When `true`, cancels all other gesture handlers when this
      * `NativeViewGestureHandler` receives an `ACTIVE` state event.
      */
    var disallowInterruption: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Android only.
      *
      * Determines whether the handler should check for an existing touch event on
      * instantiation.
      */
    var shouldActivateOnStart: js.UndefOr[Boolean] = js.undefined
  }
  object NativeViewGestureConfig {
    
    inline def apply(): NativeViewGestureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeViewGestureConfig]
    }
    
    extension [Self <: NativeViewGestureConfig](x: Self) {
      
      inline def setDisallowInterruption(value: Boolean): Self = StObject.set(x, "disallowInterruption", value.asInstanceOf[js.Any])
      
      inline def setDisallowInterruptionUndefined: Self = StObject.set(x, "disallowInterruption", js.undefined)
      
      inline def setShouldActivateOnStart(value: Boolean): Self = StObject.set(x, "shouldActivateOnStart", value.asInstanceOf[js.Any])
      
      inline def setShouldActivateOnStartUndefined: Self = StObject.set(x, "shouldActivateOnStart", js.undefined)
    }
  }
  
  trait NativeViewGestureHandlerPayload extends StObject {
    
    /**
      * True if gesture was performed inside of containing view, false otherwise.
      */
    var pointerInside: Boolean
  }
  object NativeViewGestureHandlerPayload {
    
    inline def apply(pointerInside: Boolean): NativeViewGestureHandlerPayload = {
      val __obj = js.Dynamic.literal(pointerInside = pointerInside.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeViewGestureHandlerPayload]
    }
    
    extension [Self <: NativeViewGestureHandlerPayload](x: Self) {
      
      inline def setPointerInside(value: Boolean): Self = StObject.set(x, "pointerInside", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeViewGestureHandlerProps_
    extends StObject
       with BaseGestureHandlerProps_[NativeViewGestureHandlerPayload]
       with NativeViewGestureConfig
  object NativeViewGestureHandlerProps_ {
    
    inline def apply(): NativeViewGestureHandlerProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeViewGestureHandlerProps_]
    }
  }
}
