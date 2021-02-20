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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySlick extends JQuerySlickInitials {
  
  /**
    * Default: $(element)
    */
  @JSName("$slider")
  var $slider: JQuery = js.native
  
  /**
    * Default: null
    */
  @JSName("$slidesCache")
  var $slidesCache: JQuery | Null = js.native
  
  /**
    * Default: null
    */
  var activeBreakpoint: Double | Null = js.native
  
  /**
    * Default: null
    */
  var animProp: Null = js.native
  
  /**
    * Default: null
    */
  var animType: OTransform | MozTransform | webkitTransform | msTransform | transform | `false` | Null = js.native
  
  /**
    * Default: {}
    */
  var breakpointSettings: NumberDictionary[JQuerySlickOptions] = js.native
  
  /**
    * Default: []
    */
  var breakpoints: js.Array[Double] = js.native
  
  /**
    * Default: false
    */
  var cssTransitions: Boolean = js.native
  
  var defaults: JQuerySlickOptions = js.native
  
  /**
    * Default: false
    */
  var focussed: Boolean = js.native
  
  /**
    * Default: 'hidden'
    */
  var hidden: mozHidden | webkitHidden | typings.slickCarousel.slickCarouselStrings.hidden = js.native
  
  var initials: JQuerySlickInitials = js.native
  
  /**
    * Default: false
    */
  var interrupted: Boolean = js.native
  
  var options: JQuerySlickOptions = js.native
  
  var originalSettings: JQuerySlickOptions = js.native
  
  /**
    * Default: true
    */
  var paused: Boolean = js.native
  
  /**
    * Default: null
    */
  var positionProp: top | left | Null = js.native
  
  /**
    * Default: null
    */
  var respondTo: window | slider | min | Null = js.native
  
  /**
    * Default: 1
    */
  var rowCount: Double = js.native
  
  /**
    * Default: true
    */
  var shouldClick: Boolean = js.native
  
  /**
    * Default: null
    */
  var transformType: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition | Null = js.native
  
  /**
    * Default: null
    */
  var transitionType: OTransition | MozTransition | webkitTransition | msTransition | transition | Null = js.native
  
  /**
    * Default: 'visibilitychange'
    */
  var visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange = js.native
  
  /**
    * Default: null
    */
  var windowTimer: Double | Null = js.native
  
  /**
    * Default: 0
    */
  var windowWidth: Double = js.native
}
object JQuerySlick {
  
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], $slider = $slider.asInstanceOf[js.Any], animProp = animProp.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], breakpointSettings = breakpointSettings.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], cssTransitions = cssTransitions.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focussed = focussed.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], initials = initials.asInstanceOf[js.Any], interrupted = interrupted.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalSettings = originalSettings.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], shouldClick = shouldClick.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any], visibilityChange = visibilityChange.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlick]
  }
  
  @scala.inline
  implicit class JQuerySlickMutableBuilder[Self <: JQuerySlick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$slider(value: JQuery): Self = StObject.set(x, "$slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$slidesCache(value: JQuery): Self = StObject.set(x, "$slidesCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$slidesCacheNull: Self = StObject.set(x, "$slidesCache", null)
    
    @scala.inline
    def setActiveBreakpoint(value: Double): Self = StObject.set(x, "activeBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveBreakpointNull: Self = StObject.set(x, "activeBreakpoint", null)
    
    @scala.inline
    def setAnimProp(value: Null): Self = StObject.set(x, "animProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimType(value: OTransform | MozTransform | webkitTransform | msTransform | transform | `false`): Self = StObject.set(x, "animType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimTypeNull: Self = StObject.set(x, "animType", null)
    
    @scala.inline
    def setBreakpointSettings(value: NumberDictionary[JQuerySlickOptions]): Self = StObject.set(x, "breakpointSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpoints(value: js.Array[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsVarargs(value: Double*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setCssTransitions(value: Boolean): Self = StObject.set(x, "cssTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: JQuerySlickOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocussed(value: Boolean): Self = StObject.set(x, "focussed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: mozHidden | webkitHidden | hidden): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitials(value: JQuerySlickInitials): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterrupted(value: Boolean): Self = StObject.set(x, "interrupted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: JQuerySlickOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSettings(value: JQuerySlickOptions): Self = StObject.set(x, "originalSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionProp(value: top | left): Self = StObject.set(x, "positionProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionPropNull: Self = StObject.set(x, "positionProp", null)
    
    @scala.inline
    def setRespondTo(value: window | slider | min): Self = StObject.set(x, "respondTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondToNull: Self = StObject.set(x, "respondTo", null)
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldClick(value: Boolean): Self = StObject.set(x, "shouldClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformType(value: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition): Self = StObject.set(x, "transformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformTypeNull: Self = StObject.set(x, "transformType", null)
    
    @scala.inline
    def setTransitionType(value: OTransition | MozTransition | webkitTransition | msTransition | transition): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionTypeNull: Self = StObject.set(x, "transitionType", null)
    
    @scala.inline
    def setVisibilityChange(value: visibilitychange | mozvisibilitychange | webkitvisibilitychange): Self = StObject.set(x, "visibilityChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTimer(value: Double): Self = StObject.set(x, "windowTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTimerNull: Self = StObject.set(x, "windowTimer", null)
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
