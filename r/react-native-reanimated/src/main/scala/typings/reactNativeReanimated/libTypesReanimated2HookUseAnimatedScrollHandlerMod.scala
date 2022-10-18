package typings.reactNativeReanimated

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.RefObject
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeScrollPoint
import typings.reactNative.mod.NativeScrollRectangle
import typings.reactNative.mod.NativeScrollSize
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.NativeEvent
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.WorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Context
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.DependencyList
import typings.reactNativeReanimated.libTypesReanimated2WorkletEventHandlerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookUseAnimatedScrollHandlerMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedScrollHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext]): RefObject[default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefObject[default[ScrollEvent]]]
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandler[TContext], dependencies: DependencyList): RefObject[default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefObject[default[ScrollEvent]]]
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext]): RefObject[default[ScrollEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any]).asInstanceOf[RefObject[default[ScrollEvent]]]
  inline def useAnimatedScrollHandler[TContext /* <: Context */](handlers: ScrollHandlers[TContext], dependencies: DependencyList): RefObject[default[ScrollEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedScrollHandler")(handlers.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefObject[default[ScrollEvent]]]
  
  trait ScrollEvent
    extends StObject
       with NativeScrollEvent
       with NativeEvent[ScrollEvent] {
    
    var eventName: String
  }
  object ScrollEvent {
    
    inline def apply(
      contentInset: NativeScrollRectangle,
      contentOffset: NativeScrollPoint,
      contentSize: NativeScrollSize,
      eventName: String,
      layoutMeasurement: NativeScrollSize,
      nativeEvent: ScrollEvent,
      zoomScale: Double
    ): ScrollEvent = {
      val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], layoutMeasurement = layoutMeasurement.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollEvent]
    }
    
    extension [Self <: ScrollEvent](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollHandler[TContext /* <: Context */]
    extends StObject
       with WorkletFunction {
    
    def apply(event: NativeScrollEvent): Unit = js.native
    def apply(event: NativeScrollEvent, context: TContext): Unit = js.native
  }
  
  trait ScrollHandlers[TContext /* <: Context */]
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[ScrollHandler[TContext]]] {
    
    var onBeginDrag: js.UndefOr[ScrollHandler[TContext]] = js.undefined
    
    var onEndDrag: js.UndefOr[ScrollHandler[TContext]] = js.undefined
    
    var onMomentumBegin: js.UndefOr[ScrollHandler[TContext]] = js.undefined
    
    var onMomentumEnd: js.UndefOr[ScrollHandler[TContext]] = js.undefined
    
    var onScroll: js.UndefOr[ScrollHandler[TContext]] = js.undefined
  }
  object ScrollHandlers {
    
    inline def apply[TContext /* <: Context */](): ScrollHandlers[TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollHandlers[TContext]]
    }
    
    extension [Self <: ScrollHandlers[?], TContext /* <: Context */](x: Self & ScrollHandlers[TContext]) {
      
      inline def setOnBeginDrag(value: ScrollHandler[TContext]): Self = StObject.set(x, "onBeginDrag", value.asInstanceOf[js.Any])
      
      inline def setOnBeginDragUndefined: Self = StObject.set(x, "onBeginDrag", js.undefined)
      
      inline def setOnEndDrag(value: ScrollHandler[TContext]): Self = StObject.set(x, "onEndDrag", value.asInstanceOf[js.Any])
      
      inline def setOnEndDragUndefined: Self = StObject.set(x, "onEndDrag", js.undefined)
      
      inline def setOnMomentumBegin(value: ScrollHandler[TContext]): Self = StObject.set(x, "onMomentumBegin", value.asInstanceOf[js.Any])
      
      inline def setOnMomentumBeginUndefined: Self = StObject.set(x, "onMomentumBegin", js.undefined)
      
      inline def setOnMomentumEnd(value: ScrollHandler[TContext]): Self = StObject.set(x, "onMomentumEnd", value.asInstanceOf[js.Any])
      
      inline def setOnMomentumEndUndefined: Self = StObject.set(x, "onMomentumEnd", js.undefined)
      
      inline def setOnScroll(value: ScrollHandler[TContext]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    }
  }
}
