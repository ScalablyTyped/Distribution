package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.typesMod.AnimationType
import typings.reactAliceCarousel.typesMod.AutoPlayStrategy
import typings.reactAliceCarousel.typesMod.AutoplayDirection
import typings.reactAliceCarousel.typesMod.ControlsStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIndex extends StObject {
  
  var activeIndex: Double
  
  var animationDuration: Double
  
  var animationEasingFunction: String
  
  var animationType: AnimationType
  
  var autoHeight: Boolean
  
  var autoPlay: Boolean
  
  var autoPlayControls: Boolean
  
  var autoPlayDirection: AutoplayDirection
  
  var autoPlayInterval: Double
  
  var autoPlayStrategy: AutoPlayStrategy
  
  var autoWidth: Boolean
  
  var children: Unit
  
  var controlsStrategy: ControlsStrategy
  
  var disableButtonsControls: Boolean
  
  var disableDotsControls: Boolean
  
  var disableSlideInfo: Boolean
  
  var infinite: Boolean
  
  var innerWidth: Double
  
  var items: Unit
  
  var keyboardNavigation: Boolean
  
  var mouseTracking: Boolean
  
  var name: String
  
  def onInitialized(): Unit
  
  var onResizeEvent: Unit
  
  def onResized(): Unit
  
  def onSlideChange(): Unit
  
  def onSlideChanged(): Unit
  
  var paddingLeft: Double
  
  var paddingRight: Double
  
  var responsive: Unit
  
  var ssrSilentMode: Boolean
  
  var swipeDelta: Double
  
  var swipeExtraPadding: Double
  
  var touchMoveDefaultEvents: Boolean
  
  var touchTracking: Boolean
}
object ActiveIndex {
  
  inline def apply(
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
    children: Unit,
    controlsStrategy: ControlsStrategy,
    disableButtonsControls: Boolean,
    disableDotsControls: Boolean,
    disableSlideInfo: Boolean,
    infinite: Boolean,
    innerWidth: Double,
    items: Unit,
    keyboardNavigation: Boolean,
    mouseTracking: Boolean,
    name: String,
    onInitialized: () => Unit,
    onResizeEvent: Unit,
    onResized: () => Unit,
    onSlideChange: () => Unit,
    onSlideChanged: () => Unit,
    paddingLeft: Double,
    paddingRight: Double,
    responsive: Unit,
    ssrSilentMode: Boolean,
    swipeDelta: Double,
    swipeExtraPadding: Double,
    touchMoveDefaultEvents: Boolean,
    touchTracking: Boolean
  ): ActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], animationDuration = animationDuration.asInstanceOf[js.Any], animationEasingFunction = animationEasingFunction.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], autoHeight = autoHeight.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], autoPlayControls = autoPlayControls.asInstanceOf[js.Any], autoPlayDirection = autoPlayDirection.asInstanceOf[js.Any], autoPlayInterval = autoPlayInterval.asInstanceOf[js.Any], autoPlayStrategy = autoPlayStrategy.asInstanceOf[js.Any], autoWidth = autoWidth.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], controlsStrategy = controlsStrategy.asInstanceOf[js.Any], disableButtonsControls = disableButtonsControls.asInstanceOf[js.Any], disableDotsControls = disableDotsControls.asInstanceOf[js.Any], disableSlideInfo = disableSlideInfo.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], keyboardNavigation = keyboardNavigation.asInstanceOf[js.Any], mouseTracking = mouseTracking.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onInitialized = js.Any.fromFunction0(onInitialized), onResizeEvent = onResizeEvent.asInstanceOf[js.Any], onResized = js.Any.fromFunction0(onResized), onSlideChange = js.Any.fromFunction0(onSlideChange), onSlideChanged = js.Any.fromFunction0(onSlideChanged), paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any], responsive = responsive.asInstanceOf[js.Any], ssrSilentMode = ssrSilentMode.asInstanceOf[js.Any], swipeDelta = swipeDelta.asInstanceOf[js.Any], swipeExtraPadding = swipeExtraPadding.asInstanceOf[js.Any], touchMoveDefaultEvents = touchMoveDefaultEvents.asInstanceOf[js.Any], touchTracking = touchTracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIndex]
  }
  
  extension [Self <: ActiveIndex](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingFunction(value: String): Self = StObject.set(x, "animationEasingFunction", value.asInstanceOf[js.Any])
    
    inline def setAnimationType(value: AnimationType): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayControls(value: Boolean): Self = StObject.set(x, "autoPlayControls", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayDirection(value: AutoplayDirection): Self = StObject.set(x, "autoPlayDirection", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayInterval(value: Double): Self = StObject.set(x, "autoPlayInterval", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayStrategy(value: AutoPlayStrategy): Self = StObject.set(x, "autoPlayStrategy", value.asInstanceOf[js.Any])
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setControlsStrategy(value: ControlsStrategy): Self = StObject.set(x, "controlsStrategy", value.asInstanceOf[js.Any])
    
    inline def setDisableButtonsControls(value: Boolean): Self = StObject.set(x, "disableButtonsControls", value.asInstanceOf[js.Any])
    
    inline def setDisableDotsControls(value: Boolean): Self = StObject.set(x, "disableDotsControls", value.asInstanceOf[js.Any])
    
    inline def setDisableSlideInfo(value: Boolean): Self = StObject.set(x, "disableSlideInfo", value.asInstanceOf[js.Any])
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Unit): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setKeyboardNavigation(value: Boolean): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setMouseTracking(value: Boolean): Self = StObject.set(x, "mouseTracking", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnInitialized(value: () => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction0(value))
    
    inline def setOnResizeEvent(value: Unit): Self = StObject.set(x, "onResizeEvent", value.asInstanceOf[js.Any])
    
    inline def setOnResized(value: () => Unit): Self = StObject.set(x, "onResized", js.Any.fromFunction0(value))
    
    inline def setOnSlideChange(value: () => Unit): Self = StObject.set(x, "onSlideChange", js.Any.fromFunction0(value))
    
    inline def setOnSlideChanged(value: () => Unit): Self = StObject.set(x, "onSlideChanged", js.Any.fromFunction0(value))
    
    inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    inline def setResponsive(value: Unit): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setSsrSilentMode(value: Boolean): Self = StObject.set(x, "ssrSilentMode", value.asInstanceOf[js.Any])
    
    inline def setSwipeDelta(value: Double): Self = StObject.set(x, "swipeDelta", value.asInstanceOf[js.Any])
    
    inline def setSwipeExtraPadding(value: Double): Self = StObject.set(x, "swipeExtraPadding", value.asInstanceOf[js.Any])
    
    inline def setTouchMoveDefaultEvents(value: Boolean): Self = StObject.set(x, "touchMoveDefaultEvents", value.asInstanceOf[js.Any])
    
    inline def setTouchTracking(value: Boolean): Self = StObject.set(x, "touchTracking", value.asInstanceOf[js.Any])
  }
}
