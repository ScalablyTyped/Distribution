package typings.slickCarousel

import typings.slickCarousel.anon.CurX
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySlickInitials extends js.Object {
  
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
  implicit class JQuerySlickInitialsOps[Self <: JQuerySlickInitials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set$list(value: Null): Self = this.set("$list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimating(value: Boolean): Self = this.set("animating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDirection(value: Double): Self = this.set("currentDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSlide(value: Double): Self = this.set("currentSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadIndex(value: Double): Self = this.set("loadIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrolling(value: Boolean): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideOffset(value: Double): Self = this.set("slideOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliding(value: Boolean): Self = this.set("sliding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwiping(value: Boolean): Self = this.set("swiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchObject(value: CurX): Self = this.set("touchObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsEnabled(value: Boolean): Self = this.set("transformsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnslicked(value: Boolean): Self = this.set("unslicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$dots(value: JQuery): Self = this.set("$dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$dotsNull: Self = this.set("$dots", null)
    
    @scala.inline
    def set$nextArrow(value: JQuery): Self = this.set("$nextArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$nextArrowNull: Self = this.set("$nextArrow", null)
    
    @scala.inline
    def set$prevArrow(value: JQuery): Self = this.set("$prevArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$prevArrowNull: Self = this.set("$prevArrow", null)
    
    @scala.inline
    def set$slideTrack(value: JQuery): Self = this.set("$slideTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$slideTrackNull: Self = this.set("$slideTrack", null)
    
    @scala.inline
    def set$slides(value: JQuery): Self = this.set("$slides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$slidesNull: Self = this.set("$slides", null)
    
    @scala.inline
    def setAutoPlayTimer(value: Double): Self = this.set("autoPlayTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlayTimerNull: Self = this.set("autoPlayTimer", null)
    
    @scala.inline
    def setCurrentLeft(value: Double): Self = this.set("currentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLeftNull: Self = this.set("currentLeft", null)
    
    @scala.inline
    def setListHeight(value: Double): Self = this.set("listHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListHeightNull: Self = this.set("listHeight", null)
    
    @scala.inline
    def setListWidth(value: Double): Self = this.set("listWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWidthNull: Self = this.set("listWidth", null)
    
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideCountNull: Self = this.set("slideCount", null)
    
    @scala.inline
    def setSlideWidth(value: Number): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideWidthNull: Self = this.set("slideWidth", null)
    
    @scala.inline
    def setSwipeLeft(value: Double): Self = this.set("swipeLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeLeftNull: Self = this.set("swipeLeft", null)
  }
}
