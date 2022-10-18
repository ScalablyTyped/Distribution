package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.reactNativeGestureHandler.libTypescriptHandlersFlingGestureHandlerMod.FlingGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersForceTouchGestureHandlerMod.ForceTouchGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersForceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typings.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.GestureType
import typings.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typings.reactNativeGestureHandler.libTypescriptHandlersTapGestureHandlerMod.TapGestureHandler
import typings.reactNativeGestureHandler.libTypescriptHandlersTapGestureHandlerMod.TapGestureHandlerEventPayload
import typings.reactTestRenderer.mod.ReactTestInstance
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptJestUtilsJestUtilsMod {
  
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
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesTapGestureMod.TapGesture
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesPanGestureMod.PanGesture
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesLongPressGestureMod.LongPressGesture
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesRotationGestureMod.RotationGesture
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesPinchGestureMod.PinchGesture
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesFlingGestureMod.FlingGesture
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesForceTouchGestureMod.ForceTouchGesture
    - typings.reactNativeGestureHandler.libTypescriptHandlersGesturesNativeGestureMod.NativeGesture
  */
  trait AllGestures extends StObject
  
  type AllHandlers = TapGestureHandler | PanGestureHandler | LongPressGestureHandler | RotationGestureHandler | PinchGestureHandler | FlingGestureHandler | ForceTouchGestureHandler | NativeViewGestureHandler
  
  type ClassComponentConstructor[P] = Instantiable1[/* props */ P, Component[P, Any, Any]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestures/gesture.BaseGesture<infer TGesturePayload> ? TGesturePayload : T extends react-native-gesture-handler.react-native-gesture-handler/lib/typescript/jestUtils/jestUtils.ClassComponentConstructor<infer THandlerProps> ? react-native-gesture-handler.react-native-gesture-handler/lib/typescript/jestUtils/jestUtils.ExtractPayloadFromProps<THandlerProps> : std.Record<string, unknown>
    }}}
    */
  @js.native
  trait ExtractConfig[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.BaseGestureHandlerProps<infer TPayload> ? TPayload : never
    }}}
    */
  @js.native
  trait ExtractPayloadFromProps[T] extends StObject
  
  /* Inlined react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.GestureEvent<TEventPayload> | react-native-gesture-handler.react-native-gesture-handler/lib/typescript/handlers/gestureHandlerCommon.HandlerStateChangeEvent<TEventPayload>['nativeEvent'] */
  type GestureHandlerTestEvent[TEventPayload /* <: Record[String, Any] */] = scala.Nothing
}
