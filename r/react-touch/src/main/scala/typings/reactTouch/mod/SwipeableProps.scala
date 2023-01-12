package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeableProps extends StObject {
  
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.undefined
  
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeLeft: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeRight: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipeUp: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object SwipeableProps {
  
  inline def apply(): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwipeableProps] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: SwipeableConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setOnMouseDown(value: () => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction0(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnSwipeDown(value: () => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction0(value))
    
    inline def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
    
    inline def setOnSwipeLeft(value: () => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction0(value))
    
    inline def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
    
    inline def setOnSwipeRight(value: () => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction0(value))
    
    inline def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
    
    inline def setOnSwipeUp(value: () => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction0(value))
    
    inline def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
    
    inline def setOnTouchStart(value: () => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction0(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
