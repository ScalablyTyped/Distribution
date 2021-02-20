package typings.royalslider

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait RoyalSliderAutoplayOptions extends StObject {
    
    /**
      * Delay between items in ms. (default: 300)
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Enable autoplay or not. (default: false)
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Pause autoplay on hover. (default: true)
      */
    var pauseOnHover: js.UndefOr[Boolean] = js.native
    
    /**
      * Stop autoplay at first user action. (default: true)
      */
    var stopAtAction: js.UndefOr[Boolean] = js.native
  }
  object RoyalSliderAutoplayOptions {
    
    @scala.inline
    def apply(): RoyalSliderAutoplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderAutoplayOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderAutoplayOptionsMutableBuilder[Self <: RoyalSliderAutoplayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setStopAtAction(value: Boolean): Self = StObject.set(x, "stopAtAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopAtActionUndefined: Self = StObject.set(x, "stopAtAction", js.undefined)
    }
  }
  
  @js.native
  trait RoyalSliderBlockOptions extends StObject {
    
    /**
      * Delay between each block show up, in ms. (default: 200)
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Easing function of block animation.Read more in easing section of docs. (default: 'easeOutSine' )
      */
    var easing: js.UndefOr[String] = js.native
    
    /**
      * true or false  (default: true)
      */
    var fadeEffect: js.UndefOr[Boolean] = js.native
    
    /**
      * Move effect direction.Can be 'left', 'right', 'top', 'bottom' or 'none'. (default: 'top')
      */
    var moveEffect: js.UndefOr[String] = js.native
    
    /**
      * Distance for move effect in pixels. (default: 20)
      */
    var moveOffset: js.UndefOr[Double] = js.native
    
    /**
      * Transition speed of block, in ms. (default: 400)
      */
    var speed: js.UndefOr[Double] = js.native
  }
  object RoyalSliderBlockOptions {
    
    @scala.inline
    def apply(): RoyalSliderBlockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderBlockOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderBlockOptionsMutableBuilder[Self <: RoyalSliderBlockOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFadeEffect(value: Boolean): Self = StObject.set(x, "fadeEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeEffectUndefined: Self = StObject.set(x, "fadeEffect", js.undefined)
      
      @scala.inline
      def setMoveEffect(value: String): Self = StObject.set(x, "moveEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveEffectUndefined: Self = StObject.set(x, "moveEffect", js.undefined)
      
      @scala.inline
      def setMoveOffset(value: Double): Self = StObject.set(x, "moveOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveOffsetUndefined: Self = StObject.set(x, "moveOffset", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  @js.native
  trait RoyalSliderDeeplinkingOptions extends StObject {
    
    /**
      * Automatically change URL after transition and listen for hash change. (default: false)
      */
    var change: js.UndefOr[Boolean] = js.native
    
    /**
      * Linking to slides by appending #SLIDE_INDEX to url.Slides count starts from 1. If change is set to false hash is only read once, after page load. (default: false)
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Prefix that will be added to hash. For example if you set it to 'gallery-', hash would look like this: #gallery-5 (default: '')
      */
    var prefix: js.UndefOr[String] = js.native
  }
  object RoyalSliderDeeplinkingOptions {
    
    @scala.inline
    def apply(): RoyalSliderDeeplinkingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderDeeplinkingOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderDeeplinkingOptionsMutableBuilder[Self <: RoyalSliderDeeplinkingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: Boolean): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  @js.native
  trait RoyalSliderFullscreenOptions extends StObject {
    
    /**
      * Fullscreen button at top right. (default: true)
      */
    var buttonFS: js.UndefOr[Boolean] = js.native
    
    /**
      * Fullscreen functions enabled. (default: false)
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Force keyboard arrows nav in fullscreen. (default: true)
      */
    var keyboardNav: js.UndefOr[Boolean] = js.native
    
    /**
      * Native browser fullscreen. (default: false)
      */
    var nativeFS: js.UndefOr[Boolean] = js.native
  }
  object RoyalSliderFullscreenOptions {
    
    @scala.inline
    def apply(): RoyalSliderFullscreenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderFullscreenOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderFullscreenOptionsMutableBuilder[Self <: RoyalSliderFullscreenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonFS(value: Boolean): Self = StObject.set(x, "buttonFS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonFSUndefined: Self = StObject.set(x, "buttonFS", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setKeyboardNav(value: Boolean): Self = StObject.set(x, "keyboardNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardNavUndefined: Self = StObject.set(x, "keyboardNav", js.undefined)
      
      @scala.inline
      def setNativeFS(value: Boolean): Self = StObject.set(x, "nativeFS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeFSUndefined: Self = StObject.set(x, "nativeFS", js.undefined)
    }
  }
  
  @js.native
  trait RoyalSliderOptions extends StObject {
    
    /**
      * Adds rsActiveSlide class to current slide before transition. (default: false)
      */
    var addActiveClass: js.UndefOr[Boolean] = js.native
    
    /**
      * Allows usage of CSS3 transitions. Might be useful if you're experiencing font-rendering problems, or other CSS3-related bugs. (default: true)
      */
    var allowCSS3: js.UndefOr[Boolean] = js.native
    
    /**
      * Direction arrows navigation. (default: true)
      */
    var arrowsNav: js.UndefOr[Boolean] = js.native
    
    /**
      * Auto hide arrows. (default: true)
      */
    var arrowsNavAutoHide: js.UndefOr[Boolean] = js.native
    
    /**
      * Hides arrows completely on touch devices. (default: false)
      */
    var arrowsNavHideOnTouch: js.UndefOr[Boolean] = js.native
    
    /**
      * Scales and animates height based on current slide. Please note: if you have images in slide that don't have rsImg class) or don't have fixed size, use $(window).load() instead of $(document).ready() before initializing slider. Also, autoHeight doesn't work with properties like autoScaleSlider, imageScaleMode and imageAlignCenter.  (default: false)
      */
    var autoHeight: js.UndefOr[Boolean] = js.native
    
    /**
      * Automatically updates slider height based on base width. (default: false)
      */
    var autoScaleSlider: js.UndefOr[Boolean] = js.native
    
    /**
      * 400 Base slider height
      */
    var autoScaleSliderHeight: js.UndefOr[Double] = js.native
    
    /**
      * Base slider width.Slider will autocalculate the ratio based on these values. (default: 800)
      */
    var autoScaleSliderWidth: js.UndefOr[Double] = js.native
    
    /**
      * Autoplay slideshow can be enabled via slider options. Delay between items can be set globally via delay option, or specifically for each item by adding data-rsDelay="1000" to root element of the slide (1000 = 1sec).
      */
    var autoplay: js.UndefOr[RoyalSliderAutoplayOptions] = js.native
    
    /**
      * All elements inside slide that have class rsABlock will be treated by slider as animated blocks (tag name doesn't matter). Blocks can not be nested, but you can put multiple instances of them into one slide, or make slide itself animated block.
      */
    var block: js.UndefOr[RoyalSliderBlockOptions] = js.native
    
    /**
      * Navigation type, can be 'bullets', 'thumbnails', 'tabs' or 'none' (default: 'bullets')
      */
    var controlNavigation: js.UndefOr[String] = js.native
    
    /**
      *  If set to true adds arrows and fullscreen button inside rsOverflow container, otherwise inside root slider container. (default: true)
      */
    var controlsInside: js.UndefOr[Boolean] = js.native
    
    /**
      * Deep linking module makes URL automatically change when you switch slides and you can easily link to specific slide (aka permalink).
      */
    var deeplinking: js.UndefOr[RoyalSliderDeeplinkingOptions] = js.native
    
    /**
      * Easing function for simple transition.Read more in the easing section of the documentation. (default: 'easeInOutSine')
      */
    var easeInOut: js.UndefOr[String] = js.native
    
    /**
      * Easing function of animation after ending of the swipe gesture. Read more in the easing section of the documentation. (default: 'easeOutSine')
      */
    var easeOut: js.UndefOr[String] = js.native
    
    /**
      * Fades in slide after it's loaded. (default: true)
      */
    var fadeinLoadedSlide: js.UndefOr[Boolean] = js.native
    
    /**
      * You may specify larger images when slider is in fullscreen mode by adding data-rsBigImg attribute to rsImg element. A few examples:
      */
    var fullscreen: js.UndefOr[RoyalSliderFullscreenOptions] = js.native
    
    /**
      * Adds global caption element to slider, read more in the global caption section of documentation. (default: false)
      */
    var globalCaption: js.UndefOr[Boolean] = js.native
    
    /**
      * Aligns image to center of slide. (default: true)
      */
    var imageAlignCenter: js.UndefOr[Boolean] = js.native
    
    /**
      * Scale mode for images."fill", "fit", "fit-if-smaller" or "none". (default: 'fit-if-smaller')
      */
    var imageScaleMode: js.UndefOr[String] = js.native
    
    /**
      * Distance between image and edge of slide (doesn't work with 'fill' scale mode). (default: 4)
      */
    var imageScalePadding: js.UndefOr[Double] = js.native
    
    /**
      * Adds base height to all images for better-looking loading. Can be specified separately for each image. (default: null)
      */
    var imgHeight: js.UndefOr[Double] = js.native
    
    /**
      * Adds base width to all images for better-looking loading. Can be specified separately for each image. (default: null)
      */
    var imgWidth: js.UndefOr[Double] = js.native
    
    /**
      * Navigate slider with keyboard left and right arrows. (default: false)
      */
    var keyboardNavEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Makes slider to go from last slide to first. (default: false)
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * Makes slider to go from last slide to first with rewind. Overrides prev option. (default: false)
      */
    var loopRewind: js.UndefOr[Boolean] = js.native
    
    /**
      * Minimum distance in pixels to show next slide while dragging. (default: 10)
      */
    var minSlideOffset: js.UndefOr[Double] = js.native
    
    /**
      * Navigates forward by clicking on slide. (default: true)
      */
    var navigateByClick: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of slides to preload on sides.If you set it to 0, only one slide will be kept in the display list at once. (default: 4)
      */
    var numImagesToPreload: js.UndefOr[Double] = js.native
    
    /**
      * Randomizes all slides at start. (default: false)
      */
    var randomizeSlides: js.UndefOr[Boolean] = js.native
    
    /**
      * Mouse drag navigation over slider. (default: true)
      */
    var sliderDrag: js.UndefOr[Boolean] = js.native
    
    /**
      * Touch navigation of slider. (default: true)
      */
    var sliderTouch: js.UndefOr[Boolean] = js.native
    
    // false
    /**
      * Overrides HTML of slides, used for creating of slides from HTML that is not attached to DOM. More info in knowledge base.  (default: null)
      */
    var slides: js.UndefOr[Element] = js.native
    
    /**
      * Can be 'vertical' or 'horizontal'. (default: 'horizontal')
      */
    var slidesOrientation: js.UndefOr[String] = js.native
    
    /**
      * Spacing between slides in pixels. (default: 8)
      */
    var slidesSpacing: js.UndefOr[Double] = js.native
    
    /**
      * Start slide index. (default: 0)
      */
    var startSlideId: js.UndefOr[Double] = js.native
    
    /**
      * Thumbnail options
      */
    var thumbs: js.UndefOr[RoyalSliderThumbsOptions] = js.native
    
    /**
      * Slider transition speed, in ms. (default: 600)
      */
    var transitionSpeed: js.UndefOr[Double] = js.native
    
    /**
      * 'move' or 'fade'. Important note about fade transition, slides must have background as only one image is animating. (default: 'move')
      */
    var transitionType: js.UndefOr[String] = js.native
    
    /**
      * Enables spinning preloader, you may style it via CSS (class rsPreloader). (default: true)
      */
    var usePreloader: js.UndefOr[Boolean] = js.native
    
    /**
      * To add video to slide, you need to add data-rsVideo="" attribute to image. It can contain link to YouTube or Vimeo video.
      */
    var video: js.UndefOr[RoyalSliderVideoOptions] = js.native
    
    /**
      * Module "reveals" next and previous slides, like in this template.
      */
    var visibleNearby: js.UndefOr[RoyalSliderVisibleOptions] = js.native
  }
  object RoyalSliderOptions {
    
    @scala.inline
    def apply(): RoyalSliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderOptionsMutableBuilder[Self <: RoyalSliderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddActiveClass(value: Boolean): Self = StObject.set(x, "addActiveClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddActiveClassUndefined: Self = StObject.set(x, "addActiveClass", js.undefined)
      
      @scala.inline
      def setAllowCSS3(value: Boolean): Self = StObject.set(x, "allowCSS3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowCSS3Undefined: Self = StObject.set(x, "allowCSS3", js.undefined)
      
      @scala.inline
      def setArrowsNav(value: Boolean): Self = StObject.set(x, "arrowsNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsNavAutoHide(value: Boolean): Self = StObject.set(x, "arrowsNavAutoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsNavAutoHideUndefined: Self = StObject.set(x, "arrowsNavAutoHide", js.undefined)
      
      @scala.inline
      def setArrowsNavHideOnTouch(value: Boolean): Self = StObject.set(x, "arrowsNavHideOnTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsNavHideOnTouchUndefined: Self = StObject.set(x, "arrowsNavHideOnTouch", js.undefined)
      
      @scala.inline
      def setArrowsNavUndefined: Self = StObject.set(x, "arrowsNav", js.undefined)
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setAutoScaleSlider(value: Boolean): Self = StObject.set(x, "autoScaleSlider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScaleSliderHeight(value: Double): Self = StObject.set(x, "autoScaleSliderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScaleSliderHeightUndefined: Self = StObject.set(x, "autoScaleSliderHeight", js.undefined)
      
      @scala.inline
      def setAutoScaleSliderUndefined: Self = StObject.set(x, "autoScaleSlider", js.undefined)
      
      @scala.inline
      def setAutoScaleSliderWidth(value: Double): Self = StObject.set(x, "autoScaleSliderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScaleSliderWidthUndefined: Self = StObject.set(x, "autoScaleSliderWidth", js.undefined)
      
      @scala.inline
      def setAutoplay(value: RoyalSliderAutoplayOptions): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBlock(value: RoyalSliderBlockOptions): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setControlNavigation(value: String): Self = StObject.set(x, "controlNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlNavigationUndefined: Self = StObject.set(x, "controlNavigation", js.undefined)
      
      @scala.inline
      def setControlsInside(value: Boolean): Self = StObject.set(x, "controlsInside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsInsideUndefined: Self = StObject.set(x, "controlsInside", js.undefined)
      
      @scala.inline
      def setDeeplinking(value: RoyalSliderDeeplinkingOptions): Self = StObject.set(x, "deeplinking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeeplinkingUndefined: Self = StObject.set(x, "deeplinking", js.undefined)
      
      @scala.inline
      def setEaseInOut(value: String): Self = StObject.set(x, "easeInOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseInOutUndefined: Self = StObject.set(x, "easeInOut", js.undefined)
      
      @scala.inline
      def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseOutUndefined: Self = StObject.set(x, "easeOut", js.undefined)
      
      @scala.inline
      def setFadeinLoadedSlide(value: Boolean): Self = StObject.set(x, "fadeinLoadedSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeinLoadedSlideUndefined: Self = StObject.set(x, "fadeinLoadedSlide", js.undefined)
      
      @scala.inline
      def setFullscreen(value: RoyalSliderFullscreenOptions): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setGlobalCaption(value: Boolean): Self = StObject.set(x, "globalCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalCaptionUndefined: Self = StObject.set(x, "globalCaption", js.undefined)
      
      @scala.inline
      def setImageAlignCenter(value: Boolean): Self = StObject.set(x, "imageAlignCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAlignCenterUndefined: Self = StObject.set(x, "imageAlignCenter", js.undefined)
      
      @scala.inline
      def setImageScaleMode(value: String): Self = StObject.set(x, "imageScaleMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageScaleModeUndefined: Self = StObject.set(x, "imageScaleMode", js.undefined)
      
      @scala.inline
      def setImageScalePadding(value: Double): Self = StObject.set(x, "imageScalePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageScalePaddingUndefined: Self = StObject.set(x, "imageScalePadding", js.undefined)
      
      @scala.inline
      def setImgHeight(value: Double): Self = StObject.set(x, "imgHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgHeightUndefined: Self = StObject.set(x, "imgHeight", js.undefined)
      
      @scala.inline
      def setImgWidth(value: Double): Self = StObject.set(x, "imgWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgWidthUndefined: Self = StObject.set(x, "imgWidth", js.undefined)
      
      @scala.inline
      def setKeyboardNavEnabled(value: Boolean): Self = StObject.set(x, "keyboardNavEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardNavEnabledUndefined: Self = StObject.set(x, "keyboardNavEnabled", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopRewind(value: Boolean): Self = StObject.set(x, "loopRewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopRewindUndefined: Self = StObject.set(x, "loopRewind", js.undefined)
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setMinSlideOffset(value: Double): Self = StObject.set(x, "minSlideOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSlideOffsetUndefined: Self = StObject.set(x, "minSlideOffset", js.undefined)
      
      @scala.inline
      def setNavigateByClick(value: Boolean): Self = StObject.set(x, "navigateByClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateByClickUndefined: Self = StObject.set(x, "navigateByClick", js.undefined)
      
      @scala.inline
      def setNumImagesToPreload(value: Double): Self = StObject.set(x, "numImagesToPreload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumImagesToPreloadUndefined: Self = StObject.set(x, "numImagesToPreload", js.undefined)
      
      @scala.inline
      def setRandomizeSlides(value: Boolean): Self = StObject.set(x, "randomizeSlides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomizeSlidesUndefined: Self = StObject.set(x, "randomizeSlides", js.undefined)
      
      @scala.inline
      def setSliderDrag(value: Boolean): Self = StObject.set(x, "sliderDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderDragUndefined: Self = StObject.set(x, "sliderDrag", js.undefined)
      
      @scala.inline
      def setSliderTouch(value: Boolean): Self = StObject.set(x, "sliderTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderTouchUndefined: Self = StObject.set(x, "sliderTouch", js.undefined)
      
      @scala.inline
      def setSlides(value: Element): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesOrientation(value: String): Self = StObject.set(x, "slidesOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesOrientationUndefined: Self = StObject.set(x, "slidesOrientation", js.undefined)
      
      @scala.inline
      def setSlidesSpacing(value: Double): Self = StObject.set(x, "slidesSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesSpacingUndefined: Self = StObject.set(x, "slidesSpacing", js.undefined)
      
      @scala.inline
      def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      @scala.inline
      def setStartSlideId(value: Double): Self = StObject.set(x, "startSlideId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartSlideIdUndefined: Self = StObject.set(x, "startSlideId", js.undefined)
      
      @scala.inline
      def setThumbs(value: RoyalSliderThumbsOptions): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
      
      @scala.inline
      def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
      
      @scala.inline
      def setTransitionType(value: String): Self = StObject.set(x, "transitionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionTypeUndefined: Self = StObject.set(x, "transitionType", js.undefined)
      
      @scala.inline
      def setUsePreloader(value: Boolean): Self = StObject.set(x, "usePreloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePreloaderUndefined: Self = StObject.set(x, "usePreloader", js.undefined)
      
      @scala.inline
      def setVideo(value: RoyalSliderVideoOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
      
      @scala.inline
      def setVisibleNearby(value: RoyalSliderVisibleOptions): Self = StObject.set(x, "visibleNearby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleNearbyUndefined: Self = StObject.set(x, "visibleNearby", js.undefined)
    }
  }
  
  @js.native
  trait RoyalSliderSlide extends StObject {
    
    /**
      * TODO
      */
    var appendOnLoaded: Boolean = js.native
    
    /**
      * slide element
      */
    var content: JQuery = js.native
    
    /**
      * TODO
      */
    var contentAdded: Boolean = js.native
    
    /**
      * slide element wrapper
      */
    var holder: JQuery = js.native
    
    /**
      * slide index
      */
    var id: Double = js.native
    
    /**
      * TODO
      */
    var images: Null = js.native
    
    /**
      * TODO
      */
    var isAdded: Boolean = js.native
    
    /**
      * TODO
      */
    var isAppended: Boolean = js.native
    
    /**
      * TODO
      */
    var isBig: Boolean = js.native
    
    /**
      * TODO
      */
    var isLoaded: Boolean = js.native
    
    /**
      * TODO
      */
    var isLoading: Boolean = js.native
    
    /**
      * TODO
      */
    var isRendered: Boolean = js.native
    
    /**
      * TODO
      */
    var loadedTriggered: Boolean = js.native
    
    /**
      * TODO
      */
    var positionSet: Boolean = js.native
    
    /**
      * TODO
      */
    var sizeReady: Boolean = js.native
    
    /**
      * TODO
      */
    var thumbnail: String = js.native
  }
  object RoyalSliderSlide {
    
    @scala.inline
    def apply(
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
    implicit class RoyalSliderSlideMutableBuilder[Self <: RoyalSliderSlide] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendOnLoaded(value: Boolean): Self = StObject.set(x, "appendOnLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: JQuery): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAdded(value: Boolean): Self = StObject.set(x, "contentAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolder(value: JQuery): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: Null): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAdded(value: Boolean): Self = StObject.set(x, "isAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAppended(value: Boolean): Self = StObject.set(x, "isAppended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBig(value: Boolean): Self = StObject.set(x, "isBig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedTriggered(value: Boolean): Self = StObject.set(x, "loadedTriggered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionSet(value: Boolean): Self = StObject.set(x, "positionSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeReady(value: Boolean): Self = StObject.set(x, "sizeReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RoyalSliderThumbsOptions extends StObject {
    
    /**
      * Adds span element with class thumbIco to every thumbnail. Useful for styling (default: false)
      */
    var appendSpan: js.UndefOr[Boolean] = js.native
    
    /**
      * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
      */
    var arrowLeft: js.UndefOr[JQuery] = js.native
    
    /**
      * Replaces default thumbnail arrow. You have to add it to DOM manually. (default: null)
      */
    var arrowRight: js.UndefOr[JQuery] = js.native
    
    /**
      * Thumbnails arrows. (default: true)
      */
    var arrows: js.UndefOr[Boolean] = js.native
    
    /**
      * Auto hide thumbnails arrows on hover. (default: false)
      */
    var arrowsAutoHide: js.UndefOr[Boolean] = js.native
    
    /**
      * Automatically centers container with thumbs if there are small number of items (default: true)
      */
    var autoCenter: js.UndefOr[Boolean] = js.native
    
    /**
      * Thumbnails mouse drag. (default: true)
      */
    var drag: js.UndefOr[Boolean] = js.native
    
    /**
      * Margin that equals thumbs spacing for first and last item. (default: true)
      */
    var firstMargin: js.UndefOr[Boolean] = js.native
    
    /**
      * Reduces size of main viewport area by thumbnails width or height, use it when you set 100 % width to slider.This option is always true, when slider is in fullscreen mode. (default: true)
      */
    var fitInViewport: js.UndefOr[Boolean] = js.native
    
    /**
      * 'horizontal' or 'vertical'. (default: 'horizontal')
      */
    var orientation: js.UndefOr[String] = js.native
    
    /**
      * Spacing between thumbs. (default: 4)
      */
    var spacing: js.UndefOr[Double] = js.native
    
    /**
      * Thumbnails touch. (default: true)
      */
    var touch: js.UndefOr[Boolean] = js.native
    
    /**
      * Thumbnails transition speed. (default: 600)
      */
    var transitionSpeed: js.UndefOr[Double] = js.native
  }
  object RoyalSliderThumbsOptions {
    
    @scala.inline
    def apply(): RoyalSliderThumbsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderThumbsOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderThumbsOptionsMutableBuilder[Self <: RoyalSliderThumbsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendSpan(value: Boolean): Self = StObject.set(x, "appendSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendSpanUndefined: Self = StObject.set(x, "appendSpan", js.undefined)
      
      @scala.inline
      def setArrowLeft(value: JQuery): Self = StObject.set(x, "arrowLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowLeftUndefined: Self = StObject.set(x, "arrowLeft", js.undefined)
      
      @scala.inline
      def setArrowRight(value: JQuery): Self = StObject.set(x, "arrowRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowRightUndefined: Self = StObject.set(x, "arrowRight", js.undefined)
      
      @scala.inline
      def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsAutoHide(value: Boolean): Self = StObject.set(x, "arrowsAutoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsAutoHideUndefined: Self = StObject.set(x, "arrowsAutoHide", js.undefined)
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setAutoCenter(value: Boolean): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
      
      @scala.inline
      def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setFirstMargin(value: Boolean): Self = StObject.set(x, "firstMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstMarginUndefined: Self = StObject.set(x, "firstMargin", js.undefined)
      
      @scala.inline
      def setFitInViewport(value: Boolean): Self = StObject.set(x, "fitInViewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitInViewportUndefined: Self = StObject.set(x, "fitInViewport", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  @js.native
  trait RoyalSliderVideoOptions extends StObject {
    
    /**
      * Auto hide arrows when video is playing  (default: true)
      */
    var autoHideArrows: js.UndefOr[Boolean] = js.native
    
    /**
      * Auto hide animated blocks when video is playing. (default: false)
      */
    var autoHideBlocks: js.UndefOr[Boolean] = js.native
    
    /**
      * Auto hide navigation when video is playing. (default: false)
      */
    var autoHideControlNav: js.UndefOr[Boolean] = js.native
    
    /**
      * Vimeo embed code. %id% is replaced by video id. (default: '<iframe src="http://player.vimeo.com/video/%id%?byline=0&amp;portrait=0&amp;autoplay=1" frameborder="no" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>')
      */
    var vimeoCode: js.UndefOr[String] = js.native
    
    /**
      * Youtube embed code. %id% is replaced by video id. (default: '<iframe src="http://www.youtube.com/embed/%id%?rel=1&autoplay=1&showinfo=0" frameborder="no"></iframe>')
      */
    var youTubeCode: js.UndefOr[String] = js.native
  }
  object RoyalSliderVideoOptions {
    
    @scala.inline
    def apply(): RoyalSliderVideoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderVideoOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderVideoOptionsMutableBuilder[Self <: RoyalSliderVideoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHideArrows(value: Boolean): Self = StObject.set(x, "autoHideArrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideArrowsUndefined: Self = StObject.set(x, "autoHideArrows", js.undefined)
      
      @scala.inline
      def setAutoHideBlocks(value: Boolean): Self = StObject.set(x, "autoHideBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideBlocksUndefined: Self = StObject.set(x, "autoHideBlocks", js.undefined)
      
      @scala.inline
      def setAutoHideControlNav(value: Boolean): Self = StObject.set(x, "autoHideControlNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideControlNavUndefined: Self = StObject.set(x, "autoHideControlNav", js.undefined)
      
      @scala.inline
      def setVimeoCode(value: String): Self = StObject.set(x, "vimeoCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVimeoCodeUndefined: Self = StObject.set(x, "vimeoCode", js.undefined)
      
      @scala.inline
      def setYouTubeCode(value: String): Self = StObject.set(x, "youTubeCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYouTubeCodeUndefined: Self = StObject.set(x, "youTubeCode", js.undefined)
    }
  }
  
  @js.native
  trait RoyalSliderVisibleOptions extends StObject {
    
    /**
      * Used for responsive design. Changes centerArea value to breakpointCenterArea when width of slider is less then value in this option. Set to 0 to disable. (default: 0)
      */
    var breakpoint: js.UndefOr[Double] = js.native
    
    /**
      * Same as centerArea option, just for breakpoint. Can be changed dynamically via `sliderInstance.st.breakpointCenterArea`. (default: 0.8)
      */
    var breakpointCenterArea: js.UndefOr[Double] = js.native
    
    /**
      * Alignment of center image, if you set it to false center image will be aligned to left. (default: true)
      */
    var center: js.UndefOr[Boolean] = js.native
    
    /**
      * Ratio that determines area of center image.For example for 0.6 - 60 % of slider area will get center image and 20% for two images on sides. (default: 0.6)
      */
    var centerArea: js.UndefOr[Double] = js.native
    
    /**
      * Enable visible-nearby. (default: true)
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Disables navigation to next slide by clicking on current slide (if navigateByClick is true). (default: true)
      */
    var navigateByCenterClick: js.UndefOr[Boolean] = js.native
  }
  object RoyalSliderVisibleOptions {
    
    @scala.inline
    def apply(): RoyalSliderVisibleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoyalSliderVisibleOptions]
    }
    
    @scala.inline
    implicit class RoyalSliderVisibleOptionsMutableBuilder[Self <: RoyalSliderVisibleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointCenterArea(value: Double): Self = StObject.set(x, "breakpointCenterArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointCenterAreaUndefined: Self = StObject.set(x, "breakpointCenterArea", js.undefined)
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterArea(value: Double): Self = StObject.set(x, "centerArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterAreaUndefined: Self = StObject.set(x, "centerArea", js.undefined)
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setNavigateByCenterClick(value: Boolean): Self = StObject.set(x, "navigateByCenterClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateByCenterClickUndefined: Self = StObject.set(x, "navigateByCenterClick", js.undefined)
    }
  }
}
