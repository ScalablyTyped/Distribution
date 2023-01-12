package typings.reactNativeReanimated

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.MutableRefObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.WorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Context
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.DependencyList
import typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookUseAnimatedGestureHandlerMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedGestureHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedGestureHandler", "EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventType & Double] = js.native
    
    @js.native
    sealed trait ACTIVE
      extends StObject
         with EventType
    /* 4 */ val ACTIVE: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.EventType.ACTIVE & Double = js.native
    
    @js.native
    sealed trait BEGAN
      extends StObject
         with EventType
    /* 2 */ val BEGAN: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.EventType.BEGAN & Double = js.native
    
    @js.native
    sealed trait CANCELLED
      extends StObject
         with EventType
    /* 3 */ val CANCELLED: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.EventType.CANCELLED & Double = js.native
    
    @js.native
    sealed trait END
      extends StObject
         with EventType
    /* 5 */ val END: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.EventType.END & Double = js.native
    
    @js.native
    sealed trait FAILED
      extends StObject
         with EventType
    /* 1 */ val FAILED: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.EventType.FAILED & Double = js.native
    
    @js.native
    sealed trait UNDETERMINED
      extends StObject
         with EventType
    /* 0 */ val UNDETERMINED: typings.reactNativeReanimated.libTypesReanimated2HookUseAnimatedGestureHandlerMod.EventType.UNDETERMINED & Double = js.native
  }
  
  inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext]): (MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[(MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit])]
  inline def useAnimatedGestureHandler[T /* <: GestureHandlerEvent[T] */, TContext /* <: Context */](handlers: GestureHandlers[T, TContext], dependencies: DependencyList): (MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit]) = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedGestureHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[(MutableRefObject[default[T] | Null]) | (js.Function1[/* e */ T, Unit])]
  
  trait GestureHandlerEvent[T]
    extends StObject
       with GestureHandlerStateChangeNativeEvent {
    
    var nativeEvent: T
  }
  object GestureHandlerEvent {
    
    inline def apply[T](
      handlerTag: Double,
      nativeEvent: T,
      numberOfPointers: Double,
      oldState: EventType,
      state: EventType
    ): GestureHandlerEvent[T] = {
      val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureHandlerEvent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GestureHandlerEvent[?], T] (val x: Self & GestureHandlerEvent[T]) extends AnyVal {
      
      inline def setNativeEvent(value: T): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait GestureHandlerStateChangeNativeEvent extends StObject {
    
    var handlerTag: Double
    
    var numberOfPointers: Double
    
    var oldState: EventType
    
    var state: EventType
  }
  object GestureHandlerStateChangeNativeEvent {
    
    inline def apply(handlerTag: Double, numberOfPointers: Double, oldState: EventType, state: EventType): GestureHandlerStateChangeNativeEvent = {
      val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[GestureHandlerStateChangeNativeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GestureHandlerStateChangeNativeEvent] (val x: Self) extends AnyVal {
      
      inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
      
      inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
      
      inline def setOldState(value: EventType): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
      
      inline def setState(value: EventType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait GestureHandlers[T, TContext /* <: Context */]
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[Handler[T, TContext]]] {
    
    var onActive: js.UndefOr[Handler[T, TContext]] = js.undefined
    
    var onCancel: js.UndefOr[Handler[T, TContext]] = js.undefined
    
    var onEnd: js.UndefOr[Handler[T, TContext]] = js.undefined
    
    var onFail: js.UndefOr[Handler[T, TContext]] = js.undefined
    
    var onFinish: js.UndefOr[Handler[T, TContext]] = js.undefined
    
    var onStart: js.UndefOr[Handler[T, TContext]] = js.undefined
  }
  object GestureHandlers {
    
    inline def apply[T, TContext /* <: Context */](): GestureHandlers[T, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GestureHandlers[T, TContext]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GestureHandlers[?, ?], T, TContext /* <: Context */] (val x: Self & (GestureHandlers[T, TContext])) extends AnyVal {
      
      inline def setOnActive(value: Handler[T, TContext]): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
      
      inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      inline def setOnCancel(value: Handler[T, TContext]): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnEnd(value: Handler[T, TContext]): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnFail(value: Handler[T, TContext]): Self = StObject.set(x, "onFail", value.asInstanceOf[js.Any])
      
      inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
      
      inline def setOnFinish(value: Handler[T, TContext]): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnStart(value: Handler[T, TContext]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    }
  }
  
  @js.native
  trait Handler[T, TContext /* <: Context */]
    extends StObject
       with WorkletFunction {
    
    def apply(event: T, context: TContext): Unit = js.native
    def apply(event: T, context: TContext, isCanceledOrFailed: Boolean): Unit = js.native
  }
}
