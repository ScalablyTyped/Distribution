package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableProps extends StObject {
  
  /** @see defineSwipe */
  var config: js.UndefOr[SwipeableConfig] = js.native
  
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeDown: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeLeft: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeRight: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipeUp: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.native
}
object SwipeableProps {
  
  @scala.inline
  def apply(): SwipeableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableProps]
  }
  
  @scala.inline
  implicit class SwipeablePropsMutableBuilder[Self <: SwipeableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: SwipeableConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: () => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnSwipeDown(value: () => Unit): Self = StObject.set(x, "onSwipeDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwipeDownUndefined: Self = StObject.set(x, "onSwipeDown", js.undefined)
    
    @scala.inline
    def setOnSwipeLeft(value: () => Unit): Self = StObject.set(x, "onSwipeLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwipeLeftUndefined: Self = StObject.set(x, "onSwipeLeft", js.undefined)
    
    @scala.inline
    def setOnSwipeRight(value: () => Unit): Self = StObject.set(x, "onSwipeRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwipeRightUndefined: Self = StObject.set(x, "onSwipeRight", js.undefined)
    
    @scala.inline
    def setOnSwipeUp(value: () => Unit): Self = StObject.set(x, "onSwipeUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSwipeUpUndefined: Self = StObject.set(x, "onSwipeUp", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: () => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
