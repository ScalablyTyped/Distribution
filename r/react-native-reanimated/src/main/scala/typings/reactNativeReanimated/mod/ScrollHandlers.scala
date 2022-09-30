package typings.reactNativeReanimated.mod

import typings.reactNative.mod.NativeScrollEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollHandlers[TContext /* <: Context */] extends StObject {
  
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
    
    inline def setOnBeginDrag(value: (/* event */ NativeScrollEvent, TContext) => Unit): Self = StObject.set(x, "onBeginDrag", js.Any.fromFunction2(value))
    
    inline def setOnBeginDragUndefined: Self = StObject.set(x, "onBeginDrag", js.undefined)
    
    inline def setOnEndDrag(value: (/* event */ NativeScrollEvent, TContext) => Unit): Self = StObject.set(x, "onEndDrag", js.Any.fromFunction2(value))
    
    inline def setOnEndDragUndefined: Self = StObject.set(x, "onEndDrag", js.undefined)
    
    inline def setOnMomentumBegin(value: (/* event */ NativeScrollEvent, TContext) => Unit): Self = StObject.set(x, "onMomentumBegin", js.Any.fromFunction2(value))
    
    inline def setOnMomentumBeginUndefined: Self = StObject.set(x, "onMomentumBegin", js.undefined)
    
    inline def setOnMomentumEnd(value: (/* event */ NativeScrollEvent, TContext) => Unit): Self = StObject.set(x, "onMomentumEnd", js.Any.fromFunction2(value))
    
    inline def setOnMomentumEndUndefined: Self = StObject.set(x, "onMomentumEnd", js.undefined)
    
    inline def setOnScroll(value: (/* event */ NativeScrollEvent, TContext) => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction2(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
  }
}
