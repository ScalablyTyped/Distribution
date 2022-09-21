package typings.simpleReactLightbox

import typings.react.mod.ReactNode
import typings.simpleReactLightbox.mod.Callbacks
import typings.simpleReactLightbox.mod.Element
import typings.simpleReactLightbox.mod.Elements
import typings.simpleReactLightbox.mod.SRLWrapperOptions
import typings.simpleReactLightbox.mod.SRLWrapperProps
import typings.simpleReactLightbox.mod.Slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoplaySpeed extends StObject {
    
    var autoplaySpeed: js.UndefOr[Double] = js.undefined
    
    var boxShadow: js.UndefOr[String] = js.undefined
    
    var disableKeyboardControls: js.UndefOr[Boolean] = js.undefined
    
    var disablePanzoom: js.UndefOr[Boolean] = js.undefined
    
    var disableWheelControls: js.UndefOr[Boolean] = js.undefined
    
    var downloadedFileName: js.UndefOr[String] = js.undefined
    
    var hideControlsAfter: js.UndefOr[Double | Boolean] = js.undefined
    
    var lightboxTransitionSpeed: js.UndefOr[Double] = js.undefined
    
    var lightboxTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var overlayColor: js.UndefOr[String] = js.undefined
    
    var slideAnimationType: js.UndefOr[String] = js.undefined
    
    var slideSpringValues: js.UndefOr[js.Array[Double]] = js.undefined
    
    var slideTransitionSpeed: js.UndefOr[Double] = js.undefined
    
    var slideTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    var usingPreact: js.UndefOr[Boolean] = js.undefined
  }
  object AutoplaySpeed {
    
    inline def apply(): AutoplaySpeed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoplaySpeed]
    }
    
    extension [Self <: AutoplaySpeed](x: Self) {
      
      inline def setAutoplaySpeed(value: Double): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      inline def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      inline def setDisableKeyboardControls(value: Boolean): Self = StObject.set(x, "disableKeyboardControls", value.asInstanceOf[js.Any])
      
      inline def setDisableKeyboardControlsUndefined: Self = StObject.set(x, "disableKeyboardControls", js.undefined)
      
      inline def setDisablePanzoom(value: Boolean): Self = StObject.set(x, "disablePanzoom", value.asInstanceOf[js.Any])
      
      inline def setDisablePanzoomUndefined: Self = StObject.set(x, "disablePanzoom", js.undefined)
      
      inline def setDisableWheelControls(value: Boolean): Self = StObject.set(x, "disableWheelControls", value.asInstanceOf[js.Any])
      
      inline def setDisableWheelControlsUndefined: Self = StObject.set(x, "disableWheelControls", js.undefined)
      
      inline def setDownloadedFileName(value: String): Self = StObject.set(x, "downloadedFileName", value.asInstanceOf[js.Any])
      
      inline def setDownloadedFileNameUndefined: Self = StObject.set(x, "downloadedFileName", js.undefined)
      
      inline def setHideControlsAfter(value: Double | Boolean): Self = StObject.set(x, "hideControlsAfter", value.asInstanceOf[js.Any])
      
      inline def setHideControlsAfterUndefined: Self = StObject.set(x, "hideControlsAfter", js.undefined)
      
      inline def setLightboxTransitionSpeed(value: Double): Self = StObject.set(x, "lightboxTransitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setLightboxTransitionSpeedUndefined: Self = StObject.set(x, "lightboxTransitionSpeed", js.undefined)
      
      inline def setLightboxTransitionTimingFunction(value: String): Self = StObject.set(x, "lightboxTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setLightboxTransitionTimingFunctionUndefined: Self = StObject.set(x, "lightboxTransitionTimingFunction", js.undefined)
      
      inline def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      inline def setSlideAnimationType(value: String): Self = StObject.set(x, "slideAnimationType", value.asInstanceOf[js.Any])
      
      inline def setSlideAnimationTypeUndefined: Self = StObject.set(x, "slideAnimationType", js.undefined)
      
      inline def setSlideSpringValues(value: js.Array[Double]): Self = StObject.set(x, "slideSpringValues", value.asInstanceOf[js.Any])
      
      inline def setSlideSpringValuesUndefined: Self = StObject.set(x, "slideSpringValues", js.undefined)
      
      inline def setSlideSpringValuesVarargs(value: Double*): Self = StObject.set(x, "slideSpringValues", js.Array(value*))
      
      inline def setSlideTransitionSpeed(value: Double): Self = StObject.set(x, "slideTransitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setSlideTransitionSpeedUndefined: Self = StObject.set(x, "slideTransitionSpeed", js.undefined)
      
      inline def setSlideTransitionTimingFunction(value: String): Self = StObject.set(x, "slideTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setSlideTransitionTimingFunctionUndefined: Self = StObject.set(x, "slideTransitionTimingFunction", js.undefined)
      
      inline def setUsingPreact(value: Boolean): Self = StObject.set(x, "usingPreact", value.asInstanceOf[js.Any])
      
      inline def setUsingPreactUndefined: Self = StObject.set(x, "usingPreact", js.undefined)
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var iconColor: js.UndefOr[String] = js.undefined
    
    var iconPadding: js.UndefOr[String] = js.undefined
    
    var showAutoplayButton: js.UndefOr[Boolean] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var showDownloadButton: js.UndefOr[Boolean] = js.undefined
    
    var showFullscreenButton: js.UndefOr[Boolean] = js.undefined
    
    var showNextButton: js.UndefOr[Boolean] = js.undefined
    
    var showPrevButton: js.UndefOr[Boolean] = js.undefined
    
    var showThumbnailsButton: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
  }
  object BackgroundColor {
    
    inline def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setIconPadding(value: String): Self = StObject.set(x, "iconPadding", value.asInstanceOf[js.Any])
      
      inline def setIconPaddingUndefined: Self = StObject.set(x, "iconPadding", js.undefined)
      
      inline def setShowAutoplayButton(value: Boolean): Self = StObject.set(x, "showAutoplayButton", value.asInstanceOf[js.Any])
      
      inline def setShowAutoplayButtonUndefined: Self = StObject.set(x, "showAutoplayButton", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setShowDownloadButton(value: Boolean): Self = StObject.set(x, "showDownloadButton", value.asInstanceOf[js.Any])
      
      inline def setShowDownloadButtonUndefined: Self = StObject.set(x, "showDownloadButton", js.undefined)
      
      inline def setShowFullscreenButton(value: Boolean): Self = StObject.set(x, "showFullscreenButton", value.asInstanceOf[js.Any])
      
      inline def setShowFullscreenButtonUndefined: Self = StObject.set(x, "showFullscreenButton", js.undefined)
      
      inline def setShowNextButton(value: Boolean): Self = StObject.set(x, "showNextButton", value.asInstanceOf[js.Any])
      
      inline def setShowNextButtonUndefined: Self = StObject.set(x, "showNextButton", js.undefined)
      
      inline def setShowPrevButton(value: Boolean): Self = StObject.set(x, "showPrevButton", value.asInstanceOf[js.Any])
      
      inline def setShowPrevButtonUndefined: Self = StObject.set(x, "showPrevButton", js.undefined)
      
      inline def setShowThumbnailsButton(value: Boolean): Self = StObject.set(x, "showThumbnailsButton", value.asInstanceOf[js.Any])
      
      inline def setShowThumbnailsButtonUndefined: Self = StObject.set(x, "showThumbnailsButton", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CaptionAlignment extends StObject {
    
    var captionAlignment: js.UndefOr[String] = js.undefined
    
    var captionColor: js.UndefOr[String] = js.undefined
    
    var captionContainerPadding: js.UndefOr[String] = js.undefined
    
    var captionFontFamily: js.UndefOr[String] = js.undefined
    
    var captionFontSize: js.UndefOr[String] = js.undefined
    
    var captionFontStyle: js.UndefOr[String] = js.undefined
    
    var captionFontWeight: js.UndefOr[Double | String] = js.undefined
    
    var captionTextTransform: js.UndefOr[String] = js.undefined
    
    var showCaption: js.UndefOr[Boolean] = js.undefined
  }
  object CaptionAlignment {
    
    inline def apply(): CaptionAlignment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptionAlignment]
    }
    
    extension [Self <: CaptionAlignment](x: Self) {
      
      inline def setCaptionAlignment(value: String): Self = StObject.set(x, "captionAlignment", value.asInstanceOf[js.Any])
      
      inline def setCaptionAlignmentUndefined: Self = StObject.set(x, "captionAlignment", js.undefined)
      
      inline def setCaptionColor(value: String): Self = StObject.set(x, "captionColor", value.asInstanceOf[js.Any])
      
      inline def setCaptionColorUndefined: Self = StObject.set(x, "captionColor", js.undefined)
      
      inline def setCaptionContainerPadding(value: String): Self = StObject.set(x, "captionContainerPadding", value.asInstanceOf[js.Any])
      
      inline def setCaptionContainerPaddingUndefined: Self = StObject.set(x, "captionContainerPadding", js.undefined)
      
      inline def setCaptionFontFamily(value: String): Self = StObject.set(x, "captionFontFamily", value.asInstanceOf[js.Any])
      
      inline def setCaptionFontFamilyUndefined: Self = StObject.set(x, "captionFontFamily", js.undefined)
      
      inline def setCaptionFontSize(value: String): Self = StObject.set(x, "captionFontSize", value.asInstanceOf[js.Any])
      
      inline def setCaptionFontSizeUndefined: Self = StObject.set(x, "captionFontSize", js.undefined)
      
      inline def setCaptionFontStyle(value: String): Self = StObject.set(x, "captionFontStyle", value.asInstanceOf[js.Any])
      
      inline def setCaptionFontStyleUndefined: Self = StObject.set(x, "captionFontStyle", js.undefined)
      
      inline def setCaptionFontWeight(value: Double | String): Self = StObject.set(x, "captionFontWeight", value.asInstanceOf[js.Any])
      
      inline def setCaptionFontWeightUndefined: Self = StObject.set(x, "captionFontWeight", js.undefined)
      
      inline def setCaptionTextTransform(value: String): Self = StObject.set(x, "captionTextTransform", value.asInstanceOf[js.Any])
      
      inline def setCaptionTextTransformUndefined: Self = StObject.set(x, "captionTextTransform", js.undefined)
      
      inline def setShowCaption(value: Boolean): Self = StObject.set(x, "showCaption", value.asInstanceOf[js.Any])
      
      inline def setShowCaptionUndefined: Self = StObject.set(x, "showCaption", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: ReactNode
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait CloseLightbox extends StObject {
    
    def closeLightbox(): Unit = js.native
    
    def openLightbox(): Unit = js.native
    def openLightbox(index: Double): Unit = js.native
  }
  
  trait Current extends StObject {
    
    var current: Slide
    
    var next: Slide
    
    var previous: Slide
  }
  object Current {
    
    inline def apply(current: Slide, next: Slide, previous: Slide): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrent(value: Slide): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setNext(value: Slide): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: Slide): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
  
  trait FillColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var showProgressBar: js.UndefOr[Boolean] = js.undefined
  }
  object FillColor {
    
    inline def apply(): FillColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillColor]
    }
    
    extension [Self <: FillColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setShowProgressBar(value: Boolean): Self = StObject.set(x, "showProgressBar", value.asInstanceOf[js.Any])
      
      inline def setShowProgressBarUndefined: Self = StObject.set(x, "showProgressBar", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<simple-react-lightbox.simple-react-lightbox.CallbackCountSlides> */
  trait ReadonlyCallbackCountSlid extends StObject {
    
    val totalSlide: Double
  }
  object ReadonlyCallbackCountSlid {
    
    inline def apply(totalSlide: Double): ReadonlyCallbackCountSlid = {
      val __obj = js.Dynamic.literal(totalSlide = totalSlide.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyCallbackCountSlid]
    }
    
    extension [Self <: ReadonlyCallbackCountSlid](x: Self) {
      
      inline def setTotalSlide(value: Double): Self = StObject.set(x, "totalSlide", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<simple-react-lightbox.simple-react-lightbox.CallbackOpen> */
  trait ReadonlyCallbackOpen extends StObject {
    
    val currentSlide: Slide
    
    val opened: Boolean
  }
  object ReadonlyCallbackOpen {
    
    inline def apply(currentSlide: Slide, opened: Boolean): ReadonlyCallbackOpen = {
      val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], opened = opened.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyCallbackOpen]
    }
    
    extension [Self <: ReadonlyCallbackOpen](x: Self) {
      
      inline def setCurrentSlide(value: Slide): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<simple-react-lightbox.simple-react-lightbox.CallbackSlideChange> */
  trait ReadonlyCallbackSlideChan extends StObject {
    
    val action: String
    
    val index: Double
    
    val slides: Current
  }
  object ReadonlyCallbackSlideChan {
    
    inline def apply(action: String, index: Double, slides: Current): ReadonlyCallbackSlideChan = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], slides = slides.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyCallbackSlideChan]
    }
    
    extension [Self <: ReadonlyCallbackSlideChan](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSlides(value: Current): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShowThumbnails extends StObject {
    
    var showThumbnails: js.UndefOr[Boolean] = js.undefined
    
    var thumbnailsAlignment: js.UndefOr[String] = js.undefined
    
    var thumbnailsContainerBackgroundColor: js.UndefOr[String] = js.undefined
    
    var thumbnailsContainerPadding: js.UndefOr[String] = js.undefined
    
    var thumbnailsGap: js.UndefOr[String] = js.undefined
    
    var thumbnailsIconColor: js.UndefOr[String] = js.undefined
    
    var thumbnailsOpacity: js.UndefOr[Double] = js.undefined
    
    var thumbnailsPosition: js.UndefOr[String] = js.undefined
    
    var thumbnailsSize: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ShowThumbnails {
    
    inline def apply(): ShowThumbnails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowThumbnails]
    }
    
    extension [Self <: ShowThumbnails](x: Self) {
      
      inline def setShowThumbnails(value: Boolean): Self = StObject.set(x, "showThumbnails", value.asInstanceOf[js.Any])
      
      inline def setShowThumbnailsUndefined: Self = StObject.set(x, "showThumbnails", js.undefined)
      
      inline def setThumbnailsAlignment(value: String): Self = StObject.set(x, "thumbnailsAlignment", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsAlignmentUndefined: Self = StObject.set(x, "thumbnailsAlignment", js.undefined)
      
      inline def setThumbnailsContainerBackgroundColor(value: String): Self = StObject.set(x, "thumbnailsContainerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsContainerBackgroundColorUndefined: Self = StObject.set(x, "thumbnailsContainerBackgroundColor", js.undefined)
      
      inline def setThumbnailsContainerPadding(value: String): Self = StObject.set(x, "thumbnailsContainerPadding", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsContainerPaddingUndefined: Self = StObject.set(x, "thumbnailsContainerPadding", js.undefined)
      
      inline def setThumbnailsGap(value: String): Self = StObject.set(x, "thumbnailsGap", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsGapUndefined: Self = StObject.set(x, "thumbnailsGap", js.undefined)
      
      inline def setThumbnailsIconColor(value: String): Self = StObject.set(x, "thumbnailsIconColor", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsIconColorUndefined: Self = StObject.set(x, "thumbnailsIconColor", js.undefined)
      
      inline def setThumbnailsOpacity(value: Double): Self = StObject.set(x, "thumbnailsOpacity", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsOpacityUndefined: Self = StObject.set(x, "thumbnailsOpacity", js.undefined)
      
      inline def setThumbnailsPosition(value: String): Self = StObject.set(x, "thumbnailsPosition", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsPositionUndefined: Self = StObject.set(x, "thumbnailsPosition", js.undefined)
      
      inline def setThumbnailsSize(value: js.Array[String]): Self = StObject.set(x, "thumbnailsSize", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsSizeUndefined: Self = StObject.set(x, "thumbnailsSize", js.undefined)
      
      inline def setThumbnailsSizeVarargs(value: String*): Self = StObject.set(x, "thumbnailsSize", js.Array(value*))
    }
  }
  
  /* Inlined simple-react-lightbox.simple-react-lightbox.WrapperWithChildren & {  options :simple-react-lightbox.simple-react-lightbox.SRLWrapperOptions | undefined,   callbacks :simple-react-lightbox.simple-react-lightbox.Callbacks | undefined} */
  trait WrapperWithChildrenoption
    extends StObject
       with SRLWrapperProps {
    
    var callbacks: js.UndefOr[Callbacks] = js.undefined
    
    var children: ReactNode
    
    var elements: js.UndefOr[scala.Nothing] = js.undefined
    
    var options: js.UndefOr[SRLWrapperOptions] = js.undefined
  }
  object WrapperWithChildrenoption {
    
    inline def apply(): WrapperWithChildrenoption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperWithChildrenoption]
    }
    
    extension [Self <: WrapperWithChildrenoption](x: Self) {
      
      inline def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOptions(value: SRLWrapperOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Inlined simple-react-lightbox.simple-react-lightbox.WrapperWithElements & {  options :simple-react-lightbox.simple-react-lightbox.SRLWrapperOptions | undefined,   callbacks :simple-react-lightbox.simple-react-lightbox.Callbacks | undefined} */
  trait WrapperWithElementsoption
    extends StObject
       with SRLWrapperProps {
    
    var callbacks: js.UndefOr[Callbacks] = js.undefined
    
    var children: js.UndefOr[scala.Nothing] = js.undefined
    
    var elements: Elements
    
    var options: js.UndefOr[SRLWrapperOptions] = js.undefined
  }
  object WrapperWithElementsoption {
    
    inline def apply(elements: Elements): WrapperWithElementsoption = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperWithElementsoption]
    }
    
    extension [Self <: WrapperWithElementsoption](x: Self) {
      
      inline def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setElements(value: Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setOptions(value: SRLWrapperOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
