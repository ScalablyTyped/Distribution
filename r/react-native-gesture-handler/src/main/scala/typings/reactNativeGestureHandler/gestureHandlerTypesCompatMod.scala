package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.flingGestureHandlerMod.FlingGestureHandlerEventPayload
import typings.reactNativeGestureHandler.flingGestureHandlerMod.FlingGestureHandlerProps_
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureHandlerProps_
import typings.reactNativeGestureHandler.gestureButtonsMod.BaseButtonProps
import typings.reactNativeGestureHandler.gestureButtonsMod.BorderlessButtonProps
import typings.reactNativeGestureHandler.gestureButtonsMod.RawButtonProps
import typings.reactNativeGestureHandler.gestureButtonsMod.RectButtonProps
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.GestureEvent
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.GestureEventPayload
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.HandlerStateChangeEvent
import typings.reactNativeGestureHandler.gestureHandlerCommonMod.HandlerStateChangeEventPayload
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureHandlerProps_
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandlerProps_
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandlerEventPayload
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandlerProps_
import typings.reactNativeGestureHandler.pinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.pinchGestureHandlerMod.PinchGestureHandlerProps
import typings.reactNativeGestureHandler.rotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typings.reactNativeGestureHandler.rotationGestureHandlerMod.RotationGestureHandlerProps
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureHandlerEventPayload
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureHandlerProps_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerTypesCompatMod {
  
  type BaseButtonProperties = BaseButtonProps
  
  type BorderlessButtonProperties = BorderlessButtonProps
  
  type FlingGestureHandlerGestureEvent = GestureEvent[FlingGestureHandlerEventPayload]
  
  type FlingGestureHandlerProperties = FlingGestureHandlerProps_
  
  type FlingGestureHandlerStateChangeEvent = HandlerStateChangeEvent[FlingGestureHandlerEventPayload]
  
  type ForceTouchGestureHandlerGestureEvent = GestureEvent[ForceTouchGestureHandlerEventPayload]
  
  type ForceTouchGestureHandlerProperties = ForceTouchGestureHandlerProps_
  
  type ForceTouchGestureHandlerStateChangeEvent = HandlerStateChangeEvent[ForceTouchGestureHandlerEventPayload]
  
  type GestureHandlerGestureEvent = GestureEvent[Record[String, Any]]
  
  type GestureHandlerGestureEventNativeEvent = GestureEventPayload
  
  type GestureHandlerStateChangeEvent = HandlerStateChangeEvent[Record[String, Any]]
  
  type GestureHandlerStateChangeNativeEvent = HandlerStateChangeEventPayload
  
  type LongPressGestureHandlerGestureEvent = GestureEvent[LongPressGestureHandlerEventPayload]
  
  type LongPressGestureHandlerProperties = LongPressGestureHandlerProps_
  
  type LongPressGestureHandlerStateChangeEvent = HandlerStateChangeEvent[LongPressGestureHandlerEventPayload]
  
  type NativeViewGestureHandlerGestureEvent = GestureEvent[NativeViewGestureHandlerPayload]
  
  type NativeViewGestureHandlerProperties = NativeViewGestureHandlerProps_
  
  type NativeViewGestureHandlerStateChangeEvent = HandlerStateChangeEvent[NativeViewGestureHandlerPayload]
  
  type PanGestureHandlerGestureEvent = GestureEvent[PanGestureHandlerEventPayload]
  
  type PanGestureHandlerProperties = PanGestureHandlerProps_
  
  type PanGestureHandlerStateChangeEvent = HandlerStateChangeEvent[PanGestureHandlerEventPayload]
  
  type PinchGestureHandlerGestureEvent = GestureEvent[PinchGestureHandlerEventPayload]
  
  type PinchGestureHandlerProperties = PinchGestureHandlerProps
  
  type PinchGestureHandlerStateChangeEvent = HandlerStateChangeEvent[PinchGestureHandlerEventPayload]
  
  type RawButtonProperties = RawButtonProps
  
  type RectButtonProperties = RectButtonProps
  
  type RotationGestureHandlerGestureEvent = GestureEvent[RotationGestureHandlerEventPayload]
  
  type RotationGestureHandlerProperties = RotationGestureHandlerProps
  
  type RotationGestureHandlerStateChangeEvent = HandlerStateChangeEvent[RotationGestureHandlerEventPayload]
  
  type TapGestureHandlerGestureEvent = GestureEvent[TapGestureHandlerEventPayload]
  
  type TapGestureHandlerProperties = TapGestureHandlerProps_
  
  type TapGestureHandlerStateChangeEvent = HandlerStateChangeEvent[TapGestureHandlerEventPayload]
}
