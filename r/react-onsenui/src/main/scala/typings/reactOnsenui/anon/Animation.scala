package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.collapse
import typings.reactOnsenui.reactOnsenuiStrings.default
import typings.reactOnsenui.reactOnsenuiStrings.landscape
import typings.reactOnsenui.reactOnsenuiStrings.left
import typings.reactOnsenui.reactOnsenuiStrings.overlay
import typings.reactOnsenui.reactOnsenuiStrings.portrait
import typings.reactOnsenui.reactOnsenuiStrings.right
import typings.reactOnsenui.reactOnsenuiStrings.split
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animation: js.UndefOr[overlay | default] = js.undefined
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.undefined
  
  var collapse: js.UndefOr[portrait | landscape | Boolean] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[collapse | split] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onModeChange: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onPreClose: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var onPreOpen: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
  
  var openThreshold: js.UndefOr[Double] = js.undefined
  
  var side: js.UndefOr[left | right] = js.undefined
  
  var swipeTargetWidth: js.UndefOr[Double] = js.undefined
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Animation {
  
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: overlay | default): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCollapse(value: portrait | landscape | Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setMode(value: collapse | split): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnModeChange(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onModeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnModeChangeUndefined: Self = StObject.set(x, "onModeChange", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setOnPreClose(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onPreClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPreCloseUndefined: Self = StObject.set(x, "onPreClose", js.undefined)
    
    @scala.inline
    def setOnPreOpen(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onPreOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPreOpenUndefined: Self = StObject.set(x, "onPreOpen", js.undefined)
    
    @scala.inline
    def setOpenThreshold(value: Double): Self = StObject.set(x, "openThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenThresholdUndefined: Self = StObject.set(x, "openThreshold", js.undefined)
    
    @scala.inline
    def setSide(value: left | right): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setSwipeTargetWidth(value: Double): Self = StObject.set(x, "swipeTargetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeTargetWidthUndefined: Self = StObject.set(x, "swipeTargetWidth", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
