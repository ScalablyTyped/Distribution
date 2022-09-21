package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.reactNativeGestureHandler.flingGestureHandlerMod.FlingGestureHandler
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureHandler
import typings.reactNativeGestureHandler.forceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.gestureMod.BaseGesture
import typings.reactNativeGestureHandler.gestureMod.GestureType
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureHandler
import typings.reactNativeGestureHandler.longPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandler
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandler
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandlerEventPayload
import typings.reactNativeGestureHandler.pinchGestureHandlerMod.PinchGestureHandler
import typings.reactNativeGestureHandler.pinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.rotationGestureHandlerMod.RotationGestureHandler
import typings.reactNativeGestureHandler.rotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureHandler
import typings.reactNativeGestureHandler.tapGestureHandlerMod.TapGestureHandlerEventPayload
import typings.reactTestRenderer.mod.ReactTestInstance
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestUtilsJestUtilsMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/jestUtils/jestUtils", JSImport.Namespace)
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.tapGestureMod.TapGesture
    - typings.reactNativeGestureHandler.panGestureMod.PanGesture
    - typings.reactNativeGestureHandler.longPressGestureMod.LongPressGesture
    - typings.reactNativeGestureHandler.rotationGestureMod.RotationGesture
    - typings.reactNativeGestureHandler.pinchGestureMod.PinchGesture
    - typings.reactNativeGestureHandler.flingGestureMod.FlingGesture
    - typings.reactNativeGestureHandler.forceTouchGestureMod.ForceTouchGesture
    - typings.reactNativeGestureHandler.nativeGestureMod.NativeGesture
  */
  trait AllGestures extends StObject
  
  type AllHandlers = TapGestureHandler | PanGestureHandler | LongPressGestureHandler | RotationGestureHandler | PinchGestureHandler | FlingGestureHandler | ForceTouchGestureHandler | NativeViewGestureHandler
  
  type ClassComponentConstructor[P] = Instantiable1[/* props */ P, Component[P, Any, Any]]
  
  type ExtractConfig[T] = (Record[String, Any]) | ExtractPayloadFromProps[Any]
  
  type ExtractPayloadFromProps[T] = Any
  
  /* Inlined react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.GestureEvent<TEventPayload> | react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.HandlerStateChangeEvent<TEventPayload>['nativeEvent'] */
  type GestureHandlerTestEvent[TEventPayload /* <: Record[String, Any] */] = scala.Nothing
}
