package typings.royalslider.RoyalSlider

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderOptions extends js.Object {
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
  implicit class RoyalSliderOptionsOps[Self <: RoyalSliderOptions] (val x: Self) extends AnyVal {
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
    def setAddActiveClass(value: Boolean): Self = this.set("addActiveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddActiveClass: Self = this.set("addActiveClass", js.undefined)
    @scala.inline
    def setAllowCSS3(value: Boolean): Self = this.set("allowCSS3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCSS3: Self = this.set("allowCSS3", js.undefined)
    @scala.inline
    def setArrowsNav(value: Boolean): Self = this.set("arrowsNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowsNav: Self = this.set("arrowsNav", js.undefined)
    @scala.inline
    def setArrowsNavAutoHide(value: Boolean): Self = this.set("arrowsNavAutoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowsNavAutoHide: Self = this.set("arrowsNavAutoHide", js.undefined)
    @scala.inline
    def setArrowsNavHideOnTouch(value: Boolean): Self = this.set("arrowsNavHideOnTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowsNavHideOnTouch: Self = this.set("arrowsNavHideOnTouch", js.undefined)
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    @scala.inline
    def setAutoScaleSlider(value: Boolean): Self = this.set("autoScaleSlider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScaleSlider: Self = this.set("autoScaleSlider", js.undefined)
    @scala.inline
    def setAutoScaleSliderHeight(value: Double): Self = this.set("autoScaleSliderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScaleSliderHeight: Self = this.set("autoScaleSliderHeight", js.undefined)
    @scala.inline
    def setAutoScaleSliderWidth(value: Double): Self = this.set("autoScaleSliderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScaleSliderWidth: Self = this.set("autoScaleSliderWidth", js.undefined)
    @scala.inline
    def setAutoplay(value: RoyalSliderAutoplayOptions): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBlock(value: RoyalSliderBlockOptions): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setControlNavigation(value: String): Self = this.set("controlNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlNavigation: Self = this.set("controlNavigation", js.undefined)
    @scala.inline
    def setControlsInside(value: Boolean): Self = this.set("controlsInside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsInside: Self = this.set("controlsInside", js.undefined)
    @scala.inline
    def setDeeplinking(value: RoyalSliderDeeplinkingOptions): Self = this.set("deeplinking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeeplinking: Self = this.set("deeplinking", js.undefined)
    @scala.inline
    def setEaseInOut(value: String): Self = this.set("easeInOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEaseInOut: Self = this.set("easeInOut", js.undefined)
    @scala.inline
    def setEaseOut(value: String): Self = this.set("easeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEaseOut: Self = this.set("easeOut", js.undefined)
    @scala.inline
    def setFadeinLoadedSlide(value: Boolean): Self = this.set("fadeinLoadedSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeinLoadedSlide: Self = this.set("fadeinLoadedSlide", js.undefined)
    @scala.inline
    def setFullscreen(value: RoyalSliderFullscreenOptions): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setGlobalCaption(value: Boolean): Self = this.set("globalCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalCaption: Self = this.set("globalCaption", js.undefined)
    @scala.inline
    def setImageAlignCenter(value: Boolean): Self = this.set("imageAlignCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageAlignCenter: Self = this.set("imageAlignCenter", js.undefined)
    @scala.inline
    def setImageScaleMode(value: String): Self = this.set("imageScaleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageScaleMode: Self = this.set("imageScaleMode", js.undefined)
    @scala.inline
    def setImageScalePadding(value: Double): Self = this.set("imageScalePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageScalePadding: Self = this.set("imageScalePadding", js.undefined)
    @scala.inline
    def setImgHeight(value: Double): Self = this.set("imgHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgHeight: Self = this.set("imgHeight", js.undefined)
    @scala.inline
    def setImgWidth(value: Double): Self = this.set("imgWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgWidth: Self = this.set("imgWidth", js.undefined)
    @scala.inline
    def setKeyboardNavEnabled(value: Boolean): Self = this.set("keyboardNavEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardNavEnabled: Self = this.set("keyboardNavEnabled", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLoopRewind(value: Boolean): Self = this.set("loopRewind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopRewind: Self = this.set("loopRewind", js.undefined)
    @scala.inline
    def setMinSlideOffset(value: Double): Self = this.set("minSlideOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSlideOffset: Self = this.set("minSlideOffset", js.undefined)
    @scala.inline
    def setNavigateByClick(value: Boolean): Self = this.set("navigateByClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigateByClick: Self = this.set("navigateByClick", js.undefined)
    @scala.inline
    def setNumImagesToPreload(value: Double): Self = this.set("numImagesToPreload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumImagesToPreload: Self = this.set("numImagesToPreload", js.undefined)
    @scala.inline
    def setRandomizeSlides(value: Boolean): Self = this.set("randomizeSlides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomizeSlides: Self = this.set("randomizeSlides", js.undefined)
    @scala.inline
    def setSliderDrag(value: Boolean): Self = this.set("sliderDrag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderDrag: Self = this.set("sliderDrag", js.undefined)
    @scala.inline
    def setSliderTouch(value: Boolean): Self = this.set("sliderTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderTouch: Self = this.set("sliderTouch", js.undefined)
    @scala.inline
    def setSlides(value: Element): Self = this.set("slides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
    @scala.inline
    def setSlidesOrientation(value: String): Self = this.set("slidesOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesOrientation: Self = this.set("slidesOrientation", js.undefined)
    @scala.inline
    def setSlidesSpacing(value: Double): Self = this.set("slidesSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesSpacing: Self = this.set("slidesSpacing", js.undefined)
    @scala.inline
    def setStartSlideId(value: Double): Self = this.set("startSlideId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartSlideId: Self = this.set("startSlideId", js.undefined)
    @scala.inline
    def setThumbs(value: RoyalSliderThumbsOptions): Self = this.set("thumbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbs: Self = this.set("thumbs", js.undefined)
    @scala.inline
    def setTransitionSpeed(value: Double): Self = this.set("transitionSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionSpeed: Self = this.set("transitionSpeed", js.undefined)
    @scala.inline
    def setTransitionType(value: String): Self = this.set("transitionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionType: Self = this.set("transitionType", js.undefined)
    @scala.inline
    def setUsePreloader(value: Boolean): Self = this.set("usePreloader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePreloader: Self = this.set("usePreloader", js.undefined)
    @scala.inline
    def setVideo(value: RoyalSliderVideoOptions): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setVisibleNearby(value: RoyalSliderVisibleOptions): Self = this.set("visibleNearby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleNearby: Self = this.set("visibleNearby", js.undefined)
  }
  
}

