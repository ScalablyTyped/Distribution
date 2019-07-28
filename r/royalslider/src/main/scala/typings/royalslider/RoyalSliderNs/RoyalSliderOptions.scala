package typings.royalslider.RoyalSliderNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoyalSliderOptions extends js.Object {
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
  @scala.inline
  def apply(
    addActiveClass: js.UndefOr[Boolean] = js.undefined,
    allowCSS3: js.UndefOr[Boolean] = js.undefined,
    arrowsNav: js.UndefOr[Boolean] = js.undefined,
    arrowsNavAutoHide: js.UndefOr[Boolean] = js.undefined,
    arrowsNavHideOnTouch: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    autoScaleSlider: js.UndefOr[Boolean] = js.undefined,
    autoScaleSliderHeight: Int | Double = null,
    autoScaleSliderWidth: Int | Double = null,
    autoplay: RoyalSliderAutoplayOptions = null,
    block: RoyalSliderBlockOptions = null,
    controlNavigation: String = null,
    controlsInside: js.UndefOr[Boolean] = js.undefined,
    deeplinking: RoyalSliderDeeplinkingOptions = null,
    easeInOut: String = null,
    easeOut: String = null,
    fadeinLoadedSlide: js.UndefOr[Boolean] = js.undefined,
    fullscreen: RoyalSliderFullscreenOptions = null,
    globalCaption: js.UndefOr[Boolean] = js.undefined,
    imageAlignCenter: js.UndefOr[Boolean] = js.undefined,
    imageScaleMode: String = null,
    imageScalePadding: Int | Double = null,
    imgHeight: Int | Double = null,
    imgWidth: Int | Double = null,
    keyboardNavEnabled: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    loopRewind: js.UndefOr[Boolean] = js.undefined,
    minSlideOffset: Int | Double = null,
    navigateByClick: js.UndefOr[Boolean] = js.undefined,
    numImagesToPreload: Int | Double = null,
    randomizeSlides: js.UndefOr[Boolean] = js.undefined,
    sliderDrag: js.UndefOr[Boolean] = js.undefined,
    sliderTouch: js.UndefOr[Boolean] = js.undefined,
    slides: Element = null,
    slidesOrientation: String = null,
    slidesSpacing: Int | Double = null,
    startSlideId: Int | Double = null,
    thumbs: RoyalSliderThumbsOptions = null,
    transitionSpeed: Int | Double = null,
    transitionType: String = null,
    usePreloader: js.UndefOr[Boolean] = js.undefined,
    video: RoyalSliderVideoOptions = null,
    visibleNearby: RoyalSliderVisibleOptions = null
  ): RoyalSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addActiveClass)) __obj.updateDynamic("addActiveClass")(addActiveClass)
    if (!js.isUndefined(allowCSS3)) __obj.updateDynamic("allowCSS3")(allowCSS3)
    if (!js.isUndefined(arrowsNav)) __obj.updateDynamic("arrowsNav")(arrowsNav)
    if (!js.isUndefined(arrowsNavAutoHide)) __obj.updateDynamic("arrowsNavAutoHide")(arrowsNavAutoHide)
    if (!js.isUndefined(arrowsNavHideOnTouch)) __obj.updateDynamic("arrowsNavHideOnTouch")(arrowsNavHideOnTouch)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (!js.isUndefined(autoScaleSlider)) __obj.updateDynamic("autoScaleSlider")(autoScaleSlider)
    if (autoScaleSliderHeight != null) __obj.updateDynamic("autoScaleSliderHeight")(autoScaleSliderHeight.asInstanceOf[js.Any])
    if (autoScaleSliderWidth != null) __obj.updateDynamic("autoScaleSliderWidth")(autoScaleSliderWidth.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay)
    if (block != null) __obj.updateDynamic("block")(block)
    if (controlNavigation != null) __obj.updateDynamic("controlNavigation")(controlNavigation)
    if (!js.isUndefined(controlsInside)) __obj.updateDynamic("controlsInside")(controlsInside)
    if (deeplinking != null) __obj.updateDynamic("deeplinking")(deeplinking)
    if (easeInOut != null) __obj.updateDynamic("easeInOut")(easeInOut)
    if (easeOut != null) __obj.updateDynamic("easeOut")(easeOut)
    if (!js.isUndefined(fadeinLoadedSlide)) __obj.updateDynamic("fadeinLoadedSlide")(fadeinLoadedSlide)
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(globalCaption)) __obj.updateDynamic("globalCaption")(globalCaption)
    if (!js.isUndefined(imageAlignCenter)) __obj.updateDynamic("imageAlignCenter")(imageAlignCenter)
    if (imageScaleMode != null) __obj.updateDynamic("imageScaleMode")(imageScaleMode)
    if (imageScalePadding != null) __obj.updateDynamic("imageScalePadding")(imageScalePadding.asInstanceOf[js.Any])
    if (imgHeight != null) __obj.updateDynamic("imgHeight")(imgHeight.asInstanceOf[js.Any])
    if (imgWidth != null) __obj.updateDynamic("imgWidth")(imgWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardNavEnabled)) __obj.updateDynamic("keyboardNavEnabled")(keyboardNavEnabled)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(loopRewind)) __obj.updateDynamic("loopRewind")(loopRewind)
    if (minSlideOffset != null) __obj.updateDynamic("minSlideOffset")(minSlideOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(navigateByClick)) __obj.updateDynamic("navigateByClick")(navigateByClick)
    if (numImagesToPreload != null) __obj.updateDynamic("numImagesToPreload")(numImagesToPreload.asInstanceOf[js.Any])
    if (!js.isUndefined(randomizeSlides)) __obj.updateDynamic("randomizeSlides")(randomizeSlides)
    if (!js.isUndefined(sliderDrag)) __obj.updateDynamic("sliderDrag")(sliderDrag)
    if (!js.isUndefined(sliderTouch)) __obj.updateDynamic("sliderTouch")(sliderTouch)
    if (slides != null) __obj.updateDynamic("slides")(slides)
    if (slidesOrientation != null) __obj.updateDynamic("slidesOrientation")(slidesOrientation)
    if (slidesSpacing != null) __obj.updateDynamic("slidesSpacing")(slidesSpacing.asInstanceOf[js.Any])
    if (startSlideId != null) __obj.updateDynamic("startSlideId")(startSlideId.asInstanceOf[js.Any])
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs)
    if (transitionSpeed != null) __obj.updateDynamic("transitionSpeed")(transitionSpeed.asInstanceOf[js.Any])
    if (transitionType != null) __obj.updateDynamic("transitionType")(transitionType)
    if (!js.isUndefined(usePreloader)) __obj.updateDynamic("usePreloader")(usePreloader)
    if (video != null) __obj.updateDynamic("video")(video)
    if (visibleNearby != null) __obj.updateDynamic("visibleNearby")(visibleNearby)
    __obj.asInstanceOf[RoyalSliderOptions]
  }
}

