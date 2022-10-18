package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.libTypescriptHandlersForceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.GestureType
import typings.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersTapGestureHandlerMod.TapGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllGestures
import typings.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllHandlers
import typings.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.ExtractConfig
import typings.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.GestureHandlerTestEvent
import typings.reactTestRenderer.mod.ReactTestInstance
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptJestUtilsMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/jestUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](componentOrGesture: GestureType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](
    componentOrGesture: GestureType,
    eventList: js.Array[Partial[GestureHandlerTestEvent[ExtractConfig[THandler]]]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any], eventList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](componentOrGesture: ReactTestInstance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fireGestureHandler[THandler /* <: AllGestures | AllHandlers */](
    componentOrGesture: ReactTestInstance,
    eventList: js.Array[Partial[GestureHandlerTestEvent[ExtractConfig[THandler]]]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fireGestureHandler")(componentOrGesture.asInstanceOf[js.Any], eventList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getByGestureTestId(testID: String): BaseGesture[
    ForceTouchGestureHandlerEventPayload | LongPressGestureHandlerEventPayload | NativeViewGestureHandlerPayload | PanGestureHandlerEventPayload | PinchGestureHandlerEventPayload | (Record[String, Any | scala.Nothing]) | RotationGestureHandlerEventPayload | TapGestureHandlerEventPayload
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getByGestureTestId")(testID.asInstanceOf[js.Any]).asInstanceOf[BaseGesture[
    ForceTouchGestureHandlerEventPayload | LongPressGestureHandlerEventPayload | NativeViewGestureHandlerPayload | PanGestureHandlerEventPayload | PinchGestureHandlerEventPayload | (Record[String, Any | scala.Nothing]) | RotationGestureHandlerEventPayload | TapGestureHandlerEventPayload
  ]]
}
