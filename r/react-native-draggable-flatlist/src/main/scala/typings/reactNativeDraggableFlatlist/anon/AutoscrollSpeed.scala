package typings.reactNativeDraggableFlatlist.anon

import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeDraggableFlatlist.libTypesMod.DragEndParams
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderItem
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderItemParams
import typings.reactNativeDraggableFlatlist.libTypesMod.RenderPlaceholder
import typings.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import typings.reactNativeReanimated.mod.Animated.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoscrollSpeed[T] extends StObject {
  
  var activationDistance: js.UndefOr[Double] = js.undefined
  
  var animationConfig: js.UndefOr[PartialWithSpringConfig] = js.undefined
  
  var autoscrollSpeed: js.UndefOr[Double] = js.undefined
  
  var autoscrollThreshold: js.UndefOr[Double] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var data: js.Array[T]
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var dragItemOverflow: js.UndefOr[Boolean] = js.undefined
  
  def keyExtractor(item: T, index: Double): String
  
  var onAnimValInit: js.UndefOr[js.Function1[/* animVals */ ActiveCellOffset, Unit]] = js.undefined
  
  var onContainerLayout: js.UndefOr[js.Function1[/* params */ Layout, Unit]] = js.undefined
  
  var onDragBegin: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* params */ DragEndParams[T], Unit]] = js.undefined
  
  var onPlaceholderIndexChange: js.UndefOr[js.Function1[/* placeholderIndex */ Double, Unit]] = js.undefined
  
  var onRelease: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var onScrollOffsetChange: js.UndefOr[js.Function1[/* scrollOffset */ Double, Unit]] = js.undefined
  
  var outerScrollOffset: js.UndefOr[SharedValue[Double]] = js.undefined
  
  var ref: js.UndefOr[ForwardedRef[FlatList[T]]] = js.undefined
  
  var renderItem: RenderItem[T]
  
  var renderPlaceholder: js.UndefOr[RenderPlaceholder[T]] = js.undefined
  
  var simultaneousHandlers: js.UndefOr[typings.react.mod.Ref[Any] | js.Array[typings.react.mod.Ref[Any]]] = js.undefined
}
object AutoscrollSpeed {
  
  inline def apply[T](
    data: js.Array[T],
    keyExtractor: (T, Double) => String,
    renderItem: /* params */ RenderItemParams[T] => ReactNode
  ): AutoscrollSpeed[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keyExtractor = js.Any.fromFunction2(keyExtractor), renderItem = js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[AutoscrollSpeed[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoscrollSpeed[?], T] (val x: Self & AutoscrollSpeed[T]) extends AnyVal {
    
    inline def setActivationDistance(value: Double): Self = StObject.set(x, "activationDistance", value.asInstanceOf[js.Any])
    
    inline def setActivationDistanceUndefined: Self = StObject.set(x, "activationDistance", js.undefined)
    
    inline def setAnimationConfig(value: PartialWithSpringConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAutoscrollSpeed(value: Double): Self = StObject.set(x, "autoscrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollSpeedUndefined: Self = StObject.set(x, "autoscrollSpeed", js.undefined)
    
    inline def setAutoscrollThreshold(value: Double): Self = StObject.set(x, "autoscrollThreshold", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollThresholdUndefined: Self = StObject.set(x, "autoscrollThreshold", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDragItemOverflow(value: Boolean): Self = StObject.set(x, "dragItemOverflow", value.asInstanceOf[js.Any])
    
    inline def setDragItemOverflowUndefined: Self = StObject.set(x, "dragItemOverflow", js.undefined)
    
    inline def setKeyExtractor(value: (T, Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    inline def setOnAnimValInit(value: /* animVals */ ActiveCellOffset => Unit): Self = StObject.set(x, "onAnimValInit", js.Any.fromFunction1(value))
    
    inline def setOnAnimValInitUndefined: Self = StObject.set(x, "onAnimValInit", js.undefined)
    
    inline def setOnContainerLayout(value: /* params */ Layout => Unit): Self = StObject.set(x, "onContainerLayout", js.Any.fromFunction1(value))
    
    inline def setOnContainerLayoutUndefined: Self = StObject.set(x, "onContainerLayout", js.undefined)
    
    inline def setOnDragBegin(value: /* index */ Double => Unit): Self = StObject.set(x, "onDragBegin", js.Any.fromFunction1(value))
    
    inline def setOnDragBeginUndefined: Self = StObject.set(x, "onDragBegin", js.undefined)
    
    inline def setOnDragEnd(value: /* params */ DragEndParams[T] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnPlaceholderIndexChange(value: /* placeholderIndex */ Double => Unit): Self = StObject.set(x, "onPlaceholderIndexChange", js.Any.fromFunction1(value))
    
    inline def setOnPlaceholderIndexChangeUndefined: Self = StObject.set(x, "onPlaceholderIndexChange", js.undefined)
    
    inline def setOnRelease(value: /* index */ Double => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
    
    inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    inline def setOnScrollOffsetChange(value: /* scrollOffset */ Double => Unit): Self = StObject.set(x, "onScrollOffsetChange", js.Any.fromFunction1(value))
    
    inline def setOnScrollOffsetChangeUndefined: Self = StObject.set(x, "onScrollOffsetChange", js.undefined)
    
    inline def setOuterScrollOffset(value: SharedValue[Double]): Self = StObject.set(x, "outerScrollOffset", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollOffsetUndefined: Self = StObject.set(x, "outerScrollOffset", js.undefined)
    
    inline def setRef(value: ForwardedRef[FlatList[T]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ FlatList[T] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderItem(value: /* params */ RenderItemParams[T] => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    inline def setRenderPlaceholder(value: /* params */ Index[T] => Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
    
    inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    
    inline def setSimultaneousHandlers(value: typings.react.mod.Ref[Any] | js.Array[typings.react.mod.Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: typings.react.mod.Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
  }
}
