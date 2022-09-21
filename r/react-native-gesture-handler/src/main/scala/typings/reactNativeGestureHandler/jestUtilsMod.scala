package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.gestureMod.BaseGesture
import typings.reactNativeGestureHandler.gestureMod.GestureType
import typings.reactNativeGestureHandler.jestUtilsJestUtilsMod.AllGestures
import typings.reactNativeGestureHandler.jestUtilsJestUtilsMod.AllHandlers
import typings.reactNativeGestureHandler.jestUtilsJestUtilsMod.ExtractConfig
import typings.reactNativeGestureHandler.jestUtilsJestUtilsMod.GestureHandlerTestEvent
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandlerEventPayload
import typings.reactNativeGestureHandler.pinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.rotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureHandlerEventPayload
import typings.reactTestRenderer.mod.ReactTestInstance
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestUtilsMod {
  
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
