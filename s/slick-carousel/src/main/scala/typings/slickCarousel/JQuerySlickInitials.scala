package typings.slickCarousel

import typings.slickCarousel.anon.CurX
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuerySlickInitials extends StObject {
  
  /**
    * jQuery instance that contains the "dots".
    * Default: null
    */
  @JSName("$dots")
  var $dots: JQuery | Null
  
  /**
    * jQuery instance that contains the "list".
    * Default: null
    */
  @JSName("$list")
  var $list: Null
  
  /**
    * jQuery instance that contains the "next arrow".
    * Default: null
    */
  @JSName("$nextArrow")
  var $nextArrow: JQuery | Null
  
  /**
    * jQuery instance that contains the "prev arrow".
    * Default: null
    */
  @JSName("$prevArrow")
  var $prevArrow: JQuery | Null
  
  /**
    * jQuery instance that contains the "slide track".
    * Default: null
    */
  @JSName("$slideTrack")
  var $slideTrack: JQuery | Null
  
  /**
    * jQuery instance that contains the "slides".
    * Default: null
    */
  @JSName("$slides")
  var $slides: JQuery | Null
  
  /**
    * When there is an animation running.
    * Default: false
    */
  var animating: Boolean
  
  /**
    * Internal `setInterval` identifier.
    * Default: null
    */
  var autoPlayTimer: Double | Null
  
  /**
    * The current direction (`0` for left and down, `1` for right and up).
    * Default: 0
    */
  var currentDirection: Double
  
  /**
    * Default: null
    */
  var currentLeft: Double | Null
  
  /**
    * The index of the current slide.
    * Default: 0
    */
  var currentSlide: Double
  
  /**
    * The direction (`0` for left and down, `1` for right and up).
    * Default: null
    */
  var direction: Double
  
  /**
    * When they user is dragging a slide.
    * Default: false
    */
  var dragging: Boolean
  
  /**
    * The list's height in pixels.
    * Default: null
    */
  var listHeight: Double | Null
  
  /**
    * The list's width in pixels.
    * Default: null
    */
  var listWidth: Double | Null
  
  /**
    * (actually it's not used in Slick, so I don't know what it is...)
    * Default: 0
    */
  var loadIndex: Double
  
  /**
    * When they user is scrolling a slide.
    * Default: false
    */
  var scrolling: Boolean
  
  /**
    * The number of slides.
    * Default: null
    */
  var slideCount: Double | Null
  
  /**
    * Slide offset in pixels.
    * Default: 0
    */
  var slideOffset: Double
  
  /**
    * The slide's width in pixels.
    * Default: null
    */
  var slideWidth: Number | Null
  
  /**
    * When the slider is sliding.
    * Default: false
    */
  var sliding: Boolean
  
  /**
    * Default: null
    */
  var swipeLeft: Double | Null
  
  /**
    * Default: false
    */
  var swiping: Boolean
  
  /**
    * Object that contains properties relative to "touch" behavior.
    */
  var touchObject: CurX
  
  /**
    * Default: false
    */
  var transformsEnabled: Boolean
  
  /**
    * Default: false
    */
  var unslicked: Boolean
}
object JQuerySlickInitials {
  
  inline def apply(
    $list: Null,
    animating: Boolean,
    currentDirection: Double,
    currentSlide: Double,
    direction: Double,
    dragging: Boolean,
    loadIndex: Double,
    scrolling: Boolean,
    slideOffset: Double,
    sliding: Boolean,
    swiping: Boolean,
    touchObject: CurX,
    transformsEnabled: Boolean,
    unslicked: Boolean
  ): JQuerySlickInitials = {
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any], $dots = null, $nextArrow = null, $prevArrow = null, $slideTrack = null, $slides = null, autoPlayTimer = null, currentLeft = null, listHeight = null, listWidth = null, slideCount = null, slideWidth = null, swipeLeft = null)
    __obj.asInstanceOf[JQuerySlickInitials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuerySlickInitials] (val x: Self) extends AnyVal {
    
    inline def set$dots(value: JQuery): Self = StObject.set(x, "$dots", value.asInstanceOf[js.Any])
    
    inline def set$dotsNull: Self = StObject.set(x, "$dots", null)
    
    inline def set$list(value: Null): Self = StObject.set(x, "$list", value.asInstanceOf[js.Any])
    
    inline def set$nextArrow(value: JQuery): Self = StObject.set(x, "$nextArrow", value.asInstanceOf[js.Any])
    
    inline def set$nextArrowNull: Self = StObject.set(x, "$nextArrow", null)
    
    inline def set$prevArrow(value: JQuery): Self = StObject.set(x, "$prevArrow", value.asInstanceOf[js.Any])
    
    inline def set$prevArrowNull: Self = StObject.set(x, "$prevArrow", null)
    
    inline def set$slideTrack(value: JQuery): Self = StObject.set(x, "$slideTrack", value.asInstanceOf[js.Any])
    
    inline def set$slideTrackNull: Self = StObject.set(x, "$slideTrack", null)
    
    inline def set$slides(value: JQuery): Self = StObject.set(x, "$slides", value.asInstanceOf[js.Any])
    
    inline def set$slidesNull: Self = StObject.set(x, "$slides", null)
    
    inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayTimer(value: Double): Self = StObject.set(x, "autoPlayTimer", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayTimerNull: Self = StObject.set(x, "autoPlayTimer", null)
    
    inline def setCurrentDirection(value: Double): Self = StObject.set(x, "currentDirection", value.asInstanceOf[js.Any])
    
    inline def setCurrentLeft(value: Double): Self = StObject.set(x, "currentLeft", value.asInstanceOf[js.Any])
    
    inline def setCurrentLeftNull: Self = StObject.set(x, "currentLeft", null)
    
    inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
    
    inline def setListHeightNull: Self = StObject.set(x, "listHeight", null)
    
    inline def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    inline def setListWidthNull: Self = StObject.set(x, "listWidth", null)
    
    inline def setLoadIndex(value: Double): Self = StObject.set(x, "loadIndex", value.asInstanceOf[js.Any])
    
    inline def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
    
    inline def setSlideCountNull: Self = StObject.set(x, "slideCount", null)
    
    inline def setSlideOffset(value: Double): Self = StObject.set(x, "slideOffset", value.asInstanceOf[js.Any])
    
    inline def setSlideWidth(value: Number): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
    
    inline def setSlideWidthNull: Self = StObject.set(x, "slideWidth", null)
    
    inline def setSliding(value: Boolean): Self = StObject.set(x, "sliding", value.asInstanceOf[js.Any])
    
    inline def setSwipeLeft(value: Double): Self = StObject.set(x, "swipeLeft", value.asInstanceOf[js.Any])
    
    inline def setSwipeLeftNull: Self = StObject.set(x, "swipeLeft", null)
    
    inline def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
    
    inline def setTouchObject(value: CurX): Self = StObject.set(x, "touchObject", value.asInstanceOf[js.Any])
    
    inline def setTransformsEnabled(value: Boolean): Self = StObject.set(x, "transformsEnabled", value.asInstanceOf[js.Any])
    
    inline def setUnslicked(value: Boolean): Self = StObject.set(x, "unslicked", value.asInstanceOf[js.Any])
  }
}
