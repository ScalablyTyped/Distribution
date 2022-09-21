package typings.slickCarousel

import org.scalablytyped.runtime.NumberDictionary
import typings.slickCarousel.anon.CurX
import typings.slickCarousel.slickCarouselBooleans.`false`
import typings.slickCarousel.slickCarouselStrings.MozTransform
import typings.slickCarousel.slickCarouselStrings.MozTransition
import typings.slickCarousel.slickCarouselStrings.OTransform
import typings.slickCarousel.slickCarouselStrings.OTransition
import typings.slickCarousel.slickCarouselStrings.`-moz-transform`
import typings.slickCarousel.slickCarouselStrings.`-ms-transform`
import typings.slickCarousel.slickCarouselStrings.`-o-transform`
import typings.slickCarousel.slickCarouselStrings.`-webkit-transform`
import typings.slickCarousel.slickCarouselStrings.hidden
import typings.slickCarousel.slickCarouselStrings.left
import typings.slickCarousel.slickCarouselStrings.min
import typings.slickCarousel.slickCarouselStrings.mozHidden
import typings.slickCarousel.slickCarouselStrings.mozvisibilitychange
import typings.slickCarousel.slickCarouselStrings.msTransform
import typings.slickCarousel.slickCarouselStrings.msTransition
import typings.slickCarousel.slickCarouselStrings.slider
import typings.slickCarousel.slickCarouselStrings.top
import typings.slickCarousel.slickCarouselStrings.transform
import typings.slickCarousel.slickCarouselStrings.transition
import typings.slickCarousel.slickCarouselStrings.visibilitychange
import typings.slickCarousel.slickCarouselStrings.webkitHidden
import typings.slickCarousel.slickCarouselStrings.webkitTransform
import typings.slickCarousel.slickCarouselStrings.webkitTransition
import typings.slickCarousel.slickCarouselStrings.webkitvisibilitychange
import typings.slickCarousel.slickCarouselStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuerySlick
  extends StObject
     with JQuerySlickInitials {
  
  /**
    * Default: $(element)
    */
  @JSName("$slider")
  var $slider: JQuery
  
  /**
    * Default: null
    */
  @JSName("$slidesCache")
  var $slidesCache: JQuery | Null
  
  /**
    * Default: null
    */
  var activeBreakpoint: Double | Null
  
  /**
    * Default: null
    */
  var animProp: Null
  
  /**
    * Default: null
    */
  var animType: OTransform | MozTransform | webkitTransform | msTransform | transform | `false` | Null
  
  /**
    * Default: {}
    */
  var breakpointSettings: NumberDictionary[JQuerySlickOptions]
  
  /**
    * Default: []
    */
  var breakpoints: js.Array[Double]
  
  /**
    * Default: false
    */
  var cssTransitions: Boolean
  
  var defaults: JQuerySlickOptions
  
  /**
    * Default: false
    */
  var focussed: Boolean
  
  /**
    * Default: 'hidden'
    */
  var hidden: mozHidden | webkitHidden | typings.slickCarousel.slickCarouselStrings.hidden
  
  var initials: JQuerySlickInitials
  
  /**
    * Default: false
    */
  var interrupted: Boolean
  
  var options: JQuerySlickOptions
  
  var originalSettings: JQuerySlickOptions
  
  /**
    * Default: true
    */
  var paused: Boolean
  
  /**
    * Default: null
    */
  var positionProp: top | left | Null
  
  /**
    * Default: null
    */
  var respondTo: window | slider | min | Null
  
  /**
    * Default: 1
    */
  var rowCount: Double
  
  /**
    * Default: true
    */
  var shouldClick: Boolean
  
  /**
    * Default: null
    */
  var transformType: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition | Null
  
  /**
    * Default: null
    */
  var transitionType: OTransition | MozTransition | webkitTransition | msTransition | transition | Null
  
  /**
    * Default: 'visibilitychange'
    */
  var visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange
  
  /**
    * Default: null
    */
  var windowTimer: Double | Null
  
  /**
    * Default: 0
    */
  var windowWidth: Double
}
object JQuerySlick {
  
  inline def apply(
    $list: Null,
    $slider: JQuery,
    animProp: Null,
    animating: Boolean,
    breakpointSettings: NumberDictionary[JQuerySlickOptions],
    breakpoints: js.Array[Double],
    cssTransitions: Boolean,
    currentDirection: Double,
    currentSlide: Double,
    defaults: JQuerySlickOptions,
    direction: Double,
    dragging: Boolean,
    focussed: Boolean,
    hidden: mozHidden | webkitHidden | hidden,
    initials: JQuerySlickInitials,
    interrupted: Boolean,
    loadIndex: Double,
    options: JQuerySlickOptions,
    originalSettings: JQuerySlickOptions,
    paused: Boolean,
    rowCount: Double,
    scrolling: Boolean,
    shouldClick: Boolean,
    slideOffset: Double,
    sliding: Boolean,
    swiping: Boolean,
    touchObject: CurX,
    transformsEnabled: Boolean,
    unslicked: Boolean,
    visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange,
    windowWidth: Double
  ): JQuerySlick = {
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], $slider = $slider.asInstanceOf[js.Any], animProp = animProp.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], breakpointSettings = breakpointSettings.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], cssTransitions = cssTransitions.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focussed = focussed.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], initials = initials.asInstanceOf[js.Any], interrupted = interrupted.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalSettings = originalSettings.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], shouldClick = shouldClick.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any], visibilityChange = visibilityChange.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any], $dots = null, $nextArrow = null, $prevArrow = null, $slideTrack = null, $slides = null, $slidesCache = null, activeBreakpoint = null, animType = null, autoPlayTimer = null, currentLeft = null, listHeight = null, listWidth = null, positionProp = null, respondTo = null, slideCount = null, slideWidth = null, swipeLeft = null, transformType = null, transitionType = null, windowTimer = null)
    __obj.asInstanceOf[JQuerySlick]
  }
  
  extension [Self <: JQuerySlick](x: Self) {
    
    inline def set$slider(value: JQuery): Self = StObject.set(x, "$slider", value.asInstanceOf[js.Any])
    
    inline def set$slidesCache(value: JQuery): Self = StObject.set(x, "$slidesCache", value.asInstanceOf[js.Any])
    
    inline def set$slidesCacheNull: Self = StObject.set(x, "$slidesCache", null)
    
    inline def setActiveBreakpoint(value: Double): Self = StObject.set(x, "activeBreakpoint", value.asInstanceOf[js.Any])
    
    inline def setActiveBreakpointNull: Self = StObject.set(x, "activeBreakpoint", null)
    
    inline def setAnimProp(value: Null): Self = StObject.set(x, "animProp", value.asInstanceOf[js.Any])
    
    inline def setAnimType(value: OTransform | MozTransform | webkitTransform | msTransform | transform | `false`): Self = StObject.set(x, "animType", value.asInstanceOf[js.Any])
    
    inline def setAnimTypeNull: Self = StObject.set(x, "animType", null)
    
    inline def setBreakpointSettings(value: NumberDictionary[JQuerySlickOptions]): Self = StObject.set(x, "breakpointSettings", value.asInstanceOf[js.Any])
    
    inline def setBreakpoints(value: js.Array[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: Double*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setCssTransitions(value: Boolean): Self = StObject.set(x, "cssTransitions", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: JQuerySlickOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setFocussed(value: Boolean): Self = StObject.set(x, "focussed", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: mozHidden | webkitHidden | hidden): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setInitials(value: JQuerySlickInitials): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
    
    inline def setInterrupted(value: Boolean): Self = StObject.set(x, "interrupted", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: JQuerySlickOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOriginalSettings(value: JQuerySlickOptions): Self = StObject.set(x, "originalSettings", value.asInstanceOf[js.Any])
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPositionProp(value: top | left): Self = StObject.set(x, "positionProp", value.asInstanceOf[js.Any])
    
    inline def setPositionPropNull: Self = StObject.set(x, "positionProp", null)
    
    inline def setRespondTo(value: window | slider | min): Self = StObject.set(x, "respondTo", value.asInstanceOf[js.Any])
    
    inline def setRespondToNull: Self = StObject.set(x, "respondTo", null)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setShouldClick(value: Boolean): Self = StObject.set(x, "shouldClick", value.asInstanceOf[js.Any])
    
    inline def setTransformType(value: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition): Self = StObject.set(x, "transformType", value.asInstanceOf[js.Any])
    
    inline def setTransformTypeNull: Self = StObject.set(x, "transformType", null)
    
    inline def setTransitionType(value: OTransition | MozTransition | webkitTransition | msTransition | transition): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    
    inline def setTransitionTypeNull: Self = StObject.set(x, "transitionType", null)
    
    inline def setVisibilityChange(value: visibilitychange | mozvisibilitychange | webkitvisibilitychange): Self = StObject.set(x, "visibilityChange", value.asInstanceOf[js.Any])
    
    inline def setWindowTimer(value: Double): Self = StObject.set(x, "windowTimer", value.asInstanceOf[js.Any])
    
    inline def setWindowTimerNull: Self = StObject.set(x, "windowTimer", null)
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
