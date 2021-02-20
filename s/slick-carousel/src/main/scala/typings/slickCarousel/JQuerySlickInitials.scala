package typings.slickCarousel

import typings.slickCarousel.anon.CurX
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySlickInitials extends StObject {
  
  /**
    * jQuery instance that contains the "dots".
    * Default: null
    */
  @JSName("$dots")
  var $dots: JQuery | Null = js.native
  
  /**
    * jQuery instance that contains the "list".
    * Default: null
    */
  @JSName("$list")
  var $list: Null = js.native
  
  /**
    * jQuery instance that contains the "next arrow".
    * Default: null
    */
  @JSName("$nextArrow")
  var $nextArrow: JQuery | Null = js.native
  
  /**
    * jQuery instance that contains the "prev arrow".
    * Default: null
    */
  @JSName("$prevArrow")
  var $prevArrow: JQuery | Null = js.native
  
  /**
    * jQuery instance that contains the "slide track".
    * Default: null
    */
  @JSName("$slideTrack")
  var $slideTrack: JQuery | Null = js.native
  
  /**
    * jQuery instance that contains the "slides".
    * Default: null
    */
  @JSName("$slides")
  var $slides: JQuery | Null = js.native
  
  /**
    * When there is an animation running.
    * Default: false
    */
  var animating: Boolean = js.native
  
  /**
    * Internal `setInterval` identifier.
    * Default: null
    */
  var autoPlayTimer: Double | Null = js.native
  
  /**
    * The current direction (`0` for left and down, `1` for right and up).
    * Default: 0
    */
  var currentDirection: Double = js.native
  
  /**
    * Default: null
    */
  var currentLeft: Double | Null = js.native
  
  /**
    * The index of the current slide.
    * Default: 0
    */
  var currentSlide: Double = js.native
  
  /**
    * The direction (`0` for left and down, `1` for right and up).
    * Default: null
    */
  var direction: Double = js.native
  
  /**
    * When they user is dragging a slide.
    * Default: false
    */
  var dragging: Boolean = js.native
  
  /**
    * The list's height in pixels.
    * Default: null
    */
  var listHeight: Double | Null = js.native
  
  /**
    * The list's width in pixels.
    * Default: null
    */
  var listWidth: Double | Null = js.native
  
  /**
    * (actually it's not used in Slick, so I don't know what it is...)
    * Default: 0
    */
  var loadIndex: Double = js.native
  
  /**
    * When they user is scrolling a slide.
    * Default: false
    */
  var scrolling: Boolean = js.native
  
  /**
    * The number of slides.
    * Default: null
    */
  var slideCount: Double | Null = js.native
  
  /**
    * Slide offset in pixels.
    * Default: 0
    */
  var slideOffset: Double = js.native
  
  /**
    * The slide's width in pixels.
    * Default: null
    */
  var slideWidth: Number | Null = js.native
  
  /**
    * When the slider is sliding.
    * Default: false
    */
  var sliding: Boolean = js.native
  
  /**
    * Default: null
    */
  var swipeLeft: Double | Null = js.native
  
  /**
    * Default: false
    */
  var swiping: Boolean = js.native
  
  /**
    * Object that contains properties relative to "touch" behavior.
    */
  var touchObject: CurX = js.native
  
  /**
    * Default: false
    */
  var transformsEnabled: Boolean = js.native
  
  /**
    * Default: false
    */
  var unslicked: Boolean = js.native
}
object JQuerySlickInitials {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlickInitials]
  }
  
  @scala.inline
  implicit class JQuerySlickInitialsMutableBuilder[Self <: JQuerySlickInitials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$dots(value: JQuery): Self = StObject.set(x, "$dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$dotsNull: Self = StObject.set(x, "$dots", null)
    
    @scala.inline
    def set$list(value: Null): Self = StObject.set(x, "$list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$nextArrow(value: JQuery): Self = StObject.set(x, "$nextArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$nextArrowNull: Self = StObject.set(x, "$nextArrow", null)
    
    @scala.inline
    def set$prevArrow(value: JQuery): Self = StObject.set(x, "$prevArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$prevArrowNull: Self = StObject.set(x, "$prevArrow", null)
    
    @scala.inline
    def set$slideTrack(value: JQuery): Self = StObject.set(x, "$slideTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$slideTrackNull: Self = StObject.set(x, "$slideTrack", null)
    
    @scala.inline
    def set$slides(value: JQuery): Self = StObject.set(x, "$slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$slidesNull: Self = StObject.set(x, "$slides", null)
    
    @scala.inline
    def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayTimer(value: Double): Self = StObject.set(x, "autoPlayTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayTimerNull: Self = StObject.set(x, "autoPlayTimer", null)
    
    @scala.inline
    def setCurrentDirection(value: Double): Self = StObject.set(x, "currentDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLeft(value: Double): Self = StObject.set(x, "currentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLeftNull: Self = StObject.set(x, "currentLeft", null)
    
    @scala.inline
    def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeightNull: Self = StObject.set(x, "listHeight", null)
    
    @scala.inline
    def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWidthNull: Self = StObject.set(x, "listWidth", null)
    
    @scala.inline
    def setLoadIndex(value: Double): Self = StObject.set(x, "loadIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideCountNull: Self = StObject.set(x, "slideCount", null)
    
    @scala.inline
    def setSlideOffset(value: Double): Self = StObject.set(x, "slideOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideWidth(value: Number): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideWidthNull: Self = StObject.set(x, "slideWidth", null)
    
    @scala.inline
    def setSliding(value: Boolean): Self = StObject.set(x, "sliding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeLeft(value: Double): Self = StObject.set(x, "swipeLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeLeftNull: Self = StObject.set(x, "swipeLeft", null)
    
    @scala.inline
    def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchObject(value: CurX): Self = StObject.set(x, "touchObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsEnabled(value: Boolean): Self = StObject.set(x, "transformsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnslicked(value: Boolean): Self = StObject.set(x, "unslicked", value.asInstanceOf[js.Any])
  }
}
