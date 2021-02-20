package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.typesMod.AnimationType
import typings.reactAliceCarousel.typesMod.AutoPlayStrategy
import typings.reactAliceCarousel.typesMod.AutoplayDirection
import typings.reactAliceCarousel.typesMod.ControlsStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveIndex extends StObject {
  
  var activeIndex: Double = js.native
  
  var animationDuration: Double = js.native
  
  var animationEasingFunction: String = js.native
  
  var animationType: AnimationType = js.native
  
  var autoHeight: Boolean = js.native
  
  var autoPlay: Boolean = js.native
  
  var autoPlayControls: Boolean = js.native
  
  var autoPlayDirection: AutoplayDirection = js.native
  
  var autoPlayInterval: Double = js.native
  
  var autoPlayStrategy: AutoPlayStrategy = js.native
  
  var autoWidth: Boolean = js.native
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var controlsStrategy: ControlsStrategy = js.native
  
  var disableButtonsControls: Boolean = js.native
  
  var disableDotsControls: Boolean = js.native
  
  var disableSlideInfo: Boolean = js.native
  
  var infinite: Boolean = js.native
  
  var items: js.UndefOr[scala.Nothing] = js.native
  
  var mouseTracking: Boolean = js.native
  
  def onInitialized(): js.UndefOr[scala.Nothing] = js.native
  
  var onResizeEvent: js.UndefOr[scala.Nothing] = js.native
  
  def onResized(): js.UndefOr[scala.Nothing] = js.native
  
  def onSlideChange(): js.UndefOr[scala.Nothing] = js.native
  
  def onSlideChanged(): js.UndefOr[scala.Nothing] = js.native
  
  var paddingLeft: Double = js.native
  
  var paddingRight: Double = js.native
  
  var responsive: js.UndefOr[scala.Nothing] = js.native
  
  var swipeDelta: Double = js.native
  
  var swipeExtraPadding: Double = js.native
  
  var touchMoveDefaultEvents: Boolean = js.native
  
  var touchTracking: Boolean = js.native
}
object ActiveIndex {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    animationDuration: Double,
    animationEasingFunction: String,
    animationType: AnimationType,
    autoHeight: Boolean,
    autoPlay: Boolean,
    autoPlayControls: Boolean,
    autoPlayDirection: AutoplayDirection,
    autoPlayInterval: Double,
    autoPlayStrategy: AutoPlayStrategy,
    autoWidth: Boolean,
    controlsStrategy: ControlsStrategy,
    disableButtonsControls: Boolean,
    disableDotsControls: Boolean,
    disableSlideInfo: Boolean,
    infinite: Boolean,
    mouseTracking: Boolean,
    onInitialized: () => js.UndefOr[scala.Nothing],
    onResized: () => js.UndefOr[scala.Nothing],
    onSlideChange: () => js.UndefOr[scala.Nothing],
    onSlideChanged: () => js.UndefOr[scala.Nothing],
    paddingLeft: Double,
    paddingRight: Double,
    swipeDelta: Double,
    swipeExtraPadding: Double,
    touchMoveDefaultEvents: Boolean,
    touchTracking: Boolean
  ): ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], animationEasingFunction = animationEasingFunction.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], autoHeight = autoHeight.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], autoPlayControls = autoPlayControls.asInstanceOf[js.Any], autoPlayDirection = autoPlayDirection.asInstanceOf[js.Any], autoPlayInterval = autoPlayInterval.asInstanceOf[js.Any], autoPlayStrategy = autoPlayStrategy.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], controlsStrategy = controlsStrategy.asInstanceOf[js.Any], disableButtonsControls = disableButtonsControls.asInstanceOf[js.Any], disableDotsControls = disableDotsControls.asInstanceOf[js.Any], disableSlideInfo = disableSlideInfo.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], mouseTracking = mouseTracking.asInstanceOf[js.Any], onInitialized = js.Any.fromFunction0(onInitialized), onResized = js.Any.fromFunction0(onResized), onSlideChange = js.Any.fromFunction0(onSlideChange), onSlideChanged = js.Any.fromFunction0(onSlideChanged), paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], swipeDelta = swipeDelta.asInstanceOf[js.Any], swipeExtraPadding = swipeExtraPadding.asInstanceOf[js.Any], touchMoveDefaultEvents = touchMoveDefaultEvents.asInstanceOf[js.Any], touchTracking = touchTracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
  
  @scala.inline
  implicit class ActiveIndexMutableBuilder[Self <: ActiveIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingFunction(value: String): Self = StObject.set(x, "animationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationType(value: AnimationType): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayControls(value: Boolean): Self = StObject.set(x, "autoPlayControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayDirection(value: AutoplayDirection): Self = StObject.set(x, "autoPlayDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayInterval(value: Double): Self = StObject.set(x, "autoPlayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayStrategy(value: AutoPlayStrategy): Self = StObject.set(x, "autoPlayStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsStrategy(value: ControlsStrategy): Self = StObject.set(x, "controlsStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableButtonsControls(value: Boolean): Self = StObject.set(x, "disableButtonsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDotsControls(value: Boolean): Self = StObject.set(x, "disableDotsControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSlideInfo(value: Boolean): Self = StObject.set(x, "disableSlideInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseTracking(value: Boolean): Self = StObject.set(x, "mouseTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInitialized(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onInitialized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnResized(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onResized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSlideChange(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSlideChanged(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "onSlideChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeDelta(value: Double): Self = StObject.set(x, "swipeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeExtraPadding(value: Double): Self = StObject.set(x, "swipeExtraPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchMoveDefaultEvents(value: Boolean): Self = StObject.set(x, "touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchTracking(value: Boolean): Self = StObject.set(x, "touchTracking", value.asInstanceOf[js.Any])
  }
}
