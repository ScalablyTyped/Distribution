package typings.royalslider

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RoyalSlider {
  
  @js.native
  trait RoyalSlider extends StObject {
    
    /**
      * Dynamic slides adding/removing
      */
    def appendSlide(element: JQuery): Unit = js.native
    def appendSlide(element: JQuery, index: Double): Unit = js.native
    
    /**
      * current slide object
      */
    var currSlide: RoyalSliderSlide = js.native
    
    /**
      * current slide index
      */
    var currSlideId: Double = js.native
    
    /**
      * removes all events and clears all slider data (use on ajax sites to avoid memory leaks)
      */
    def destroy(): Unit = js.native
    
    /**
      * Boolean, changes on mouseup, indicates if slide was dragged. Used to check if event is drag or click.
      */
    var dragSuccess: Boolean = js.native
    
    /**
      * Enter Fullscreen mode
      */
    def enterFullscreen(): Unit = js.native
    
    /**
      * jQuery object with slider events
      */
    var ev: JQuery = js.native
    
    /**
      * Exit Fullscreen mode
      */
    def exitFullscreen(): Unit = js.native
    
    //TODO: extends/implements JQuery? (giving problems due to next(), prev(), width and height and 'selector'.
    /**
      * go to slide with id
      */
    def goTo(id: Double): Unit = js.native
    
    /**
      * height of slider
      */
    var height: Double = js.native
    
    /**
      * indicates if slider is in fullscreen mode
      */
    var isFullscreen: Boolean = js.native
    
    /**
      * indicates if browser supports native fullscreen
      */
    var nativeFS: Boolean = js.native
    
    /**
      * next slide
      */
    def next(): Unit = js.native
    
    /**
      * total number of slides
      */
    var numSlides: Double = js.native
    
    /**
      * Play video
      */
    def playVideo(): Unit = js.native
    
    /**
      * prev slide
      */
    def prev(): Unit = js.native
    
    /**
      * Remove slide
      */
    def removeSlide(): Unit = js.native
    def removeSlide(index: Double): Unit = js.native
    
    /**
      * changes orientation of thumbnails
      */
    def setThumbsOrientation(orientation: String): Unit = js.native
    
    /**
      * contains all data about each slide
      */
    var slides: js.Array[RoyalSliderSlide] = js.native
    
    /**
      * Contains list of HTML slides that are added to slider
      */
    var slidesJQ: js.Array[JQuery] = js.native
    
    //TODO: what type?
    /**
      * Object with slider settings
      */
    var st: RoyalSliderOptions = js.native
    
    /**
      * Start autoplay
      */
    def startAutoPlay(): Unit = js.native
    
    /**
      * Stop autoplay
      */
    def stopAutoPlay(): Unit = js.native
    
    /**
      * Stop video
      */
    def stopVideo(): Unit = js.native
    
    /**
      * Toggle autoplay between start and stop
      */
    def toggleAutoPlay(): Unit = js.native
    
    /**
      * Toggle video between start and stop
      */
    def toggleVideo(): Unit = js.native
    
    /**
      * updates size of slider.  Use after you resize slider with js.
      */
    def updateSliderSize(): Unit = js.native
    def updateSliderSize(forceResize: Boolean): Unit = js.native
    
    /**
      * updates size of thumbnails
      */
    def updateThumbsSize(): Unit = js.native
    
    /**
      * width of slider
      */
    var width: Double = js.native
  }
  
  trait RoyalSliderAutoplayOptions extends StObject {
    
    /**
      * Delay between items in ms. (default: 300)
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable autoplay or not. (default: false)
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pause autoplay on hover. (default: true)
      */
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stop autoplay at first user action. (default: true)
      */
    var stopAtAction: js.UndefOr[Boolean] = js.undefined
  }
  object RoyalSliderAutoplayOptions {
    
    inline def apply(): RoyalSliderAutoplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderAutoplayOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderAutoplayOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setStopAtAction(value: Boolean): Self = StObject.set(x, "stopAtAction", value.asInstanceOf[js.Any])
      
      inline def setStopAtActionUndefined: Self = StObject.set(x, "stopAtAction", js.undefined)
    }
  }
  
  trait RoyalSliderBlockOptions extends StObject {
    
    /**
      * Delay between each block show up, in ms. (default: 200)
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Easing function of block animation.Read more in easing section of docs. (default: 'easeOutSine' )
      */
    var easing: js.UndefOr[String] = js.undefined
    
    /**
      * true or false  (default: true)
      */
    var fadeEffect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Move effect direction.Can be 'left', 'right', 'top', 'bottom' or 'none'. (default: 'top')
      */
    var moveEffect: js.UndefOr[String] = js.undefined
    
    /**
      * Distance for move effect in pixels. (default: 20)
      */
    var moveOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Transition speed of block, in ms. (default: 400)
      */
    var speed: js.UndefOr[Double] = js.undefined
  }
  object RoyalSliderBlockOptions {
    
    inline def apply(): RoyalSliderBlockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderBlockOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderBlockOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFadeEffect(value: Boolean): Self = StObject.set(x, "fadeEffect", value.asInstanceOf[js.Any])
      
      inline def setFadeEffectUndefined: Self = StObject.set(x, "fadeEffect", js.undefined)
      
      inline def setMoveEffect(value: String): Self = StObject.set(x, "moveEffect", value.asInstanceOf[js.Any])
      
      inline def setMoveEffectUndefined: Self = StObject.set(x, "moveEffect", js.undefined)
      
      inline def setMoveOffset(value: Double): Self = StObject.set(x, "moveOffset", value.asInstanceOf[js.Any])
      
      inline def setMoveOffsetUndefined: Self = StObject.set(x, "moveOffset", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  trait RoyalSliderDeeplinkingOptions extends StObject {
    
    /**
      * Automatically change URL after transition and listen for hash change. (default: false)
      */
    var change: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Linking to slides by appending #SLIDE_INDEX to url.Slides count starts from 1. If change is set to false hash is only read once, after page load. (default: false)
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prefix that will be added to hash. For example if you set it to 'gallery-', hash would look like this: #gallery-5 (default: '')
      */
    var prefix: js.UndefOr[String] = js.undefined
  }
  object RoyalSliderDeeplinkingOptions {
    
    inline def apply(): RoyalSliderDeeplinkingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderDeeplinkingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderDeeplinkingOptions] (val x: Self) extends AnyVal {
      
      inline def setChange(value: Boolean): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait RoyalSliderFullscreenOptions extends StObject {
    
    /**
      * Fullscreen button at top right. (default: true)
      */
    var buttonFS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Fullscreen functions enabled. (default: false)
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force keyboard arrows nav in fullscreen. (default: true)
      */
    var keyboardNav: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Native browser fullscreen. (default: false)
      */
    var nativeFS: js.UndefOr[Boolean] = js.undefined
  }
  object RoyalSliderFullscreenOptions {
    
    inline def apply(): RoyalSliderFullscreenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderFullscreenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderFullscreenOptions] (val x: Self) extends AnyVal {
      
      inline def setButtonFS(value: Boolean): Self = StObject.set(x, "buttonFS", value.asInstanceOf[js.Any])
      
      inline def setButtonFSUndefined: Self = StObject.set(x, "buttonFS", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKeyboardNav(value: Boolean): Self = StObject.set(x, "keyboardNav", value.asInstanceOf[js.Any])
      
      inline def setKeyboardNavUndefined: Self = StObject.set(x, "keyboardNav", js.undefined)
      
      inline def setNativeFS(value: Boolean): Self = StObject.set(x, "nativeFS", value.asInstanceOf[js.Any])
      
      inline def setNativeFSUndefined: Self = StObject.set(x, "nativeFS", js.undefined)
    }
  }
  
  trait RoyalSliderOptions extends StObject {
    
    /**
      * Adds rsActiveSlide class to current slide before transition. (default: false)
      */
    var addActiveClass: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows usage of CSS3 transitions. Might be useful if you're experiencing font-rendering problems, or other CSS3-related bugs. (default: true)
      */
    var allowCSS3: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Direction arrows navigation. (default: true)
      */
    var arrowsNav: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Auto hide arrows. (default: true)
      */
    var arrowsNavAutoHide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hides arrows completely on touch devices. (default: false)
      */
    var arrowsNavHideOnTouch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Scales and animates height based on current slide. Please note: if you have images in slide that don't have rsImg class) or don't have fixed size, use $(window).load() instead of $(document).ready() before initializing slider. Also, autoHeight doesn't work with properties like autoScaleSlider, imageScaleMode and imageAlignCenter.  (default: false)
      */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically updates slider height based on base width. (default: false)
      */
    var autoScaleSlider: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 400 Base slider height
      */
    var autoScaleSliderHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Base slider width.Slider will autocalculate the ratio based on these values. (default: 800)
      */
    var autoScaleSliderWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Autoplay slideshow can be enabled via slider options. Delay between items can be set globally via delay option, or specifically for each item by adding data-rsDelay="1000" to root element of the slide (1000 = 1sec).
      */
    var autoplay: js.UndefOr[RoyalSliderAutoplayOptions] = js.undefined
    
    /**
      * All elements inside slide that have class rsABlock will be treated by slider as animated blocks (tag name doesn't matter). Blocks can not be nested, but you can put multiple instances of them into one slide, or make slide itself animated block.
      */
    var block: js.UndefOr[RoyalSliderBlockOptions] = js.undefined
    
    /**
      * Navigation type, can be 'bullets', 'thumbnails', 'tabs' or 'none' (default: 'bullets')
      */
    var controlNavigation: js.UndefOr[String] = js.undefined
    
    /**
      *  If set to true adds arrows and fullscreen button inside rsOverflow container, otherwise inside root slider container. (default: true)
      */
    var controlsInside: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Deep linking module makes URL automatically change when you switch slides and you can easily link to specific slide (aka permalink).
      */
    var deeplinking: js.UndefOr[RoyalSliderDeeplinkingOptions] = js.undefined
    
    /**
      * Easing function for simple transition.Read more in the easing section of the documentation. (default: 'easeInOutSine')
      */
    var easeInOut: js.UndefOr[String] = js.undefined
    
    /**
      * Easing function of animation after ending of the swipe gesture. Read more in the easing section of the documentation. (default: 'easeOutSine')
      */
    var easeOut: js.UndefOr[String] = js.undefined
    
    /**
      * Fades in slide after it's loaded. (default: true)
      */
    var fadeinLoadedSlide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You may specify larger images when slider is in fullscreen mode by adding data-rsBigImg attribute to rsImg element. A few examples:
      */
    var fullscreen: js.UndefOr[RoyalSliderFullscreenOptions] = js.undefined
    
    /**
      * Adds global caption element to slider, read more in the global caption section of documentation. (default: false)
      */
    var globalCaption: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Aligns image to center of slide. (default: true)
      */
    var imageAlignCenter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Scale mode for images."fill", "fit", "fit-if-smaller" or "none". (default: 'fit-if-smaller')
      */
    var imageScaleMode: js.UndefOr[String] = js.undefined
    
    /**
      * Distance between image and edge of slide (doesn't work with 'fill' scale mode). (default: 4)
      */
    var imageScalePadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Adds base height to all images for better-looking loading. Can be specified separately for each image. (default: null)
      */
    var imgHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Adds base width to all images for better-looking loading. Can be specified separately for each image. (default: null)
      */
    var imgWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Navigate slider with keyboard left and right arrows. (default: false)
      */
    var keyboardNavEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes slider to go from last slide to first. (default: false)
      */
    var loop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Makes slider to go from last slide to first with rewind. Overrides prev option. (default: false)
      */
    var loopRewind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum distance in pixels to show next slide while dragging. (default: 10)
      */
    var minSlideOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Navigates forward by clicking on slide. (default: true)
      */
    var navigateByClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of slides to preload on sides.If you set it to 0, only one slide will be kept in the display list at once. (default: 4)
      */
    var numImagesToPreload: js.UndefOr[Double] = js.undefined
    
    /**
      * Randomizes all slides at start. (default: false)
      */
    var randomizeSlides: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mouse drag navigation over slider. (default: true)
      */
    var sliderDrag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Touch navigation of slider. (default: true)
      */
    var sliderTouch: js.UndefOr[Boolean] = js.undefined
    
    // false
    /**
      * Overrides HTML of slides, used for creating of slides from HTML that is not attached to DOM. More info in knowledge base.  (default: null)
      */
    var slides: js.UndefOr[Element] = js.undefined
    
    /**
      * Can be 'vertical' or 'horizontal'. (default: 'horizontal')
      */
    var slidesOrientation: js.UndefOr[String] = js.undefined
    
    /**
      * Spacing between slides in pixels. (default: 8)
      */
    var slidesSpacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Start slide index. (default: 0)
      */
    var startSlideId: js.UndefOr[Double] = js.undefined
    
    /**
      * Thumbnail options
      */
    var thumbs: js.UndefOr[RoyalSliderThumbsOptions] = js.undefined
    
    /**
      * Slider transition speed, in ms. (default: 600)
      */
    var transitionSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * 'move' or 'fade'. Important note about fade transition, slides must have background as only one image is animating. (default: 'move')
      */
    var transitionType: js.UndefOr[String] = js.undefined
    
    /**
      * Enables spinning preloader, you may style it via CSS (class rsPreloader). (default: true)
      */
    var usePreloader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To add video to slide, you need to add data-rsVideo="" attribute to image. It can contain link to YouTube or Vimeo video.
      */
    var video: js.UndefOr[RoyalSliderVideoOptions] = js.undefined
    
    /**
      * Module "reveals" next and previous slides, like in this template.
      */
    var visibleNearby: js.UndefOr[RoyalSliderVisibleOptions] = js.undefined
  }
  object RoyalSliderOptions {
    
    inline def apply(): RoyalSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderOptions] (val x: Self) extends AnyVal {
      
      inline def setAddActiveClass(value: Boolean): Self = StObject.set(x, "addActiveClass", value.asInstanceOf[js.Any])
      
      inline def setAddActiveClassUndefined: Self = StObject.set(x, "addActiveClass", js.undefined)
      
      inline def setAllowCSS3(value: Boolean): Self = StObject.set(x, "allowCSS3", value.asInstanceOf[js.Any])
      
      inline def setAllowCSS3Undefined: Self = StObject.set(x, "allowCSS3", js.undefined)
      
      inline def setArrowsNav(value: Boolean): Self = StObject.set(x, "arrowsNav", value.asInstanceOf[js.Any])
      
      inline def setArrowsNavAutoHide(value: Boolean): Self = StObject.set(x, "arrowsNavAutoHide", value.asInstanceOf[js.Any])
      
      inline def setArrowsNavAutoHideUndefined: Self = StObject.set(x, "arrowsNavAutoHide", js.undefined)
      
      inline def setArrowsNavHideOnTouch(value: Boolean): Self = StObject.set(x, "arrowsNavHideOnTouch", value.asInstanceOf[js.Any])
      
      inline def setArrowsNavHideOnTouchUndefined: Self = StObject.set(x, "arrowsNavHideOnTouch", js.undefined)
      
      inline def setArrowsNavUndefined: Self = StObject.set(x, "arrowsNav", js.undefined)
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setAutoScaleSlider(value: Boolean): Self = StObject.set(x, "autoScaleSlider", value.asInstanceOf[js.Any])
      
      inline def setAutoScaleSliderHeight(value: Double): Self = StObject.set(x, "autoScaleSliderHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoScaleSliderHeightUndefined: Self = StObject.set(x, "autoScaleSliderHeight", js.undefined)
      
      inline def setAutoScaleSliderUndefined: Self = StObject.set(x, "autoScaleSlider", js.undefined)
      
      inline def setAutoScaleSliderWidth(value: Double): Self = StObject.set(x, "autoScaleSliderWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoScaleSliderWidthUndefined: Self = StObject.set(x, "autoScaleSliderWidth", js.undefined)
      
      inline def setAutoplay(value: RoyalSliderAutoplayOptions): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBlock(value: RoyalSliderBlockOptions): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setControlNavigation(value: String): Self = StObject.set(x, "controlNavigation", value.asInstanceOf[js.Any])
      
      inline def setControlNavigationUndefined: Self = StObject.set(x, "controlNavigation", js.undefined)
      
      inline def setControlsInside(value: Boolean): Self = StObject.set(x, "controlsInside", value.asInstanceOf[js.Any])
      
      inline def setControlsInsideUndefined: Self = StObject.set(x, "controlsInside", js.undefined)
      
      inline def setDeeplinking(value: RoyalSliderDeeplinkingOptions): Self = StObject.set(x, "deeplinking", value.asInstanceOf[js.Any])
      
      inline def setDeeplinkingUndefined: Self = StObject.set(x, "deeplinking", js.undefined)
      
      inline def setEaseInOut(value: String): Self = StObject.set(x, "easeInOut", value.asInstanceOf[js.Any])
      
      inline def setEaseInOutUndefined: Self = StObject.set(x, "easeInOut", js.undefined)
      
      inline def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
      
      inline def setEaseOutUndefined: Self = StObject.set(x, "easeOut", js.undefined)
      
      inline def setFadeinLoadedSlide(value: Boolean): Self = StObject.set(x, "fadeinLoadedSlide", value.asInstanceOf[js.Any])
      
      inline def setFadeinLoadedSlideUndefined: Self = StObject.set(x, "fadeinLoadedSlide", js.undefined)
      
      inline def setFullscreen(value: RoyalSliderFullscreenOptions): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setGlobalCaption(value: Boolean): Self = StObject.set(x, "globalCaption", value.asInstanceOf[js.Any])
      
      inline def setGlobalCaptionUndefined: Self = StObject.set(x, "globalCaption", js.undefined)
      
      inline def setImageAlignCenter(value: Boolean): Self = StObject.set(x, "imageAlignCenter", value.asInstanceOf[js.Any])
      
      inline def setImageAlignCenterUndefined: Self = StObject.set(x, "imageAlignCenter", js.undefined)
      
      inline def setImageScaleMode(value: String): Self = StObject.set(x, "imageScaleMode", value.asInstanceOf[js.Any])
      
      inline def setImageScaleModeUndefined: Self = StObject.set(x, "imageScaleMode", js.undefined)
      
      inline def setImageScalePadding(value: Double): Self = StObject.set(x, "imageScalePadding", value.asInstanceOf[js.Any])
      
      inline def setImageScalePaddingUndefined: Self = StObject.set(x, "imageScalePadding", js.undefined)
      
      inline def setImgHeight(value: Double): Self = StObject.set(x, "imgHeight", value.asInstanceOf[js.Any])
      
      inline def setImgHeightUndefined: Self = StObject.set(x, "imgHeight", js.undefined)
      
      inline def setImgWidth(value: Double): Self = StObject.set(x, "imgWidth", value.asInstanceOf[js.Any])
      
      inline def setImgWidthUndefined: Self = StObject.set(x, "imgWidth", js.undefined)
      
      inline def setKeyboardNavEnabled(value: Boolean): Self = StObject.set(x, "keyboardNavEnabled", value.asInstanceOf[js.Any])
      
      inline def setKeyboardNavEnabledUndefined: Self = StObject.set(x, "keyboardNavEnabled", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopRewind(value: Boolean): Self = StObject.set(x, "loopRewind", value.asInstanceOf[js.Any])
      
      inline def setLoopRewindUndefined: Self = StObject.set(x, "loopRewind", js.undefined)
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMinSlideOffset(value: Double): Self = StObject.set(x, "minSlideOffset", value.asInstanceOf[js.Any])
      
      inline def setMinSlideOffsetUndefined: Self = StObject.set(x, "minSlideOffset", js.undefined)
      
      inline def setNavigateByClick(value: Boolean): Self = StObject.set(x, "navigateByClick", value.asInstanceOf[js.Any])
      
      inline def setNavigateByClickUndefined: Self = StObject.set(x, "navigateByClick", js.undefined)
      
      inline def setNumImagesToPreload(value: Double): Self = StObject.set(x, "numImagesToPreload", value.asInstanceOf[js.Any])
      
      inline def setNumImagesToPreloadUndefined: Self = StObject.set(x, "numImagesToPreload", js.undefined)
      
      inline def setRandomizeSlides(value: Boolean): Self = StObject.set(x, "randomizeSlides", value.asInstanceOf[js.Any])
      
      inline def setRandomizeSlidesUndefined: Self = StObject.set(x, "randomizeSlides", js.undefined)
      
      inline def setSliderDrag(value: Boolean): Self = StObject.set(x, "sliderDrag", value.asInstanceOf[js.Any])
      
      inline def setSliderDragUndefined: Self = StObject.set(x, "sliderDrag", js.undefined)
      
      inline def setSliderTouch(value: Boolean): Self = StObject.set(x, "sliderTouch", value.asInstanceOf[js.Any])
      
      inline def setSliderTouchUndefined: Self = StObject.set(x, "sliderTouch", js.undefined)
      
      inline def setSlides(value: Element): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      inline def setSlidesOrientation(value: String): Self = StObject.set(x, "slidesOrientation", value.asInstanceOf[js.Any])
      
      inline def setSlidesOrientationUndefined: Self = StObject.set(x, "slidesOrientation", js.undefined)
      
      inline def setSlidesSpacing(value: Double): Self = StObject.set(x, "slidesSpacing", value.asInstanceOf[js.Any])
      
      inline def setSlidesSpacingUndefined: Self = StObject.set(x, "slidesSpacing", js.undefined)
      
      inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      inline def setStartSlideId(value: Double): Self = StObject.set(x, "startSlideId", value.asInstanceOf[js.Any])
      
      inline def setStartSlideIdUndefined: Self = StObject.set(x, "startSlideId", js.undefined)
      
      inline def setThumbs(value: RoyalSliderThumbsOptions): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
      
      inline def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
      
      inline def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
      
      inline def setTransitionType(value: String): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
      
      inline def setTransitionTypeUndefined: Self = StObject.set(x, "transitionType", js.undefined)
      
      inline def setUsePreloader(value: Boolean): Self = StObject.set(x, "usePreloader", value.asInstanceOf[js.Any])
      
      inline def setUsePreloaderUndefined: Self = StObject.set(x, "usePreloader", js.undefined)
      
      inline def setVideo(value: RoyalSliderVideoOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      inline def setVisibleNearby(value: RoyalSliderVisibleOptions): Self = StObject.set(x, "visibleNearby", value.asInstanceOf[js.Any])
      
      inline def setVisibleNearbyUndefined: Self = StObject.set(x, "visibleNearby", js.undefined)
    }
  }
  
  trait RoyalSliderSlide extends StObject {
    
    /**
      * TODO
      */
    var appendOnLoaded: Boolean
    
    /**
      * slide element
      */
    var content: JQuery
    
    /**
      * TODO
      */
    var contentAdded: Boolean
    
    /**
      * slide element wrapper
      */
    var holder: JQuery
    
    /**
      * slide index
      */
    var id: Double
    
    /**
      * TODO
      */
    var images: Null
    
    /**
      * TODO
      */
    var isAdded: Boolean
    
    /**
      * TODO
      */
    var isAppended: Boolean
    
    /**
      * TODO
      */
    var isBig: Boolean
    
    /**
      * TODO
      */
    var isLoaded: Boolean
    
    /**
      * TODO
      */
    var isLoading: Boolean
    
    /**
      * TODO
      */
    var isRendered: Boolean
    
    /**
      * TODO
      */
    var loadedTriggered: Boolean
    
    /**
      * TODO
      */
    var positionSet: Boolean
    
    /**
      * TODO
      */
    var sizeReady: Boolean
    
    /**
      * TODO
      */
    var thumbnail: String
  }
  object RoyalSliderSlide {
    
    inline def apply(
      appendOnLoaded: Boolean,
      content: JQuery,
      contentAdded: Boolean,
      holder: JQuery,
      id: Double,
      images: Null,
      isAdded: Boolean,
      isAppended: Boolean,
      isBig: Boolean,
      isLoaded: Boolean,
      isLoading: Boolean,
      isRendered: Boolean,
      loadedTriggered: Boolean,
      positionSet: Boolean,
      sizeReady: Boolean,
      thumbnail: String
    ): RoyalSliderSlide = {
      val __obj = js.Dynamic.literal(appendOnLoaded = appendOnLoaded.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentAdded = contentAdded.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], isAdded = isAdded.asInstanceOf[js.Any], isAppended = isAppended.asInstanceOf[js.Any], isBig = isBig.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], loadedTriggered = loadedTriggered.asInstanceOf[js.Any], positionSet = positionSet.asInstanceOf[js.Any], sizeReady = sizeReady.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoyalSliderSlide]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderSlide] (val x: Self) extends AnyVal {
      
      inline def setAppendOnLoaded(value: Boolean): Self = StObject.set(x, "appendOnLoaded", value.asInstanceOf[js.Any])
      
      inline def setContent(value: JQuery): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentAdded(value: Boolean): Self = StObject.set(x, "contentAdded", value.asInstanceOf[js.Any])
      
      inline def setHolder(value: JQuery): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImages(value: Null): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setIsAdded(value: Boolean): Self = StObject.set(x, "isAdded", value.asInstanceOf[js.Any])
      
      inline def setIsAppended(value: Boolean): Self = StObject.set(x, "isAppended", value.asInstanceOf[js.Any])
      
      inline def setIsBig(value: Boolean): Self = StObject.set(x, "isBig", value.asInstanceOf[js.Any])
      
      inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
      
      inline def setLoadedTriggered(value: Boolean): Self = StObject.set(x, "loadedTriggered", value.asInstanceOf[js.Any])
      
      inline def setPositionSet(value: Boolean): Self = StObject.set(x, "positionSet", value.asInstanceOf[js.Any])
      
      inline def setSizeReady(value: Boolean): Self = StObject.set(x, "sizeReady", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoyalSliderThumbsOptions extends StObject {
    
    /**
      * Adds span element with class thumbIco to every thumbnail. Useful for styling (default: false)
      */
    var appendSpan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
      */
    var arrowLeft: js.UndefOr[JQuery] = js.undefined
    
    /**
      * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
      */
    var arrowRight: js.UndefOr[JQuery] = js.undefined
    
    /**
      * Thumbnails arrows. (default: true)
      */
    var arrows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Auto hide thumbnails arrows on hover. (default: false)
      */
    var arrowsAutoHide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically centers container with thumbs if there are small number of items (default: true)
      */
    var autoCenter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Thumbnails mouse drag. (default: true)
      */
    var drag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Margin that equals thumbs spacing for first and last item. (default: true)
      */
    var firstMargin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Reduces size of main viewport area by thumbnails width or height, use it when you set 100 % width to slider.This option is always true, when slider is in fullscreen mode. (default: true)
      */
    var fitInViewport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 'horizontal' or 'vertical'. (default: 'horizontal')
      */
    var orientation: js.UndefOr[String] = js.undefined
    
    /**
      * Spacing between thumbs. (default: 4)
      */
    var spacing: js.UndefOr[Double] = js.undefined
    
    /**
      * Thumbnails touch. (default: true)
      */
    var touch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Thumbnails transition speed. (default: 600)
      */
    var transitionSpeed: js.UndefOr[Double] = js.undefined
  }
  object RoyalSliderThumbsOptions {
    
    inline def apply(): RoyalSliderThumbsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderThumbsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderThumbsOptions] (val x: Self) extends AnyVal {
      
      inline def setAppendSpan(value: Boolean): Self = StObject.set(x, "appendSpan", value.asInstanceOf[js.Any])
      
      inline def setAppendSpanUndefined: Self = StObject.set(x, "appendSpan", js.undefined)
      
      inline def setArrowLeft(value: JQuery): Self = StObject.set(x, "arrowLeft", value.asInstanceOf[js.Any])
      
      inline def setArrowLeftUndefined: Self = StObject.set(x, "arrowLeft", js.undefined)
      
      inline def setArrowRight(value: JQuery): Self = StObject.set(x, "arrowRight", value.asInstanceOf[js.Any])
      
      inline def setArrowRightUndefined: Self = StObject.set(x, "arrowRight", js.undefined)
      
      inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsAutoHide(value: Boolean): Self = StObject.set(x, "arrowsAutoHide", value.asInstanceOf[js.Any])
      
      inline def setArrowsAutoHideUndefined: Self = StObject.set(x, "arrowsAutoHide", js.undefined)
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setAutoCenter(value: Boolean): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
      
      inline def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
      
      inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setFirstMargin(value: Boolean): Self = StObject.set(x, "firstMargin", value.asInstanceOf[js.Any])
      
      inline def setFirstMarginUndefined: Self = StObject.set(x, "firstMargin", js.undefined)
      
      inline def setFitInViewport(value: Boolean): Self = StObject.set(x, "fitInViewport", value.asInstanceOf[js.Any])
      
      inline def setFitInViewportUndefined: Self = StObject.set(x, "fitInViewport", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  trait RoyalSliderVideoOptions extends StObject {
    
    /**
      * Auto hide arrows when video is playing  (default: true)
      */
    var autoHideArrows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Auto hide animated blocks when video is playing. (default: false)
      */
    var autoHideBlocks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Auto hide navigation when video is playing. (default: false)
      */
    var autoHideControlNav: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Vimeo embed code. %id% is replaced by video id. (default: '<iframe src="http://player.vimeo.com/video/%id%?byline=0&amp;portrait=0&amp;autoplay=1" frameborder="no" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>')
      */
    var vimeoCode: js.UndefOr[String] = js.undefined
    
    /**
      * Youtube embed code. %id% is replaced by video id. (default: '<iframe src="http://www.youtube.com/embed/%id%?rel=1&autoplay=1&showinfo=0" frameborder="no"></iframe>')
      */
    var youTubeCode: js.UndefOr[String] = js.undefined
  }
  object RoyalSliderVideoOptions {
    
    inline def apply(): RoyalSliderVideoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderVideoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderVideoOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoHideArrows(value: Boolean): Self = StObject.set(x, "autoHideArrows", value.asInstanceOf[js.Any])
      
      inline def setAutoHideArrowsUndefined: Self = StObject.set(x, "autoHideArrows", js.undefined)
      
      inline def setAutoHideBlocks(value: Boolean): Self = StObject.set(x, "autoHideBlocks", value.asInstanceOf[js.Any])
      
      inline def setAutoHideBlocksUndefined: Self = StObject.set(x, "autoHideBlocks", js.undefined)
      
      inline def setAutoHideControlNav(value: Boolean): Self = StObject.set(x, "autoHideControlNav", value.asInstanceOf[js.Any])
      
      inline def setAutoHideControlNavUndefined: Self = StObject.set(x, "autoHideControlNav", js.undefined)
      
      inline def setVimeoCode(value: String): Self = StObject.set(x, "vimeoCode", value.asInstanceOf[js.Any])
      
      inline def setVimeoCodeUndefined: Self = StObject.set(x, "vimeoCode", js.undefined)
      
      inline def setYouTubeCode(value: String): Self = StObject.set(x, "youTubeCode", value.asInstanceOf[js.Any])
      
      inline def setYouTubeCodeUndefined: Self = StObject.set(x, "youTubeCode", js.undefined)
    }
  }
  
  trait RoyalSliderVisibleOptions extends StObject {
    
    /**
      * Used for responsive design. Changes centerArea value to breakpointCenterArea when width of slider is less then value in this option. Set to 0 to disable. (default: 0)
      */
    var breakpoint: js.UndefOr[Double] = js.undefined
    
    /**
      * Same as centerArea option, just for breakpoint. Can be changed dynamically via `sliderInstance.st.breakpointCenterArea`. (default: 0.8)
      */
    var breakpointCenterArea: js.UndefOr[Double] = js.undefined
    
    /**
      * Alignment of center image, if you set it to false center image will be aligned to left. (default: true)
      */
    var center: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ratio that determines area of center image.For example for 0.6 - 60 % of slider area will get center image and 20% for two images on sides. (default: 0.6)
      */
    var centerArea: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable visible-nearby. (default: true)
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disables navigation to next slide by clicking on current slide (if navigateByClick is true). (default: true)
      */
    var navigateByCenterClick: js.UndefOr[Boolean] = js.undefined
  }
  object RoyalSliderVisibleOptions {
    
    inline def apply(): RoyalSliderVisibleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderVisibleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoyalSliderVisibleOptions] (val x: Self) extends AnyVal {
      
      inline def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointCenterArea(value: Double): Self = StObject.set(x, "breakpointCenterArea", value.asInstanceOf[js.Any])
      
      inline def setBreakpointCenterAreaUndefined: Self = StObject.set(x, "breakpointCenterArea", js.undefined)
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterArea(value: Double): Self = StObject.set(x, "centerArea", value.asInstanceOf[js.Any])
      
      inline def setCenterAreaUndefined: Self = StObject.set(x, "centerArea", js.undefined)
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setNavigateByCenterClick(value: Boolean): Self = StObject.set(x, "navigateByCenterClick", value.asInstanceOf[js.Any])
      
      inline def setNavigateByCenterClickUndefined: Self = StObject.set(x, "navigateByCenterClick", js.undefined)
    }
  }
}
