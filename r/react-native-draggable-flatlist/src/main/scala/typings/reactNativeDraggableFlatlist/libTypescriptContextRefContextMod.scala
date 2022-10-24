package typings.reactNativeDraggableFlatlist

import typings.react.mod.ForwardedRef
import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactNativeDraggableFlatlist.anon.ChildrenFlatListRef
import typings.reactNativeDraggableFlatlist.libTypescriptTypesMod.CellData
import typings.reactNativeDraggableFlatlist.libTypescriptTypesMod.DraggableFlatListProps
import typings.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import typings.reactNativeReanimated.mod.Animated.ScrollView
import typings.reactNativeReanimated.mod.Animated.View
import typings.reactNativeReanimated.mod.WithSpringConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptContextRefContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/context/refContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](param0: ChildrenFlatListRef[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useRefs[T](): RefContextValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefs")().asInstanceOf[RefContextValue[T]]
  
  trait RefContextValue[T] extends StObject {
    
    var animationConfigRef: MutableRefObject[WithSpringConfig]
    
    var cellDataRef: MutableRefObject[Map[String, CellData]]
    
    var containerRef: RefObject[View]
    
    var flatlistRef: RefObject[FlatList[T]] | ForwardedRef[FlatList[T]]
    
    var keyToIndexRef: MutableRefObject[Map[String, Double]]
    
    var propsRef: MutableRefObject[DraggableFlatListProps[T]]
    
    var scrollViewRef: RefObject[ScrollView]
  }
  object RefContextValue {
    
    inline def apply[T](
      animationConfigRef: MutableRefObject[WithSpringConfig],
      cellDataRef: MutableRefObject[Map[String, CellData]],
      containerRef: RefObject[View],
      keyToIndexRef: MutableRefObject[Map[String, Double]],
      propsRef: MutableRefObject[DraggableFlatListProps[T]],
      scrollViewRef: RefObject[ScrollView]
    ): RefContextValue[T] = {
      val __obj = js.Dynamic.literal(animationConfigRef = animationConfigRef.asInstanceOf[js.Any], cellDataRef = cellDataRef.asInstanceOf[js.Any], containerRef = containerRef.asInstanceOf[js.Any], keyToIndexRef = keyToIndexRef.asInstanceOf[js.Any], propsRef = propsRef.asInstanceOf[js.Any], scrollViewRef = scrollViewRef.asInstanceOf[js.Any], flatlistRef = null)
      __obj.asInstanceOf[RefContextValue[T]]
    }
    
    extension [Self <: RefContextValue[?], T](x: Self & RefContextValue[T]) {
      
      inline def setAnimationConfigRef(value: MutableRefObject[WithSpringConfig]): Self = StObject.set(x, "animationConfigRef", value.asInstanceOf[js.Any])
      
      inline def setCellDataRef(value: MutableRefObject[Map[String, CellData]]): Self = StObject.set(x, "cellDataRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRef(value: RefObject[View]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setFlatlistRef(value: RefObject[FlatList[T]] | ForwardedRef[FlatList[T]]): Self = StObject.set(x, "flatlistRef", value.asInstanceOf[js.Any])
      
      inline def setFlatlistRefFunction1(value: /* instance */ FlatList[T] | Null => Unit): Self = StObject.set(x, "flatlistRef", js.Any.fromFunction1(value))
      
      inline def setFlatlistRefNull: Self = StObject.set(x, "flatlistRef", null)
      
      inline def setKeyToIndexRef(value: MutableRefObject[Map[String, Double]]): Self = StObject.set(x, "keyToIndexRef", value.asInstanceOf[js.Any])
      
      inline def setPropsRef(value: MutableRefObject[DraggableFlatListProps[T]]): Self = StObject.set(x, "propsRef", value.asInstanceOf[js.Any])
      
      inline def setScrollViewRef(value: RefObject[ScrollView]): Self = StObject.set(x, "scrollViewRef", value.asInstanceOf[js.Any])
    }
  }
}
