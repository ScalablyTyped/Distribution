package typings.reactNativeDraggableFlatlist.anon

import typings.react.mod.Dispatch
import typings.react.mod.RefObject
import typings.react.mod.SetStateAction
import typings.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.ScrollView
import typings.reactNativeReanimated.mod.Animated.Value
import typings.reactNativeReanimated.mod.Animated.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerRef extends StObject {
  
  var containerRef: RefObject[View]
  
  var containerSize: Value
  
  var outerScrollEnabled: Boolean
  
  var outerScrollOffset: Value
  
  var scrollViewSize: Value
  
  var scrollableRef: RefObject[ScrollView]
  
  var setOuterScrollEnabled: Dispatch[SetStateAction[Boolean]]
}
object ContainerRef {
  
  inline def apply(
    containerRef: RefObject[View],
    containerSize: Value,
    outerScrollEnabled: Boolean,
    outerScrollOffset: Value,
    scrollViewSize: Value,
    scrollableRef: RefObject[ScrollView],
    setOuterScrollEnabled: SetStateAction[Boolean] => Unit
  ): ContainerRef = {
    val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], outerScrollEnabled = outerScrollEnabled.asInstanceOf[js.Any], outerScrollOffset = outerScrollOffset.asInstanceOf[js.Any], scrollViewSize = scrollViewSize.asInstanceOf[js.Any], scrollableRef = scrollableRef.asInstanceOf[js.Any], setOuterScrollEnabled = js.Any.fromFunction1(setOuterScrollEnabled))
    __obj.asInstanceOf[ContainerRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerRef] (val x: Self) extends AnyVal {
    
    inline def setContainerRef(value: RefObject[View]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setContainerSize(value: Value): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollEnabled(value: Boolean): Self = StObject.set(x, "outerScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollOffset(value: Value): Self = StObject.set(x, "outerScrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollViewSize(value: Value): Self = StObject.set(x, "scrollViewSize", value.asInstanceOf[js.Any])
    
    inline def setScrollableRef(value: RefObject[ScrollView]): Self = StObject.set(x, "scrollableRef", value.asInstanceOf[js.Any])
    
    inline def setSetOuterScrollEnabled(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setOuterScrollEnabled", js.Any.fromFunction1(value))
  }
}
